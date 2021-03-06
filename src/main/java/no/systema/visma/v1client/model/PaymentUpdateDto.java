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
import java.util.ArrayList;
import java.util.List;
import no.systema.visma.v1client.model.DtoValueBoolean;
import no.systema.visma.v1client.model.DtoValueDateTime;
import no.systema.visma.v1client.model.DtoValueDecimal;
import no.systema.visma.v1client.model.DtoValueNullablePaymentTypes;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.PaymentLinesUpdateDto;
import no.systema.visma.v1client.model.PaymentOrdersLinesUpdateDto;

/**
 * PaymentUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PaymentUpdateDto {
  @JsonProperty("type")
  private DtoValueNullablePaymentTypes type = null;

  @JsonProperty("hold")
  private DtoValueBoolean hold = null;

  @JsonProperty("applicationDate")
  private DtoValueDateTime applicationDate = null;

  @JsonProperty("applicationPeriod")
  private DtoValueString applicationPeriod = null;

  @JsonProperty("paymentRef")
  private DtoValueString paymentRef = null;

  @JsonProperty("customer")
  private DtoValueString customer = null;

  @JsonProperty("location")
  private DtoValueString location = null;

  @JsonProperty("paymentMethod")
  private DtoValueString paymentMethod = null;

  @JsonProperty("cashAccount")
  private DtoValueString cashAccount = null;

  @JsonProperty("currency")
  private DtoValueString currency = null;

  @JsonProperty("paymentAmount")
  private DtoValueDecimal paymentAmount = null;

  @JsonProperty("invoiceText")
  private DtoValueString invoiceText = null;

  @JsonProperty("branch")
  private DtoValueString branch = null;

  @JsonProperty("ordersToApply")
  private List<PaymentOrdersLinesUpdateDto> ordersToApply = null;

  @JsonProperty("paymentLines")
  private List<PaymentLinesUpdateDto> paymentLines = null;

  public PaymentUpdateDto type(DtoValueNullablePaymentTypes type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullablePaymentTypes getType() {
    return type;
  }

  public void setType(DtoValueNullablePaymentTypes type) {
    this.type = type;
  }

  public PaymentUpdateDto hold(DtoValueBoolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getHold() {
    return hold;
  }

  public void setHold(DtoValueBoolean hold) {
    this.hold = hold;
  }

  public PaymentUpdateDto applicationDate(DtoValueDateTime applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * Get applicationDate
   * @return applicationDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(DtoValueDateTime applicationDate) {
    this.applicationDate = applicationDate;
  }

  public PaymentUpdateDto applicationPeriod(DtoValueString applicationPeriod) {
    this.applicationPeriod = applicationPeriod;
    return this;
  }

   /**
   * Get applicationPeriod
   * @return applicationPeriod
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getApplicationPeriod() {
    return applicationPeriod;
  }

  public void setApplicationPeriod(DtoValueString applicationPeriod) {
    this.applicationPeriod = applicationPeriod;
  }

  public PaymentUpdateDto paymentRef(DtoValueString paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

   /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(DtoValueString paymentRef) {
    this.paymentRef = paymentRef;
  }

  public PaymentUpdateDto customer(DtoValueString customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomer() {
    return customer;
  }

  public void setCustomer(DtoValueString customer) {
    this.customer = customer;
  }

  public PaymentUpdateDto location(DtoValueString location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLocation() {
    return location;
  }

  public void setLocation(DtoValueString location) {
    this.location = location;
  }

  public PaymentUpdateDto paymentMethod(DtoValueString paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(DtoValueString paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentUpdateDto cashAccount(DtoValueString cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * Get cashAccount
   * @return cashAccount
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(DtoValueString cashAccount) {
    this.cashAccount = cashAccount;
  }

  public PaymentUpdateDto currency(DtoValueString currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCurrency() {
    return currency;
  }

  public void setCurrency(DtoValueString currency) {
    this.currency = currency;
  }

  public PaymentUpdateDto paymentAmount(DtoValueDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(DtoValueDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public PaymentUpdateDto invoiceText(DtoValueString invoiceText) {
    this.invoiceText = invoiceText;
    return this;
  }

   /**
   * Get invoiceText
   * @return invoiceText
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getInvoiceText() {
    return invoiceText;
  }

  public void setInvoiceText(DtoValueString invoiceText) {
    this.invoiceText = invoiceText;
  }

  public PaymentUpdateDto branch(DtoValueString branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getBranch() {
    return branch;
  }

  public void setBranch(DtoValueString branch) {
    this.branch = branch;
  }

  public PaymentUpdateDto ordersToApply(List<PaymentOrdersLinesUpdateDto> ordersToApply) {
    this.ordersToApply = ordersToApply;
    return this;
  }

  public PaymentUpdateDto addOrdersToApplyItem(PaymentOrdersLinesUpdateDto ordersToApplyItem) {
    if (this.ordersToApply == null) {
      this.ordersToApply = new ArrayList<>();
    }
    this.ordersToApply.add(ordersToApplyItem);
    return this;
  }

   /**
   * Get ordersToApply
   * @return ordersToApply
  **/
  @ApiModelProperty(value = "")
  public List<PaymentOrdersLinesUpdateDto> getOrdersToApply() {
    return ordersToApply;
  }

  public void setOrdersToApply(List<PaymentOrdersLinesUpdateDto> ordersToApply) {
    this.ordersToApply = ordersToApply;
  }

  public PaymentUpdateDto paymentLines(List<PaymentLinesUpdateDto> paymentLines) {
    this.paymentLines = paymentLines;
    return this;
  }

  public PaymentUpdateDto addPaymentLinesItem(PaymentLinesUpdateDto paymentLinesItem) {
    if (this.paymentLines == null) {
      this.paymentLines = new ArrayList<>();
    }
    this.paymentLines.add(paymentLinesItem);
    return this;
  }

   /**
   * Get paymentLines
   * @return paymentLines
  **/
  @ApiModelProperty(value = "")
  public List<PaymentLinesUpdateDto> getPaymentLines() {
    return paymentLines;
  }

  public void setPaymentLines(List<PaymentLinesUpdateDto> paymentLines) {
    this.paymentLines = paymentLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentUpdateDto paymentUpdateDto = (PaymentUpdateDto) o;
    return Objects.equals(this.type, paymentUpdateDto.type) &&
        Objects.equals(this.hold, paymentUpdateDto.hold) &&
        Objects.equals(this.applicationDate, paymentUpdateDto.applicationDate) &&
        Objects.equals(this.applicationPeriod, paymentUpdateDto.applicationPeriod) &&
        Objects.equals(this.paymentRef, paymentUpdateDto.paymentRef) &&
        Objects.equals(this.customer, paymentUpdateDto.customer) &&
        Objects.equals(this.location, paymentUpdateDto.location) &&
        Objects.equals(this.paymentMethod, paymentUpdateDto.paymentMethod) &&
        Objects.equals(this.cashAccount, paymentUpdateDto.cashAccount) &&
        Objects.equals(this.currency, paymentUpdateDto.currency) &&
        Objects.equals(this.paymentAmount, paymentUpdateDto.paymentAmount) &&
        Objects.equals(this.invoiceText, paymentUpdateDto.invoiceText) &&
        Objects.equals(this.branch, paymentUpdateDto.branch) &&
        Objects.equals(this.ordersToApply, paymentUpdateDto.ordersToApply) &&
        Objects.equals(this.paymentLines, paymentUpdateDto.paymentLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hold, applicationDate, applicationPeriod, paymentRef, customer, location, paymentMethod, cashAccount, currency, paymentAmount, invoiceText, branch, ordersToApply, paymentLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentUpdateDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    applicationPeriod: ").append(toIndentedString(applicationPeriod)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    invoiceText: ").append(toIndentedString(invoiceText)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    ordersToApply: ").append(toIndentedString(ordersToApply)).append("\n");
    sb.append("    paymentLines: ").append(toIndentedString(paymentLines)).append("\n");
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

