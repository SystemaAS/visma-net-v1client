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
import no.systema.visma.v1client.model.DtoValueInt32;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * TimeCardSummaryUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class TimeCardSummaryUpdateDto {
  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    INSERT("Insert"),
    
    UPDATE("Update"),
    
    DELETE("Delete");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("lineNumber")
  private DtoValueInt32 lineNumber = null;

  @JsonProperty("earningType")
  private DtoValueString earningType = null;

  @JsonProperty("project")
  private DtoValueString project = null;

  @JsonProperty("projectTask")
  private DtoValueString projectTask = null;

  @JsonProperty("mon")
  private DtoValueNullableInt32 mon = null;

  @JsonProperty("tue")
  private DtoValueNullableInt32 tue = null;

  @JsonProperty("wed")
  private DtoValueNullableInt32 wed = null;

  @JsonProperty("thu")
  private DtoValueNullableInt32 thu = null;

  @JsonProperty("fri")
  private DtoValueNullableInt32 fri = null;

  @JsonProperty("sat")
  private DtoValueNullableInt32 sat = null;

  @JsonProperty("sun")
  private DtoValueNullableInt32 sun = null;

  @JsonProperty("invoiceable")
  private DtoValueNullableBoolean invoiceable = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  public TimeCardSummaryUpdateDto operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public TimeCardSummaryUpdateDto lineNumber(DtoValueInt32 lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueInt32 getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(DtoValueInt32 lineNumber) {
    this.lineNumber = lineNumber;
  }

  public TimeCardSummaryUpdateDto earningType(DtoValueString earningType) {
    this.earningType = earningType;
    return this;
  }

   /**
   * The type of the work time spent by the employee
   * @return earningType
  **/
  @ApiModelProperty(value = "The type of the work time spent by the employee")
  public DtoValueString getEarningType() {
    return earningType;
  }

  public void setEarningType(DtoValueString earningType) {
    this.earningType = earningType;
  }

  public TimeCardSummaryUpdateDto project(DtoValueString project) {
    this.project = project;
    return this;
  }

   /**
   * The project that the employee worked on.
   * @return project
  **/
  @ApiModelProperty(value = "The project that the employee worked on.")
  public DtoValueString getProject() {
    return project;
  }

  public void setProject(DtoValueString project) {
    this.project = project;
  }

  public TimeCardSummaryUpdateDto projectTask(DtoValueString projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * The project task that the employee worked on.
   * @return projectTask
  **/
  @ApiModelProperty(value = "The project task that the employee worked on.")
  public DtoValueString getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(DtoValueString projectTask) {
    this.projectTask = projectTask;
  }

  public TimeCardSummaryUpdateDto mon(DtoValueNullableInt32 mon) {
    this.mon = mon;
    return this;
  }

   /**
   * The work time reported for Monday, including overtime.
   * @return mon
  **/
  @ApiModelProperty(value = "The work time reported for Monday, including overtime.")
  public DtoValueNullableInt32 getMon() {
    return mon;
  }

  public void setMon(DtoValueNullableInt32 mon) {
    this.mon = mon;
  }

  public TimeCardSummaryUpdateDto tue(DtoValueNullableInt32 tue) {
    this.tue = tue;
    return this;
  }

   /**
   * The work time reported for Tuesday, including overtime.
   * @return tue
  **/
  @ApiModelProperty(value = "The work time reported for Tuesday, including overtime.")
  public DtoValueNullableInt32 getTue() {
    return tue;
  }

  public void setTue(DtoValueNullableInt32 tue) {
    this.tue = tue;
  }

  public TimeCardSummaryUpdateDto wed(DtoValueNullableInt32 wed) {
    this.wed = wed;
    return this;
  }

   /**
   * The work time reported for Wednesday, including overtime.
   * @return wed
  **/
  @ApiModelProperty(value = "The work time reported for Wednesday, including overtime.")
  public DtoValueNullableInt32 getWed() {
    return wed;
  }

  public void setWed(DtoValueNullableInt32 wed) {
    this.wed = wed;
  }

  public TimeCardSummaryUpdateDto thu(DtoValueNullableInt32 thu) {
    this.thu = thu;
    return this;
  }

   /**
   * The work time reported for Thursday, including overtime.
   * @return thu
  **/
  @ApiModelProperty(value = "The work time reported for Thursday, including overtime.")
  public DtoValueNullableInt32 getThu() {
    return thu;
  }

  public void setThu(DtoValueNullableInt32 thu) {
    this.thu = thu;
  }

  public TimeCardSummaryUpdateDto fri(DtoValueNullableInt32 fri) {
    this.fri = fri;
    return this;
  }

   /**
   * The work time reported for Friday, including overtime.
   * @return fri
  **/
  @ApiModelProperty(value = "The work time reported for Friday, including overtime.")
  public DtoValueNullableInt32 getFri() {
    return fri;
  }

  public void setFri(DtoValueNullableInt32 fri) {
    this.fri = fri;
  }

  public TimeCardSummaryUpdateDto sat(DtoValueNullableInt32 sat) {
    this.sat = sat;
    return this;
  }

   /**
   * The work time reported for Saturday, including overtime.
   * @return sat
  **/
  @ApiModelProperty(value = "The work time reported for Saturday, including overtime.")
  public DtoValueNullableInt32 getSat() {
    return sat;
  }

  public void setSat(DtoValueNullableInt32 sat) {
    this.sat = sat;
  }

  public TimeCardSummaryUpdateDto sun(DtoValueNullableInt32 sun) {
    this.sun = sun;
    return this;
  }

   /**
   * The work time reported for Sunday, including overtime.
   * @return sun
  **/
  @ApiModelProperty(value = "The work time reported for Sunday, including overtime.")
  public DtoValueNullableInt32 getSun() {
    return sun;
  }

  public void setSun(DtoValueNullableInt32 sun) {
    this.sun = sun;
  }

  public TimeCardSummaryUpdateDto invoiceable(DtoValueNullableBoolean invoiceable) {
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * A check box that you select to indicate that these work hours are invoiceable.
   * @return invoiceable
  **/
  @ApiModelProperty(value = "A check box that you select to indicate that these work hours are invoiceable.")
  public DtoValueNullableBoolean getInvoiceable() {
    return invoiceable;
  }

  public void setInvoiceable(DtoValueNullableBoolean invoiceable) {
    this.invoiceable = invoiceable;
  }

  public TimeCardSummaryUpdateDto description(DtoValueString description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the reported work hours.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the reported work hours.")
  public DtoValueString getDescription() {
    return description;
  }

  public void setDescription(DtoValueString description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeCardSummaryUpdateDto timeCardSummaryUpdateDto = (TimeCardSummaryUpdateDto) o;
    return Objects.equals(this.operation, timeCardSummaryUpdateDto.operation) &&
        Objects.equals(this.lineNumber, timeCardSummaryUpdateDto.lineNumber) &&
        Objects.equals(this.earningType, timeCardSummaryUpdateDto.earningType) &&
        Objects.equals(this.project, timeCardSummaryUpdateDto.project) &&
        Objects.equals(this.projectTask, timeCardSummaryUpdateDto.projectTask) &&
        Objects.equals(this.mon, timeCardSummaryUpdateDto.mon) &&
        Objects.equals(this.tue, timeCardSummaryUpdateDto.tue) &&
        Objects.equals(this.wed, timeCardSummaryUpdateDto.wed) &&
        Objects.equals(this.thu, timeCardSummaryUpdateDto.thu) &&
        Objects.equals(this.fri, timeCardSummaryUpdateDto.fri) &&
        Objects.equals(this.sat, timeCardSummaryUpdateDto.sat) &&
        Objects.equals(this.sun, timeCardSummaryUpdateDto.sun) &&
        Objects.equals(this.invoiceable, timeCardSummaryUpdateDto.invoiceable) &&
        Objects.equals(this.description, timeCardSummaryUpdateDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, lineNumber, earningType, project, projectTask, mon, tue, wed, thu, fri, sat, sun, invoiceable, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeCardSummaryUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    earningType: ").append(toIndentedString(earningType)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
