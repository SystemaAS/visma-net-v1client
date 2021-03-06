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
 * CustomerQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerQueryParameters {
  @JsonProperty("greaterThanValue")
  private String greaterThanValue = null;

  @JsonProperty("numberToRead")
  private Integer numberToRead = null;

  @JsonProperty("skipRecords")
  private Integer skipRecords = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    ONHOLD("OnHold"),
    
    CREDITHOLD("CreditHold"),
    
    INACTIVE("Inactive"),
    
    ONETIME("OneTime");

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

  @JsonProperty("corporateId")
  private String corporateId = null;

  @JsonProperty("vatRegistrationId")
  private String vatRegistrationId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lastModifiedDateTimeCondition")
  private String lastModifiedDateTimeCondition = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("createdDateTimeCondition")
  private String createdDateTimeCondition = null;

  @JsonProperty("attributes")
  private String attributes = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public CustomerQueryParameters greaterThanValue(String greaterThanValue) {
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

  public CustomerQueryParameters numberToRead(Integer numberToRead) {
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

  public CustomerQueryParameters skipRecords(Integer skipRecords) {
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

  public CustomerQueryParameters name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerQueryParameters status(StatusEnum status) {
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

  public CustomerQueryParameters corporateId(String corporateId) {
    this.corporateId = corporateId;
    return this;
  }

   /**
   * Get corporateId
   * @return corporateId
  **/
  @ApiModelProperty(value = "")
  public String getCorporateId() {
    return corporateId;
  }

  public void setCorporateId(String corporateId) {
    this.corporateId = corporateId;
  }

  public CustomerQueryParameters vatRegistrationId(String vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
    return this;
  }

   /**
   * Get vatRegistrationId
   * @return vatRegistrationId
  **/
  @ApiModelProperty(value = "")
  public String getVatRegistrationId() {
    return vatRegistrationId;
  }

  public void setVatRegistrationId(String vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
  }

  public CustomerQueryParameters email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerQueryParameters phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CustomerQueryParameters lastModifiedDateTime(String lastModifiedDateTime) {
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

  public CustomerQueryParameters lastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
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

  public CustomerQueryParameters createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public CustomerQueryParameters createdDateTimeCondition(String createdDateTimeCondition) {
    this.createdDateTimeCondition = createdDateTimeCondition;
    return this;
  }

   /**
   * Get createdDateTimeCondition
   * @return createdDateTimeCondition
  **/
  @ApiModelProperty(value = "")
  public String getCreatedDateTimeCondition() {
    return createdDateTimeCondition;
  }

  public void setCreatedDateTimeCondition(String createdDateTimeCondition) {
    this.createdDateTimeCondition = createdDateTimeCondition;
  }

  public CustomerQueryParameters attributes(String attributes) {
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

  public CustomerQueryParameters pageNumber(Integer pageNumber) {
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

  public CustomerQueryParameters pageSize(Integer pageSize) {
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
    CustomerQueryParameters customerQueryParameters = (CustomerQueryParameters) o;
    return Objects.equals(this.greaterThanValue, customerQueryParameters.greaterThanValue) &&
        Objects.equals(this.numberToRead, customerQueryParameters.numberToRead) &&
        Objects.equals(this.skipRecords, customerQueryParameters.skipRecords) &&
        Objects.equals(this.name, customerQueryParameters.name) &&
        Objects.equals(this.status, customerQueryParameters.status) &&
        Objects.equals(this.corporateId, customerQueryParameters.corporateId) &&
        Objects.equals(this.vatRegistrationId, customerQueryParameters.vatRegistrationId) &&
        Objects.equals(this.email, customerQueryParameters.email) &&
        Objects.equals(this.phone, customerQueryParameters.phone) &&
        Objects.equals(this.lastModifiedDateTime, customerQueryParameters.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedDateTimeCondition, customerQueryParameters.lastModifiedDateTimeCondition) &&
        Objects.equals(this.createdDateTime, customerQueryParameters.createdDateTime) &&
        Objects.equals(this.createdDateTimeCondition, customerQueryParameters.createdDateTimeCondition) &&
        Objects.equals(this.attributes, customerQueryParameters.attributes) &&
        Objects.equals(this.pageNumber, customerQueryParameters.pageNumber) &&
        Objects.equals(this.pageSize, customerQueryParameters.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThanValue, numberToRead, skipRecords, name, status, corporateId, vatRegistrationId, email, phone, lastModifiedDateTime, lastModifiedDateTimeCondition, createdDateTime, createdDateTimeCondition, attributes, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerQueryParameters {\n");
    
    sb.append("    greaterThanValue: ").append(toIndentedString(greaterThanValue)).append("\n");
    sb.append("    numberToRead: ").append(toIndentedString(numberToRead)).append("\n");
    sb.append("    skipRecords: ").append(toIndentedString(skipRecords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    corporateId: ").append(toIndentedString(corporateId)).append("\n");
    sb.append("    vatRegistrationId: ").append(toIndentedString(vatRegistrationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastModifiedDateTimeCondition: ").append(toIndentedString(lastModifiedDateTimeCondition)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    createdDateTimeCondition: ").append(toIndentedString(createdDateTimeCondition)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

