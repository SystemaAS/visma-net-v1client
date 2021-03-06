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
 * EmployeeTimeCardQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class EmployeeTimeCardQueryParameters {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HOLD("Hold"),
    
    OPEN("Open"),
    
    APPROVED("Approved"),
    
    REJECTED("Rejected"),
    
    RELEASED("Released");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("week")
  private String week = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    NORMAL("Normal"),
    
    CORRECTION("Correction"),
    
    NORMALCORRECTED("NormalCorrected");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("greaterThanValue")
  private String greaterThanValue = null;

  @JsonProperty("numberToRead")
  private Integer numberToRead = null;

  @JsonProperty("skipRecords")
  private Integer skipRecords = null;

  @JsonProperty("orderBy")
  private String orderBy = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lastModifiedDateTimeCondition")
  private String lastModifiedDateTimeCondition = null;

  public EmployeeTimeCardQueryParameters status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public EmployeeTimeCardQueryParameters week(String week) {
    this.week = week;
    return this;
  }

   /**
   * Get week
   * @return week
  **/
  @ApiModelProperty(value = "")
  public String getWeek() {
    return week;
  }

  public void setWeek(String week) {
    this.week = week;
  }

  public EmployeeTimeCardQueryParameters type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EmployeeTimeCardQueryParameters greaterThanValue(String greaterThanValue) {
    this.greaterThanValue = greaterThanValue;
    return this;
  }

   /**
   * Get greaterThanValue
   * @return greaterThanValue
  **/
  @ApiModelProperty(value = "")
  public String getGreaterThanValue() {
    return greaterThanValue;
  }

  public void setGreaterThanValue(String greaterThanValue) {
    this.greaterThanValue = greaterThanValue;
  }

  public EmployeeTimeCardQueryParameters numberToRead(Integer numberToRead) {
    this.numberToRead = numberToRead;
    return this;
  }

   /**
   * Get numberToRead
   * @return numberToRead
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberToRead() {
    return numberToRead;
  }

  public void setNumberToRead(Integer numberToRead) {
    this.numberToRead = numberToRead;
  }

  public EmployeeTimeCardQueryParameters skipRecords(Integer skipRecords) {
    this.skipRecords = skipRecords;
    return this;
  }

   /**
   * Get skipRecords
   * @return skipRecords
  **/
  @ApiModelProperty(value = "")
  public Integer getSkipRecords() {
    return skipRecords;
  }

  public void setSkipRecords(Integer skipRecords) {
    this.skipRecords = skipRecords;
  }

  public EmployeeTimeCardQueryParameters orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public EmployeeTimeCardQueryParameters lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public EmployeeTimeCardQueryParameters lastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
    this.lastModifiedDateTimeCondition = lastModifiedDateTimeCondition;
    return this;
  }

   /**
   * Get lastModifiedDateTimeCondition
   * @return lastModifiedDateTimeCondition
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedDateTimeCondition() {
    return lastModifiedDateTimeCondition;
  }

  public void setLastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
    this.lastModifiedDateTimeCondition = lastModifiedDateTimeCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTimeCardQueryParameters employeeTimeCardQueryParameters = (EmployeeTimeCardQueryParameters) o;
    return Objects.equals(this.status, employeeTimeCardQueryParameters.status) &&
        Objects.equals(this.week, employeeTimeCardQueryParameters.week) &&
        Objects.equals(this.type, employeeTimeCardQueryParameters.type) &&
        Objects.equals(this.greaterThanValue, employeeTimeCardQueryParameters.greaterThanValue) &&
        Objects.equals(this.numberToRead, employeeTimeCardQueryParameters.numberToRead) &&
        Objects.equals(this.skipRecords, employeeTimeCardQueryParameters.skipRecords) &&
        Objects.equals(this.orderBy, employeeTimeCardQueryParameters.orderBy) &&
        Objects.equals(this.lastModifiedDateTime, employeeTimeCardQueryParameters.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedDateTimeCondition, employeeTimeCardQueryParameters.lastModifiedDateTimeCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, week, type, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTimeCardQueryParameters {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    greaterThanValue: ").append(toIndentedString(greaterThanValue)).append("\n");
    sb.append("    numberToRead: ").append(toIndentedString(numberToRead)).append("\n");
    sb.append("    skipRecords: ").append(toIndentedString(skipRecords)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastModifiedDateTimeCondition: ").append(toIndentedString(lastModifiedDateTimeCondition)).append("\n");
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

