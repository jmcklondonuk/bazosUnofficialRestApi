package com.jackmckenzie.scraping.bazos.entity;

import lombok.Data;

@Data
public class Seller {
    private String phone;
    private String email;

    private String adSellerName;
    private String adPhone;
    private String adEmail;
    private String adZip;
    private String adPassword;
}
