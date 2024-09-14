# OpenAPI\Client\AuthenticationApi

All URIs are relative to http://127.0.0.1:8080, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkCredentials()**](AuthenticationApi.md#checkCredentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again. |
| [**requestAuthenticationCode()**](AuthenticationApi.md#requestAuthenticationCode) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz |
| [**submitAuthenticationCode()**](AuthenticationApi.md#submitAuthenticationCode) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz |


## `checkCredentials()`

```php
checkCredentials($bid, $bkod): bool
```

Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$bid = 56; // int
$bkod = 'bkod_example'; // string

try {
    $result = $apiInstance->checkCredentials($bid, $bkod);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->checkCredentials: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bid** | **int**|  | |
| **bkod** | **string**|  | |

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

## `requestAuthenticationCode()`

```php
requestAuthenticationCode($phone): string
```

Requests a code on your phone to authenticate for using bazos.cz

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$phone = 'phone_example'; // string

try {
    $result = $apiInstance->requestAuthenticationCode($phone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->requestAuthenticationCode: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **phone** | **string**|  | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `submitAuthenticationCode()`

```php
submitAuthenticationCode($code, $phone): array<string,string>
```

Sends an authentication code, obtained via text message on your phone, back to bazos.cz

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$code = 'code_example'; // string
$phone = 'phone_example'; // string

try {
    $result = $apiInstance->submitAuthenticationCode($code, $phone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->submitAuthenticationCode: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **string**|  | |
| **phone** | **string**|  | |

### Return type

**array<string,string>**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
