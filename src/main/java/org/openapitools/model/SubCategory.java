package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.validation.Valid;
import org.openapitools.model.MainCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * SubCategory
 */

public class SubCategory {

  private String url;

  private String title;

  private MainCategory mainCategory;

  public SubCategory url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

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
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

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
  @Valid
  @Schema(name = "mainCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mainCategory")
  public MainCategory getMainCategory() {
    return mainCategory;
  }

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

