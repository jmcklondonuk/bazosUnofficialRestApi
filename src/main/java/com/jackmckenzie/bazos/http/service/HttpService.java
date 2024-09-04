package com.jackmckenzie.bazos.http.service;

import org.jsoup.Connection;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Map;

public interface HttpService {
    HttpResponse<String> downloadTextWithCookie(String url, String cookie, String... optionalKeyValsPostData) throws InterruptedException, IOException;

    HttpResponse<String> downloadText(String url, String... optionalKeyValsPostData) throws InterruptedException, IOException;

    Connection.Response downloadHtmlForAuthentication(String url, boolean clearCookies, String cookieDomain, String... keyValsPostData) throws IOException;

    byte[] downloadFile(String url) throws InterruptedException, IOException;

    String uploadFilesWithCookie(String url, String cookie, String name, Map<String, byte[]> files, String... optionalKeyValsPostData) throws InterruptedException, IOException;

    String uploadFiles(String url, String name, Map<String, byte[]> files, String... optionalKeyValsPostData) throws InterruptedException, IOException;
}
