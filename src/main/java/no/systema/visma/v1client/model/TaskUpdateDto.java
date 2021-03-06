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
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueNullableProjectStatus;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * TaskUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class TaskUpdateDto {
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

  @JsonProperty("taskId")
  private DtoValueString taskId = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("plannedStart")
  private DtoValueNullableDateTime plannedStart = null;

  @JsonProperty("plannedEnd")
  private DtoValueNullableDateTime plannedEnd = null;

  @JsonProperty("startDate")
  private DtoValueNullableDateTime startDate = null;

  @JsonProperty("rateTable")
  private DtoValueString rateTable = null;

  @JsonProperty("status")
  private DtoValueNullableProjectStatus status = null;

  public TaskUpdateDto operation(OperationEnum operation) {
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

  public TaskUpdateDto taskId(DtoValueString taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTaskId() {
    return taskId;
  }

  public void setTaskId(DtoValueString taskId) {
    this.taskId = taskId;
  }

  public TaskUpdateDto description(DtoValueString description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDescription() {
    return description;
  }

  public void setDescription(DtoValueString description) {
    this.description = description;
  }

  public TaskUpdateDto plannedStart(DtoValueNullableDateTime plannedStart) {
    this.plannedStart = plannedStart;
    return this;
  }

   /**
   * Get plannedStart
   * @return plannedStart
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDateTime getPlannedStart() {
    return plannedStart;
  }

  public void setPlannedStart(DtoValueNullableDateTime plannedStart) {
    this.plannedStart = plannedStart;
  }

  public TaskUpdateDto plannedEnd(DtoValueNullableDateTime plannedEnd) {
    this.plannedEnd = plannedEnd;
    return this;
  }

   /**
   * Get plannedEnd
   * @return plannedEnd
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDateTime getPlannedEnd() {
    return plannedEnd;
  }

  public void setPlannedEnd(DtoValueNullableDateTime plannedEnd) {
    this.plannedEnd = plannedEnd;
  }

  public TaskUpdateDto startDate(DtoValueNullableDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DtoValueNullableDateTime startDate) {
    this.startDate = startDate;
  }

  public TaskUpdateDto rateTable(DtoValueString rateTable) {
    this.rateTable = rateTable;
    return this;
  }

   /**
   * Get rateTable
   * @return rateTable
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getRateTable() {
    return rateTable;
  }

  public void setRateTable(DtoValueString rateTable) {
    this.rateTable = rateTable;
  }

  public TaskUpdateDto status(DtoValueNullableProjectStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableProjectStatus getStatus() {
    return status;
  }

  public void setStatus(DtoValueNullableProjectStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdateDto taskUpdateDto = (TaskUpdateDto) o;
    return Objects.equals(this.operation, taskUpdateDto.operation) &&
        Objects.equals(this.taskId, taskUpdateDto.taskId) &&
        Objects.equals(this.description, taskUpdateDto.description) &&
        Objects.equals(this.plannedStart, taskUpdateDto.plannedStart) &&
        Objects.equals(this.plannedEnd, taskUpdateDto.plannedEnd) &&
        Objects.equals(this.startDate, taskUpdateDto.startDate) &&
        Objects.equals(this.rateTable, taskUpdateDto.rateTable) &&
        Objects.equals(this.status, taskUpdateDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, taskId, description, plannedStart, plannedEnd, startDate, rateTable, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plannedStart: ").append(toIndentedString(plannedStart)).append("\n");
    sb.append("    plannedEnd: ").append(toIndentedString(plannedEnd)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    rateTable: ").append(toIndentedString(rateTable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

