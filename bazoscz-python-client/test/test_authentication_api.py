# coding: utf-8

"""
    Bazos.cz API

    This is a REST API for bazos.cz

    The version of the OpenAPI document: v0.9.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.authentication_api import AuthenticationApi


class TestAuthenticationApi(unittest.TestCase):
    """AuthenticationApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AuthenticationApi()

    def tearDown(self) -> None:
        pass

    def test_check_credentials(self) -> None:
        """Test case for check_credentials

        Verifies the bazos ID and bazos code are valid. If this fails you need to authenticate again.
        """
        pass

    def test_request_authentication_code(self) -> None:
        """Test case for request_authentication_code

        Requests a code on your phone to authenticate for using bazos.cz
        """
        pass

    def test_submit_authentication_code(self) -> None:
        """Test case for submit_authentication_code

        Sends an authentication code, obtained via text message on your phone, back to bazos.cz
        """
        pass


if __name__ == '__main__':
    unittest.main()
