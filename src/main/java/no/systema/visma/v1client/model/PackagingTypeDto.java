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

/**
 * This class represents a PackagingType in PackagingTypeController. Used by getting data.
 */
@ApiModel(description = "This class represents a PackagingType in PackagingTypeController. Used by getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PackagingTypeDto {
  @JsonProperty("boxId")
  private String boxId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("boxWeight")
  private Double boxWeight = null;

  @JsonProperty("maxWeight")
  private Double maxWeight = null;

  @JsonProperty("weightUoM")
  private String weightUoM = null;

  @JsonProperty("maxVolume")
  private Double maxVolume = null;

  @JsonProperty("volumeUoM")
  private String volumeUoM = null;

  @JsonProperty("length")
  private Integer length = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  @JsonProperty("activeByDefault")
  private Boolean activeByDefault = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public PackagingTypeDto boxId(String boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * Get boxId
   * @return boxId
  **/
  @ApiModelProperty(value = "")
  public String getBoxId() {
    return boxId;
  }

  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }

  public PackagingTypeDto description(String description) {
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

  public PackagingTypeDto boxWeight(Double boxWeight) {
    this.boxWeight = boxWeight;
    return this;
  }

   /**
   * Get boxWeight
   * @return boxWeight
  **/
  @ApiModelProperty(value = "")
  public Double getBoxWeight() {
    return boxWeight;
  }

  public void setBoxWeight(Double boxWeight) {
    this.boxWeight = boxWeight;
  }

  public PackagingTypeDto maxWeight(Double maxWeight) {
    this.maxWeight = maxWeight;
    return this;
  }

   /**
   * Get maxWeight
   * @return maxWeight
  **/
  @ApiModelProperty(value = "")
  public Double getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(Double maxWeight) {
    this.maxWeight = maxWeight;
  }

  public PackagingTypeDto weightUoM(String weightUoM) {
    this.weightUoM = weightUoM;
    return this;
  }

   /**
   * Get weightUoM
   * @return weightUoM
  **/
  @ApiModelProperty(value = "")
  public String getWeightUoM() {
    return weightUoM;
  }

  public void setWeightUoM(String weightUoM) {
    this.weightUoM = weightUoM;
  }

  public PackagingTypeDto maxVolume(Double maxVolume) {
    this.maxVolume = maxVolume;
    return this;
  }

   /**
   * Get maxVolume
   * @return maxVolume
  **/
  @ApiModelProperty(value = "")
  public Double getMaxVolume() {
    return maxVolume;
  }

  public void setMaxVolume(Double maxVolume) {
    this.maxVolume = maxVolume;
  }

  public PackagingTypeDto volumeUoM(String volumeUoM) {
    this.volumeUoM = volumeUoM;
    return this;
  }

   /**
   * Get volumeUoM
   * @return volumeUoM
  **/
  @ApiModelProperty(value = "")
  public String getVolumeUoM() {
    return volumeUoM;
  }

  public void setVolumeUoM(String volumeUoM) {
    this.volumeUoM = volumeUoM;
  }

  public PackagingTypeDto length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public PackagingTypeDto width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PackagingTypeDto height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PackagingTypeDto activeByDefault(Boolean activeByDefault) {
    this.activeByDefault = activeByDefault;
    return this;
  }

   /**
   * Get activeByDefault
   * @return activeByDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isActiveByDefault() {
    return activeByDefault;
  }

  public void setActiveByDefault(Boolean activeByDefault) {
    this.activeByDefault = activeByDefault;
  }

  public PackagingTypeDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackagingTypeDto packagingTypeDto = (PackagingTypeDto) o;
    return Objects.equals(this.boxId, packagingTypeDto.boxId) &&
        Objects.equals(this.description, packagingTypeDto.description) &&
        Objects.equals(this.boxWeight, packagingTypeDto.boxWeight) &&
        Objects.equals(this.maxWeight, packagingTypeDto.maxWeight) &&
        Objects.equals(this.weightUoM, packagingTypeDto.weightUoM) &&
        Objects.equals(this.maxVolume, packagingTypeDto.maxVolume) &&
        Objects.equals(this.volumeUoM, packagingTypeDto.volumeUoM) &&
        Objects.equals(this.length, packagingTypeDto.length) &&
        Objects.equals(this.width, packagingTypeDto.width) &&
        Objects.equals(this.height, packagingTypeDto.height) &&
        Objects.equals(this.activeByDefault, packagingTypeDto.activeByDefault) &&
        Objects.equals(this.lastModifiedDateTime, packagingTypeDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, description, boxWeight, maxWeight, weightUoM, maxVolume, volumeUoM, length, width, height, activeByDefault, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackagingTypeDto {\n");
    
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    boxWeight: ").append(toIndentedString(boxWeight)).append("\n");
    sb.append("    maxWeight: ").append(toIndentedString(maxWeight)).append("\n");
    sb.append("    weightUoM: ").append(toIndentedString(weightUoM)).append("\n");
    sb.append("    maxVolume: ").append(toIndentedString(maxVolume)).append("\n");
    sb.append("    volumeUoM: ").append(toIndentedString(volumeUoM)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    activeByDefault: ").append(toIndentedString(activeByDefault)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
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

