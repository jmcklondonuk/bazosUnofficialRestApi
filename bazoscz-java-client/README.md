# bazosczclient

Bazos.cz API

- API version: v0.9.2

- Build date: 2024-09-14T11:45:00.040478100+02:00[Europe/Prague]

- Generator version: 7.8.0

This is a REST API for bazos.cz


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.jackmckenzie.bazos</groupId>
  <artifactId>bazosczclient</artifactId>
  <version>v0.9.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'bazosczclient' jar has been published to maven central.
    mavenLocal()       // Needed if the 'bazosczclient' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.jackmckenzie.bazos:bazosczclient:v0.9.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/bazosczclient-v0.9.2.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AdvertisementsApi;

public class AdvertisementsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = new ApiClient()
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

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertisementsApi* | [**deleteAdvertisement**](docs/AdvertisementsApi.md#deleteAdvertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz
*AdvertisementsApi* | [**listOwnAdvertisements**](docs/AdvertisementsApi.md#listOwnAdvertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos
*AdvertisementsApi* | [**scrapeOwnAdvertisement**](docs/AdvertisementsApi.md#scrapeOwnAdvertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos
*AdvertisementsApi* | [**uploadAdvertisement**](docs/AdvertisementsApi.md#uploadAdvertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz
*AuthenticationApi* | [**checkCredentials**](docs/AuthenticationApi.md#checkCredentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
*AuthenticationApi* | [**requestAuthenticationCode**](docs/AuthenticationApi.md#requestAuthenticationCode) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz
*AuthenticationApi* | [**submitAuthenticationCode**](docs/AuthenticationApi.md#submitAuthenticationCode) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz


## Documentation for Models

 - [Advertisement](docs/Advertisement.md)
 - [Error](docs/Error.md)
 - [MainCategory](docs/MainCategory.md)
 - [Photo](docs/Photo.md)
 - [Seller](docs/Seller.md)
 - [SubCategory](docs/SubCategory.md)
 - [UploadRequest](docs/UploadRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



