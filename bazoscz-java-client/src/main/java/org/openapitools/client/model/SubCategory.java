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
import org.openapitools.client.model.MainCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubCategory
 */
@JsonPropertyOrder({
  SubCategory.JSON_PROPERTY_URL,
  SubCategory.JSON_PROPERTY_TITLE,
  SubCategory.JSON_PROPERTY_MAIN_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-14T11:45:00.040478100+02:00[Europe/Prague]", comments = "Generator version: 7.8.0")
public class SubCategory {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_MAIN_CATEGORY = "mainCategory";
  private MainCategory mainCategory;

  public SubCategory() {
  }

  public SubCategory url(String url) {
    
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

  public SubCategory title(String title) {
    
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

  public SubCategory mainCategory(MainCategory mainCategory) {
    
    this.mainCategory = mainCategory;
    return this;
  }

  /**
   * Get mainCategory
   * @return mainCategory
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MainCategory getMainCategory() {
    return mainCategory;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainCategory(MainCategory mainCategory) {
    this.mainCategory = mainCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCategory subCategory = (SubCategory) o;
    return Objects.equals(this.url, subCategory.url) &&
        Objects.equals(this.title, subCategory.title) &&
        Objects.equals(this.mainCategory, subCategory.mainCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, mainCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCategory {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    mainCategory: ").append(toIndentedString(mainCategory)).append("\n");
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

