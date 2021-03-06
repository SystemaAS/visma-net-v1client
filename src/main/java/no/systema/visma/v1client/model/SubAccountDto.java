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
import java.util.ArrayList;
import java.util.List;
import no.systema.visma.v1client.model.SegmentDto;

/**
 * SubAccountDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class SubAccountDto {
  @JsonProperty("subaccountId")
  private Integer subaccountId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("segments")
  private List<SegmentDto> segments = null;

  public SubAccountDto subaccountId(Integer subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

   /**
   * Get subaccountId
   * @return subaccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getSubaccountId() {
    return subaccountId;
  }

  public void setSubaccountId(Integer subaccountId) {
    this.subaccountId = subaccountId;
  }

  public SubAccountDto description(String description) {
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

  public SubAccountDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The property is now considered obsolete, use SubaccountId instead.
   * @return id
  **/
  @ApiModelProperty(value = "The property is now considered obsolete, use SubaccountId instead.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SubAccountDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public SubAccountDto segments(List<SegmentDto> segments) {
    this.segments = segments;
    return this;
  }

  public SubAccountDto addSegmentsItem(SegmentDto segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(value = "")
  public List<SegmentDto> getSegments() {
    return segments;
  }

  public void setSegments(List<SegmentDto> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountDto subAccountDto = (SubAccountDto) o;
    return Objects.equals(this.subaccountId, subAccountDto.subaccountId) &&
        Objects.equals(this.description, subAccountDto.description) &&
        Objects.equals(this.id, subAccountDto.id) &&
        Objects.equals(this.lastModifiedDateTime, subAccountDto.lastModifiedDateTime) &&
        Objects.equals(this.segments, subAccountDto.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subaccountId, description, id, lastModifiedDateTime, segments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDto {\n");
    
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

