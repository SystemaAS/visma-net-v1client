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
import no.systema.visma.v1client.model.AttributeLineUpdateDto;
import no.systema.visma.v1client.model.CustomerDirectDebitUpdateDto;
import no.systema.visma.v1client.model.DtoValueAddressUpdateDto;
import no.systema.visma.v1client.model.DtoValueBoolean;
import no.systema.visma.v1client.model.DtoValueContactInfoUpdateDto;
import no.systema.visma.v1client.model.DtoValueCreditRule;
import no.systema.visma.v1client.model.DtoValueCustomerStatus;
import no.systema.visma.v1client.model.DtoValueDecimal;
import no.systema.visma.v1client.model.DtoValueNullableInt16;
import no.systema.visma.v1client.model.DtoValueStatementTypes;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * CustomerUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerUpdateDto {
  @JsonProperty("number")
  private DtoValueString number = null;

  @JsonProperty("name")
  private DtoValueString name = null;

  @JsonProperty("status")
  private DtoValueCustomerStatus status = null;

  @JsonProperty("accountReference")
  private DtoValueString accountReference = null;

  @JsonProperty("parentRecordNumber")
  private DtoValueString parentRecordNumber = null;

  @JsonProperty("currencyId")
  private DtoValueString currencyId = null;

  @JsonProperty("creditLimit")
  private DtoValueDecimal creditLimit = null;

  @JsonProperty("creditDaysPastDue")
  private DtoValueNullableInt16 creditDaysPastDue = null;

  @JsonProperty("overrideWithClassValues")
  private Boolean overrideWithClassValues = null;

  @JsonProperty("customerClassId")
  private DtoValueString customerClassId = null;

  @JsonProperty("creditTermsId")
  private DtoValueString creditTermsId = null;

  @JsonProperty("printInvoices")
  private DtoValueBoolean printInvoices = null;

  @JsonProperty("acceptAutoInvoices")
  private DtoValueBoolean acceptAutoInvoices = null;

  @JsonProperty("sendInvoicesByEmail")
  private DtoValueBoolean sendInvoicesByEmail = null;

  @JsonProperty("printStatements")
  private DtoValueBoolean printStatements = null;

  @JsonProperty("sendStatementsByEmail")
  private DtoValueBoolean sendStatementsByEmail = null;

  @JsonProperty("printMultiCurrencyStatements")
  private DtoValueBoolean printMultiCurrencyStatements = null;

  @JsonProperty("vatRegistrationId")
  private DtoValueString vatRegistrationId = null;

  @JsonProperty("corporateId")
  private DtoValueString corporateId = null;

  @JsonProperty("vatZoneId")
  private DtoValueString vatZoneId = null;

  @JsonProperty("note")
  private DtoValueString note = null;

  @JsonProperty("mainAddress")
  private DtoValueAddressUpdateDto mainAddress = null;

  @JsonProperty("mainContact")
  private DtoValueContactInfoUpdateDto mainContact = null;

  @JsonProperty("creditVerification")
  private DtoValueCreditRule creditVerification = null;

  @JsonProperty("invoiceAddress")
  private DtoValueAddressUpdateDto invoiceAddress = null;

  @JsonProperty("invoiceContact")
  private DtoValueContactInfoUpdateDto invoiceContact = null;

  @JsonProperty("statementType")
  private DtoValueStatementTypes statementType = null;

  @JsonProperty("deliveryAddress")
  private DtoValueAddressUpdateDto deliveryAddress = null;

  @JsonProperty("deliveryContact")
  private DtoValueContactInfoUpdateDto deliveryContact = null;

  @JsonProperty("priceClassId")
  private DtoValueString priceClassId = null;

  @JsonProperty("directDebitLines")
  private List<CustomerDirectDebitUpdateDto> directDebitLines = null;

  @JsonProperty("attributeLines")
  private List<AttributeLineUpdateDto> attributeLines = null;

  public CustomerUpdateDto number(DtoValueString number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getNumber() {
    return number;
  }

  public void setNumber(DtoValueString number) {
    this.number = number;
  }

  public CustomerUpdateDto name(DtoValueString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getName() {
    return name;
  }

  public void setName(DtoValueString name) {
    this.name = name;
  }

  public CustomerUpdateDto status(DtoValueCustomerStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public DtoValueCustomerStatus getStatus() {
    return status;
  }

  public void setStatus(DtoValueCustomerStatus status) {
    this.status = status;
  }

  public CustomerUpdateDto accountReference(DtoValueString accountReference) {
    this.accountReference = accountReference;
    return this;
  }

   /**
   * Get accountReference
   * @return accountReference
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(DtoValueString accountReference) {
    this.accountReference = accountReference;
  }

  public CustomerUpdateDto parentRecordNumber(DtoValueString parentRecordNumber) {
    this.parentRecordNumber = parentRecordNumber;
    return this;
  }

   /**
   * Get parentRecordNumber
   * @return parentRecordNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getParentRecordNumber() {
    return parentRecordNumber;
  }

  public void setParentRecordNumber(DtoValueString parentRecordNumber) {
    this.parentRecordNumber = parentRecordNumber;
  }

  public CustomerUpdateDto currencyId(DtoValueString currencyId) {
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

  public CustomerUpdateDto creditLimit(DtoValueDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(DtoValueDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public CustomerUpdateDto creditDaysPastDue(DtoValueNullableInt16 creditDaysPastDue) {
    this.creditDaysPastDue = creditDaysPastDue;
    return this;
  }

   /**
   * Get creditDaysPastDue
   * @return creditDaysPastDue
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt16 getCreditDaysPastDue() {
    return creditDaysPastDue;
  }

  public void setCreditDaysPastDue(DtoValueNullableInt16 creditDaysPastDue) {
    this.creditDaysPastDue = creditDaysPastDue;
  }

  public CustomerUpdateDto overrideWithClassValues(Boolean overrideWithClassValues) {
    this.overrideWithClassValues = overrideWithClassValues;
    return this;
  }

   /**
   * Get overrideWithClassValues
   * @return overrideWithClassValues
  **/
  @ApiModelProperty(value = "")
  public Boolean isOverrideWithClassValues() {
    return overrideWithClassValues;
  }

  public void setOverrideWithClassValues(Boolean overrideWithClassValues) {
    this.overrideWithClassValues = overrideWithClassValues;
  }

  public CustomerUpdateDto customerClassId(DtoValueString customerClassId) {
    this.customerClassId = customerClassId;
    return this;
  }

   /**
   * Get customerClassId
   * @return customerClassId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomerClassId() {
    return customerClassId;
  }

  public void setCustomerClassId(DtoValueString customerClassId) {
    this.customerClassId = customerClassId;
  }

  public CustomerUpdateDto creditTermsId(DtoValueString creditTermsId) {
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

  public CustomerUpdateDto printInvoices(DtoValueBoolean printInvoices) {
    this.printInvoices = printInvoices;
    return this;
  }

   /**
   * Get printInvoices
   * @return printInvoices
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getPrintInvoices() {
    return printInvoices;
  }

  public void setPrintInvoices(DtoValueBoolean printInvoices) {
    this.printInvoices = printInvoices;
  }

  public CustomerUpdateDto acceptAutoInvoices(DtoValueBoolean acceptAutoInvoices) {
    this.acceptAutoInvoices = acceptAutoInvoices;
    return this;
  }

   /**
   * Get acceptAutoInvoices
   * @return acceptAutoInvoices
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getAcceptAutoInvoices() {
    return acceptAutoInvoices;
  }

  public void setAcceptAutoInvoices(DtoValueBoolean acceptAutoInvoices) {
    this.acceptAutoInvoices = acceptAutoInvoices;
  }

  public CustomerUpdateDto sendInvoicesByEmail(DtoValueBoolean sendInvoicesByEmail) {
    this.sendInvoicesByEmail = sendInvoicesByEmail;
    return this;
  }

   /**
   * Get sendInvoicesByEmail
   * @return sendInvoicesByEmail
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getSendInvoicesByEmail() {
    return sendInvoicesByEmail;
  }

  public void setSendInvoicesByEmail(DtoValueBoolean sendInvoicesByEmail) {
    this.sendInvoicesByEmail = sendInvoicesByEmail;
  }

  public CustomerUpdateDto printStatements(DtoValueBoolean printStatements) {
    this.printStatements = printStatements;
    return this;
  }

   /**
   * Get printStatements
   * @return printStatements
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getPrintStatements() {
    return printStatements;
  }

  public void setPrintStatements(DtoValueBoolean printStatements) {
    this.printStatements = printStatements;
  }

  public CustomerUpdateDto sendStatementsByEmail(DtoValueBoolean sendStatementsByEmail) {
    this.sendStatementsByEmail = sendStatementsByEmail;
    return this;
  }

   /**
   * Get sendStatementsByEmail
   * @return sendStatementsByEmail
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getSendStatementsByEmail() {
    return sendStatementsByEmail;
  }

  public void setSendStatementsByEmail(DtoValueBoolean sendStatementsByEmail) {
    this.sendStatementsByEmail = sendStatementsByEmail;
  }

  public CustomerUpdateDto printMultiCurrencyStatements(DtoValueBoolean printMultiCurrencyStatements) {
    this.printMultiCurrencyStatements = printMultiCurrencyStatements;
    return this;
  }

   /**
   * Get printMultiCurrencyStatements
   * @return printMultiCurrencyStatements
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getPrintMultiCurrencyStatements() {
    return printMultiCurrencyStatements;
  }

  public void setPrintMultiCurrencyStatements(DtoValueBoolean printMultiCurrencyStatements) {
    this.printMultiCurrencyStatements = printMultiCurrencyStatements;
  }

  public CustomerUpdateDto vatRegistrationId(DtoValueString vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
    return this;
  }

   /**
   * Get vatRegistrationId
   * @return vatRegistrationId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatRegistrationId() {
    return vatRegistrationId;
  }

  public void setVatRegistrationId(DtoValueString vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
  }

  public CustomerUpdateDto corporateId(DtoValueString corporateId) {
    this.corporateId = corporateId;
    return this;
  }

   /**
   * Get corporateId
   * @return corporateId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCorporateId() {
    return corporateId;
  }

  public void setCorporateId(DtoValueString corporateId) {
    this.corporateId = corporateId;
  }

  public CustomerUpdateDto vatZoneId(DtoValueString vatZoneId) {
    this.vatZoneId = vatZoneId;
    return this;
  }

   /**
   * Get vatZoneId
   * @return vatZoneId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatZoneId() {
    return vatZoneId;
  }

  public void setVatZoneId(DtoValueString vatZoneId) {
    this.vatZoneId = vatZoneId;
  }

  public CustomerUpdateDto note(DtoValueString note) {
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

  public CustomerUpdateDto mainAddress(DtoValueAddressUpdateDto mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

   /**
   * Get mainAddress
   * @return mainAddress
  **/
  @ApiModelProperty(value = "")
  public DtoValueAddressUpdateDto getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(DtoValueAddressUpdateDto mainAddress) {
    this.mainAddress = mainAddress;
  }

  public CustomerUpdateDto mainContact(DtoValueContactInfoUpdateDto mainContact) {
    this.mainContact = mainContact;
    return this;
  }

   /**
   * Get mainContact
   * @return mainContact
  **/
  @ApiModelProperty(value = "")
  public DtoValueContactInfoUpdateDto getMainContact() {
    return mainContact;
  }

  public void setMainContact(DtoValueContactInfoUpdateDto mainContact) {
    this.mainContact = mainContact;
  }

  public CustomerUpdateDto creditVerification(DtoValueCreditRule creditVerification) {
    this.creditVerification = creditVerification;
    return this;
  }

   /**
   * Get creditVerification
   * @return creditVerification
  **/
  @ApiModelProperty(value = "")
  public DtoValueCreditRule getCreditVerification() {
    return creditVerification;
  }

  public void setCreditVerification(DtoValueCreditRule creditVerification) {
    this.creditVerification = creditVerification;
  }

  public CustomerUpdateDto invoiceAddress(DtoValueAddressUpdateDto invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
    return this;
  }

   /**
   * Get invoiceAddress
   * @return invoiceAddress
  **/
  @ApiModelProperty(value = "")
  public DtoValueAddressUpdateDto getInvoiceAddress() {
    return invoiceAddress;
  }

  public void setInvoiceAddress(DtoValueAddressUpdateDto invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
  }

  public CustomerUpdateDto invoiceContact(DtoValueContactInfoUpdateDto invoiceContact) {
    this.invoiceContact = invoiceContact;
    return this;
  }

   /**
   * Get invoiceContact
   * @return invoiceContact
  **/
  @ApiModelProperty(value = "")
  public DtoValueContactInfoUpdateDto getInvoiceContact() {
    return invoiceContact;
  }

  public void setInvoiceContact(DtoValueContactInfoUpdateDto invoiceContact) {
    this.invoiceContact = invoiceContact;
  }

  public CustomerUpdateDto statementType(DtoValueStatementTypes statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   * Get statementType
   * @return statementType
  **/
  @ApiModelProperty(value = "")
  public DtoValueStatementTypes getStatementType() {
    return statementType;
  }

  public void setStatementType(DtoValueStatementTypes statementType) {
    this.statementType = statementType;
  }

  public CustomerUpdateDto deliveryAddress(DtoValueAddressUpdateDto deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")
  public DtoValueAddressUpdateDto getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(DtoValueAddressUpdateDto deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public CustomerUpdateDto deliveryContact(DtoValueContactInfoUpdateDto deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @ApiModelProperty(value = "")
  public DtoValueContactInfoUpdateDto getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(DtoValueContactInfoUpdateDto deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public CustomerUpdateDto priceClassId(DtoValueString priceClassId) {
    this.priceClassId = priceClassId;
    return this;
  }

   /**
   * Get priceClassId
   * @return priceClassId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPriceClassId() {
    return priceClassId;
  }

  public void setPriceClassId(DtoValueString priceClassId) {
    this.priceClassId = priceClassId;
  }

  public CustomerUpdateDto directDebitLines(List<CustomerDirectDebitUpdateDto> directDebitLines) {
    this.directDebitLines = directDebitLines;
    return this;
  }

  public CustomerUpdateDto addDirectDebitLinesItem(CustomerDirectDebitUpdateDto directDebitLinesItem) {
    if (this.directDebitLines == null) {
      this.directDebitLines = new ArrayList<>();
    }
    this.directDebitLines.add(directDebitLinesItem);
    return this;
  }

   /**
   * Update direct debit information for a customer(only for Netherlands)
   * @return directDebitLines
  **/
  @ApiModelProperty(value = "Update direct debit information for a customer(only for Netherlands)")
  public List<CustomerDirectDebitUpdateDto> getDirectDebitLines() {
    return directDebitLines;
  }

  public void setDirectDebitLines(List<CustomerDirectDebitUpdateDto> directDebitLines) {
    this.directDebitLines = directDebitLines;
  }

  public CustomerUpdateDto attributeLines(List<AttributeLineUpdateDto> attributeLines) {
    this.attributeLines = attributeLines;
    return this;
  }

  public CustomerUpdateDto addAttributeLinesItem(AttributeLineUpdateDto attributeLinesItem) {
    if (this.attributeLines == null) {
      this.attributeLines = new ArrayList<>();
    }
    this.attributeLines.add(attributeLinesItem);
    return this;
  }

   /**
   * Get attributeLines
   * @return attributeLines
  **/
  @ApiModelProperty(value = "")
  public List<AttributeLineUpdateDto> getAttributeLines() {
    return attributeLines;
  }

  public void setAttributeLines(List<AttributeLineUpdateDto> attributeLines) {
    this.attributeLines = attributeLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateDto customerUpdateDto = (CustomerUpdateDto) o;
    return Objects.equals(this.number, customerUpdateDto.number) &&
        Objects.equals(this.name, customerUpdateDto.name) &&
        Objects.equals(this.status, customerUpdateDto.status) &&
        Objects.equals(this.accountReference, customerUpdateDto.accountReference) &&
        Objects.equals(this.parentRecordNumber, customerUpdateDto.parentRecordNumber) &&
        Objects.equals(this.currencyId, customerUpdateDto.currencyId) &&
        Objects.equals(this.creditLimit, customerUpdateDto.creditLimit) &&
        Objects.equals(this.creditDaysPastDue, customerUpdateDto.creditDaysPastDue) &&
        Objects.equals(this.overrideWithClassValues, customerUpdateDto.overrideWithClassValues) &&
        Objects.equals(this.customerClassId, customerUpdateDto.customerClassId) &&
        Objects.equals(this.creditTermsId, customerUpdateDto.creditTermsId) &&
        Objects.equals(this.printInvoices, customerUpdateDto.printInvoices) &&
        Objects.equals(this.acceptAutoInvoices, customerUpdateDto.acceptAutoInvoices) &&
        Objects.equals(this.sendInvoicesByEmail, customerUpdateDto.sendInvoicesByEmail) &&
        Objects.equals(this.printStatements, customerUpdateDto.printStatements) &&
        Objects.equals(this.sendStatementsByEmail, customerUpdateDto.sendStatementsByEmail) &&
        Objects.equals(this.printMultiCurrencyStatements, customerUpdateDto.printMultiCurrencyStatements) &&
        Objects.equals(this.vatRegistrationId, customerUpdateDto.vatRegistrationId) &&
        Objects.equals(this.corporateId, customerUpdateDto.corporateId) &&
        Objects.equals(this.vatZoneId, customerUpdateDto.vatZoneId) &&
        Objects.equals(this.note, customerUpdateDto.note) &&
        Objects.equals(this.mainAddress, customerUpdateDto.mainAddress) &&
        Objects.equals(this.mainContact, customerUpdateDto.mainContact) &&
        Objects.equals(this.creditVerification, customerUpdateDto.creditVerification) &&
        Objects.equals(this.invoiceAddress, customerUpdateDto.invoiceAddress) &&
        Objects.equals(this.invoiceContact, customerUpdateDto.invoiceContact) &&
        Objects.equals(this.statementType, customerUpdateDto.statementType) &&
        Objects.equals(this.deliveryAddress, customerUpdateDto.deliveryAddress) &&
        Objects.equals(this.deliveryContact, customerUpdateDto.deliveryContact) &&
        Objects.equals(this.priceClassId, customerUpdateDto.priceClassId) &&
        Objects.equals(this.directDebitLines, customerUpdateDto.directDebitLines) &&
        Objects.equals(this.attributeLines, customerUpdateDto.attributeLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, name, status, accountReference, parentRecordNumber, currencyId, creditLimit, creditDaysPastDue, overrideWithClassValues, customerClassId, creditTermsId, printInvoices, acceptAutoInvoices, sendInvoicesByEmail, printStatements, sendStatementsByEmail, printMultiCurrencyStatements, vatRegistrationId, corporateId, vatZoneId, note, mainAddress, mainContact, creditVerification, invoiceAddress, invoiceContact, statementType, deliveryAddress, deliveryContact, priceClassId, directDebitLines, attributeLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateDto {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    parentRecordNumber: ").append(toIndentedString(parentRecordNumber)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditDaysPastDue: ").append(toIndentedString(creditDaysPastDue)).append("\n");
    sb.append("    overrideWithClassValues: ").append(toIndentedString(overrideWithClassValues)).append("\n");
    sb.append("    customerClassId: ").append(toIndentedString(customerClassId)).append("\n");
    sb.append("    creditTermsId: ").append(toIndentedString(creditTermsId)).append("\n");
    sb.append("    printInvoices: ").append(toIndentedString(printInvoices)).append("\n");
    sb.append("    acceptAutoInvoices: ").append(toIndentedString(acceptAutoInvoices)).append("\n");
    sb.append("    sendInvoicesByEmail: ").append(toIndentedString(sendInvoicesByEmail)).append("\n");
    sb.append("    printStatements: ").append(toIndentedString(printStatements)).append("\n");
    sb.append("    sendStatementsByEmail: ").append(toIndentedString(sendStatementsByEmail)).append("\n");
    sb.append("    printMultiCurrencyStatements: ").append(toIndentedString(printMultiCurrencyStatements)).append("\n");
    sb.append("    vatRegistrationId: ").append(toIndentedString(vatRegistrationId)).append("\n");
    sb.append("    corporateId: ").append(toIndentedString(corporateId)).append("\n");
    sb.append("    vatZoneId: ").append(toIndentedString(vatZoneId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    mainAddress: ").append(toIndentedString(mainAddress)).append("\n");
    sb.append("    mainContact: ").append(toIndentedString(mainContact)).append("\n");
    sb.append("    creditVerification: ").append(toIndentedString(creditVerification)).append("\n");
    sb.append("    invoiceAddress: ").append(toIndentedString(invoiceAddress)).append("\n");
    sb.append("    invoiceContact: ").append(toIndentedString(invoiceContact)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    priceClassId: ").append(toIndentedString(priceClassId)).append("\n");
    sb.append("    directDebitLines: ").append(toIndentedString(directDebitLines)).append("\n");
    sb.append("    attributeLines: ").append(toIndentedString(attributeLines)).append("\n");
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

