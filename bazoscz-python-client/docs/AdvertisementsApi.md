# openapi_client.AdvertisementsApi

All URIs are relative to *http://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_advertisement**](AdvertisementsApi.md#delete_advertisement) | **POST** /api/v1/delete-advertisement | Deletes your advertisement from bazos.cz
[**list_own_advertisements**](AdvertisementsApi.md#list_own_advertisements) | **GET** /api/v1/list-own-advertisements/{email}/{phone}/{password}/{downloadPhotos} | Downloads your own advertisements from bazos.cz including photos
[**scrape_own_advertisement**](AdvertisementsApi.md#scrape_own_advertisement) | **POST** /api/v1/scrape-own-advertisement | Scrapes your own advertisement from bazos.cz including photos
[**upload_advertisement**](AdvertisementsApi.md#upload_advertisement) | **POST** /api/v1/upload-advertisement | Uploads an advertisement to bazos.cz


# **delete_advertisement**
> bool delete_advertisement(url, password)

Deletes your advertisement from bazos.cz

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://127.0.0.1:8080
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://127.0.0.1:8080"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdvertisementsApi(api_client)
    url = 'url_example' # str | 
    password = 'password_example' # str | 

    try:
        # Deletes your advertisement from bazos.cz
        api_response = api_instance.delete_advertisement(url, password)
        print("The response of AdvertisementsApi->delete_advertisement:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvertisementsApi->delete_advertisement: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **str**|  | 
 **password** | **str**|  | 

### Return type

**bool**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_own_advertisements**
> List[Advertisement] list_own_advertisements(email, phone, password, download_photos)

Downloads your own advertisements from bazos.cz including photos

### Example


```python
import openapi_client
from openapi_client.models.advertisement import Advertisement
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://127.0.0.1:8080
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://127.0.0.1:8080"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdvertisementsApi(api_client)
    email = 'email_example' # str | 
    phone = 'phone_example' # str | 
    password = 'password_example' # str | 
    download_photos = True # bool | 

    try:
        # Downloads your own advertisements from bazos.cz including photos
        api_response = api_instance.list_own_advertisements(email, phone, password, download_photos)
        print("The response of AdvertisementsApi->list_own_advertisements:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvertisementsApi->list_own_advertisements: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **str**|  | 
 **phone** | **str**|  | 
 **password** | **str**|  | 
 **download_photos** | **bool**|  | 

### Return type

[**List[Advertisement]**](Advertisement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scrape_own_advertisement**
> Advertisement scrape_own_advertisement(url, password, download_photos)

Scrapes your own advertisement from bazos.cz including photos

### Example


```python
import openapi_client
from openapi_client.models.advertisement import Advertisement
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://127.0.0.1:8080
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://127.0.0.1:8080"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdvertisementsApi(api_client)
    url = 'url_example' # str | 
    password = 'password_example' # str | 
    download_photos = True # bool | 

    try:
        # Scrapes your own advertisement from bazos.cz including photos
        api_response = api_instance.scrape_own_advertisement(url, password, download_photos)
        print("The response of AdvertisementsApi->scrape_own_advertisement:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvertisementsApi->scrape_own_advertisement: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **str**|  | 
 **password** | **str**|  | 
 **download_photos** | **bool**|  | 

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
**200** | OK |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_advertisement**
> int upload_advertisement(upload_request)

Uploads an advertisement to bazos.cz

### Example


```python
import openapi_client
from openapi_client.models.upload_request import UploadRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://127.0.0.1:8080
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://127.0.0.1:8080"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdvertisementsApi(api_client)
    upload_request = openapi_client.UploadRequest() # UploadRequest | 

    try:
        # Uploads an advertisement to bazos.cz
        api_response = api_instance.upload_advertisement(upload_request)
        print("The response of AdvertisementsApi->upload_advertisement:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdvertisementsApi->upload_advertisement: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_request** | [**UploadRequest**](UploadRequest.md)|  | 

### Return type

**int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

