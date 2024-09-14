package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Seller
 */

public class Seller {

  private String phone;

  private String email;

  private String adSellerName;

  private String adPhone;

  private String adEmail;

  private String adZip;

  private String adPassword;

  public Seller phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Seller email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Seller adSellerName(String adSellerName) {
    this.adSellerName = adSellerName;
    return this;
  }

  /**
   * Get adSellerName
   * @return adSellerName
   */
  
  @Schema(name = "adSellerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adSellerName")
  public String getAdSellerName() {
    return adSellerName;
  }

  public void setAdSellerName(String adSellerName) {
    this.adSellerName = adSellerName;
  }

  public Seller adPhone(String adPhone) {
    this.adPhone = adPhone;
    return this;
  }

  /**
   * Get adPhone
   * @return adPhone
   */
  
  @Schema(name = "adPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adPhone")
  public String getAdPhone() {
    return adPhone;
  }

  public void setAdPhone(String adPhone) {
    this.adPhone = adPhone;
  }

  public Seller adEmail(String adEmail) {
    this.adEmail = adEmail;
    return this;
  }

  /**
   * Get adEmail
   * @return adEmail
   */
  
  @Schema(name = "adEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adEmail")
  public String getAdEmail() {
    return adEmail;
  }

  public void setAdEmail(String adEmail) {
    this.adEmail = adEmail;
  }

  public Seller adZip(String adZip) {
    this.adZip = adZip;
    return this;
  }

  /**
   * Get adZip
   * @return adZip
   */
  
  @Schema(name = "adZip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adZip")
  public String getAdZip() {
    return adZip;
  }

  public void setAdZip(String adZip) {
    this.adZip = adZip;
  }

  public Seller adPassword(String adPassword) {
    this.adPassword = adPassword;
    return this;
  }

  /**
   * Get adPassword
   * @return adPassword
   */
  
  @Schema(name = "adPassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adPassword")
  public String getAdPassword() {
    return adPassword;
  }

  public void setAdPassword(String adPassword) {
    this.adPassword = adPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seller seller = (Seller) o;
    return Objects.equals(this.phone, seller.phone) &&
        Objects.equals(this.email, seller.email) &&
        Objects.equals(this.adSellerName, seller.adSellerName) &&
        Objects.equals(this.adPhone, seller.adPhone) &&
        Objects.equals(this.adEmail, seller.adEmail) &&
        Objects.equals(this.adZip, seller.adZip) &&
        Objects.equals(this.adPassword, seller.adPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, email, adSellerName, adPhone, adEmail, adZip, adPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seller {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    adSellerName: ").append(toIndentedString(adSellerName)).append("\n");
    sb.append("    adPhone: ").append(toIndentedString(adPhone)).append("\n");
    sb.append("    adEmail: ").append(toIndentedString(adEmail)).append("\n");
    sb.append("    adZip: ").append(toIndentedString(adZip)).append("\n");
    sb.append("    adPassword: ").append(toIndentedString(adPassword)).append("\n");
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

