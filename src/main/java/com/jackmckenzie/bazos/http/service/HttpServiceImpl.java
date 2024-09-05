package com.jackmckenzie.bazos.http.service;

import com.jackmckenzie.bazos.http.entity.Cookie;
import com.jackmckenzie.bazos.http.repository.CookieRepository;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HttpServiceImpl implements HttpService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpServiceImpl.class);

    private HttpClient client;

    private CookieRepository cookieRepository;

    public HttpServiceImpl(CookieRepository cookieRepository) {
        this.cookieRepository = cookieRepository;
        this.client = HttpClient.newBuilder()
                .build();
    }

    @Override
    public Connection.Response downloadHtmlForAuthentication(String url, boolean clearCookies, String cookieDomain, String... keyValsPostData) throws IOException {
        if (clearCookies)
            cookieRepository.deleteByDomain(cookieDomain);

        LOGGER.debug("Resolving cookies for domain {}...", cookieDomain);
        List<Cookie> storedCookies = this.cookieRepository.findByDomain(cookieDomain);
        Map<String, String> cookies = new HashMap<>();
        for (Cookie cookie : storedCookies) {
            cookies.put(cookie.getName(), cookie.getContent());
        }

        if (!cookies.isEmpty()) {
            LOGGER.debug("Cookies resolved: {}", cookies);
        }

        Connection connection;
        if (keyValsPostData != null && keyValsPostData.length != 0) {
            connection = Jsoup.connect(url).cookies(cookies).method(Connection.Method.POST).data(keyValsPostData);
        } else {
            connection = Jsoup.connect(url).cookies(cookies);
        }

        LOGGER.debug("Request Method: {}", connection.request().method());
        Connection.Response response = connection.execute();
        LOGGER.debug("HTML: " + response.body());
        Map<String, String> responseCookies = response.cookies();

        Cookie cookie;
        for (Map.Entry<String, String> entry : responseCookies.entrySet()) {
            LOGGER.debug("Resolving a cookie for domain {}, key {}...", cookieDomain, entry.getKey());
            cookie = this.cookieRepository.findByDomainAndName(cookieDomain, entry.getKey());
            if (entry.getValue() == null) {
                entry.setValue("");
            }

            if (cookie == null) {
                LOGGER.debug("Creating a new cookie for this key...");
                cookie = new Cookie();
                cookie.setDomain(cookieDomain);
                cookie.setName(entry.getKey());
                cookie.setContent(entry.getValue());
            } else {
                LOGGER.debug("Updating the key to a new value: {}", entry.getKey());
                cookie.setContent(entry.getValue());
            }

            cookieRepository.save(cookie);
        }

        return response;
    }

    @Override
    public HttpResponse<String> downloadTextWithCookie(String url, String cookie, String... optionalKeyValsPostData) throws InterruptedException, IOException {
        URI uri;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URI!", e);
        }

        LOGGER.debug("Preparing request for URL {}...", url);
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder().uri(uri);
        if (optionalKeyValsPostData != null && optionalKeyValsPostData.length > 0) {
            StringBuilder postData = new StringBuilder();
            for (int i = 0; i < optionalKeyValsPostData.length; i += 2) {
                if (i > 0)
                    postData.append("&");

                postData.append(optionalKeyValsPostData[i]).append("=").append(optionalKeyValsPostData[i + 1]);
            }

            requestBuilder.header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                    .POST(HttpRequest.BodyPublishers.ofString(postData.toString()));
        } else {
            requestBuilder.GET();
        }

        if (cookie != null)
            requestBuilder.header("Cookie", cookie);

        HttpRequest request = requestBuilder.build();
        HttpResponse<String> response;
        response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        LOGGER.debug("Request completed with status code {}.", response.statusCode());
        return response;
    }

    @Override
    public HttpResponse<String> downloadText(String url, String... optionalKeyValsPostData) throws InterruptedException, IOException {
        return downloadTextWithCookie(url, null, optionalKeyValsPostData);
    }

    @Override
    public byte[] downloadFile(String url) throws InterruptedException, IOException {
        URI uri;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URI!", e);
        }

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(uri)
                .GET();

        HttpRequest request = requestBuilder.build();
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

        byte[] fileData = response.body();
        LOGGER.debug("Downloaded a binary file, size: {} bytes", fileData.length);
        return fileData;
    }

    @Override
    public String uploadFilesWithCookie(String url, String cookie, String name, Map<String, byte[]> files, String... optionalKeyValsPostData) throws InterruptedException, IOException {
        Random random = new Random();
        String boundary = "---------------------------" + Math.abs(random.nextLong());

        ByteArrayOutputStream requestBody = new ByteArrayOutputStream();
        for (int i = 0; i < optionalKeyValsPostData.length; i += 2) {
            String key = optionalKeyValsPostData[i];
            String value = optionalKeyValsPostData[i + 1];

            requestBody.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.UTF_8));
            requestBody.write(("Content-Disposition: form-data; name=\"" + key + "\"\r\n\r\n").getBytes(StandardCharsets.UTF_8));
            requestBody.write((value + "\r\n").getBytes(StandardCharsets.UTF_8));
        }

        for (Map.Entry<String, byte[]> entry : files.entrySet()) {
            String fileName = entry.getKey();
            byte[] fileData = entry.getValue();

            requestBody.write(("--" + boundary + "\r\n").getBytes(StandardCharsets.US_ASCII));
            requestBody.write(("Content-Disposition: form-data; name=\"" + name + "\"; filename=\"" + fileName + "\"\r\n").getBytes(StandardCharsets.US_ASCII));
            requestBody.write(("Content-Type: application/octet-stream\r\n\r\n").getBytes(StandardCharsets.US_ASCII));

            requestBody.write(fileData);
            requestBody.write("\r\n".getBytes(StandardCharsets.US_ASCII));
        }

        requestBody.write(("--" + boundary + "--\r\n").getBytes(StandardCharsets.US_ASCII));

        URI uri;
        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            throw new IOException("Invalid URI!", e);
        }

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "multipart/form-data; boundary=" + boundary)
                .POST(HttpRequest.BodyPublishers.ofByteArray(requestBody.toByteArray()));

        if (cookie != null)
            requestBuilder.header("Cookie", cookie);

        HttpRequest request = requestBuilder.build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (ConnectException e) {
            throw new IOException("Unable to connect!", e);
        }

        return response.body();
    }

    @Override
    public String uploadFiles(String url, String name, Map<String, byte[]> files, String... optionalKeyValsPostData) throws InterruptedException, IOException {
        return uploadFilesWithCookie(url, null, name, files, optionalKeyValsPostData);
    }
}
