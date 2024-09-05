package com.jackmckenzie.bazos.restserver.entity;

import com.jackmckenzie.bazos.scraper.entity.Advertisement;
import com.jackmckenzie.bazos.scraper.entity.Seller;
import lombok.Data;

@Data
public class UploadAdvertisementRequest {
    private Long bid;
    private String bkod;
    private Advertisement advertisement;
    private Seller seller;
}
