# coding: utf-8

"""
    Bazos.cz API

    This is a REST API for bazos.cz

    The version of the OpenAPI document: v0.9.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.photo import Photo
from openapi_client.models.sub_category import SubCategory
from typing import Optional, Set
from typing_extensions import Self

class Advertisement(BaseModel):
    """
    Advertisement
    """ # noqa: E501
    id: Optional[StrictInt] = None
    url: Optional[StrictStr] = None
    var_date: Optional[StrictStr] = Field(default=None, alias="date")
    title: Optional[StrictStr] = None
    price: Optional[Union[StrictFloat, StrictInt]] = None
    description: Optional[StrictStr] = None
    photos: Optional[List[Photo]] = None
    sub_category: Optional[SubCategory] = Field(default=None, alias="subCategory")
    __properties: ClassVar[List[str]] = ["id", "url", "date", "title", "price", "description", "photos", "subCategory"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Advertisement from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in photos (list)
        _items = []
        if self.photos:
            for _item_photos in self.photos:
                if _item_photos:
                    _items.append(_item_photos.to_dict())
            _dict['photos'] = _items
        # override the default output from pydantic by calling `to_dict()` of sub_category
        if self.sub_category:
            _dict['subCategory'] = self.sub_category.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Advertisement from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "url": obj.get("url"),
            "date": obj.get("date"),
            "title": obj.get("title"),
            "price": obj.get("price"),
            "description": obj.get("description"),
            "photos": [Photo.from_dict(_item) for _item in obj["photos"]] if obj.get("photos") is not None else None,
            "subCategory": SubCategory.from_dict(obj["subCategory"]) if obj.get("subCategory") is not None else None
        })
        return _obj

