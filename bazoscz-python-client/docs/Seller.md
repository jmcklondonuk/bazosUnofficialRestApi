# Seller


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phone** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**ad_seller_name** | **str** |  | [optional] 
**ad_phone** | **str** |  | [optional] 
**ad_email** | **str** |  | [optional] 
**ad_zip** | **str** |  | [optional] 
**ad_password** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.seller import Seller

# TODO update the JSON string below
json = "{}"
# create an instance of Seller from a JSON string
seller_instance = Seller.from_json(json)
# print the JSON string representation of the object
print(Seller.to_json())

# convert the object into a dict
seller_dict = seller_instance.to_dict()
# create an instance of Seller from a dict
seller_from_dict = Seller.from_dict(seller_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


