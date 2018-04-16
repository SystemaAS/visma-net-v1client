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
 * InventoryQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class InventoryQueryParameters {
  @JsonProperty("alternateID")
  private String alternateID = null;

  @JsonProperty("salesCategory")
  private Integer salesCategory = null;

  @JsonProperty("addCostPriceStatistics")
  private Boolean addCostPriceStatistics = null;

  @JsonProperty("attributes")
  private String attributes = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("availabilityLastModifiedDateTime")
  private String availabilityLastModifiedDateTime = null;

  @JsonProperty("availabilityLastModifiedDateTimeCondition")
  private String availabilityLastModifiedDateTimeCondition = null;

  @JsonProperty("expandCrossReference")
  private Boolean expandCrossReference = null;

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

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public InventoryQueryParameters alternateID(String alternateID) {
    this.alternateID = alternateID;
    return this;
  }

   /**
   * Get alternateID
   * @return alternateID
  **/
  @ApiModelProperty(value = "")
  public String getAlternateID() {
    return alternateID;
  }

  public void setAlternateID(String alternateID) {
    this.alternateID = alternateID;
  }

  public InventoryQueryParameters salesCategory(Integer salesCategory) {
    this.salesCategory = salesCategory;
    return this;
  }

   /**
   * Get salesCategory
   * @return salesCategory
  **/
  @ApiModelProperty(value = "")
  public Integer getSalesCategory() {
    return salesCategory;
  }

  public void setSalesCategory(Integer salesCategory) {
    this.salesCategory = salesCategory;
  }

  public InventoryQueryParameters addCostPriceStatistics(Boolean addCostPriceStatistics) {
    this.addCostPriceStatistics = addCostPriceStatistics;
    return this;
  }

   /**
   * This filter can be used only for stock items
   * @return addCostPriceStatistics
  **/
  @ApiModelProperty(value = "This filter can be used only for stock items")
  public Boolean isAddCostPriceStatistics() {
    return addCostPriceStatistics;
  }

  public void setAddCostPriceStatistics(Boolean addCostPriceStatistics) {
    this.addCostPriceStatistics = addCostPriceStatistics;
  }

  public InventoryQueryParameters attributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }

  public InventoryQueryParameters description(String description) {
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

  public InventoryQueryParameters availabilityLastModifiedDateTime(String availabilityLastModifiedDateTime) {
    this.availabilityLastModifiedDateTime = availabilityLastModifiedDateTime;
    return this;
  }

   /**
   * Get availabilityLastModifiedDateTime
   * @return availabilityLastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getAvailabilityLastModifiedDateTime() {
    return availabilityLastModifiedDateTime;
  }

  public void setAvailabilityLastModifiedDateTime(String availabilityLastModifiedDateTime) {
    this.availabilityLastModifiedDateTime = availabilityLastModifiedDateTime;
  }

  public InventoryQueryParameters availabilityLastModifiedDateTimeCondition(String availabilityLastModifiedDateTimeCondition) {
    this.availabilityLastModifiedDateTimeCondition = availabilityLastModifiedDateTimeCondition;
    return this;
  }

   /**
   * Get availabilityLastModifiedDateTimeCondition
   * @return availabilityLastModifiedDateTimeCondition
  **/
  @ApiModelProperty(value = "")
  public String getAvailabilityLastModifiedDateTimeCondition() {
    return availabilityLastModifiedDateTimeCondition;
  }

  public void setAvailabilityLastModifiedDateTimeCondition(String availabilityLastModifiedDateTimeCondition) {
    this.availabilityLastModifiedDateTimeCondition = availabilityLastModifiedDateTimeCondition;
  }

  public InventoryQueryParameters expandCrossReference(Boolean expandCrossReference) {
    this.expandCrossReference = expandCrossReference;
    return this;
  }

   /**
   * Get expandCrossReference
   * @return expandCrossReference
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpandCrossReference() {
    return expandCrossReference;
  }

  public void setExpandCrossReference(Boolean expandCrossReference) {
    this.expandCrossReference = expandCrossReference;
  }

  public InventoryQueryParameters greaterThanValue(String greaterThanValue) {
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

  public InventoryQueryParameters numberToRead(Integer numberToRead) {
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

  public InventoryQueryParameters skipRecords(Integer skipRecords) {
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

  public InventoryQueryParameters orderBy(String orderBy) {
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

  public InventoryQueryParameters lastModifiedDateTime(String lastModifiedDateTime) {
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

  public InventoryQueryParameters lastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
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

  public InventoryQueryParameters pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public InventoryQueryParameters pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryQueryParameters inventoryQueryParameters = (InventoryQueryParameters) o;
    return Objects.equals(this.alternateID, inventoryQueryParameters.alternateID) &&
        Objects.equals(this.salesCategory, inventoryQueryParameters.salesCategory) &&
        Objects.equals(this.addCostPriceStatistics, inventoryQueryParameters.addCostPriceStatistics) &&
        Objects.equals(this.attributes, inventoryQueryParameters.attributes) &&
        Objects.equals(this.description, inventoryQueryParameters.description) &&
        Objects.equals(this.availabilityLastModifiedDateTime, inventoryQueryParameters.availabilityLastModifiedDateTime) &&
        Objects.equals(this.availabilityLastModifiedDateTimeCondition, inventoryQueryParameters.availabilityLastModifiedDateTimeCondition) &&
        Objects.equals(this.expandCrossReference, inventoryQueryParameters.expandCrossReference) &&
        Objects.equals(this.greaterThanValue, inventoryQueryParameters.greaterThanValue) &&
        Objects.equals(this.numberToRead, inventoryQueryParameters.numberToRead) &&
        Objects.equals(this.skipRecords, inventoryQueryParameters.skipRecords) &&
        Objects.equals(this.orderBy, inventoryQueryParameters.orderBy) &&
        Objects.equals(this.lastModifiedDateTime, inventoryQueryParameters.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedDateTimeCondition, inventoryQueryParameters.lastModifiedDateTimeCondition) &&
        Objects.equals(this.pageNumber, inventoryQueryParameters.pageNumber) &&
        Objects.equals(this.pageSize, inventoryQueryParameters.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateID, salesCategory, addCostPriceStatistics, attributes, description, availabilityLastModifiedDateTime, availabilityLastModifiedDateTimeCondition, expandCrossReference, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryQueryParameters {\n");
    
    sb.append("    alternateID: ").append(toIndentedString(alternateID)).append("\n");
    sb.append("    salesCategory: ").append(toIndentedString(salesCategory)).append("\n");
    sb.append("    addCostPriceStatistics: ").append(toIndentedString(addCostPriceStatistics)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    availabilityLastModifiedDateTime: ").append(toIndentedString(availabilityLastModifiedDateTime)).append("\n");
    sb.append("    availabilityLastModifiedDateTimeCondition: ").append(toIndentedString(availabilityLastModifiedDateTimeCondition)).append("\n");
    sb.append("    expandCrossReference: ").append(toIndentedString(expandCrossReference)).append("\n");
    sb.append("    greaterThanValue: ").append(toIndentedString(greaterThanValue)).append("\n");
    sb.append("    numberToRead: ").append(toIndentedString(numberToRead)).append("\n");
    sb.append("    skipRecords: ").append(toIndentedString(skipRecords)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastModifiedDateTimeCondition: ").append(toIndentedString(lastModifiedDateTimeCondition)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
