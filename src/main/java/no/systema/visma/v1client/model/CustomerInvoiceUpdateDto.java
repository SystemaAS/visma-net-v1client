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
import no.systema.visma.v1client.model.CustomerInvoiceLinesUpdateDto;
import no.systema.visma.v1client.model.DtoValueBoolean;
import no.systema.visma.v1client.model.DtoValueDateTime;
import no.systema.visma.v1client.model.DtoValueDecimal;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.RotRutUpdateDto;
import no.systema.visma.v1client.model.TaxDetailUpdateDto;

/**
 * CustomerInvoiceUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerInvoiceUpdateDto {
  @JsonProperty("paymentMethodId")
  private DtoValueString paymentMethodId = null;

  @JsonProperty("creditTermsId")
  private DtoValueString creditTermsId = null;

  @JsonProperty("currencyId")
  private DtoValueString currencyId = null;

  @JsonProperty("customerRefNumber")
  private DtoValueString customerRefNumber = null;

  @JsonProperty("cashDiscountDate")
  private DtoValueDateTime cashDiscountDate = null;

  @JsonProperty("documentDueDate")
  private DtoValueDateTime documentDueDate = null;

  @JsonProperty("externalReference")
  private DtoValueString externalReference = null;

  @JsonProperty("exchangeRate")
  private DtoValueDecimal exchangeRate = null;

  @JsonProperty("domesticServicesDeductibleDocument")
  private DtoValueNullableBoolean domesticServicesDeductibleDocument = null;

  @JsonProperty("rotRutDetails")
  private RotRutUpdateDto rotRutDetails = null;

  @JsonProperty("paymentReference")
  private DtoValueString paymentReference = null;

  @JsonProperty("contact")
  private DtoValueNullableInt32 contact = null;

  @JsonProperty("project")
  private DtoValueString project = null;

  @JsonProperty("taxDetailLines")
  private List<TaxDetailUpdateDto> taxDetailLines = null;

  @JsonProperty("invoiceLines")
  private List<CustomerInvoiceLinesUpdateDto> invoiceLines = null;

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

  @JsonProperty("cashAccount")
  private DtoValueString cashAccount = null;

  public CustomerInvoiceUpdateDto paymentMethodId(DtoValueString paymentMethodId) {
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

  public CustomerInvoiceUpdateDto creditTermsId(DtoValueString creditTermsId) {
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

  public CustomerInvoiceUpdateDto currencyId(DtoValueString currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(DtoValueString currencyId) {
    this.currencyId = currencyId;
  }

  public CustomerInvoiceUpdateDto customerRefNumber(DtoValueString customerRefNumber) {
    this.customerRefNumber = customerRefNumber;
    return this;
  }

   /**
   * Get customerRefNumber
   * @return customerRefNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomerRefNumber() {
    return customerRefNumber;
  }

  public void setCustomerRefNumber(DtoValueString customerRefNumber) {
    this.customerRefNumber = customerRefNumber;
  }

  public CustomerInvoiceUpdateDto cashDiscountDate(DtoValueDateTime cashDiscountDate) {
    this.cashDiscountDate = cashDiscountDate;
    return this;
  }

   /**
   * Get cashDiscountDate
   * @return cashDiscountDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getCashDiscountDate() {
    return cashDiscountDate;
  }

  public void setCashDiscountDate(DtoValueDateTime cashDiscountDate) {
    this.cashDiscountDate = cashDiscountDate;
  }

  public CustomerInvoiceUpdateDto documentDueDate(DtoValueDateTime documentDueDate) {
    this.documentDueDate = documentDueDate;
    return this;
  }

   /**
   * Get documentDueDate
   * @return documentDueDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getDocumentDueDate() {
    return documentDueDate;
  }

  public void setDocumentDueDate(DtoValueDateTime documentDueDate) {
    this.documentDueDate = documentDueDate;
  }

  public CustomerInvoiceUpdateDto externalReference(DtoValueString externalReference) {
    this.externalReference = externalReference;
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(DtoValueString externalReference) {
    this.externalReference = externalReference;
  }

  public CustomerInvoiceUpdateDto exchangeRate(DtoValueDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(DtoValueDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public CustomerInvoiceUpdateDto domesticServicesDeductibleDocument(DtoValueNullableBoolean domesticServicesDeductibleDocument) {
    this.domesticServicesDeductibleDocument = domesticServicesDeductibleDocument;
    return this;
  }

   /**
   * Get domesticServicesDeductibleDocument
   * @return domesticServicesDeductibleDocument
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getDomesticServicesDeductibleDocument() {
    return domesticServicesDeductibleDocument;
  }

  public void setDomesticServicesDeductibleDocument(DtoValueNullableBoolean domesticServicesDeductibleDocument) {
    this.domesticServicesDeductibleDocument = domesticServicesDeductibleDocument;
  }

  public CustomerInvoiceUpdateDto rotRutDetails(RotRutUpdateDto rotRutDetails) {
    this.rotRutDetails = rotRutDetails;
    return this;
  }

   /**
   * Get rotRutDetails
   * @return rotRutDetails
  **/
  @ApiModelProperty(value = "")
  public RotRutUpdateDto getRotRutDetails() {
    return rotRutDetails;
  }

  public void setRotRutDetails(RotRutUpdateDto rotRutDetails) {
    this.rotRutDetails = rotRutDetails;
  }

  public CustomerInvoiceUpdateDto paymentReference(DtoValueString paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Get paymentReference
   * @return paymentReference
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(DtoValueString paymentReference) {
    this.paymentReference = paymentReference;
  }

  public CustomerInvoiceUpdateDto contact(DtoValueNullableInt32 contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getContact() {
    return contact;
  }

  public void setContact(DtoValueNullableInt32 contact) {
    this.contact = contact;
  }

  public CustomerInvoiceUpdateDto project(DtoValueString project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getProject() {
    return project;
  }

  public void setProject(DtoValueString project) {
    this.project = project;
  }

  public CustomerInvoiceUpdateDto taxDetailLines(List<TaxDetailUpdateDto> taxDetailLines) {
    this.taxDetailLines = taxDetailLines;
    return this;
  }

  public CustomerInvoiceUpdateDto addTaxDetailLinesItem(TaxDetailUpdateDto taxDetailLinesItem) {
    if (this.taxDetailLines == null) {
      this.taxDetailLines = new ArrayList<>();
    }
    this.taxDetailLines.add(taxDetailLinesItem);
    return this;
  }

   /**
   * Get taxDetailLines
   * @return taxDetailLines
  **/
  @ApiModelProperty(value = "")
  public List<TaxDetailUpdateDto> getTaxDetailLines() {
    return taxDetailLines;
  }

  public void setTaxDetailLines(List<TaxDetailUpdateDto> taxDetailLines) {
    this.taxDetailLines = taxDetailLines;
  }

  public CustomerInvoiceUpdateDto invoiceLines(List<CustomerInvoiceLinesUpdateDto> invoiceLines) {
    this.invoiceLines = invoiceLines;
    return this;
  }

  public CustomerInvoiceUpdateDto addInvoiceLinesItem(CustomerInvoiceLinesUpdateDto invoiceLinesItem) {
    if (this.invoiceLines == null) {
      this.invoiceLines = new ArrayList<>();
    }
    this.invoiceLines.add(invoiceLinesItem);
    return this;
  }

   /**
   * Get invoiceLines
   * @return invoiceLines
  **/
  @ApiModelProperty(value = "")
  public List<CustomerInvoiceLinesUpdateDto> getInvoiceLines() {
    return invoiceLines;
  }

  public void setInvoiceLines(List<CustomerInvoiceLinesUpdateDto> invoiceLines) {
    this.invoiceLines = invoiceLines;
  }

  public CustomerInvoiceUpdateDto referenceNumber(DtoValueString referenceNumber) {
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

  public CustomerInvoiceUpdateDto customerNumber(DtoValueString customerNumber) {
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

  public CustomerInvoiceUpdateDto documentDate(DtoValueDateTime documentDate) {
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

  public CustomerInvoiceUpdateDto hold(DtoValueBoolean hold) {
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

  public CustomerInvoiceUpdateDto postPeriod(DtoValueString postPeriod) {
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

  public CustomerInvoiceUpdateDto financialPeriod(DtoValueString financialPeriod) {
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

  public CustomerInvoiceUpdateDto invoiceText(DtoValueString invoiceText) {
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

  public CustomerInvoiceUpdateDto locationId(DtoValueString locationId) {
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

  public CustomerInvoiceUpdateDto salesPersonID(DtoValueNullableInt32 salesPersonID) {
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

  public CustomerInvoiceUpdateDto note(DtoValueString note) {
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

  public CustomerInvoiceUpdateDto branchNumber(DtoValueString branchNumber) {
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

  public CustomerInvoiceUpdateDto cashAccount(DtoValueString cashAccount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInvoiceUpdateDto customerInvoiceUpdateDto = (CustomerInvoiceUpdateDto) o;
    return Objects.equals(this.paymentMethodId, customerInvoiceUpdateDto.paymentMethodId) &&
        Objects.equals(this.creditTermsId, customerInvoiceUpdateDto.creditTermsId) &&
        Objects.equals(this.currencyId, customerInvoiceUpdateDto.currencyId) &&
        Objects.equals(this.customerRefNumber, customerInvoiceUpdateDto.customerRefNumber) &&
        Objects.equals(this.cashDiscountDate, customerInvoiceUpdateDto.cashDiscountDate) &&
        Objects.equals(this.documentDueDate, customerInvoiceUpdateDto.documentDueDate) &&
        Objects.equals(this.externalReference, customerInvoiceUpdateDto.externalReference) &&
        Objects.equals(this.exchangeRate, customerInvoiceUpdateDto.exchangeRate) &&
        Objects.equals(this.domesticServicesDeductibleDocument, customerInvoiceUpdateDto.domesticServicesDeductibleDocument) &&
        Objects.equals(this.rotRutDetails, customerInvoiceUpdateDto.rotRutDetails) &&
        Objects.equals(this.paymentReference, customerInvoiceUpdateDto.paymentReference) &&
        Objects.equals(this.contact, customerInvoiceUpdateDto.contact) &&
        Objects.equals(this.project, customerInvoiceUpdateDto.project) &&
        Objects.equals(this.taxDetailLines, customerInvoiceUpdateDto.taxDetailLines) &&
        Objects.equals(this.invoiceLines, customerInvoiceUpdateDto.invoiceLines) &&
        Objects.equals(this.referenceNumber, customerInvoiceUpdateDto.referenceNumber) &&
        Objects.equals(this.customerNumber, customerInvoiceUpdateDto.customerNumber) &&
        Objects.equals(this.documentDate, customerInvoiceUpdateDto.documentDate) &&
        Objects.equals(this.hold, customerInvoiceUpdateDto.hold) &&
        Objects.equals(this.postPeriod, customerInvoiceUpdateDto.postPeriod) &&
        Objects.equals(this.financialPeriod, customerInvoiceUpdateDto.financialPeriod) &&
        Objects.equals(this.invoiceText, customerInvoiceUpdateDto.invoiceText) &&
        Objects.equals(this.locationId, customerInvoiceUpdateDto.locationId) &&
        Objects.equals(this.salesPersonID, customerInvoiceUpdateDto.salesPersonID) &&
        Objects.equals(this.note, customerInvoiceUpdateDto.note) &&
        Objects.equals(this.branchNumber, customerInvoiceUpdateDto.branchNumber) &&
        Objects.equals(this.cashAccount, customerInvoiceUpdateDto.cashAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodId, creditTermsId, currencyId, customerRefNumber, cashDiscountDate, documentDueDate, externalReference, exchangeRate, domesticServicesDeductibleDocument, rotRutDetails, paymentReference, contact, project, taxDetailLines, invoiceLines, referenceNumber, customerNumber, documentDate, hold, postPeriod, financialPeriod, invoiceText, locationId, salesPersonID, note, branchNumber, cashAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceUpdateDto {\n");
    
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    creditTermsId: ").append(toIndentedString(creditTermsId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    customerRefNumber: ").append(toIndentedString(customerRefNumber)).append("\n");
    sb.append("    cashDiscountDate: ").append(toIndentedString(cashDiscountDate)).append("\n");
    sb.append("    documentDueDate: ").append(toIndentedString(documentDueDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    domesticServicesDeductibleDocument: ").append(toIndentedString(domesticServicesDeductibleDocument)).append("\n");
    sb.append("    rotRutDetails: ").append(toIndentedString(rotRutDetails)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    taxDetailLines: ").append(toIndentedString(taxDetailLines)).append("\n");
    sb.append("    invoiceLines: ").append(toIndentedString(invoiceLines)).append("\n");
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
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
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

