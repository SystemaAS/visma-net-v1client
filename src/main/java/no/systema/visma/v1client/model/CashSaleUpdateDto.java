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
import no.systema.visma.v1client.model.CashSaleLinesUpdateDto;
import no.systema.visma.v1client.model.DtoValueBoolean;
import no.systema.visma.v1client.model.DtoValueDateTime;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * CashSaleUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CashSaleUpdateDto {
  @JsonProperty("paymentMethodId")
  private DtoValueString paymentMethodId = null;

  @JsonProperty("creditTermsId")
  private DtoValueString creditTermsId = null;

  @JsonProperty("cashAccount")
  private DtoValueString cashAccount = null;

  @JsonProperty("paymentReference")
  private DtoValueString paymentReference = null;

  @JsonProperty("cashSaleLines")
  private List<CashSaleLinesUpdateDto> cashSaleLines = null;

  @JsonProperty("referenceNumber")
  private DtoValueString referenceNumber = null;

  @JsonProperty("customerNumber")
  private DtoValueString customerNumber = null;

  @JsonProperty("documentDate")
  private DtoValueDateTime documentDate = null;

  @JsonProperty("hold")
  private DtoValueBoolean hold = null;

  @JsonProperty("postPeriod")
  private DtoValueString postPeriod = null;

  @JsonProperty("financialPeriod")
  private DtoValueString financialPeriod = null;

  @JsonProperty("invoiceText")
  private DtoValueString invoiceText = null;

  @JsonProperty("locationId")
  private DtoValueString locationId = null;

  @JsonProperty("salesPersonID")
  private DtoValueNullableInt32 salesPersonID = null;

  @JsonProperty("note")
  private DtoValueString note = null;

  @JsonProperty("branchNumber")
  private DtoValueString branchNumber = null;

  public CashSaleUpdateDto paymentMethodId(DtoValueString paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(DtoValueString paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public CashSaleUpdateDto creditTermsId(DtoValueString creditTermsId) {
    this.creditTermsId = creditTermsId;
    return this;
  }

   /**
   * Get creditTermsId
   * @return creditTermsId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCreditTermsId() {
    return creditTermsId;
  }

  public void setCreditTermsId(DtoValueString creditTermsId) {
    this.creditTermsId = creditTermsId;
  }

  public CashSaleUpdateDto cashAccount(DtoValueString cashAccount) {
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

  public CashSaleUpdateDto paymentReference(DtoValueString paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Mandatory
   * @return paymentReference
  **/
  @ApiModelProperty(value = "Mandatory")
  public DtoValueString getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(DtoValueString paymentReference) {
    this.paymentReference = paymentReference;
  }

  public CashSaleUpdateDto cashSaleLines(List<CashSaleLinesUpdateDto> cashSaleLines) {
    this.cashSaleLines = cashSaleLines;
    return this;
  }

  public CashSaleUpdateDto addCashSaleLinesItem(CashSaleLinesUpdateDto cashSaleLinesItem) {
    if (this.cashSaleLines == null) {
      this.cashSaleLines = new ArrayList<>();
    }
    this.cashSaleLines.add(cashSaleLinesItem);
    return this;
  }

   /**
   * Get cashSaleLines
   * @return cashSaleLines
  **/
  @ApiModelProperty(value = "")
  public List<CashSaleLinesUpdateDto> getCashSaleLines() {
    return cashSaleLines;
  }

  public void setCashSaleLines(List<CashSaleLinesUpdateDto> cashSaleLines) {
    this.cashSaleLines = cashSaleLines;
  }

  public CashSaleUpdateDto referenceNumber(DtoValueString referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(DtoValueString referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public CashSaleUpdateDto customerNumber(DtoValueString customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(DtoValueString customerNumber) {
    this.customerNumber = customerNumber;
  }

  public CashSaleUpdateDto documentDate(DtoValueDateTime documentDate) {
    this.documentDate = documentDate;
    return this;
  }

   /**
   * Get documentDate
   * @return documentDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(DtoValueDateTime documentDate) {
    this.documentDate = documentDate;
  }

  public CashSaleUpdateDto hold(DtoValueBoolean hold) {
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

  public CashSaleUpdateDto postPeriod(DtoValueString postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY.
   * @return postPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY.")
  public DtoValueString getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(DtoValueString postPeriod) {
    this.postPeriod = postPeriod;
  }

  public CashSaleUpdateDto financialPeriod(DtoValueString financialPeriod) {
    this.financialPeriod = financialPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM.
   * @return financialPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM.")
  public DtoValueString getFinancialPeriod() {
    return financialPeriod;
  }

  public void setFinancialPeriod(DtoValueString financialPeriod) {
    this.financialPeriod = financialPeriod;
  }

  public CashSaleUpdateDto invoiceText(DtoValueString invoiceText) {
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

  public CashSaleUpdateDto locationId(DtoValueString locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLocationId() {
    return locationId;
  }

  public void setLocationId(DtoValueString locationId) {
    this.locationId = locationId;
  }

  public CashSaleUpdateDto salesPersonID(DtoValueNullableInt32 salesPersonID) {
    this.salesPersonID = salesPersonID;
    return this;
  }

   /**
   * Get salesPersonID
   * @return salesPersonID
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getSalesPersonID() {
    return salesPersonID;
  }

  public void setSalesPersonID(DtoValueNullableInt32 salesPersonID) {
    this.salesPersonID = salesPersonID;
  }

  public CashSaleUpdateDto note(DtoValueString note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getNote() {
    return note;
  }

  public void setNote(DtoValueString note) {
    this.note = note;
  }

  public CashSaleUpdateDto branchNumber(DtoValueString branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Get branchNumber
   * @return branchNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(DtoValueString branchNumber) {
    this.branchNumber = branchNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashSaleUpdateDto cashSaleUpdateDto = (CashSaleUpdateDto) o;
    return Objects.equals(this.paymentMethodId, cashSaleUpdateDto.paymentMethodId) &&
        Objects.equals(this.creditTermsId, cashSaleUpdateDto.creditTermsId) &&
        Objects.equals(this.cashAccount, cashSaleUpdateDto.cashAccount) &&
        Objects.equals(this.paymentReference, cashSaleUpdateDto.paymentReference) &&
        Objects.equals(this.cashSaleLines, cashSaleUpdateDto.cashSaleLines) &&
        Objects.equals(this.referenceNumber, cashSaleUpdateDto.referenceNumber) &&
        Objects.equals(this.customerNumber, cashSaleUpdateDto.customerNumber) &&
        Objects.equals(this.documentDate, cashSaleUpdateDto.documentDate) &&
        Objects.equals(this.hold, cashSaleUpdateDto.hold) &&
        Objects.equals(this.postPeriod, cashSaleUpdateDto.postPeriod) &&
        Objects.equals(this.financialPeriod, cashSaleUpdateDto.financialPeriod) &&
        Objects.equals(this.invoiceText, cashSaleUpdateDto.invoiceText) &&
        Objects.equals(this.locationId, cashSaleUpdateDto.locationId) &&
        Objects.equals(this.salesPersonID, cashSaleUpdateDto.salesPersonID) &&
        Objects.equals(this.note, cashSaleUpdateDto.note) &&
        Objects.equals(this.branchNumber, cashSaleUpdateDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodId, creditTermsId, cashAccount, paymentReference, cashSaleLines, referenceNumber, customerNumber, documentDate, hold, postPeriod, financialPeriod, invoiceText, locationId, salesPersonID, note, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashSaleUpdateDto {\n");
    
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    creditTermsId: ").append(toIndentedString(creditTermsId)).append("\n");
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    cashSaleLines: ").append(toIndentedString(cashSaleLines)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    documentDate: ").append(toIndentedString(documentDate)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    postPeriod: ").append(toIndentedString(postPeriod)).append("\n");
    sb.append("    financialPeriod: ").append(toIndentedString(financialPeriod)).append("\n");
    sb.append("    invoiceText: ").append(toIndentedString(invoiceText)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    salesPersonID: ").append(toIndentedString(salesPersonID)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
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

