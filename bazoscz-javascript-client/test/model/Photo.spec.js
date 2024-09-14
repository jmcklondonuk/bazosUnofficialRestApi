/**
 * Bazos.cz API
 * This is a REST API for bazos.cz
 *
 * The version of the OpenAPI document: v0.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BazosCzApi);
  }
}(this, function(expect, BazosCzApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BazosCzApi.Photo();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Photo', function() {
    it('should create an instance of Photo', function() {
      // uncomment below and update the code to test Photo
      //var instance = new BazosCzApi.Photo();
      //expect(instance).to.be.a(BazosCzApi.Photo);
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new BazosCzApi.Photo();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instance = new BazosCzApi.Photo();
      //expect(instance).to.be();
    });

  });

}));
