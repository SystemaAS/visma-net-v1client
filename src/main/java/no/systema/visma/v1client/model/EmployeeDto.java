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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AddressDto;
import no.systema.visma.v1client.model.EmployeeContactDto;

/**
 * This class represents an Employee in EmployeeController. Used for getting data.
 */
@ApiModel(description = "This class represents an Employee in EmployeeController. Used for getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class EmployeeDto {
  @JsonProperty("employeeId")
  private Integer employeeId = null;

  @JsonProperty("employeeNumber")
  private String employeeNumber = null;

  @JsonProperty("employeeName")
  private String employeeName = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    ONHOLD("OnHold"),
    
    HOLDPAYMENTS("HoldPayments"),
    
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

  @JsonProperty("department")
  private String department = null;

  @JsonProperty("contact")
  private EmployeeContactDto contact = null;

  @JsonProperty("address")
  private AddressDto address = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public EmployeeDto employeeId(Integer employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @ApiModelProperty(value = "")
  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public EmployeeDto employeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @ApiModelProperty(value = "")
  public String getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public EmployeeDto employeeName(String employeeName) {
    this.employeeName = employeeName;
    return this;
  }

   /**
   * Get employeeName
   * @return employeeName
  **/
  @ApiModelProperty(value = "")
  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public EmployeeDto status(StatusEnum status) {
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

  public EmployeeDto department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public EmployeeDto contact(EmployeeContactDto contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public EmployeeContactDto getContact() {
    return contact;
  }

  public void setContact(EmployeeContactDto contact) {
    this.contact = contact;
  }

  public EmployeeDto address(AddressDto address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) {
    this.address = address;
  }

  public EmployeeDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public EmployeeDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public EmployeeDto putExtrasItem(String key, Object extrasItem) {
    if (this.extras == null) {
      this.extras = new HashMap<>();
    }
    this.extras.put(key, extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getExtras() {
    return extras;
  }

  public void setExtras(Map<String, Object> extras) {
    this.extras = extras;
  }

  public EmployeeDto errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @ApiModelProperty(value = "")
  public String getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeDto employeeDto = (EmployeeDto) o;
    return Objects.equals(this.employeeId, employeeDto.employeeId) &&
        Objects.equals(this.employeeNumber, employeeDto.employeeNumber) &&
        Objects.equals(this.employeeName, employeeDto.employeeName) &&
        Objects.equals(this.status, employeeDto.status) &&
        Objects.equals(this.department, employeeDto.department) &&
        Objects.equals(this.contact, employeeDto.contact) &&
        Objects.equals(this.address, employeeDto.address) &&
        Objects.equals(this.lastModifiedDateTime, employeeDto.lastModifiedDateTime) &&
        Objects.equals(this.extras, employeeDto.extras) &&
        Objects.equals(this.errorInfo, employeeDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeNumber, employeeName, status, department, contact, address, lastModifiedDateTime, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeDto {\n");
    
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

