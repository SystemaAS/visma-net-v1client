/*
 * Visma Net API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.13.03.0008
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package no.systema.visma.v1client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * DtoSegmentValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class DtoSegmentValue {
  @JsonProperty("valueId")
  private String valueId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("publicId")
  private UUID publicId = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("timeStamp")
  private String timeStamp = null;

  @JsonProperty("lastModified")
  private LocalDateTime lastModified = null;

  public DtoSegmentValue valueId(String valueId) {
    this.valueId = valueId;
    return this;
  }

   /**
   * Get valueId
   * @return valueId
  **/
  @ApiModelProperty(value = "")
  public String getValueId() {
    return valueId;
  }

  public void setValueId(String valueId) {
    this.valueId = valueId;
  }

  public DtoSegmentValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DtoSegmentValue publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Get publicId
   * @return publicId
  **/
  @ApiModelProperty(value = "")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public DtoSegmentValue active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public DtoSegmentValue timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(value = "")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public DtoSegmentValue lastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DtoSegmentValue dtoSegmentValue = (DtoSegmentValue) o;
    return Objects.equals(this.valueId, dtoSegmentValue.valueId) &&
        Objects.equals(this.description, dtoSegmentValue.description) &&
        Objects.equals(this.publicId, dtoSegmentValue.publicId) &&
        Objects.equals(this.active, dtoSegmentValue.active) &&
        Objects.equals(this.timeStamp, dtoSegmentValue.timeStamp) &&
        Objects.equals(this.lastModified, dtoSegmentValue.lastModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueId, description, publicId, active, timeStamp, lastModified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtoSegmentValue {\n");
    
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

