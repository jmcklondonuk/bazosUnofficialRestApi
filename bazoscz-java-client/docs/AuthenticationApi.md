# AuthenticationApi

All URIs are relative to *http://127.0.0.1:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCredentials**](AuthenticationApi.md#checkCredentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again. |
| [**requestAuthenticationCode**](AuthenticationApi.md#requestAuthenticationCode) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz |
| [**submitAuthenticationCode**](AuthenticationApi.md#submitAuthenticationCode) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz |



## checkCredentials

> Boolean checkCredentials(bid, bkod)

Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        Long bid = 56L; // Long | 
        String bkod = "bkod_example"; // String | 
        try {
            Boolean result = apiInstance.checkCredentials(bid, bkod);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#checkCredentials");
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
| **bid** | **Long**|  | |
| **bkod** | **String**|  | |

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


## requestAuthenticationCode

> String requestAuthenticationCode(phone)

Requests a code on your phone to authenticate for using bazos.cz

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String phone = "phone_example"; // String | 
        try {
            String result = apiInstance.requestAuthenticationCode(phone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#requestAuthenticationCode");
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
| **phone** | **String**|  | |

### Return type

**String**

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


## submitAuthenticationCode

> Map&lt;String, String&gt; submitAuthenticationCode(code, phone)

Sends an authentication code, obtained via text message on your phone, back to bazos.cz

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:8080");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String code = "code_example"; // String | 
        String phone = "phone_example"; // String | 
        try {
            Map<String, String> result = apiInstance.submitAuthenticationCode(code, phone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#submitAuthenticationCode");
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
| **code** | **String**|  | |
| **phone** | **String**|  | |

### Return type

**Map&lt;String, String&gt;**

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

