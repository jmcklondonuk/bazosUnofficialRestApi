package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.Advertisement;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.UploadRequest;

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
public class AdvertisementsApi extends BaseApi {

    public AdvertisementsApi() {
        super(new ApiClient());
    }

    public AdvertisementsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Deletes your advertisement from bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param url  (required)
     * @param password  (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean deleteAdvertisement(String url, String password) throws RestClientException {
        return deleteAdvertisementWithHttpInfo(url, password).getBody();
    }

    /**
     * Deletes your advertisement from bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param url  (required)
     * @param password  (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> deleteAdvertisementWithHttpInfo(String url, String password) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'url' when calling deleteAdvertisement");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling deleteAdvertisement");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "password", password));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Boolean> localReturnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI("/api/v1/delete-advertisement", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Downloads your own advertisements from bazos.cz including photos
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param email  (required)
     * @param phone  (required)
     * @param password  (required)
     * @param downloadPhotos  (required)
     * @return List&lt;Advertisement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Advertisement> listOwnAdvertisements(String email, String phone, String password, Boolean downloadPhotos) throws RestClientException {
        return listOwnAdvertisementsWithHttpInfo(email, phone, password, downloadPhotos).getBody();
    }

    /**
     * Downloads your own advertisements from bazos.cz including photos
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param email  (required)
     * @param phone  (required)
     * @param password  (required)
     * @param downloadPhotos  (required)
     * @return ResponseEntity&lt;List&lt;Advertisement&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Advertisement>> listOwnAdvertisementsWithHttpInfo(String email, String phone, String password, Boolean downloadPhotos) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling listOwnAdvertisements");
        }
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phone' when calling listOwnAdvertisements");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling listOwnAdvertisements");
        }
        
        // verify the required parameter 'downloadPhotos' is set
        if (downloadPhotos == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'downloadPhotos' when calling listOwnAdvertisements");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email", email);
        uriVariables.put("phone", phone);
        uriVariables.put("password", password);
        uriVariables.put("downloadPhotos", downloadPhotos);

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

        ParameterizedTypeReference<List<Advertisement>> localReturnType = new ParameterizedTypeReference<List<Advertisement>>() {};
        return apiClient.invokeAPI("/api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Scrapes your own advertisement from bazos.cz including photos
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param url  (required)
     * @param password  (required)
     * @param downloadPhotos  (required)
     * @return Advertisement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Advertisement scrapeOwnAdvertisement(String url, String password, Boolean downloadPhotos) throws RestClientException {
        return scrapeOwnAdvertisementWithHttpInfo(url, password, downloadPhotos).getBody();
    }

    /**
     * Scrapes your own advertisement from bazos.cz including photos
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param url  (required)
     * @param password  (required)
     * @param downloadPhotos  (required)
     * @return ResponseEntity&lt;Advertisement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Advertisement> scrapeOwnAdvertisementWithHttpInfo(String url, String password, Boolean downloadPhotos) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'url' when calling scrapeOwnAdvertisement");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling scrapeOwnAdvertisement");
        }
        
        // verify the required parameter 'downloadPhotos' is set
        if (downloadPhotos == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'downloadPhotos' when calling scrapeOwnAdvertisement");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "password", password));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "downloadPhotos", downloadPhotos));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Advertisement> localReturnType = new ParameterizedTypeReference<Advertisement>() {};
        return apiClient.invokeAPI("/api/v1/scrape-own-advertisement", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Uploads an advertisement to bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param uploadRequest  (required)
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer uploadAdvertisement(UploadRequest uploadRequest) throws RestClientException {
        return uploadAdvertisementWithHttpInfo(uploadRequest).getBody();
    }

    /**
     * Uploads an advertisement to bazos.cz
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad request
     * @param uploadRequest  (required)
     * @return ResponseEntity&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Integer> uploadAdvertisementWithHttpInfo(UploadRequest uploadRequest) throws RestClientException {
        Object localVarPostBody = uploadRequest;
        
        // verify the required parameter 'uploadRequest' is set
        if (uploadRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadRequest' when calling uploadAdvertisement");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Integer> localReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/api/v1/upload-advertisement", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
