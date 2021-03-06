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
import no.systema.visma.v1client.model.DtoValueInt32;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.SegmentUpdateDto;

/**
 * CreditNoteLineUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CreditNoteLineUpdateDto {
  @JsonProperty("discountCode")
  private DtoValueString discountCode = null;

  @JsonProperty("taskId")
  private DtoValueString taskId = null;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    INSERT("Insert"),
    
    UPDATE("Update"),
    
    DELETE("Delete");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("inventoryNumber")
  private DtoValueString inventoryNumber = null;

  @JsonProperty("lineNumber")
  private DtoValueInt32 lineNumber = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("quantity")
  private DtoValueDecimal quantity = null;

  @JsonProperty("unitPriceInCurrency")
  private DtoValueDecimal unitPriceInCurrency = null;

  @JsonProperty("manualAmountInCurrency")
  private DtoValueDecimal manualAmountInCurrency = null;

  @JsonProperty("accountNumber")
  private DtoValueString accountNumber = null;

  @JsonProperty("vatCodeId")
  private DtoValueString vatCodeId = null;

  @JsonProperty("uom")
  private DtoValueString uom = null;

  @JsonProperty("discountPercent")
  private DtoValueDecimal discountPercent = null;

  @JsonProperty("discountAmountInCurrency")
  private DtoValueDecimal discountAmountInCurrency = null;

  @JsonProperty("manualDiscount")
  private DtoValueBoolean manualDiscount = null;

  @JsonProperty("subaccount")
  private List<SegmentUpdateDto> subaccount = null;

  @JsonProperty("salesperson")
  private DtoValueString salesperson = null;

  @JsonProperty("deferralSchedule")
  private DtoValueInt32 deferralSchedule = null;

  @JsonProperty("deferralCode")
  private DtoValueString deferralCode = null;

  @JsonProperty("termStartDate")
  private DtoValueDateTime termStartDate = null;

  @JsonProperty("termEndDate")
  private DtoValueDateTime termEndDate = null;

  @JsonProperty("note")
  private DtoValueString note = null;

  @JsonProperty("branchNumber")
  private DtoValueString branchNumber = null;

  public CreditNoteLineUpdateDto discountCode(DtoValueString discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * Get discountCode
   * @return discountCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(DtoValueString discountCode) {
    this.discountCode = discountCode;
  }

  public CreditNoteLineUpdateDto taskId(DtoValueString taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTaskId() {
    return taskId;
  }

  public void setTaskId(DtoValueString taskId) {
    this.taskId = taskId;
  }

  public CreditNoteLineUpdateDto operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CreditNoteLineUpdateDto inventoryNumber(DtoValueString inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
    return this;
  }

   /**
   * Get inventoryNumber
   * @return inventoryNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getInventoryNumber() {
    return inventoryNumber;
  }

  public void setInventoryNumber(DtoValueString inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
  }

  public CreditNoteLineUpdateDto lineNumber(DtoValueInt32 lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueInt32 getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(DtoValueInt32 lineNumber) {
    this.lineNumber = lineNumber;
  }

  public CreditNoteLineUpdateDto description(DtoValueString description) {
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

  public CreditNoteLineUpdateDto quantity(DtoValueDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(DtoValueDecimal quantity) {
    this.quantity = quantity;
  }

  public CreditNoteLineUpdateDto unitPriceInCurrency(DtoValueDecimal unitPriceInCurrency) {
    this.unitPriceInCurrency = unitPriceInCurrency;
    return this;
  }

   /**
   * Get unitPriceInCurrency
   * @return unitPriceInCurrency
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getUnitPriceInCurrency() {
    return unitPriceInCurrency;
  }

  public void setUnitPriceInCurrency(DtoValueDecimal unitPriceInCurrency) {
    this.unitPriceInCurrency = unitPriceInCurrency;
  }

  public CreditNoteLineUpdateDto manualAmountInCurrency(DtoValueDecimal manualAmountInCurrency) {
    this.manualAmountInCurrency = manualAmountInCurrency;
    return this;
  }

   /**
   * Get manualAmountInCurrency
   * @return manualAmountInCurrency
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getManualAmountInCurrency() {
    return manualAmountInCurrency;
  }

  public void setManualAmountInCurrency(DtoValueDecimal manualAmountInCurrency) {
    this.manualAmountInCurrency = manualAmountInCurrency;
  }

  public CreditNoteLineUpdateDto accountNumber(DtoValueString accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(DtoValueString accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CreditNoteLineUpdateDto vatCodeId(DtoValueString vatCodeId) {
    this.vatCodeId = vatCodeId;
    return this;
  }

   /**
   * Get vatCodeId
   * @return vatCodeId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatCodeId() {
    return vatCodeId;
  }

  public void setVatCodeId(DtoValueString vatCodeId) {
    this.vatCodeId = vatCodeId;
  }

  public CreditNoteLineUpdateDto uom(DtoValueString uom) {
    this.uom = uom;
    return this;
  }

   /**
   * Get uom
   * @return uom
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getUom() {
    return uom;
  }

  public void setUom(DtoValueString uom) {
    this.uom = uom;
  }

  public CreditNoteLineUpdateDto discountPercent(DtoValueDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(DtoValueDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public CreditNoteLineUpdateDto discountAmountInCurrency(DtoValueDecimal discountAmountInCurrency) {
    this.discountAmountInCurrency = discountAmountInCurrency;
    return this;
  }

   /**
   * Get discountAmountInCurrency
   * @return discountAmountInCurrency
  **/
  @ApiModelProperty(value = "")
  public DtoValueDecimal getDiscountAmountInCurrency() {
    return discountAmountInCurrency;
  }

  public void setDiscountAmountInCurrency(DtoValueDecimal discountAmountInCurrency) {
    this.discountAmountInCurrency = discountAmountInCurrency;
  }

  public CreditNoteLineUpdateDto manualDiscount(DtoValueBoolean manualDiscount) {
    this.manualDiscount = manualDiscount;
    return this;
  }

   /**
   * Get manualDiscount
   * @return manualDiscount
  **/
  @ApiModelProperty(value = "")
  public DtoValueBoolean getManualDiscount() {
    return manualDiscount;
  }

  public void setManualDiscount(DtoValueBoolean manualDiscount) {
    this.manualDiscount = manualDiscount;
  }

  public CreditNoteLineUpdateDto subaccount(List<SegmentUpdateDto> subaccount) {
    this.subaccount = subaccount;
    return this;
  }

  public CreditNoteLineUpdateDto addSubaccountItem(SegmentUpdateDto subaccountItem) {
    if (this.subaccount == null) {
      this.subaccount = new ArrayList<>();
    }
    this.subaccount.add(subaccountItem);
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public List<SegmentUpdateDto> getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(List<SegmentUpdateDto> subaccount) {
    this.subaccount = subaccount;
  }

  public CreditNoteLineUpdateDto salesperson(DtoValueString salesperson) {
    this.salesperson = salesperson;
    return this;
  }

   /**
   * Get salesperson
   * @return salesperson
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getSalesperson() {
    return salesperson;
  }

  public void setSalesperson(DtoValueString salesperson) {
    this.salesperson = salesperson;
  }

  public CreditNoteLineUpdateDto deferralSchedule(DtoValueInt32 deferralSchedule) {
    this.deferralSchedule = deferralSchedule;
    return this;
  }

   /**
   * Get deferralSchedule
   * @return deferralSchedule
  **/
  @ApiModelProperty(value = "")
  public DtoValueInt32 getDeferralSchedule() {
    return deferralSchedule;
  }

  public void setDeferralSchedule(DtoValueInt32 deferralSchedule) {
    this.deferralSchedule = deferralSchedule;
  }

  public CreditNoteLineUpdateDto deferralCode(DtoValueString deferralCode) {
    this.deferralCode = deferralCode;
    return this;
  }

   /**
   * Get deferralCode
   * @return deferralCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDeferralCode() {
    return deferralCode;
  }

  public void setDeferralCode(DtoValueString deferralCode) {
    this.deferralCode = deferralCode;
  }

  public CreditNoteLineUpdateDto termStartDate(DtoValueDateTime termStartDate) {
    this.termStartDate = termStartDate;
    return this;
  }

   /**
   * Get termStartDate
   * @return termStartDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getTermStartDate() {
    return termStartDate;
  }

  public void setTermStartDate(DtoValueDateTime termStartDate) {
    this.termStartDate = termStartDate;
  }

  public CreditNoteLineUpdateDto termEndDate(DtoValueDateTime termEndDate) {
    this.termEndDate = termEndDate;
    return this;
  }

   /**
   * Get termEndDate
   * @return termEndDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueDateTime getTermEndDate() {
    return termEndDate;
  }

  public void setTermEndDate(DtoValueDateTime termEndDate) {
    this.termEndDate = termEndDate;
  }

  public CreditNoteLineUpdateDto note(DtoValueString note) {
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

  public CreditNoteLineUpdateDto branchNumber(DtoValueString branchNumber) {
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
    CreditNoteLineUpdateDto creditNoteLineUpdateDto = (CreditNoteLineUpdateDto) o;
    return Objects.equals(this.discountCode, creditNoteLineUpdateDto.discountCode) &&
        Objects.equals(this.taskId, creditNoteLineUpdateDto.taskId) &&
        Objects.equals(this.operation, creditNoteLineUpdateDto.operation) &&
        Objects.equals(this.inventoryNumber, creditNoteLineUpdateDto.inventoryNumber) &&
        Objects.equals(this.lineNumber, creditNoteLineUpdateDto.lineNumber) &&
        Objects.equals(this.description, creditNoteLineUpdateDto.description) &&
        Objects.equals(this.quantity, creditNoteLineUpdateDto.quantity) &&
        Objects.equals(this.unitPriceInCurrency, creditNoteLineUpdateDto.unitPriceInCurrency) &&
        Objects.equals(this.manualAmountInCurrency, creditNoteLineUpdateDto.manualAmountInCurrency) &&
        Objects.equals(this.accountNumber, creditNoteLineUpdateDto.accountNumber) &&
        Objects.equals(this.vatCodeId, creditNoteLineUpdateDto.vatCodeId) &&
        Objects.equals(this.uom, creditNoteLineUpdateDto.uom) &&
        Objects.equals(this.discountPercent, creditNoteLineUpdateDto.discountPercent) &&
        Objects.equals(this.discountAmountInCurrency, creditNoteLineUpdateDto.discountAmountInCurrency) &&
        Objects.equals(this.manualDiscount, creditNoteLineUpdateDto.manualDiscount) &&
        Objects.equals(this.subaccount, creditNoteLineUpdateDto.subaccount) &&
        Objects.equals(this.salesperson, creditNoteLineUpdateDto.salesperson) &&
        Objects.equals(this.deferralSchedule, creditNoteLineUpdateDto.deferralSchedule) &&
        Objects.equals(this.deferralCode, creditNoteLineUpdateDto.deferralCode) &&
        Objects.equals(this.termStartDate, creditNoteLineUpdateDto.termStartDate) &&
        Objects.equals(this.termEndDate, creditNoteLineUpdateDto.termEndDate) &&
        Objects.equals(this.note, creditNoteLineUpdateDto.note) &&
        Objects.equals(this.branchNumber, creditNoteLineUpdateDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountCode, taskId, operation, inventoryNumber, lineNumber, description, quantity, unitPriceInCurrency, manualAmountInCurrency, accountNumber, vatCodeId, uom, discountPercent, discountAmountInCurrency, manualDiscount, subaccount, salesperson, deferralSchedule, deferralCode, termStartDate, termEndDate, note, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteLineUpdateDto {\n");
    
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    inventoryNumber: ").append(toIndentedString(inventoryNumber)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPriceInCurrency: ").append(toIndentedString(unitPriceInCurrency)).append("\n");
    sb.append("    manualAmountInCurrency: ").append(toIndentedString(manualAmountInCurrency)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    vatCodeId: ").append(toIndentedString(vatCodeId)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountAmountInCurrency: ").append(toIndentedString(discountAmountInCurrency)).append("\n");
    sb.append("    manualDiscount: ").append(toIndentedString(manualDiscount)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    salesperson: ").append(toIndentedString(salesperson)).append("\n");
    sb.append("    deferralSchedule: ").append(toIndentedString(deferralSchedule)).append("\n");
    sb.append("    deferralCode: ").append(toIndentedString(deferralCode)).append("\n");
    sb.append("    termStartDate: ").append(toIndentedString(termStartDate)).append("\n");
    sb.append("    termEndDate: ").append(toIndentedString(termEndDate)).append("\n");
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

