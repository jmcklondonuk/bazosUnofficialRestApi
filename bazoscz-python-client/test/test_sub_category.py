# coding: utf-8

"""
    Bazos.cz API

    This is a REST API for bazos.cz

    The version of the OpenAPI document: v0.9.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.sub_category import SubCategory

class TestSubCategory(unittest.TestCase):
    """SubCategory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SubCategory:
        """Test SubCategory
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SubCategory`
        """
        model = SubCategory()
        if include_optional:
            return SubCategory(
                url = '',
                title = '',
                main_category = {"id":1,"title":"title","url":"url"}
            )
        else:
            return SubCategory(
        )
        """

    def testSubCategory(self):
        """Test SubCategory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
