# OpenAPIClient-php

This is a REST API for bazos.cz


## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

## API Endpoints

All URIs are relative to *http://127.0.0.1:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertisementsApi* | [**deleteAdvertisement**](docs/Api/AdvertisementsApi.md#deleteadvertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz
*AdvertisementsApi* | [**listOwnAdvertisements**](docs/Api/AdvertisementsApi.md#listownadvertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos
*AdvertisementsApi* | [**scrapeOwnAdvertisement**](docs/Api/AdvertisementsApi.md#scrapeownadvertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos
*AdvertisementsApi* | [**uploadAdvertisement**](docs/Api/AdvertisementsApi.md#uploadadvertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz
*AuthenticationApi* | [**checkCredentials**](docs/Api/AuthenticationApi.md#checkcredentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
*AuthenticationApi* | [**requestAuthenticationCode**](docs/Api/AuthenticationApi.md#requestauthenticationcode) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz
*AuthenticationApi* | [**submitAuthenticationCode**](docs/Api/AuthenticationApi.md#submitauthenticationcode) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz

## Models

- [Advertisement](docs/Model/Advertisement.md)
- [Error](docs/Model/Error.md)
- [MainCategory](docs/Model/MainCategory.md)
- [Photo](docs/Model/Photo.md)
- [Seller](docs/Model/Seller.md)
- [SubCategory](docs/Model/SubCategory.md)
- [UploadRequest](docs/Model/UploadRequest.md)

## Authorization
Endpoints do not require authorization.

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `v0.9.2`
    - Generator version: `7.8.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
