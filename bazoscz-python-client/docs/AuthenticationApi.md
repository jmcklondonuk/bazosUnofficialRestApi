# openapi_client.AuthenticationApi

All URIs are relative to *http://127.0.0.1:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_credentials**](AuthenticationApi.md#check_credentials) | **GET** /api/v1/check-credentials/{bid}/{bkod} | Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
[**request_authentication_code**](AuthenticationApi.md#request_authentication_code) | **GET** /api/v1/request-authentication-code/{phone} | Requests a code on your phone to authenticate for using bazos.cz
[**submit_authentication_code**](AuthenticationApi.md#submit_authentication_code) | **GET** /api/v1/submit-authentication-code/{code}/{phone} | Sends an authentication code, obtained via text message on your phone, back to bazos.cz


# **check_credentials**
> bool check_credentials(bid, bkod)

Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.

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
    api_instance = openapi_client.AuthenticationApi(api_client)
    bid = 56 # int | 
    bkod = 'bkod_example' # str | 

    try:
        # Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
        api_response = api_instance.check_credentials(bid, bkod)
        print("The response of AuthenticationApi->check_credentials:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticationApi->check_credentials: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bid** | **int**|  | 
 **bkod** | **str**|  | 

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

# **request_authentication_code**
> str request_authentication_code(phone)

Requests a code on your phone to authenticate for using bazos.cz

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
    api_instance = openapi_client.AuthenticationApi(api_client)
    phone = 'phone_example' # str | 

    try:
        # Requests a code on your phone to authenticate for using bazos.cz
        api_response = api_instance.request_authentication_code(phone)
        print("The response of AuthenticationApi->request_authentication_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticationApi->request_authentication_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **str**|  | 

### Return type

**str**

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

# **submit_authentication_code**
> Dict[str, str] submit_authentication_code(code, phone)

Sends an authentication code, obtained via text message on your phone, back to bazos.cz

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
    api_instance = openapi_client.AuthenticationApi(api_client)
    code = 'code_example' # str | 
    phone = 'phone_example' # str | 

    try:
        # Sends an authentication code, obtained via text message on your phone, back to bazos.cz
        api_response = api_instance.submit_authentication_code(code, phone)
        print("The response of AuthenticationApi->submit_authentication_code:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthenticationApi->submit_authentication_code: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  | 
 **phone** | **str**|  | 

### Return type

**Dict[str, str]**

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

