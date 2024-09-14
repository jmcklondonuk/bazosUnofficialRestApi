# BazosCzApi.AdvertisementsApi

All URIs are relative to *http://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAdvertisement**](AdvertisementsApi.md#deleteAdvertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz
[**listOwnAdvertisements**](AdvertisementsApi.md#listOwnAdvertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos
[**scrapeOwnAdvertisement**](AdvertisementsApi.md#scrapeOwnAdvertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos
[**uploadAdvertisement**](AdvertisementsApi.md#uploadAdvertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz



## deleteAdvertisement

> Boolean deleteAdvertisement(url, password)

Deletes your advertisement from bazos.cz

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AdvertisementsApi();
let url = "url_example"; // String | 
let password = "password_example"; // String | 
apiInstance.deleteAdvertisement(url, password, (error, data, response) => {
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
 **url** | **String**|  | 
 **password** | **String**|  | 

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listOwnAdvertisements

> [Advertisement] listOwnAdvertisements(email, phone, password, downloadPhotos)

Downloads your own advertisements from bazos.cz including photos

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AdvertisementsApi();
let email = "email_example"; // String | 
let phone = "phone_example"; // String | 
let password = "password_example"; // String | 
let downloadPhotos = true; // Boolean | 
apiInstance.listOwnAdvertisements(email, phone, password, downloadPhotos, (error, data, response) => {
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
 **email** | **String**|  | 
 **phone** | **String**|  | 
 **password** | **String**|  | 
 **downloadPhotos** | **Boolean**|  | 

### Return type

[**[Advertisement]**](Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## scrapeOwnAdvertisement

> Advertisement scrapeOwnAdvertisement(url, password, downloadPhotos)

Scrapes your own advertisement from bazos.cz including photos

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AdvertisementsApi();
let url = "url_example"; // String | 
let password = "password_example"; // String | 
let downloadPhotos = true; // Boolean | 
apiInstance.scrapeOwnAdvertisement(url, password, downloadPhotos, (error, data, response) => {
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
 **url** | **String**|  | 
 **password** | **String**|  | 
 **downloadPhotos** | **Boolean**|  | 

### Return type

[**Advertisement**](Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## uploadAdvertisement

> Number uploadAdvertisement(uploadRequest)

Uploads an advertisement to bazos.cz

### Example

```javascript
import BazosCzApi from 'bazos_cz_api';

let apiInstance = new BazosCzApi.AdvertisementsApi();
let uploadRequest = new BazosCzApi.UploadRequest(); // UploadRequest | 
apiInstance.uploadAdvertisement(uploadRequest, (error, data, response) => {
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
 **uploadRequest** | [**UploadRequest**](UploadRequest.md)|  | 

### Return type

**Number**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

