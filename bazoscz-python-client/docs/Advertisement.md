# Advertisement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**url** | **str** |  | [optional] 
**var_date** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**price** | **float** |  | [optional] 
**description** | **str** |  | [optional] 
**photos** | [**List[Photo]**](Photo.md) |  | [optional] 
**sub_category** | [**SubCategory**](SubCategory.md) |  | [optional] 

## Example

```python
from openapi_client.models.advertisement import Advertisement

# TODO update the JSON string below
json = "{}"
# create an instance of Advertisement from a JSON string
advertisement_instance = Advertisement.from_json(json)
# print the JSON string representation of the object
print(Advertisement.to_json())

# convert the object into a dict
advertisement_dict = advertisement_instance.to_dict()
# create an instance of Advertisement from a dict
advertisement_from_dict = Advertisement.from_dict(advertisement_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


