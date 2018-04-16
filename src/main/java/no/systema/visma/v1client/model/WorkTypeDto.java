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

/**
 * WorkTypeDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class WorkTypeDto {
  /**
   * Gets or Sets rutRotType
   */
  public enum RutRotTypeEnum {
    RUT("Rut"),
    
    ROT("Rot");

    private String value;

    RutRotTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RutRotTypeEnum fromValue(String text) {
      for (RutRotTypeEnum b : RutRotTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rutRotType")
  private RutRotTypeEnum rutRotType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("xmlTag")
  private String xmlTag = null;

  public WorkTypeDto rutRotType(RutRotTypeEnum rutRotType) {
    this.rutRotType = rutRotType;
    return this;
  }

   /**
   * Get rutRotType
   * @return rutRotType
  **/
  @ApiModelProperty(value = "")
  public RutRotTypeEnum getRutRotType() {
    return rutRotType;
  }

  public void setRutRotType(RutRotTypeEnum rutRotType) {
    this.rutRotType = rutRotType;
  }

  public WorkTypeDto description(String description) {
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

  public WorkTypeDto xmlTag(String xmlTag) {
    this.xmlTag = xmlTag;
    return this;
  }

   /**
   * Get xmlTag
   * @return xmlTag
  **/
  @ApiModelProperty(value = "")
  public String getXmlTag() {
    return xmlTag;
  }

  public void setXmlTag(String xmlTag) {
    this.xmlTag = xmlTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkTypeDto workTypeDto = (WorkTypeDto) o;
    return Objects.equals(this.rutRotType, workTypeDto.rutRotType) &&
        Objects.equals(this.description, workTypeDto.description) &&
        Objects.equals(this.xmlTag, workTypeDto.xmlTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rutRotType, description, xmlTag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkTypeDto {\n");
    
    sb.append("    rutRotType: ").append(toIndentedString(rutRotType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    xmlTag: ").append(toIndentedString(xmlTag)).append("\n");
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
