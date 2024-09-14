package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.Error;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-14T11:45:00.040478100+02:00[Europe/Prague]", comments = "Generator version: 7.8.0")
public class AuthenticationApi extends BaseApi {

    public AuthenticationApi() {
        super(new ApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param bid  (required)
     * @param bkod  (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean checkCredentials(Long bid, String bkod) throws RestClientException {
        return checkCredentialsWithHttpInfo(bid, bkod).getBody();
    }

    /**
     * Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param bid  (required)
     * @param bkod  (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> checkCredentialsWithHttpInfo(Long bid, String bkod) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bid' is set
        if (bid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bid' when calling checkCredentials");
        }
        
        // verify the required parameter 'bkod' is set
        if (bkod == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bkod' when calling checkCredentials");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bid", bid);
        uriVariables.put("bkod", bkod);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Boolean> localReturnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI("/api/v1/check-credentials/{bid}/{bkod}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Requests a code on your phone to authenticate for using bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param phone  (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String requestAuthenticationCode(String phone) throws RestClientException {
        return requestAuthenticationCodeWithHttpInfo(phone).getBody();
    }

    /**
     * Requests a code on your phone to authenticate for using bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param phone  (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> requestAuthenticationCodeWithHttpInfo(String phone) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phone' when calling requestAuthenticationCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("phone", phone);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/api/v1/request-authentication-code/{phone}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sends an authentication code, obtained via text message on your phone, back to bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param code  (required)
     * @param phone  (required)
     * @return Map&lt;String, String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, String> submitAuthenticationCode(String code, String phone) throws RestClientException {
        return submitAuthenticationCodeWithHttpInfo(code, phone).getBody();
    }

    /**
     * Sends an authentication code, obtained via text message on your phone, back to bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param code  (required)
     * @param phone  (required)
     * @return ResponseEntity&lt;Map&lt;String, String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, String>> submitAuthenticationCodeWithHttpInfo(String code, String phone) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling submitAuthenticationCode");
        }
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phone' when calling submitAuthenticationCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);
        uriVariables.put("phone", phone);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Map<String, String>> localReturnType = new ParameterizedTypeReference<Map<String, String>>() {};
        return apiClient.invokeAPI("/api/v1/submit-authentication-code/{code}/{phone}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
