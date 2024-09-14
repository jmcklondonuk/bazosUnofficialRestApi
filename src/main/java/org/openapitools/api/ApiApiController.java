package org.openapitools.api;

import com.jackmckenzie.bazos.scraper.service.BazosScraper;
import org.modelmapper.ModelMapper;
import org.openapitools.model.Advertisement;
import org.openapitools.model.Seller;
import org.openapitools.model.UploadRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("${openapi.bazosCz.base-path:}")
public class ApiApiController implements ApiApi {
    private final NativeWebRequest request;
    
    private BazosScraper bazosScraper;

    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public ApiApiController(NativeWebRequest request, BazosScraper scraper) {
        this.request = request;
        this.bazosScraper = scraper;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Boolean> checkCredentials(@PathVariable("bid") Long bid, @PathVariable("bkod") String bkod) throws IOException, InterruptedException {
        boolean authenticated = bazosScraper.isAuthenticated(bid, bkod);
        return ResponseEntity.ok(authenticated);
    }

    @Override
    public ResponseEntity<Boolean> deleteAdvertisement(@RequestParam(value = "url", required = true) String url,
                                                       @RequestParam(value = "password", required = true) String password) throws IOException, InterruptedException {
        boolean deleted = bazosScraper.deleteAdvertisement(url, password);
        return ResponseEntity.ok(deleted);
    }

    @Override
    public ResponseEntity<List<org.openapitools.model.Advertisement>> listOwnAdvertisements(
            @PathVariable("email") String email,
            @PathVariable("phone") String phone,
            @PathVariable("password") String password,
            @PathVariable("downloadPhotos") Boolean downloadPhotos
    ) throws IOException, InterruptedException {
        List<com.jackmckenzie.bazos.scraper.entity.Advertisement> ads = bazosScraper.listOwnAdvertisements(email, phone, password, downloadPhotos);
        List<org.openapitools.model.Advertisement> result = new ArrayList<>();
        for (com.jackmckenzie.bazos.scraper.entity.Advertisement ad : ads) {
            org.openapitools.model.Advertisement mappedAd = modelMapper.map(ad, org.openapitools.model.Advertisement.class);
            result.add(mappedAd);
        }

        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<String> requestAuthenticationCode(@PathVariable("phone") String phone) throws IOException, InterruptedException {
        String bid = bazosScraper.requestAuthenticationCode(phone);
        return ResponseEntity.ok(bid);
    }

    @Override
    public ResponseEntity<org.openapitools.model.Advertisement> scrapeOwnAdvertisement(@RequestParam("url") String url,
                                                                                       @RequestParam("password") String password,
                                                                                       @RequestParam("downloadPhotos") Boolean downloadPhotos) throws IOException, InterruptedException {
        com.jackmckenzie.bazos.scraper.entity.Advertisement ad = bazosScraper.scrapeOwnAdvertisement(url, password, downloadPhotos);
        return ResponseEntity.ok(modelMapper.map(ad, org.openapitools.model.Advertisement.class));
    }

    @Override
    public ResponseEntity<Map<String, String>> submitAuthenticationCode(@PathVariable("code") String code,
                                                                        @PathVariable("phone") String phone) throws IOException, InterruptedException {
        Map<String, String> result = bazosScraper.submitAuthenticationCode(code, phone);
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<Integer> uploadAdvertisement(@RequestBody UploadRequest uploadRequest) throws IOException, InterruptedException {
        com.jackmckenzie.bazos.scraper.entity.Advertisement mappedAd = modelMapper.map(uploadRequest.getAdvertisement(), com.jackmckenzie.bazos.scraper.entity.Advertisement.class);
        com.jackmckenzie.bazos.scraper.entity.Seller mappedSeller = modelMapper.map(uploadRequest.getSeller(), com.jackmckenzie.bazos.scraper.entity.Seller.class);
        Integer adId = bazosScraper.postAdvertisement(Long.parseLong(uploadRequest.getBid()), uploadRequest.getBkod(), mappedAd, mappedSeller);
        return ResponseEntity.ok(adId);
    }
}
