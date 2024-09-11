package com.jackmckenzie.bazos.scraper.service;

import com.jackmckenzie.bazos.http.service.HttpService;
import com.jackmckenzie.bazos.scraper.entity.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class BazosScraperImpl implements BazosScraper {
    private HttpService httpService;

    public BazosScraperImpl(HttpService httpService) {
        this.httpService = httpService;
    }

    @Override
    public boolean isAuthenticated(Long bid, String bkod) throws InterruptedException, IOException {
        HttpResponse<String> response = httpService.downloadTextWithCookie("https://reality.bazos.cz/pridat-inzerat.php", "bid=" + bid + "; bkod=" + bkod);
        String html = response.body();
        return html.contains("Rubrika");
    }

    @Override
    public String requestAuthenticationCode(String phone) throws InterruptedException, IOException {
        if (!phone.startsWith("+")) {
            throw new IllegalArgumentException("Phone number must start with a country prefix, i.e. +420!");
        }

        Connection.Response response = httpService.downloadHtmlForAuthentication("https://reality.bazos.cz/pridat-inzerat.php",
                true, phone, "podminky", "1", "teloverit", phone);

        if (response.body().contains("zkuste to pozd")) {
            throw new IOException("You have attempted to verify your phone number too many times. Try again later.");
        }

        Map<String, String> cookies = ((HttpConnection.Response) response).cookies();
        if (cookies.containsKey("bid")) {
            return cookies.get("bid");
        }

        throw new IOException("The request was not successful. No bid was returned.");
    }

    @Override
    public Map<String, String> submitAuthenticationCode(String code, String phone) throws InterruptedException, IOException {
        if (!phone.startsWith("+")) {
            throw new IllegalArgumentException("Phone number must start with a country prefix, i.e. +420!");
        }

        Connection.Response response = httpService.downloadHtmlForAuthentication("https://reality.bazos.cz/pridat-inzerat.php",
                false, phone, "klic", code, "klictelefon", phone);

        if (response.body().contains("Chybně zadaný mobilní klíč")) {
            throw new IOException("You have entered an invalid code from your phone!");
        }

        Map<String, String> cookies = response.cookies();
        Map<String, String> result = new HashMap<>();
        if (cookies.containsKey("bid") && cookies.containsKey("bkod")) {
            result.put("bid", cookies.get("bid"));
            result.put("bkod", cookies.get("bkod"));
        } else {
            result.put("bid", "");
            result.put("bkod", "");
        }

        return result;
    }

    @Override
    public List<Advertisement> listOwnAdvertisements(String email, String phone, String password, Boolean downloadPhotos) throws InterruptedException, IOException {
        HttpResponse<String> response = httpService.downloadText("https://www.bazos.cz/moje-inzeraty.php",
                "email", email, "telefon", String.valueOf(phone));

        String html = response.body();
        Elements elements = Jsoup.parse(html).select("div.inzeraty.inzeratyflex .inzeratynadpis .nadpis a");
        List<Advertisement> ads = new ArrayList<>();
        for (Element element : elements) {
            ads.add(scrapeOwnAdvertisement(element.attr("href"), password, downloadPhotos));
        }

        return ads;
    }

    private static String parseAdIdFromUrl(String url) throws URISyntaxException {
        Matcher matcher = Pattern.compile("/inzerat/(\\d+)/").matcher(url);
        if (!matcher.find()) {
            throw new URISyntaxException(url, "/inzerat/<number>/ was not found in the URI!");
        }

        return matcher.group(1);
    }

    @Override
    public Advertisement scrapeOwnAdvertisement(String url, String password, Boolean downloadPhotos) throws InterruptedException, IOException {
        HttpResponse<String> response = httpService.downloadText(url);
        String html = response.body();
        Document document = Jsoup.parse(html);

        Advertisement advertisement = new Advertisement();
        try {
            advertisement.setId(Integer.parseInt(parseAdIdFromUrl(url)));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid ad url", e);
        }

        advertisement.setUrl(url);
        try {
            String date = document.select(".inzeratydetnadpis .velikost10").text();
            if (date.length() > 5) {
                date = date.substring(3, date.length() - 1).replace(" ", "");
            }

            advertisement.setDate(date);
        } catch (ParseException e) {
            throw new IOException("Invalid date!", e);
        }

        advertisement.setTitle(document.select("h1.nadpisdetail").text());
        Element priceElement = document.select("tr:nth-child(5)").first();
        if (priceElement != null) {
            String price = priceElement.select("td:nth-child(2) b").text();
            price = price.substring(0, price.length() - 3).replace(" ", "");
            advertisement.setPrice(price);
        } else {
            throw new IOException("Price cannot be parsed and is null!");
        }

        Elements breadcrumbNavigation = document.select("div.drobky a");
        assert breadcrumbNavigation.size() == 3;
        String categoryId = html.substring(html.indexOf("cat=") + 4, html.indexOf("\"", html.indexOf("cat=")));
        MainCategory mainCategory = new MainCategory();
        mainCategory.setTitle(breadcrumbNavigation.eq(1).text());
        mainCategory.setUrl(breadcrumbNavigation.eq(1).attr("href"));
        mainCategory.setId(Integer.parseInt(categoryId));

        SubCategory subCategory = new SubCategory();
        subCategory.setTitle(breadcrumbNavigation.eq(2).text());
        subCategory.setUrl(breadcrumbNavigation.eq(2).attr("href"));
        subCategory.setMainCategory(mainCategory);

        advertisement.setSubCategory(subCategory);

        String adEditingUrl = advertisement.getSubCategory().getMainCategory().getUrl() + "deletei2.php";
        HttpResponse<String> adEditingResponse = httpService.downloadText(adEditingUrl,
                "idad", String.valueOf(advertisement.getId()),
                "heslobazar", password,
                "administrace", "Upravit");

        String adEditingHtml = adEditingResponse.body();
        if (adEditingHtml.contains("Zadali jste špatné heslo"))
            throw new IOException("Invalid password!");

        Document adEditingDocument = Jsoup.parse(adEditingHtml);
        String description = adEditingDocument.select("#popis").text();

        advertisement.setDescription(description);

        Elements images = document.select(".carousel-cell img");
        List<Photo> photos = new ArrayList<>();
        for (Element image : images) {
            String imageUrl = image.attr("data-flickity-lazyload");
            Photo photo = new Photo();
            if (downloadPhotos) {
                byte[] imageData = httpService.downloadFile(imageUrl);
                photo.setContent(imageData);
            }

            photo.setUrl(imageUrl);
            photos.add(photo);
        }

        advertisement.setPhotos(photos);
        return advertisement;
    }

    @Override
    public Integer postAdvertisement(Long bid, String bkod, Advertisement advertisement, Seller seller) throws InterruptedException, IOException {
        String cookie = "bid=" + bid + "; bkod=" + bkod;

        List<String> uploadedPhotos = new ArrayList<>();
        for (Photo photo : advertisement.getPhotos()) {
            String fileName = photo.getUrl().substring(photo.getUrl().lastIndexOf('/') + 1);
            if (fileName.contains("?"))
                fileName = fileName.substring(0, fileName.indexOf("?"));

            if (uploadedPhotos.contains(fileName))
                fileName = UUID.randomUUID().toString().replace("-", "") + fileName;

            String newFileName = httpService.uploadFilesWithCookie(advertisement.getSubCategory().getMainCategory().getUrl() + "upload.php",
                    cookie,
                    "file[]",
                    Map.of(fileName, photo.getContent()));

            if (newFileName.startsWith("[\"") && newFileName.endsWith("\"]"))
                newFileName = newFileName.substring(2, newFileName.length() - 2);

            uploadedPhotos.add(newFileName);
        }

        List<String> args = new ArrayList<>(List.of(
                "category", String.valueOf(advertisement.getSubCategory().getMainCategory().getId()),
                "nadpis", advertisement.getTitle(),
                "popis", advertisement.getDescription(),
                "cena", String.valueOf(advertisement.getPrice()).replace(".0", ""),
                "cenavyber", "1",
                "lokalita", seller.getAdZip(),
                "jmeno", seller.getAdSellerName(),
                "telefoni", seller.getAdPhone(),
                "maili", seller.getAdEmail(),
                "heslobazar", seller.getAdPassword(),
                "fdsfdfsss", "agdfg",
                "Submit", "Odeslat"
        ));

        uploadedPhotos.forEach(photo -> {
            args.add("files[]");
            args.add(photo);
        });

        String response = httpService.uploadFilesWithCookie(
                advertisement.getSubCategory().getMainCategory().getUrl() + "insert.php",
                cookie,
                "nothing",
                new HashMap<>(),
                args.toArray(new String[0])
        );

        if (response.contains("Inzerát byl vložen")) {
            HttpResponse<String> myAdsResponse = httpService.downloadTextWithCookie("https://www.bazos.cz/moje-inzeraty.php",
                    cookie, "email", seller.getEmail(), "telefon", seller.getAdPhone());

            String html = myAdsResponse.body();
            Document document = Jsoup.parse(html);
            Elements elements = document.select("div.inzeraty.inzeratyflex .inzeratynadpis .nadpis a");
            String url = elements.get(0).attr("href");
            try {
                return Integer.parseInt(parseAdIdFromUrl(url));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException("Invalid ad URI", e);
            }
        } else {
            throw new IOException("The advertisement has not been posted!");
        }
    }

    @Override
    public boolean deleteAdvertisement(String url, String password) throws InterruptedException, IOException {
        String id;
        try {
            id = parseAdIdFromUrl(url);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid ad URI", e);
        }

        String categoryUrl = url.substring(0, url.indexOf('/', 8) + 1);

        HttpResponse<String> response = httpService.downloadText(categoryUrl + "deletei2.php",
                "heslobazar", password,
                "idad", id,
                "administrace", "Vymazat");

        if (response.body().contains("Zadali jste špatné heslo"))
            throw new IOException("Invalid password!");

        return response.body().contains("Inzerát byl vymazán");
    }
}
