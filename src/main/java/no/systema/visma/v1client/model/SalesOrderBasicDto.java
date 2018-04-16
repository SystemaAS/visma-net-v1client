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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.CustomerDescriptionDto;
import no.systema.visma.v1client.model.LocationDescriptionDto;
import no.systema.visma.v1client.model.SalesOrderDocumentLineDto;

/**
 * This class represents a SOOrder in SOOrderController. Used by getting data.
 */
@ApiModel(description = "This class represents a SOOrder in SOOrderController. Used by getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class SalesOrderBasicDto {
  @JsonProperty("lines")
  private List<SalesOrderDocumentLineDto> lines = null;

  @JsonProperty("orderType")
  private String orderType = null;

  @JsonProperty("orderNo")
  private String orderNo = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("Open"),
    
    HOLD("Hold"),
    
    CREDITHOLD("CreditHold"),
    
    COMPLETED("Completed"),
    
    CANCELLED("Cancelled"),
    
    BACKORDER("BackOrder"),
    
    SHIPPING("Shipping"),
    
    INVOICED("Invoiced");

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

  @JsonProperty("hold")
  private Boolean hold = null;

  @JsonProperty("date")
  private LocalDateTime date = null;

  @JsonProperty("requestOn")
  private LocalDateTime requestOn = null;

  @JsonProperty("customerOrder")
  private String customerOrder = null;

  @JsonProperty("customerRefNo")
  private String customerRefNo = null;

  @JsonProperty("customer")
  private CustomerDescriptionDto customer = null;

  @JsonProperty("location")
  private LocationDescriptionDto location = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("orderTotal")
  private Double orderTotal = null;

  @JsonProperty("vatTaxableTotal")
  private Double vatTaxableTotal = null;

  @JsonProperty("vatExemptTotal")
  private Double vatExemptTotal = null;

  @JsonProperty("taxTotal")
  private Double taxTotal = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public SalesOrderBasicDto lines(List<SalesOrderDocumentLineDto> lines) {
    this.lines = lines;
    return this;
  }

  public SalesOrderBasicDto addLinesItem(SalesOrderDocumentLineDto linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<SalesOrderDocumentLineDto> getLines() {
    return lines;
  }

  public void setLines(List<SalesOrderDocumentLineDto> lines) {
    this.lines = lines;
  }

  public SalesOrderBasicDto orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public SalesOrderBasicDto orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public SalesOrderBasicDto status(StatusEnum status) {
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

  public SalesOrderBasicDto hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public Boolean isHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public SalesOrderBasicDto date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public SalesOrderBasicDto requestOn(LocalDateTime requestOn) {
    this.requestOn = requestOn;
    return this;
  }

   /**
   * Get requestOn
   * @return requestOn
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getRequestOn() {
    return requestOn;
  }

  public void setRequestOn(LocalDateTime requestOn) {
    this.requestOn = requestOn;
  }

  public SalesOrderBasicDto customerOrder(String customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

   /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")
  public String getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(String customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SalesOrderBasicDto customerRefNo(String customerRefNo) {
    this.customerRefNo = customerRefNo;
    return this;
  }

   /**
   * Get customerRefNo
   * @return customerRefNo
  **/
  @ApiModelProperty(value = "")
  public String getCustomerRefNo() {
    return customerRefNo;
  }

  public void setCustomerRefNo(String customerRefNo) {
    this.customerRefNo = customerRefNo;
  }

  public SalesOrderBasicDto customer(CustomerDescriptionDto customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public CustomerDescriptionDto getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerDescriptionDto customer) {
    this.customer = customer;
  }

  public SalesOrderBasicDto location(LocationDescriptionDto location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public LocationDescriptionDto getLocation() {
    return location;
  }

  public void setLocation(LocationDescriptionDto location) {
    this.location = location;
  }

  public SalesOrderBasicDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SalesOrderBasicDto description(String description) {
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

  public SalesOrderBasicDto orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

   /**
   * Get orderTotal
   * @return orderTotal
  **/
  @ApiModelProperty(value = "")
  public Double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }

  public SalesOrderBasicDto vatTaxableTotal(Double vatTaxableTotal) {
    this.vatTaxableTotal = vatTaxableTotal;
    return this;
  }

   /**
   * Get vatTaxableTotal
   * @return vatTaxableTotal
  **/
  @ApiModelProperty(value = "")
  public Double getVatTaxableTotal() {
    return vatTaxableTotal;
  }

  public void setVatTaxableTotal(Double vatTaxableTotal) {
    this.vatTaxableTotal = vatTaxableTotal;
  }

  public SalesOrderBasicDto vatExemptTotal(Double vatExemptTotal) {
    this.vatExemptTotal = vatExemptTotal;
    return this;
  }

   /**
   * Get vatExemptTotal
   * @return vatExemptTotal
  **/
  @ApiModelProperty(value = "")
  public Double getVatExemptTotal() {
    return vatExemptTotal;
  }

  public void setVatExemptTotal(Double vatExemptTotal) {
    this.vatExemptTotal = vatExemptTotal;
  }

  public SalesOrderBasicDto taxTotal(Double taxTotal) {
    this.taxTotal = taxTotal;
    return this;
  }

   /**
   * Get taxTotal
   * @return taxTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTaxTotal() {
    return taxTotal;
  }

  public void setTaxTotal(Double taxTotal) {
    this.taxTotal = taxTotal;
  }

  public SalesOrderBasicDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public SalesOrderBasicDto branchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Get branchNumber
   * @return branchNumber
  **/
  @ApiModelProperty(value = "")
  public BranchNumberDto getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
  }

  public SalesOrderBasicDto note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public SalesOrderBasicDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public SalesOrderBasicDto addAttachmentsItem(AttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * The data containing information about the document attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "The data containing information about the document attachments")
  public List<AttachmentDto> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
  }

  public SalesOrderBasicDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public SalesOrderBasicDto putExtrasItem(String key, Object extrasItem) {
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

  public SalesOrderBasicDto errorInfo(String errorInfo) {
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
    SalesOrderBasicDto salesOrderBasicDto = (SalesOrderBasicDto) o;
    return Objects.equals(this.lines, salesOrderBasicDto.lines) &&
        Objects.equals(this.orderType, salesOrderBasicDto.orderType) &&
        Objects.equals(this.orderNo, salesOrderBasicDto.orderNo) &&
        Objects.equals(this.status, salesOrderBasicDto.status) &&
        Objects.equals(this.hold, salesOrderBasicDto.hold) &&
        Objects.equals(this.date, salesOrderBasicDto.date) &&
        Objects.equals(this.requestOn, salesOrderBasicDto.requestOn) &&
        Objects.equals(this.customerOrder, salesOrderBasicDto.customerOrder) &&
        Objects.equals(this.customerRefNo, salesOrderBasicDto.customerRefNo) &&
        Objects.equals(this.customer, salesOrderBasicDto.customer) &&
        Objects.equals(this.location, salesOrderBasicDto.location) &&
        Objects.equals(this.currency, salesOrderBasicDto.currency) &&
        Objects.equals(this.description, salesOrderBasicDto.description) &&
        Objects.equals(this.orderTotal, salesOrderBasicDto.orderTotal) &&
        Objects.equals(this.vatTaxableTotal, salesOrderBasicDto.vatTaxableTotal) &&
        Objects.equals(this.vatExemptTotal, salesOrderBasicDto.vatExemptTotal) &&
        Objects.equals(this.taxTotal, salesOrderBasicDto.taxTotal) &&
        Objects.equals(this.lastModifiedDateTime, salesOrderBasicDto.lastModifiedDateTime) &&
        Objects.equals(this.branchNumber, salesOrderBasicDto.branchNumber) &&
        Objects.equals(this.note, salesOrderBasicDto.note) &&
        Objects.equals(this.attachments, salesOrderBasicDto.attachments) &&
        Objects.equals(this.extras, salesOrderBasicDto.extras) &&
        Objects.equals(this.errorInfo, salesOrderBasicDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lines, orderType, orderNo, status, hold, date, requestOn, customerOrder, customerRefNo, customer, location, currency, description, orderTotal, vatTaxableTotal, vatExemptTotal, taxTotal, lastModifiedDateTime, branchNumber, note, attachments, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesOrderBasicDto {\n");
    
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requestOn: ").append(toIndentedString(requestOn)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    customerRefNo: ").append(toIndentedString(customerRefNo)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    vatTaxableTotal: ").append(toIndentedString(vatTaxableTotal)).append("\n");
    sb.append("    vatExemptTotal: ").append(toIndentedString(vatExemptTotal)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

