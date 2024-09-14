package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.validation.constraints.NotNull;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * Error
 */

public class Error {

  private String code;

  private String message;

  public Error() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @NotNull
  @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

