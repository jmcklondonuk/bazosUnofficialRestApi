# OpenAPI\Client\AdvertisementsApi

All URIs are relative to http://127.0.0.1:8080, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteAdvertisement()**](AdvertisementsApi.md#deleteAdvertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz |
| [**listOwnAdvertisements()**](AdvertisementsApi.md#listOwnAdvertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos |
| [**scrapeOwnAdvertisement()**](AdvertisementsApi.md#scrapeOwnAdvertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos |
| [**uploadAdvertisement()**](AdvertisementsApi.md#uploadAdvertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz |


## `deleteAdvertisement()`

```php
deleteAdvertisement($url, $password): bool
```

Deletes your advertisement from bazos.cz

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AdvertisementsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$url = 'url_example'; // string
$password = 'password_example'; // string

try {
    $result = $apiInstance->deleteAdvertisement($url, $password);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvertisementsApi->deleteAdvertisement: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **string**|  | |
| **password** | **string**|  | |

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listOwnAdvertisements()`

```php
listOwnAdvertisements($email, $phone, $password, $download_photos): \OpenAPI\Client\Model\Advertisement[]
```

Downloads your own advertisements from bazos.cz including photos

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AdvertisementsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$email = 'email_example'; // string
$phone = 'phone_example'; // string
$password = 'password_example'; // string
$download_photos = True; // bool

try {
    $result = $apiInstance->listOwnAdvertisements($email, $phone, $password, $download_photos);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvertisementsApi->listOwnAdvertisements: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **email** | **string**|  | |
| **phone** | **string**|  | |
| **password** | **string**|  | |
| **download_photos** | **bool**|  | |

### Return type

[**\OpenAPI\Client\Model\Advertisement[]**](../Model/Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `scrapeOwnAdvertisement()`

```php
scrapeOwnAdvertisement($url, $password, $download_photos): \OpenAPI\Client\Model\Advertisement
```

Scrapes your own advertisement from bazos.cz including photos

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AdvertisementsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$url = 'url_example'; // string
$password = 'password_example'; // string
$download_photos = True; // bool

try {
    $result = $apiInstance->scrapeOwnAdvertisement($url, $password, $download_photos);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvertisementsApi->scrapeOwnAdvertisement: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **url** | **string**|  | |
| **password** | **string**|  | |
| **download_photos** | **bool**|  | |

### Return type

[**\OpenAPI\Client\Model\Advertisement**](../Model/Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `uploadAdvertisement()`

```php
uploadAdvertisement($upload_request): int
```

Uploads an advertisement to bazos.cz

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AdvertisementsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$upload_request = new \OpenAPI\Client\Model\UploadRequest(); // \OpenAPI\Client\Model\UploadRequest

try {
    $result = $apiInstance->uploadAdvertisement($upload_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvertisementsApi->uploadAdvertisement: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **upload_request** | [**\OpenAPI\Client\Model\UploadRequest**](../Model/UploadRequest.md)|  | |

### Return type

**int**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
