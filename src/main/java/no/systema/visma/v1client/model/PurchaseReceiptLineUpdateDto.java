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
import no.systema.visma.v1client.model.AllocationsUpdateDto;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueNullablePoLineType;
import no.systema.visma.v1client.model.DtoValueNullablePurchaseOrderType;
import no.systema.visma.v1client.model.DtoValueNullableSalesOrderTypes;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.SegmentUpdateDto;

/**
 * This class represents a Purchase Order Line in PurchaseReceiptContraoller. Used for getting data.
 */
@ApiModel(description = "This class represents a Purchase Order Line in PurchaseReceiptContraoller. Used for getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PurchaseReceiptLineUpdateDto {
  @JsonProperty("allocations")
  private List<AllocationsUpdateDto> allocations = null;

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

  @JsonProperty("lineNbr")
  private DtoValueNullableInt32 lineNbr = null;

  @JsonProperty("lineType")
  private DtoValueNullablePoLineType lineType = null;

  @JsonProperty("branchId")
  private DtoValueString branchId = null;

  @JsonProperty("branchNumber")
  private DtoValueString branchNumber = null;

  @JsonProperty("inventoryId")
  private DtoValueString inventoryId = null;

  @JsonProperty("warehouseId")
  private DtoValueString warehouseId = null;

  @JsonProperty("locationId")
  private DtoValueString locationId = null;

  @JsonProperty("transactionDescription")
  private DtoValueString transactionDescription = null;

  @JsonProperty("uom")
  private DtoValueString uom = null;

  @JsonProperty("receiptQty")
  private DtoValueNullableDecimal receiptQty = null;

  @JsonProperty("unitCost")
  private DtoValueNullableDecimal unitCost = null;

  @JsonProperty("extCost")
  private DtoValueNullableDecimal extCost = null;

  @JsonProperty("discountPercent")
  private DtoValueNullableDecimal discountPercent = null;

  @JsonProperty("discountAmount")
  private DtoValueNullableDecimal discountAmount = null;

  @JsonProperty("manualDiscount")
  private DtoValueNullableBoolean manualDiscount = null;

  @JsonProperty("discountCodeId")
  private DtoValueString discountCodeId = null;

  @JsonProperty("amount")
  private DtoValueNullableDecimal amount = null;

  @JsonProperty("taxCategoryId")
  private DtoValueString taxCategoryId = null;

  @JsonProperty("accountId")
  private DtoValueString accountId = null;

  @JsonProperty("accountDescription")
  private DtoValueString accountDescription = null;

  @JsonProperty("subaccount")
  private List<SegmentUpdateDto> subaccount = null;

  @JsonProperty("actualAccountId")
  private DtoValueString actualAccountId = null;

  @JsonProperty("actualSubaccount")
  private List<SegmentUpdateDto> actualSubaccount = null;

  @JsonProperty("projectId")
  private DtoValueString projectId = null;

  @JsonProperty("projectTaskId")
  private DtoValueString projectTaskId = null;

  @JsonProperty("expirationDate")
  private DtoValueNullableDateTime expirationDate = null;

  @JsonProperty("lotSerialNumber")
  private DtoValueString lotSerialNumber = null;

  @JsonProperty("poOrderType")
  private DtoValueNullablePurchaseOrderType poOrderType = null;

  @JsonProperty("poOrderNbr")
  private DtoValueString poOrderNbr = null;

  @JsonProperty("poOrderLineNbr")
  private DtoValueNullableInt32 poOrderLineNbr = null;

  @JsonProperty("transferOrderType")
  private DtoValueNullableSalesOrderTypes transferOrderType = null;

  @JsonProperty("transferOrderNbr")
  private DtoValueString transferOrderNbr = null;

  @JsonProperty("transferOrderLineNbr")
  private DtoValueNullableInt32 transferOrderLineNbr = null;

  @JsonProperty("completePoLine")
  private DtoValueNullableBoolean completePoLine = null;

  public PurchaseReceiptLineUpdateDto allocations(List<AllocationsUpdateDto> allocations) {
    this.allocations = allocations;
    return this;
  }

  public PurchaseReceiptLineUpdateDto addAllocationsItem(AllocationsUpdateDto allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @ApiModelProperty(value = "")
  public List<AllocationsUpdateDto> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<AllocationsUpdateDto> allocations) {
    this.allocations = allocations;
  }

  public PurchaseReceiptLineUpdateDto operation(OperationEnum operation) {
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

  public PurchaseReceiptLineUpdateDto lineNbr(DtoValueNullableInt32 lineNbr) {
    this.lineNbr = lineNbr;
    return this;
  }

   /**
   * Get lineNbr
   * @return lineNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getLineNbr() {
    return lineNbr;
  }

  public void setLineNbr(DtoValueNullableInt32 lineNbr) {
    this.lineNbr = lineNbr;
  }

  public PurchaseReceiptLineUpdateDto lineType(DtoValueNullablePoLineType lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullablePoLineType getLineType() {
    return lineType;
  }

  public void setLineType(DtoValueNullablePoLineType lineType) {
    this.lineType = lineType;
  }

  public PurchaseReceiptLineUpdateDto branchId(DtoValueString branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * BranchId is deprecated, please use BranchNumber instead.
   * @return branchId
  **/
  @ApiModelProperty(value = "BranchId is deprecated, please use BranchNumber instead.")
  public DtoValueString getBranchId() {
    return branchId;
  }

  public void setBranchId(DtoValueString branchId) {
    this.branchId = branchId;
  }

  public PurchaseReceiptLineUpdateDto branchNumber(DtoValueString branchNumber) {
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

  public PurchaseReceiptLineUpdateDto inventoryId(DtoValueString inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

   /**
   * Get inventoryId
   * @return inventoryId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(DtoValueString inventoryId) {
    this.inventoryId = inventoryId;
  }

  public PurchaseReceiptLineUpdateDto warehouseId(DtoValueString warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(DtoValueString warehouseId) {
    this.warehouseId = warehouseId;
  }

  public PurchaseReceiptLineUpdateDto locationId(DtoValueString locationId) {
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

  public PurchaseReceiptLineUpdateDto transactionDescription(DtoValueString transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(DtoValueString transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public PurchaseReceiptLineUpdateDto uom(DtoValueString uom) {
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

  public PurchaseReceiptLineUpdateDto receiptQty(DtoValueNullableDecimal receiptQty) {
    this.receiptQty = receiptQty;
    return this;
  }

   /**
   * Get receiptQty
   * @return receiptQty
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getReceiptQty() {
    return receiptQty;
  }

  public void setReceiptQty(DtoValueNullableDecimal receiptQty) {
    this.receiptQty = receiptQty;
  }

  public PurchaseReceiptLineUpdateDto unitCost(DtoValueNullableDecimal unitCost) {
    this.unitCost = unitCost;
    return this;
  }

   /**
   * Get unitCost
   * @return unitCost
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(DtoValueNullableDecimal unitCost) {
    this.unitCost = unitCost;
  }

  public PurchaseReceiptLineUpdateDto extCost(DtoValueNullableDecimal extCost) {
    this.extCost = extCost;
    return this;
  }

   /**
   * Get extCost
   * @return extCost
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getExtCost() {
    return extCost;
  }

  public void setExtCost(DtoValueNullableDecimal extCost) {
    this.extCost = extCost;
  }

  public PurchaseReceiptLineUpdateDto discountPercent(DtoValueNullableDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(DtoValueNullableDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public PurchaseReceiptLineUpdateDto discountAmount(DtoValueNullableDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(DtoValueNullableDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public PurchaseReceiptLineUpdateDto manualDiscount(DtoValueNullableBoolean manualDiscount) {
    this.manualDiscount = manualDiscount;
    return this;
  }

   /**
   * Get manualDiscount
   * @return manualDiscount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getManualDiscount() {
    return manualDiscount;
  }

  public void setManualDiscount(DtoValueNullableBoolean manualDiscount) {
    this.manualDiscount = manualDiscount;
  }

  public PurchaseReceiptLineUpdateDto discountCodeId(DtoValueString discountCodeId) {
    this.discountCodeId = discountCodeId;
    return this;
  }

   /**
   * Get discountCodeId
   * @return discountCodeId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getDiscountCodeId() {
    return discountCodeId;
  }

  public void setDiscountCodeId(DtoValueString discountCodeId) {
    this.discountCodeId = discountCodeId;
  }

  public PurchaseReceiptLineUpdateDto amount(DtoValueNullableDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getAmount() {
    return amount;
  }

  public void setAmount(DtoValueNullableDecimal amount) {
    this.amount = amount;
  }

  public PurchaseReceiptLineUpdateDto taxCategoryId(DtoValueString taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
    return this;
  }

   /**
   * Get taxCategoryId
   * @return taxCategoryId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTaxCategoryId() {
    return taxCategoryId;
  }

  public void setTaxCategoryId(DtoValueString taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
  }

  public PurchaseReceiptLineUpdateDto accountId(DtoValueString accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAccountId() {
    return accountId;
  }

  public void setAccountId(DtoValueString accountId) {
    this.accountId = accountId;
  }

  public PurchaseReceiptLineUpdateDto accountDescription(DtoValueString accountDescription) {
    this.accountDescription = accountDescription;
    return this;
  }

   /**
   * Get accountDescription
   * @return accountDescription
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAccountDescription() {
    return accountDescription;
  }

  public void setAccountDescription(DtoValueString accountDescription) {
    this.accountDescription = accountDescription;
  }

  public PurchaseReceiptLineUpdateDto subaccount(List<SegmentUpdateDto> subaccount) {
    this.subaccount = subaccount;
    return this;
  }

  public PurchaseReceiptLineUpdateDto addSubaccountItem(SegmentUpdateDto subaccountItem) {
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

  public PurchaseReceiptLineUpdateDto actualAccountId(DtoValueString actualAccountId) {
    this.actualAccountId = actualAccountId;
    return this;
  }

   /**
   * Get actualAccountId
   * @return actualAccountId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getActualAccountId() {
    return actualAccountId;
  }

  public void setActualAccountId(DtoValueString actualAccountId) {
    this.actualAccountId = actualAccountId;
  }

  public PurchaseReceiptLineUpdateDto actualSubaccount(List<SegmentUpdateDto> actualSubaccount) {
    this.actualSubaccount = actualSubaccount;
    return this;
  }

  public PurchaseReceiptLineUpdateDto addActualSubaccountItem(SegmentUpdateDto actualSubaccountItem) {
    if (this.actualSubaccount == null) {
      this.actualSubaccount = new ArrayList<>();
    }
    this.actualSubaccount.add(actualSubaccountItem);
    return this;
  }

   /**
   * Get actualSubaccount
   * @return actualSubaccount
  **/
  @ApiModelProperty(value = "")
  public List<SegmentUpdateDto> getActualSubaccount() {
    return actualSubaccount;
  }

  public void setActualSubaccount(List<SegmentUpdateDto> actualSubaccount) {
    this.actualSubaccount = actualSubaccount;
  }

  public PurchaseReceiptLineUpdateDto projectId(DtoValueString projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getProjectId() {
    return projectId;
  }

  public void setProjectId(DtoValueString projectId) {
    this.projectId = projectId;
  }

  public PurchaseReceiptLineUpdateDto projectTaskId(DtoValueString projectTaskId) {
    this.projectTaskId = projectTaskId;
    return this;
  }

   /**
   * Get projectTaskId
   * @return projectTaskId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getProjectTaskId() {
    return projectTaskId;
  }

  public void setProjectTaskId(DtoValueString projectTaskId) {
    this.projectTaskId = projectTaskId;
  }

  public PurchaseReceiptLineUpdateDto expirationDate(DtoValueNullableDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DtoValueNullableDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PurchaseReceiptLineUpdateDto lotSerialNumber(DtoValueString lotSerialNumber) {
    this.lotSerialNumber = lotSerialNumber;
    return this;
  }

   /**
   * Get lotSerialNumber
   * @return lotSerialNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLotSerialNumber() {
    return lotSerialNumber;
  }

  public void setLotSerialNumber(DtoValueString lotSerialNumber) {
    this.lotSerialNumber = lotSerialNumber;
  }

  public PurchaseReceiptLineUpdateDto poOrderType(DtoValueNullablePurchaseOrderType poOrderType) {
    this.poOrderType = poOrderType;
    return this;
  }

   /**
   * Deprecated, property will be replaced by an action
   * @return poOrderType
  **/
  @ApiModelProperty(value = "Deprecated, property will be replaced by an action")
  public DtoValueNullablePurchaseOrderType getPoOrderType() {
    return poOrderType;
  }

  public void setPoOrderType(DtoValueNullablePurchaseOrderType poOrderType) {
    this.poOrderType = poOrderType;
  }

  public PurchaseReceiptLineUpdateDto poOrderNbr(DtoValueString poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
    return this;
  }

   /**
   * Deprecated, property will be replaced by an action
   * @return poOrderNbr
  **/
  @ApiModelProperty(value = "Deprecated, property will be replaced by an action")
  public DtoValueString getPoOrderNbr() {
    return poOrderNbr;
  }

  public void setPoOrderNbr(DtoValueString poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
  }

  public PurchaseReceiptLineUpdateDto poOrderLineNbr(DtoValueNullableInt32 poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
    return this;
  }

   /**
   * Deprecated, property will be replaced by an action
   * @return poOrderLineNbr
  **/
  @ApiModelProperty(value = "Deprecated, property will be replaced by an action")
  public DtoValueNullableInt32 getPoOrderLineNbr() {
    return poOrderLineNbr;
  }

  public void setPoOrderLineNbr(DtoValueNullableInt32 poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
  }

  public PurchaseReceiptLineUpdateDto transferOrderType(DtoValueNullableSalesOrderTypes transferOrderType) {
    this.transferOrderType = transferOrderType;
    return this;
  }

   /**
   * Get transferOrderType
   * @return transferOrderType
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableSalesOrderTypes getTransferOrderType() {
    return transferOrderType;
  }

  public void setTransferOrderType(DtoValueNullableSalesOrderTypes transferOrderType) {
    this.transferOrderType = transferOrderType;
  }

  public PurchaseReceiptLineUpdateDto transferOrderNbr(DtoValueString transferOrderNbr) {
    this.transferOrderNbr = transferOrderNbr;
    return this;
  }

   /**
   * Get transferOrderNbr
   * @return transferOrderNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTransferOrderNbr() {
    return transferOrderNbr;
  }

  public void setTransferOrderNbr(DtoValueString transferOrderNbr) {
    this.transferOrderNbr = transferOrderNbr;
  }

  public PurchaseReceiptLineUpdateDto transferOrderLineNbr(DtoValueNullableInt32 transferOrderLineNbr) {
    this.transferOrderLineNbr = transferOrderLineNbr;
    return this;
  }

   /**
   * Get transferOrderLineNbr
   * @return transferOrderLineNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getTransferOrderLineNbr() {
    return transferOrderLineNbr;
  }

  public void setTransferOrderLineNbr(DtoValueNullableInt32 transferOrderLineNbr) {
    this.transferOrderLineNbr = transferOrderLineNbr;
  }

  public PurchaseReceiptLineUpdateDto completePoLine(DtoValueNullableBoolean completePoLine) {
    this.completePoLine = completePoLine;
    return this;
  }

   /**
   * Get completePoLine
   * @return completePoLine
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getCompletePoLine() {
    return completePoLine;
  }

  public void setCompletePoLine(DtoValueNullableBoolean completePoLine) {
    this.completePoLine = completePoLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseReceiptLineUpdateDto purchaseReceiptLineUpdateDto = (PurchaseReceiptLineUpdateDto) o;
    return Objects.equals(this.allocations, purchaseReceiptLineUpdateDto.allocations) &&
        Objects.equals(this.operation, purchaseReceiptLineUpdateDto.operation) &&
        Objects.equals(this.lineNbr, purchaseReceiptLineUpdateDto.lineNbr) &&
        Objects.equals(this.lineType, purchaseReceiptLineUpdateDto.lineType) &&
        Objects.equals(this.branchId, purchaseReceiptLineUpdateDto.branchId) &&
        Objects.equals(this.branchNumber, purchaseReceiptLineUpdateDto.branchNumber) &&
        Objects.equals(this.inventoryId, purchaseReceiptLineUpdateDto.inventoryId) &&
        Objects.equals(this.warehouseId, purchaseReceiptLineUpdateDto.warehouseId) &&
        Objects.equals(this.locationId, purchaseReceiptLineUpdateDto.locationId) &&
        Objects.equals(this.transactionDescription, purchaseReceiptLineUpdateDto.transactionDescription) &&
        Objects.equals(this.uom, purchaseReceiptLineUpdateDto.uom) &&
        Objects.equals(this.receiptQty, purchaseReceiptLineUpdateDto.receiptQty) &&
        Objects.equals(this.unitCost, purchaseReceiptLineUpdateDto.unitCost) &&
        Objects.equals(this.extCost, purchaseReceiptLineUpdateDto.extCost) &&
        Objects.equals(this.discountPercent, purchaseReceiptLineUpdateDto.discountPercent) &&
        Objects.equals(this.discountAmount, purchaseReceiptLineUpdateDto.discountAmount) &&
        Objects.equals(this.manualDiscount, purchaseReceiptLineUpdateDto.manualDiscount) &&
        Objects.equals(this.discountCodeId, purchaseReceiptLineUpdateDto.discountCodeId) &&
        Objects.equals(this.amount, purchaseReceiptLineUpdateDto.amount) &&
        Objects.equals(this.taxCategoryId, purchaseReceiptLineUpdateDto.taxCategoryId) &&
        Objects.equals(this.accountId, purchaseReceiptLineUpdateDto.accountId) &&
        Objects.equals(this.accountDescription, purchaseReceiptLineUpdateDto.accountDescription) &&
        Objects.equals(this.subaccount, purchaseReceiptLineUpdateDto.subaccount) &&
        Objects.equals(this.actualAccountId, purchaseReceiptLineUpdateDto.actualAccountId) &&
        Objects.equals(this.actualSubaccount, purchaseReceiptLineUpdateDto.actualSubaccount) &&
        Objects.equals(this.projectId, purchaseReceiptLineUpdateDto.projectId) &&
        Objects.equals(this.projectTaskId, purchaseReceiptLineUpdateDto.projectTaskId) &&
        Objects.equals(this.expirationDate, purchaseReceiptLineUpdateDto.expirationDate) &&
        Objects.equals(this.lotSerialNumber, purchaseReceiptLineUpdateDto.lotSerialNumber) &&
        Objects.equals(this.poOrderType, purchaseReceiptLineUpdateDto.poOrderType) &&
        Objects.equals(this.poOrderNbr, purchaseReceiptLineUpdateDto.poOrderNbr) &&
        Objects.equals(this.poOrderLineNbr, purchaseReceiptLineUpdateDto.poOrderLineNbr) &&
        Objects.equals(this.transferOrderType, purchaseReceiptLineUpdateDto.transferOrderType) &&
        Objects.equals(this.transferOrderNbr, purchaseReceiptLineUpdateDto.transferOrderNbr) &&
        Objects.equals(this.transferOrderLineNbr, purchaseReceiptLineUpdateDto.transferOrderLineNbr) &&
        Objects.equals(this.completePoLine, purchaseReceiptLineUpdateDto.completePoLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations, operation, lineNbr, lineType, branchId, branchNumber, inventoryId, warehouseId, locationId, transactionDescription, uom, receiptQty, unitCost, extCost, discountPercent, discountAmount, manualDiscount, discountCodeId, amount, taxCategoryId, accountId, accountDescription, subaccount, actualAccountId, actualSubaccount, projectId, projectTaskId, expirationDate, lotSerialNumber, poOrderType, poOrderNbr, poOrderLineNbr, transferOrderType, transferOrderNbr, transferOrderLineNbr, completePoLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseReceiptLineUpdateDto {\n");
    
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNbr: ").append(toIndentedString(lineNbr)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    receiptQty: ").append(toIndentedString(receiptQty)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    extCost: ").append(toIndentedString(extCost)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    manualDiscount: ").append(toIndentedString(manualDiscount)).append("\n");
    sb.append("    discountCodeId: ").append(toIndentedString(discountCodeId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxCategoryId: ").append(toIndentedString(taxCategoryId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountDescription: ").append(toIndentedString(accountDescription)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    actualAccountId: ").append(toIndentedString(actualAccountId)).append("\n");
    sb.append("    actualSubaccount: ").append(toIndentedString(actualSubaccount)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectTaskId: ").append(toIndentedString(projectTaskId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    lotSerialNumber: ").append(toIndentedString(lotSerialNumber)).append("\n");
    sb.append("    poOrderType: ").append(toIndentedString(poOrderType)).append("\n");
    sb.append("    poOrderNbr: ").append(toIndentedString(poOrderNbr)).append("\n");
    sb.append("    poOrderLineNbr: ").append(toIndentedString(poOrderLineNbr)).append("\n");
    sb.append("    transferOrderType: ").append(toIndentedString(transferOrderType)).append("\n");
    sb.append("    transferOrderNbr: ").append(toIndentedString(transferOrderNbr)).append("\n");
    sb.append("    transferOrderLineNbr: ").append(toIndentedString(transferOrderLineNbr)).append("\n");
    sb.append("    completePoLine: ").append(toIndentedString(completePoLine)).append("\n");
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

