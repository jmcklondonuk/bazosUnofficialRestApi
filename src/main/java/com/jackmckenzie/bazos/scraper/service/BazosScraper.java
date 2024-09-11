package com.jackmckenzie.bazos.scraper.service;

import com.jackmckenzie.bazos.scraper.entity.Advertisement;
import com.jackmckenzie.bazos.scraper.entity.Seller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface BazosScraper {
    boolean isAuthenticated(Long bid, String bkod) throws InterruptedException, IOException;

    String requestAuthenticationCode(String phone) throws InterruptedException, IOException;

    Map<String, String> submitAuthenticationCode(String code, String phone) throws InterruptedException, IOException;

    List<Advertisement> listOwnAdvertisements(String email, String phone, String password, Boolean downloadPhotos) throws InterruptedException, IOException;

    Advertisement scrapeOwnAdvertisement(String url, String password, Boolean downloadPhotos) throws InterruptedException, IOException;

    Integer postAdvertisement(Long bid, String bkod, Advertisement advertisement, Seller seller) throws InterruptedException, IOException;

    boolean deleteAdvertisement(String url, String password) throws InterruptedException, IOException;
}
