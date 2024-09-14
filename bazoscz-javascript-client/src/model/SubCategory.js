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

import ApiClient from '../ApiClient';
import MainCategory from './MainCategory';

/**
 * The SubCategory model module.
 * @module model/SubCategory
 * @version v0.9.2
 */
class SubCategory {
    /**
     * Constructs a new <code>SubCategory</code>.
     * @alias module:model/SubCategory
     */
    constructor() { 
        
        SubCategory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SubCategory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SubCategory} obj Optional instance to populate.
     * @return {module:model/SubCategory} The populated <code>SubCategory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubCategory();

            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('mainCategory')) {
                obj['mainCategory'] = MainCategory.constructFromObject(data['mainCategory']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SubCategory</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SubCategory</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // validate the optional field `mainCategory`
        if (data['mainCategory']) { // data not null
          MainCategory.validateJSON(data['mainCategory']);
        }

        return true;
    }


}



/**
 * @member {String} url
 */
SubCategory.prototype['url'] = undefined;

/**
 * @member {String} title
 */
SubCategory.prototype['title'] = undefined;

/**
 * @member {module:model/MainCategory} mainCategory
 */
SubCategory.prototype['mainCategory'] = undefined;






export default SubCategory;
