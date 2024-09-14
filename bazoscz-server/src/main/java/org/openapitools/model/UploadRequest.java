package org.openapitools.model;

import lombok.Data;

@Data
public class UploadRequest {
	private String bid;
	private String bkod;
	private Advertisement advertisement;
	private Seller seller;
}
