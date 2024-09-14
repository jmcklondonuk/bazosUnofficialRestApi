/*
 * Bazos.cz API
 * This is a REST API for bazos.cz
 *
 * The version of the OpenAPI document: v0.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public interface Authentication {
    /**
     * Apply authentication settings to header and / or query parameters.
     * @param queryParams The query parameters for the request
     * @param headerParams The header parameters for the request
     * @param cookieParams The cookie parameters for the request
     */
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams);
}
