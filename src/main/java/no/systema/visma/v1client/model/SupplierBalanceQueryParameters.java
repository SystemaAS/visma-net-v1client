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
 * SupplierBalanceQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class SupplierBalanceQueryParameters {
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

  public SupplierBalanceQueryParameters greaterThanValue(String greaterThanValue) {
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

  public SupplierBalanceQueryParameters numberToRead(Integer numberToRead) {
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

  public SupplierBalanceQueryParameters skipRecords(Integer skipRecords) {
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

  public SupplierBalanceQueryParameters orderBy(String orderBy) {
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

  public SupplierBalanceQueryParameters lastModifiedDateTime(String lastModifiedDateTime) {
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

  public SupplierBalanceQueryParameters lastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
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
    SupplierBalanceQueryParameters supplierBalanceQueryParameters = (SupplierBalanceQueryParameters) o;
    return Objects.equals(this.greaterThanValue, supplierBalanceQueryParameters.greaterThanValue) &&
        Objects.equals(this.numberToRead, supplierBalanceQueryParameters.numberToRead) &&
        Objects.equals(this.skipRecords, supplierBalanceQueryParameters.skipRecords) &&
        Objects.equals(this.orderBy, supplierBalanceQueryParameters.orderBy) &&
        Objects.equals(this.lastModifiedDateTime, supplierBalanceQueryParameters.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedDateTimeCondition, supplierBalanceQueryParameters.lastModifiedDateTimeCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierBalanceQueryParameters {\n");
    
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

