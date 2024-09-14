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


import ApiClient from './ApiClient';
import Advertisement from './model/Advertisement';
import Error from './model/Error';
import MainCategory from './model/MainCategory';
import Photo from './model/Photo';
import Seller from './model/Seller';
import SubCategory from './model/SubCategory';
import UploadRequest from './model/UploadRequest';
import AdvertisementsApi from './api/AdvertisementsApi';
import AuthenticationApi from './api/AuthenticationApi';


/**
* This is a REST API for bazos.cz.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var BazosCzApi = require('index'); // See note below*.
* var xxxSvc = new BazosCzApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new BazosCzApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new BazosCzApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new BazosCzApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version v0.9.2
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Advertisement model constructor.
     * @property {module:model/Advertisement}
     */
    Advertisement,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The MainCategory model constructor.
     * @property {module:model/MainCategory}
     */
    MainCategory,

    /**
     * The Photo model constructor.
     * @property {module:model/Photo}
     */
    Photo,

    /**
     * The Seller model constructor.
     * @property {module:model/Seller}
     */
    Seller,

    /**
     * The SubCategory model constructor.
     * @property {module:model/SubCategory}
     */
    SubCategory,

    /**
     * The UploadRequest model constructor.
     * @property {module:model/UploadRequest}
     */
    UploadRequest,

    /**
    * The AdvertisementsApi service constructor.
    * @property {module:api/AdvertisementsApi}
    */
    AdvertisementsApi,

    /**
    * The AuthenticationApi service constructor.
    * @property {module:api/AuthenticationApi}
    */
    AuthenticationApi
};