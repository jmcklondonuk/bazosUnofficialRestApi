package com.jackmckenzie.bazos.restserver.controller;

import com.jackmckenzie.bazos.restserver.entity.BazosException;
import com.jackmckenzie.bazos.scraper.entity.Advertisement;
import com.jackmckenzie.bazos.scraper.entity.Seller;
import com.jackmckenzie.bazos.scraper.service.BazosScraper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class BazosRestController {
    private BazosScraper bazosScraper;

    public BazosRestController(BazosScraper bazosScraper) {
        this.bazosScraper = bazosScraper;
    }

    @GetMapping("/request-authentication-code/{phone}")
    public ResponseEntity<String> requestAuthenticationCode(@PathVariable("phone") String phone) throws BazosException {
        try {
            String bid = bazosScraper.requestAuthenticationCode(phone);
            return ResponseEntity.ok(bid);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to request the authentication code", e);
        }
    }

    @GetMapping("/submit-authentication-code/{code}/{phone}")
    public ResponseEntity<Map<String, String>> submitAuthenticationCode(@PathVariable("code") String code, @PathVariable("phone") String phone) throws BazosException {
        try {
            Map<String, String> result = bazosScraper.submitAuthenticationCode(code, phone);
            return ResponseEntity.ok(result);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to request the authentication code", e);
        }
    }

    @GetMapping("/check-credentials/{bid}/{bkod}")
    public ResponseEntity<Boolean> checkCredentials(@PathVariable("bid") long bid, @PathVariable("bkod") String bkod) throws BazosException {
        boolean valid = false;
        try {
            valid = bazosScraper.isAuthenticated(bid, bkod);
            return ResponseEntity.ok(valid);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to check credentials", e);
        }
    }

    @GetMapping("/list-own-advertisements/{email}/{phone}/{password}")
    public ResponseEntity<List<Advertisement>> listOwnAdvertisements(@PathVariable("email") String email, @PathVariable("phone") String phone, @PathVariable("password") String password) throws BazosException {
        List<Advertisement> advertisements;
        try {
            advertisements = bazosScraper.listOwnAdvertisements(email, phone, password);
            return ResponseEntity.ok(advertisements);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to list own advertisements", e);
        }
    }

    @PostMapping("/scrape-own-advertisement")
    public ResponseEntity<Advertisement> scrapeOwnAdvertisement(String url, String password) throws BazosException {
        try {
            Advertisement advertisement = bazosScraper.scrapeOwnAdvertisement(url, password);
            return ResponseEntity.ok(advertisement);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to scrape own advertisement", e);
        }
    }

    @PostMapping("/upload-advertisement")
    public ResponseEntity<Integer> uploadAdvertisement(long bid, String bkod, Advertisement advertisement, Seller seller) throws BazosException {
        try {
            Integer newId = bazosScraper.postAdvertisement(bid, bkod, advertisement, seller);
            return ResponseEntity.ok(newId);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to upload advertisement", e);
        }
    }

    @DeleteMapping("/delete-advertisement")
    public ResponseEntity<Boolean> deleteAdvertisement(@RequestParam("url") String url, @RequestParam("password") String password) throws BazosException {
        try {
            boolean deleted = bazosScraper.deleteAdvertisement(url, password);
            return ResponseEntity.ok(deleted);
        } catch (InterruptedException | IOException e) {
            throw new BazosException("Unable to delete own advertisement", e);
        }
    }
}
