/*
 * Bazos.cz API
 * This is a REST API for bazos.cz
 *
 * The version of the OpenAPI document: v0.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Photo;
import org.openapitools.client.model.SubCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Advertisement
 */
@JsonPropertyOrder({
  Advertisement.JSON_PROPERTY_ID,
  Advertisement.JSON_PROPERTY_URL,
  Advertisement.JSON_PROPERTY_DATE,
  Advertisement.JSON_PROPERTY_TITLE,
  Advertisement.JSON_PROPERTY_PRICE,
  Advertisement.JSON_PROPERTY_DESCRIPTION,
  Advertisement.JSON_PROPERTY_PHOTOS,
  Advertisement.JSON_PROPERTY_SUB_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-14T11:45:00.040478100+02:00[Europe/Prague]", comments = "Generator version: 7.8.0")
public class Advertisement {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Float price;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PHOTOS = "photos";
  private List<Photo> photos = new ArrayList<>();

  public static final String JSON_PROPERTY_SUB_CATEGORY = "subCategory";
  private SubCategory subCategory;

  public Advertisement() {
  }

  public Advertisement id(Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }

  public Advertisement url(String url) {
    
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  public Advertisement date(String date) {
    
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }

  public Advertisement title(String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  public Advertisement price(Float price) {
    
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Float price) {
    this.price = price;
  }

  public Advertisement description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  public Advertisement photos(List<Photo> photos) {
    
    this.photos = photos;
    return this;
  }

  public Advertisement addPhotosItem(Photo photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Photo> getPhotos() {
    return photos;
  }


  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public Advertisement subCategory(SubCategory subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

  /**
   * Get subCategory
   * @return subCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubCategory getSubCategory() {
    return subCategory;
  }


  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubCategory(SubCategory subCategory) {
    this.subCategory = subCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advertisement advertisement = (Advertisement) o;
    return Objects.equals(this.id, advertisement.id) &&
        Objects.equals(this.url, advertisement.url) &&
        Objects.equals(this.date, advertisement.date) &&
        Objects.equals(this.title, advertisement.title) &&
        Objects.equals(this.price, advertisement.price) &&
        Objects.equals(this.description, advertisement.description) &&
        Objects.equals(this.photos, advertisement.photos) &&
        Objects.equals(this.subCategory, advertisement.subCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, date, title, price, description, photos, subCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advertisement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

