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
import no.systema.visma.v1client.model.CashTransactionDetailUpdateDto;
import no.systema.visma.v1client.model.CashTransactionTaxDetailUpdateDto;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueNullableTaxCalcMode;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * CashTransactionUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CashTransactionUpdateDto {
  @JsonProperty("referenceNumber")
  private DtoValueString referenceNumber = null;

  @JsonProperty("hold")
  private DtoValueNullableBoolean hold = null;

  @JsonProperty("tranDate")
  private DtoValueNullableDateTime tranDate = null;

  @JsonProperty("finanacialPeriod")
  private DtoValueString finanacialPeriod = null;

  @JsonProperty("financialPeriod")
  private DtoValueString financialPeriod = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("cashAccount")
  private DtoValueString cashAccount = null;

  @JsonProperty("entryType")
  private DtoValueString entryType = null;

  @JsonProperty("documentRef")
  private DtoValueString documentRef = null;

  @JsonProperty("controlTotal")
  private DtoValueNullableDecimal controlTotal = null;

  @JsonProperty("vatAmount")
  private DtoValueNullableDecimal vatAmount = null;

  @JsonProperty("vatZone")
  private DtoValueString vatZone = null;

  @JsonProperty("taxCalculationMode")
  private DtoValueNullableTaxCalcMode taxCalculationMode = null;

  @JsonProperty("cashTransactionDetails")
  private List<CashTransactionDetailUpdateDto> cashTransactionDetails = null;

  @JsonProperty("cashTransactionTaxDetails")
  private List<CashTransactionTaxDetailUpdateDto> cashTransactionTaxDetails = null;

  public CashTransactionUpdateDto referenceNumber(DtoValueString referenceNumber) {
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

  public CashTransactionUpdateDto hold(DtoValueNullableBoolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getHold() {
    return hold;
  }

  public void setHold(DtoValueNullableBoolean hold) {
    this.hold = hold;
  }

  public CashTransactionUpdateDto tranDate(DtoValueNullableDateTime tranDate) {
    this.tranDate = tranDate;
    return this;
  }

   /**
   * Get tranDate
   * @return tranDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDateTime getTranDate() {
    return tranDate;
  }

  public void setTranDate(DtoValueNullableDateTime tranDate) {
    this.tranDate = tranDate;
  }

  public CashTransactionUpdateDto finanacialPeriod(DtoValueString finanacialPeriod) {
    this.finanacialPeriod = finanacialPeriod;
    return this;
  }

   /**
   * The property is now considered obsolete. Use Financial Period instead
   * @return finanacialPeriod
  **/
  @ApiModelProperty(value = "The property is now considered obsolete. Use Financial Period instead")
  public DtoValueString getFinanacialPeriod() {
    return finanacialPeriod;
  }

  public void setFinanacialPeriod(DtoValueString finanacialPeriod) {
    this.finanacialPeriod = finanacialPeriod;
  }

  public CashTransactionUpdateDto financialPeriod(DtoValueString financialPeriod) {
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

  public CashTransactionUpdateDto description(DtoValueString description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDescription() {
    return description;
  }

  public void setDescription(DtoValueString description) {
    this.description = description;
  }

  public CashTransactionUpdateDto cashAccount(DtoValueString cashAccount) {
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

  public CashTransactionUpdateDto entryType(DtoValueString entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getEntryType() {
    return entryType;
  }

  public void setEntryType(DtoValueString entryType) {
    this.entryType = entryType;
  }

  public CashTransactionUpdateDto documentRef(DtoValueString documentRef) {
    this.documentRef = documentRef;
    return this;
  }

   /**
   * Get documentRef
   * @return documentRef
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDocumentRef() {
    return documentRef;
  }

  public void setDocumentRef(DtoValueString documentRef) {
    this.documentRef = documentRef;
  }

  public CashTransactionUpdateDto controlTotal(DtoValueNullableDecimal controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

   /**
   * Get controlTotal
   * @return controlTotal
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(DtoValueNullableDecimal controlTotal) {
    this.controlTotal = controlTotal;
  }

  public CashTransactionUpdateDto vatAmount(DtoValueNullableDecimal vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(DtoValueNullableDecimal vatAmount) {
    this.vatAmount = vatAmount;
  }

  public CashTransactionUpdateDto vatZone(DtoValueString vatZone) {
    this.vatZone = vatZone;
    return this;
  }

   /**
   * Get vatZone
   * @return vatZone
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatZone() {
    return vatZone;
  }

  public void setVatZone(DtoValueString vatZone) {
    this.vatZone = vatZone;
  }

  public CashTransactionUpdateDto taxCalculationMode(DtoValueNullableTaxCalcMode taxCalculationMode) {
    this.taxCalculationMode = taxCalculationMode;
    return this;
  }

   /**
   * Get taxCalculationMode
   * @return taxCalculationMode
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableTaxCalcMode getTaxCalculationMode() {
    return taxCalculationMode;
  }

  public void setTaxCalculationMode(DtoValueNullableTaxCalcMode taxCalculationMode) {
    this.taxCalculationMode = taxCalculationMode;
  }

  public CashTransactionUpdateDto cashTransactionDetails(List<CashTransactionDetailUpdateDto> cashTransactionDetails) {
    this.cashTransactionDetails = cashTransactionDetails;
    return this;
  }

  public CashTransactionUpdateDto addCashTransactionDetailsItem(CashTransactionDetailUpdateDto cashTransactionDetailsItem) {
    if (this.cashTransactionDetails == null) {
      this.cashTransactionDetails = new ArrayList<>();
    }
    this.cashTransactionDetails.add(cashTransactionDetailsItem);
    return this;
  }

   /**
   * Get cashTransactionDetails
   * @return cashTransactionDetails
  **/
  @ApiModelProperty(value = "")
  public List<CashTransactionDetailUpdateDto> getCashTransactionDetails() {
    return cashTransactionDetails;
  }

  public void setCashTransactionDetails(List<CashTransactionDetailUpdateDto> cashTransactionDetails) {
    this.cashTransactionDetails = cashTransactionDetails;
  }

  public CashTransactionUpdateDto cashTransactionTaxDetails(List<CashTransactionTaxDetailUpdateDto> cashTransactionTaxDetails) {
    this.cashTransactionTaxDetails = cashTransactionTaxDetails;
    return this;
  }

  public CashTransactionUpdateDto addCashTransactionTaxDetailsItem(CashTransactionTaxDetailUpdateDto cashTransactionTaxDetailsItem) {
    if (this.cashTransactionTaxDetails == null) {
      this.cashTransactionTaxDetails = new ArrayList<>();
    }
    this.cashTransactionTaxDetails.add(cashTransactionTaxDetailsItem);
    return this;
  }

   /**
   * Get cashTransactionTaxDetails
   * @return cashTransactionTaxDetails
  **/
  @ApiModelProperty(value = "")
  public List<CashTransactionTaxDetailUpdateDto> getCashTransactionTaxDetails() {
    return cashTransactionTaxDetails;
  }

  public void setCashTransactionTaxDetails(List<CashTransactionTaxDetailUpdateDto> cashTransactionTaxDetails) {
    this.cashTransactionTaxDetails = cashTransactionTaxDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransactionUpdateDto cashTransactionUpdateDto = (CashTransactionUpdateDto) o;
    return Objects.equals(this.referenceNumber, cashTransactionUpdateDto.referenceNumber) &&
        Objects.equals(this.hold, cashTransactionUpdateDto.hold) &&
        Objects.equals(this.tranDate, cashTransactionUpdateDto.tranDate) &&
        Objects.equals(this.finanacialPeriod, cashTransactionUpdateDto.finanacialPeriod) &&
        Objects.equals(this.financialPeriod, cashTransactionUpdateDto.financialPeriod) &&
        Objects.equals(this.description, cashTransactionUpdateDto.description) &&
        Objects.equals(this.cashAccount, cashTransactionUpdateDto.cashAccount) &&
        Objects.equals(this.entryType, cashTransactionUpdateDto.entryType) &&
        Objects.equals(this.documentRef, cashTransactionUpdateDto.documentRef) &&
        Objects.equals(this.controlTotal, cashTransactionUpdateDto.controlTotal) &&
        Objects.equals(this.vatAmount, cashTransactionUpdateDto.vatAmount) &&
        Objects.equals(this.vatZone, cashTransactionUpdateDto.vatZone) &&
        Objects.equals(this.taxCalculationMode, cashTransactionUpdateDto.taxCalculationMode) &&
        Objects.equals(this.cashTransactionDetails, cashTransactionUpdateDto.cashTransactionDetails) &&
        Objects.equals(this.cashTransactionTaxDetails, cashTransactionUpdateDto.cashTransactionTaxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, hold, tranDate, finanacialPeriod, financialPeriod, description, cashAccount, entryType, documentRef, controlTotal, vatAmount, vatZone, taxCalculationMode, cashTransactionDetails, cashTransactionTaxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionUpdateDto {\n");
    
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    tranDate: ").append(toIndentedString(tranDate)).append("\n");
    sb.append("    finanacialPeriod: ").append(toIndentedString(finanacialPeriod)).append("\n");
    sb.append("    financialPeriod: ").append(toIndentedString(financialPeriod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    documentRef: ").append(toIndentedString(documentRef)).append("\n");
    sb.append("    controlTotal: ").append(toIndentedString(controlTotal)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    vatZone: ").append(toIndentedString(vatZone)).append("\n");
    sb.append("    taxCalculationMode: ").append(toIndentedString(taxCalculationMode)).append("\n");
    sb.append("    cashTransactionDetails: ").append(toIndentedString(cashTransactionDetails)).append("\n");
    sb.append("    cashTransactionTaxDetails: ").append(toIndentedString(cashTransactionTaxDetails)).append("\n");
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

