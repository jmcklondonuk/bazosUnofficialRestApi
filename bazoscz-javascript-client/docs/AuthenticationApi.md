# BazosCzApi.AuthenticationApi

All URIs are relative to *http://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCredentials**](AuthenticationApi.md#checkCredentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
[**requestAuthenticationCode**](AuthenticationApi.md#requestAuthenticationCode) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz
[**submitAuthenticationCode**](AuthenticationApi.md#submitAuthenticationCode) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz



## checkCredentials

> Boolean checkCredentials(bid, bkod)

Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AuthenticationApi();
let bid = 789; // Number | 
let bkod = "bkod_example"; // String | 
apiInstance.checkCredentials(bid, bkod, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bid** | **Number**|  | 
 **bkod** | **String**|  | 

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## requestAuthenticationCode

> String requestAuthenticationCode(phone)

Requests a code on your phone to authenticate for using bazos.cz

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AuthenticationApi();
let phone = "phone_example"; // String | 
apiInstance.requestAuthenticationCode(phone, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## submitAuthenticationCode

> {String: String} submitAuthenticationCode(code, phone)

Sends an authentication code, obtained via text message on your phone, back to bazos.cz

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AuthenticationApi();
let code = "code_example"; // String | 
let phone = "phone_example"; // String | 
apiInstance.submitAuthenticationCode(code, phone, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  | 
 **phone** | **String**|  | 

### Return type

**{String: String}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

