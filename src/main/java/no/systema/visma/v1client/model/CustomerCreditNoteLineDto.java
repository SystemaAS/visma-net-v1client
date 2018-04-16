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
import java.util.List;
import no.systema.visma.v1client.model.AccountNumberDto;
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.ProjectTaskIdDescriptionDto;
import no.systema.visma.v1client.model.SubAccountDto;
import no.systema.visma.v1client.model.VatCodeDto;
import no.systema.visma.v1client.model.WorkTypeDto;

/**
 * CustomerCreditNoteLineDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerCreditNoteLineDto {
  @JsonProperty("termStartDate")
  private LocalDateTime termStartDate = null;

  @JsonProperty("termEndDate")
  private LocalDateTime termEndDate = null;

  @JsonProperty("isRotRutDeductible")
  private Boolean isRotRutDeductible = null;

  /**
   * Gets or Sets itemType
   */
  public enum ItemTypeEnum {
    SERVICE("Service"),
    
    MATERIALCOST("MaterialCost"),
    
    OTHERCOST("OtherCost");

    private String value;

    ItemTypeEnum(String value) {
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
    public static ItemTypeEnum fromValue(String text) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("itemType")
  private ItemTypeEnum itemType = null;

  @JsonProperty("typeOfWork")
  private WorkTypeDto typeOfWork = null;

  @JsonProperty("deductableAmount")
  private Double deductableAmount = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  @JsonProperty("projectTask")
  private ProjectTaskIdDescriptionDto projectTask = null;

  @JsonProperty("lineNumber")
  private Integer lineNumber = null;

  @JsonProperty("inventoryNumber")
  private String inventoryNumber = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("unitPrice")
  private Double unitPrice = null;

  @JsonProperty("unitPriceInCurrency")
  private Double unitPriceInCurrency = null;

  @JsonProperty("manualAmount")
  private Double manualAmount = null;

  @JsonProperty("manualAmountInCurrency")
  private Double manualAmountInCurrency = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("amountInCurrency")
  private Double amountInCurrency = null;

  @JsonProperty("account")
  private AccountNumberDto account = null;

  @JsonProperty("vatCode")
  private VatCodeDto vatCode = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("discountPercent")
  private Double discountPercent = null;

  @JsonProperty("discountAmount")
  private Double discountAmount = null;

  @JsonProperty("discountAmountInCurrency")
  private Double discountAmountInCurrency = null;

  @JsonProperty("manualDiscount")
  private Boolean manualDiscount = null;

  @JsonProperty("subaccount")
  private SubAccountDto subaccount = null;

  @JsonProperty("salesperson")
  private String salesperson = null;

  @JsonProperty("deferralSchedule")
  private Integer deferralSchedule = null;

  @JsonProperty("deferralCode")
  private String deferralCode = null;

  @JsonProperty("discountCode")
  private String discountCode = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  public CustomerCreditNoteLineDto termStartDate(LocalDateTime termStartDate) {
    this.termStartDate = termStartDate;
    return this;
  }

   /**
   * Get termStartDate
   * @return termStartDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getTermStartDate() {
    return termStartDate;
  }

  public void setTermStartDate(LocalDateTime termStartDate) {
    this.termStartDate = termStartDate;
  }

  public CustomerCreditNoteLineDto termEndDate(LocalDateTime termEndDate) {
    this.termEndDate = termEndDate;
    return this;
  }

   /**
   * The date when the process of the deferred revenue recognition should finish  for the selected item; this date can be specified manually if the deferral code  assigned to the item is based on the Flexible by Periods, Prorate by days or  Flexible by Days in Period recognition method.This column appears only if the  Deferred Revenue Management feature is enabled on the Enable/Disable Features form.
   * @return termEndDate
  **/
  @ApiModelProperty(value = "The date when the process of the deferred revenue recognition should finish  for the selected item; this date can be specified manually if the deferral code  assigned to the item is based on the Flexible by Periods, Prorate by days or  Flexible by Days in Period recognition method.This column appears only if the  Deferred Revenue Management feature is enabled on the Enable/Disable Features form.")
  public LocalDateTime getTermEndDate() {
    return termEndDate;
  }

  public void setTermEndDate(LocalDateTime termEndDate) {
    this.termEndDate = termEndDate;
  }

  public CustomerCreditNoteLineDto isRotRutDeductible(Boolean isRotRutDeductible) {
    this.isRotRutDeductible = isRotRutDeductible;
    return this;
  }

   /**
   * Get isRotRutDeductible
   * @return isRotRutDeductible
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRotRutDeductible() {
    return isRotRutDeductible;
  }

  public void setIsRotRutDeductible(Boolean isRotRutDeductible) {
    this.isRotRutDeductible = isRotRutDeductible;
  }

  public CustomerCreditNoteLineDto itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @ApiModelProperty(value = "")
  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public CustomerCreditNoteLineDto typeOfWork(WorkTypeDto typeOfWork) {
    this.typeOfWork = typeOfWork;
    return this;
  }

   /**
   * Get typeOfWork
   * @return typeOfWork
  **/
  @ApiModelProperty(value = "")
  public WorkTypeDto getTypeOfWork() {
    return typeOfWork;
  }

  public void setTypeOfWork(WorkTypeDto typeOfWork) {
    this.typeOfWork = typeOfWork;
  }

  public CustomerCreditNoteLineDto deductableAmount(Double deductableAmount) {
    this.deductableAmount = deductableAmount;
    return this;
  }

   /**
   * Get deductableAmount
   * @return deductableAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDeductableAmount() {
    return deductableAmount;
  }

  public void setDeductableAmount(Double deductableAmount) {
    this.deductableAmount = deductableAmount;
  }

  public CustomerCreditNoteLineDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CustomerCreditNoteLineDto addAttachmentsItem(AttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<AttachmentDto> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
  }

  public CustomerCreditNoteLineDto projectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * Get projectTask
   * @return projectTask
  **/
  @ApiModelProperty(value = "")
  public ProjectTaskIdDescriptionDto getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
  }

  public CustomerCreditNoteLineDto lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public CustomerCreditNoteLineDto inventoryNumber(String inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
    return this;
  }

   /**
   * Get inventoryNumber
   * @return inventoryNumber
  **/
  @ApiModelProperty(value = "")
  public String getInventoryNumber() {
    return inventoryNumber;
  }

  public void setInventoryNumber(String inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
  }

  public CustomerCreditNoteLineDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Any comments relevant to the transaction. The alphanumeric string may contain up to 30 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Any comments relevant to the transaction. The alphanumeric string may contain up to 30 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomerCreditNoteLineDto quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public CustomerCreditNoteLineDto unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price set for the item or service. If you want to update the unit price  automatically to the current value(that is, the applicable sales or default price),  you can use the Recalculate Prices and Discounts action.If you have modified  the unit price and saved the document, the value will not be updated by the  system if you change the document date.
   * @return unitPrice
  **/
  @ApiModelProperty(value = "The unit price set for the item or service. If you want to update the unit price  automatically to the current value(that is, the applicable sales or default price),  you can use the Recalculate Prices and Discounts action.If you have modified  the unit price and saved the document, the value will not be updated by the  system if you change the document date.")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CustomerCreditNoteLineDto unitPriceInCurrency(Double unitPriceInCurrency) {
    this.unitPriceInCurrency = unitPriceInCurrency;
    return this;
  }

   /**
   * Get unitPriceInCurrency
   * @return unitPriceInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getUnitPriceInCurrency() {
    return unitPriceInCurrency;
  }

  public void setUnitPriceInCurrency(Double unitPriceInCurrency) {
    this.unitPriceInCurrency = unitPriceInCurrency;
  }

  public CustomerCreditNoteLineDto manualAmount(Double manualAmount) {
    this.manualAmount = manualAmount;
    return this;
  }

   /**
   * Get manualAmount
   * @return manualAmount
  **/
  @ApiModelProperty(value = "")
  public Double getManualAmount() {
    return manualAmount;
  }

  public void setManualAmount(Double manualAmount) {
    this.manualAmount = manualAmount;
  }

  public CustomerCreditNoteLineDto manualAmountInCurrency(Double manualAmountInCurrency) {
    this.manualAmountInCurrency = manualAmountInCurrency;
    return this;
  }

   /**
   * Get manualAmountInCurrency
   * @return manualAmountInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getManualAmountInCurrency() {
    return manualAmountInCurrency;
  }

  public void setManualAmountInCurrency(Double manualAmountInCurrency) {
    this.manualAmountInCurrency = manualAmountInCurrency;
  }

  public CustomerCreditNoteLineDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount after the discount has been applied. The value of this read-only box  is calculated automatically by deducting the discount amount from the extended price.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount after the discount has been applied. The value of this read-only box  is calculated automatically by deducting the discount amount from the extended price.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CustomerCreditNoteLineDto amountInCurrency(Double amountInCurrency) {
    this.amountInCurrency = amountInCurrency;
    return this;
  }

   /**
   * Get amountInCurrency
   * @return amountInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getAmountInCurrency() {
    return amountInCurrency;
  }

  public void setAmountInCurrency(Double amountInCurrency) {
    this.amountInCurrency = amountInCurrency;
  }

  public CustomerCreditNoteLineDto account(AccountNumberDto account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountNumberDto getAccount() {
    return account;
  }

  public void setAccount(AccountNumberDto account) {
    this.account = account;
  }

  public CustomerCreditNoteLineDto vatCode(VatCodeDto vatCode) {
    this.vatCode = vatCode;
    return this;
  }

   /**
   * Get vatCode
   * @return vatCode
  **/
  @ApiModelProperty(value = "")
  public VatCodeDto getVatCode() {
    return vatCode;
  }

  public void setVatCode(VatCodeDto vatCode) {
    this.vatCode = vatCode;
  }

  public CustomerCreditNoteLineDto uom(String uom) {
    this.uom = uom;
    return this;
  }

   /**
   * Get uom
   * @return uom
  **/
  @ApiModelProperty(value = "")
  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }

  public CustomerCreditNoteLineDto discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * The percent of the line-level discount that has been applied manually or  automatically.The system selects the Manual Discount check box and  calculates the discount amount after you have entered the percent manually and  saved your changes or added a new line.
   * @return discountPercent
  **/
  @ApiModelProperty(value = "The percent of the line-level discount that has been applied manually or  automatically.The system selects the Manual Discount check box and  calculates the discount amount after you have entered the percent manually and  saved your changes or added a new line.")
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }

  public CustomerCreditNoteLineDto discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The amount of the line-level discount that has been applied manually or  automatically to this line.The system selects the Manual Discount check box  and calculates the line amount after you have entered the discount amount  manually and save your changes or added a new line.
   * @return discountAmount
  **/
  @ApiModelProperty(value = "The amount of the line-level discount that has been applied manually or  automatically to this line.The system selects the Manual Discount check box  and calculates the line amount after you have entered the discount amount  manually and save your changes or added a new line.")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public CustomerCreditNoteLineDto discountAmountInCurrency(Double discountAmountInCurrency) {
    this.discountAmountInCurrency = discountAmountInCurrency;
    return this;
  }

   /**
   * Get discountAmountInCurrency
   * @return discountAmountInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getDiscountAmountInCurrency() {
    return discountAmountInCurrency;
  }

  public void setDiscountAmountInCurrency(Double discountAmountInCurrency) {
    this.discountAmountInCurrency = discountAmountInCurrency;
  }

  public CustomerCreditNoteLineDto manualDiscount(Boolean manualDiscount) {
    this.manualDiscount = manualDiscount;
    return this;
  }

   /**
   * A check box that indicates (if selected) that the discount has been applied  manually.If you clear the check box, the system clears entered discount percent,  or discount amount, or selected discount code.
   * @return manualDiscount
  **/
  @ApiModelProperty(value = "A check box that indicates (if selected) that the discount has been applied  manually.If you clear the check box, the system clears entered discount percent,  or discount amount, or selected discount code.")
  public Boolean isManualDiscount() {
    return manualDiscount;
  }

  public void setManualDiscount(Boolean manualDiscount) {
    this.manualDiscount = manualDiscount;
  }

  public CustomerCreditNoteLineDto subaccount(SubAccountDto subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public SubAccountDto getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(SubAccountDto subaccount) {
    this.subaccount = subaccount;
  }

  public CustomerCreditNoteLineDto salesperson(String salesperson) {
    this.salesperson = salesperson;
    return this;
  }

   /**
   * Get salesperson
   * @return salesperson
  **/
  @ApiModelProperty(value = "")
  public String getSalesperson() {
    return salesperson;
  }

  public void setSalesperson(String salesperson) {
    this.salesperson = salesperson;
  }

  public CustomerCreditNoteLineDto deferralSchedule(Integer deferralSchedule) {
    this.deferralSchedule = deferralSchedule;
    return this;
  }

   /**
   * Get deferralSchedule
   * @return deferralSchedule
  **/
  @ApiModelProperty(value = "")
  public Integer getDeferralSchedule() {
    return deferralSchedule;
  }

  public void setDeferralSchedule(Integer deferralSchedule) {
    this.deferralSchedule = deferralSchedule;
  }

  public CustomerCreditNoteLineDto deferralCode(String deferralCode) {
    this.deferralCode = deferralCode;
    return this;
  }

   /**
   * The deferral code assigned to the stock item or non-stock item specified in this  document line.Upon release of the document, the system generates a deferral  schedule (or schedules) based on the settings defined in this deferral code.
   * @return deferralCode
  **/
  @ApiModelProperty(value = "The deferral code assigned to the stock item or non-stock item specified in this  document line.Upon release of the document, the system generates a deferral  schedule (or schedules) based on the settings defined in this deferral code.")
  public String getDeferralCode() {
    return deferralCode;
  }

  public void setDeferralCode(String deferralCode) {
    this.deferralCode = deferralCode;
  }

  public CustomerCreditNoteLineDto discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * The code of the line discount that has been applied to this line automatically or manually.
   * @return discountCode
  **/
  @ApiModelProperty(value = "The code of the line discount that has been applied to this line automatically or manually.")
  public String getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  public CustomerCreditNoteLineDto note(String note) {
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

  public CustomerCreditNoteLineDto branchNumber(BranchNumberDto branchNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreditNoteLineDto customerCreditNoteLineDto = (CustomerCreditNoteLineDto) o;
    return Objects.equals(this.termStartDate, customerCreditNoteLineDto.termStartDate) &&
        Objects.equals(this.termEndDate, customerCreditNoteLineDto.termEndDate) &&
        Objects.equals(this.isRotRutDeductible, customerCreditNoteLineDto.isRotRutDeductible) &&
        Objects.equals(this.itemType, customerCreditNoteLineDto.itemType) &&
        Objects.equals(this.typeOfWork, customerCreditNoteLineDto.typeOfWork) &&
        Objects.equals(this.deductableAmount, customerCreditNoteLineDto.deductableAmount) &&
        Objects.equals(this.attachments, customerCreditNoteLineDto.attachments) &&
        Objects.equals(this.projectTask, customerCreditNoteLineDto.projectTask) &&
        Objects.equals(this.lineNumber, customerCreditNoteLineDto.lineNumber) &&
        Objects.equals(this.inventoryNumber, customerCreditNoteLineDto.inventoryNumber) &&
        Objects.equals(this.description, customerCreditNoteLineDto.description) &&
        Objects.equals(this.quantity, customerCreditNoteLineDto.quantity) &&
        Objects.equals(this.unitPrice, customerCreditNoteLineDto.unitPrice) &&
        Objects.equals(this.unitPriceInCurrency, customerCreditNoteLineDto.unitPriceInCurrency) &&
        Objects.equals(this.manualAmount, customerCreditNoteLineDto.manualAmount) &&
        Objects.equals(this.manualAmountInCurrency, customerCreditNoteLineDto.manualAmountInCurrency) &&
        Objects.equals(this.amount, customerCreditNoteLineDto.amount) &&
        Objects.equals(this.amountInCurrency, customerCreditNoteLineDto.amountInCurrency) &&
        Objects.equals(this.account, customerCreditNoteLineDto.account) &&
        Objects.equals(this.vatCode, customerCreditNoteLineDto.vatCode) &&
        Objects.equals(this.uom, customerCreditNoteLineDto.uom) &&
        Objects.equals(this.discountPercent, customerCreditNoteLineDto.discountPercent) &&
        Objects.equals(this.discountAmount, customerCreditNoteLineDto.discountAmount) &&
        Objects.equals(this.discountAmountInCurrency, customerCreditNoteLineDto.discountAmountInCurrency) &&
        Objects.equals(this.manualDiscount, customerCreditNoteLineDto.manualDiscount) &&
        Objects.equals(this.subaccount, customerCreditNoteLineDto.subaccount) &&
        Objects.equals(this.salesperson, customerCreditNoteLineDto.salesperson) &&
        Objects.equals(this.deferralSchedule, customerCreditNoteLineDto.deferralSchedule) &&
        Objects.equals(this.deferralCode, customerCreditNoteLineDto.deferralCode) &&
        Objects.equals(this.discountCode, customerCreditNoteLineDto.discountCode) &&
        Objects.equals(this.note, customerCreditNoteLineDto.note) &&
        Objects.equals(this.branchNumber, customerCreditNoteLineDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termStartDate, termEndDate, isRotRutDeductible, itemType, typeOfWork, deductableAmount, attachments, projectTask, lineNumber, inventoryNumber, description, quantity, unitPrice, unitPriceInCurrency, manualAmount, manualAmountInCurrency, amount, amountInCurrency, account, vatCode, uom, discountPercent, discountAmount, discountAmountInCurrency, manualDiscount, subaccount, salesperson, deferralSchedule, deferralCode, discountCode, note, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreditNoteLineDto {\n");
    
    sb.append("    termStartDate: ").append(toIndentedString(termStartDate)).append("\n");
    sb.append("    termEndDate: ").append(toIndentedString(termEndDate)).append("\n");
    sb.append("    isRotRutDeductible: ").append(toIndentedString(isRotRutDeductible)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    typeOfWork: ").append(toIndentedString(typeOfWork)).append("\n");
    sb.append("    deductableAmount: ").append(toIndentedString(deductableAmount)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    inventoryNumber: ").append(toIndentedString(inventoryNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitPriceInCurrency: ").append(toIndentedString(unitPriceInCurrency)).append("\n");
    sb.append("    manualAmount: ").append(toIndentedString(manualAmount)).append("\n");
    sb.append("    manualAmountInCurrency: ").append(toIndentedString(manualAmountInCurrency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountInCurrency: ").append(toIndentedString(amountInCurrency)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountAmountInCurrency: ").append(toIndentedString(discountAmountInCurrency)).append("\n");
    sb.append("    manualDiscount: ").append(toIndentedString(manualDiscount)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    salesperson: ").append(toIndentedString(salesperson)).append("\n");
    sb.append("    deferralSchedule: ").append(toIndentedString(deferralSchedule)).append("\n");
    sb.append("    deferralCode: ").append(toIndentedString(deferralCode)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
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

