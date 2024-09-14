# UploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **str** |  | [optional] 
**bkod** | **str** |  | [optional] 
**advertisement** | [**Advertisement**](Advertisement.md) |  | [optional] 
**seller** | [**Seller**](Seller.md) |  | [optional] 

## Example

```python
from openapi_client.models.upload_request import UploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UploadRequest from a JSON string
upload_request_instance = UploadRequest.from_json(json)
# print the JSON string representation of the object
print(UploadRequest.to_json())

# convert the object into a dict
upload_request_dict = upload_request_instance.to_dict()
# create an instance of UploadRequest from a dict
upload_request_from_dict = UploadRequest.from_dict(upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


