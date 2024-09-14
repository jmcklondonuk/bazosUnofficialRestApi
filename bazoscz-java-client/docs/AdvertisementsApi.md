# AdvertisementsApi

All URIs are relative to *http://127.0.0.1:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAdvertisement**](AdvertisementsApi.md#deleteAdvertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz |
| [**listOwnAdvertisements**](AdvertisementsApi.md#listOwnAdvertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos |
| [**scrapeOwnAdvertisement**](AdvertisementsApi.md#scrapeOwnAdvertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos |
| [**uploadAdvertisement**](AdvertisementsApi.md#uploadAdvertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz |



## deleteAdvertisement

> Boolean deleteAdvertisement(url, password)

Deletes your advertisement from bazos.cz

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AdvertisementsApi apiInstance = new AdvertisementsApi(defaultClient);
        String url = "url_example"; // String | 
        String password = "password_example"; // String | 
        try {
            Boolean result = apiInstance.deleteAdvertisement(url, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisementsApi#deleteAdvertisement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **url** | **String**|  | |
| **password** | **String**|  | |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |


## listOwnAdvertisements

> List&lt;Advertisement&gt; listOwnAdvertisements(email, phone, password, downloadPhotos)

Downloads your own advertisements from bazos.cz including photos

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AdvertisementsApi apiInstance = new AdvertisementsApi(defaultClient);
        String email = "email_example"; // String | 
        String phone = "phone_example"; // String | 
        String password = "password_example"; // String | 
        Boolean downloadPhotos = true; // Boolean | 
        try {
            List<Advertisement> result = apiInstance.listOwnAdvertisements(email, phone, password, downloadPhotos);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisementsApi#listOwnAdvertisements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**|  | |
| **phone** | **String**|  | |
| **password** | **String**|  | |
| **downloadPhotos** | **Boolean**|  | |

### Return type

[**List&lt;Advertisement&gt;**](Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |


## scrapeOwnAdvertisement

> Advertisement scrapeOwnAdvertisement(url, password, downloadPhotos)

Scrapes your own advertisement from bazos.cz including photos

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AdvertisementsApi apiInstance = new AdvertisementsApi(defaultClient);
        String url = "url_example"; // String | 
        String password = "password_example"; // String | 
        Boolean downloadPhotos = true; // Boolean | 
        try {
            Advertisement result = apiInstance.scrapeOwnAdvertisement(url, password, downloadPhotos);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisementsApi#scrapeOwnAdvertisement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **url** | **String**|  | |
| **password** | **String**|  | |
| **downloadPhotos** | **Boolean**|  | |

### Return type

[**Advertisement**](Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |


## uploadAdvertisement

> Integer uploadAdvertisement(uploadRequest)

Uploads an advertisement to bazos.cz

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdvertisementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AdvertisementsApi apiInstance = new AdvertisementsApi(defaultClient);
        UploadRequest uploadRequest = new UploadRequest(); // UploadRequest | 
        try {
            Integer result = apiInstance.uploadAdvertisement(uploadRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvertisementsApi#uploadAdvertisement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uploadRequest** | [**UploadRequest**](UploadRequest.md)|  | |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |

