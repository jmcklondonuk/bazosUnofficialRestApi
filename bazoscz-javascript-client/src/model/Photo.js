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

/**
 * The Photo model module.
 * @module model/Photo
 * @version v0.9.2
 */
class Photo {
    /**
     * Constructs a new <code>Photo</code>.
     * @alias module:model/Photo
     */
    constructor() { 
        
        Photo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Photo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Photo} obj Optional instance to populate.
     * @return {module:model/Photo} The populated <code>Photo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Photo();

            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'Blob');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Photo</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Photo</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }

        return true;
    }


}



/**
 * @member {String} url
 */
Photo.prototype['url'] = undefined;

/**
 * @member {Blob} content
 */
Photo.prototype['content'] = undefined;






export default Photo;

