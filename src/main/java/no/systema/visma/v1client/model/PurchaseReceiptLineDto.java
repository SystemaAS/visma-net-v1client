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
import no.systema.visma.v1client.model.AccountNumberTypeDescriptionDto;
import no.systema.visma.v1client.model.AllocationsDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.DiscountCodeNumberDescriptionDto;
import no.systema.visma.v1client.model.InventoryNumberDescriptionDto;
import no.systema.visma.v1client.model.LocationDescriptionDto;
import no.systema.visma.v1client.model.ProjectIdDescriptionDto;
import no.systema.visma.v1client.model.ProjectTaskIdDescriptionDto;
import no.systema.visma.v1client.model.SubAccountDescriptionDto;
import no.systema.visma.v1client.model.TaxCategoryNumberDescriptionDto;
import no.systema.visma.v1client.model.WarehouseIdDescriptionDto;

/**
 * This class represents a Purchase Order Line in PurchaseReceiptContraoller. Used for getting data.
 */
@ApiModel(description = "This class represents a Purchase Order Line in PurchaseReceiptContraoller. Used for getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PurchaseReceiptLineDto {
  @JsonProperty("allocations")
  private List<AllocationsDto> allocations = null;

  @JsonProperty("lineNbr")
  private Integer lineNbr = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  @JsonProperty("inventory")
  private InventoryNumberDescriptionDto inventory = null;

  /**
   * Gets or Sets lineType
   */
  public enum LineTypeEnum {
    GOODSFORINVENTORY("GoodsForInventory"),
    
    GOODSFORSALESORDER("GoodsForSalesOrder"),
    
    GOODSFORREPLENISHMENT("GoodsForReplenishment"),
    
    GOODSFORDROPSHIP("GoodsForDropShip"),
    
    NONSTOCKFORDROPSHIP("NonStockForDropShip"),
    
    NONSTOCKFORSALESORDER("NonStockForSalesOrder"),
    
    NONSTOCK("NonStock"),
    
    SERVICE("Service"),
    
    FREIGHT("Freight"),
    
    DESCRIPTION("Description");

    private String value;

    LineTypeEnum(String value) {
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
    public static LineTypeEnum fromValue(String text) {
      for (LineTypeEnum b : LineTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("lineType")
  private LineTypeEnum lineType = null;

  @JsonProperty("warehouse")
  private WarehouseIdDescriptionDto warehouse = null;

  @JsonProperty("location")
  private LocationDescriptionDto location = null;

  @JsonProperty("transactionDescription")
  private String transactionDescription = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("orderQty")
  private Double orderQty = null;

  @JsonProperty("openQty")
  private Double openQty = null;

  @JsonProperty("receiptQty")
  private Double receiptQty = null;

  @JsonProperty("unitCost")
  private Double unitCost = null;

  @JsonProperty("extCost")
  private Double extCost = null;

  @JsonProperty("discountPercent")
  private Double discountPercent = null;

  @JsonProperty("discountAmount")
  private Double discountAmount = null;

  @JsonProperty("manualDiscount")
  private Boolean manualDiscount = null;

  @JsonProperty("discountCode")
  private DiscountCodeNumberDescriptionDto discountCode = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("taxCategory")
  private TaxCategoryNumberDescriptionDto taxCategory = null;

  @JsonProperty("account")
  private AccountNumberTypeDescriptionDto account = null;

  @JsonProperty("accountDescription")
  private String accountDescription = null;

  @JsonProperty("sub")
  private SubAccountDescriptionDto sub = null;

  @JsonProperty("actualAccount")
  private AccountNumberTypeDescriptionDto actualAccount = null;

  @JsonProperty("actualSub")
  private SubAccountDescriptionDto actualSub = null;

  @JsonProperty("project")
  private ProjectIdDescriptionDto project = null;

  @JsonProperty("projectTask")
  private ProjectTaskIdDescriptionDto projectTask = null;

  @JsonProperty("expirationDate")
  private LocalDateTime expirationDate = null;

  @JsonProperty("lotSerialNumber")
  private String lotSerialNumber = null;

  /**
   * Gets or Sets poOrderType
   */
  public enum PoOrderTypeEnum {
    REGULARORDER("RegularOrder"),
    
    DROPSHIP("DropShip"),
    
    BLANKET("Blanket"),
    
    STANDARDBLANKET("StandardBlanket");

    private String value;

    PoOrderTypeEnum(String value) {
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
    public static PoOrderTypeEnum fromValue(String text) {
      for (PoOrderTypeEnum b : PoOrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("poOrderType")
  private PoOrderTypeEnum poOrderType = null;

  @JsonProperty("poOrderNbr")
  private String poOrderNbr = null;

  @JsonProperty("poOrderLineNbr")
  private Integer poOrderLineNbr = null;

  /**
   * Gets or Sets transferOrderType
   */
  public enum TransferOrderTypeEnum {
    CREDITNOTE("CreditNote"),
    
    DEBITNOTE("DebitNote"),
    
    INVOICE("Invoice"),
    
    QUOTEORDER("QuoteOrder"),
    
    RMAORDER("RMAOrder"),
    
    SALESORDER("SalesOrder"),
    
    STANDARDORDER("StandardOrder"),
    
    TRANSFERORDER("TransferOrder");

    private String value;

    TransferOrderTypeEnum(String value) {
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
    public static TransferOrderTypeEnum fromValue(String text) {
      for (TransferOrderTypeEnum b : TransferOrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("transferOrderType")
  private TransferOrderTypeEnum transferOrderType = null;

  @JsonProperty("transferOrderNbr")
  private String transferOrderNbr = null;

  @JsonProperty("transferOrderLineNbr")
  private Integer transferOrderLineNbr = null;

  @JsonProperty("completePoLine")
  private Boolean completePoLine = null;

  public PurchaseReceiptLineDto allocations(List<AllocationsDto> allocations) {
    this.allocations = allocations;
    return this;
  }

  public PurchaseReceiptLineDto addAllocationsItem(AllocationsDto allocationsItem) {
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
  public List<AllocationsDto> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<AllocationsDto> allocations) {
    this.allocations = allocations;
  }

  public PurchaseReceiptLineDto lineNbr(Integer lineNbr) {
    this.lineNbr = lineNbr;
    return this;
  }

   /**
   * Get lineNbr
   * @return lineNbr
  **/
  @ApiModelProperty(value = "")
  public Integer getLineNbr() {
    return lineNbr;
  }

  public void setLineNbr(Integer lineNbr) {
    this.lineNbr = lineNbr;
  }

  public PurchaseReceiptLineDto branch(BranchNumberDto branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Branch is deprecated, please use BranchNumber instead.
   * @return branch
  **/
  @ApiModelProperty(value = "Branch is deprecated, please use BranchNumber instead.")
  public BranchNumberDto getBranch() {
    return branch;
  }

  public void setBranch(BranchNumberDto branch) {
    this.branch = branch;
  }

  public PurchaseReceiptLineDto branchNumber(BranchNumberDto branchNumber) {
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

  public PurchaseReceiptLineDto inventory(InventoryNumberDescriptionDto inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public InventoryNumberDescriptionDto getInventory() {
    return inventory;
  }

  public void setInventory(InventoryNumberDescriptionDto inventory) {
    this.inventory = inventory;
  }

  public PurchaseReceiptLineDto lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Get lineType
   * @return lineType
  **/
  @ApiModelProperty(value = "")
  public LineTypeEnum getLineType() {
    return lineType;
  }

  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }

  public PurchaseReceiptLineDto warehouse(WarehouseIdDescriptionDto warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public WarehouseIdDescriptionDto getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(WarehouseIdDescriptionDto warehouse) {
    this.warehouse = warehouse;
  }

  public PurchaseReceiptLineDto location(LocationDescriptionDto location) {
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

  public PurchaseReceiptLineDto transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @ApiModelProperty(value = "")
  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public PurchaseReceiptLineDto uom(String uom) {
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

  public PurchaseReceiptLineDto orderQty(Double orderQty) {
    this.orderQty = orderQty;
    return this;
  }

   /**
   * Get orderQty
   * @return orderQty
  **/
  @ApiModelProperty(value = "")
  public Double getOrderQty() {
    return orderQty;
  }

  public void setOrderQty(Double orderQty) {
    this.orderQty = orderQty;
  }

  public PurchaseReceiptLineDto openQty(Double openQty) {
    this.openQty = openQty;
    return this;
  }

   /**
   * Get openQty
   * @return openQty
  **/
  @ApiModelProperty(value = "")
  public Double getOpenQty() {
    return openQty;
  }

  public void setOpenQty(Double openQty) {
    this.openQty = openQty;
  }

  public PurchaseReceiptLineDto receiptQty(Double receiptQty) {
    this.receiptQty = receiptQty;
    return this;
  }

   /**
   * Get receiptQty
   * @return receiptQty
  **/
  @ApiModelProperty(value = "")
  public Double getReceiptQty() {
    return receiptQty;
  }

  public void setReceiptQty(Double receiptQty) {
    this.receiptQty = receiptQty;
  }

  public PurchaseReceiptLineDto unitCost(Double unitCost) {
    this.unitCost = unitCost;
    return this;
  }

   /**
   * Get unitCost
   * @return unitCost
  **/
  @ApiModelProperty(value = "")
  public Double getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(Double unitCost) {
    this.unitCost = unitCost;
  }

  public PurchaseReceiptLineDto extCost(Double extCost) {
    this.extCost = extCost;
    return this;
  }

   /**
   * Get extCost
   * @return extCost
  **/
  @ApiModelProperty(value = "")
  public Double getExtCost() {
    return extCost;
  }

  public void setExtCost(Double extCost) {
    this.extCost = extCost;
  }

  public PurchaseReceiptLineDto discountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * Get discountPercent
   * @return discountPercent
  **/
  @ApiModelProperty(value = "")
  public Double getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(Double discountPercent) {
    this.discountPercent = discountPercent;
  }

  public PurchaseReceiptLineDto discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public PurchaseReceiptLineDto manualDiscount(Boolean manualDiscount) {
    this.manualDiscount = manualDiscount;
    return this;
  }

   /**
   * Get manualDiscount
   * @return manualDiscount
  **/
  @ApiModelProperty(value = "")
  public Boolean isManualDiscount() {
    return manualDiscount;
  }

  public void setManualDiscount(Boolean manualDiscount) {
    this.manualDiscount = manualDiscount;
  }

  public PurchaseReceiptLineDto discountCode(DiscountCodeNumberDescriptionDto discountCode) {
    this.discountCode = discountCode;
    return this;
  }

   /**
   * Get discountCode
   * @return discountCode
  **/
  @ApiModelProperty(value = "")
  public DiscountCodeNumberDescriptionDto getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(DiscountCodeNumberDescriptionDto discountCode) {
    this.discountCode = discountCode;
  }

  public PurchaseReceiptLineDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PurchaseReceiptLineDto taxCategory(TaxCategoryNumberDescriptionDto taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")
  public TaxCategoryNumberDescriptionDto getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(TaxCategoryNumberDescriptionDto taxCategory) {
    this.taxCategory = taxCategory;
  }

  public PurchaseReceiptLineDto account(AccountNumberTypeDescriptionDto account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountNumberTypeDescriptionDto getAccount() {
    return account;
  }

  public void setAccount(AccountNumberTypeDescriptionDto account) {
    this.account = account;
  }

  public PurchaseReceiptLineDto accountDescription(String accountDescription) {
    this.accountDescription = accountDescription;
    return this;
  }

   /**
   * Get accountDescription
   * @return accountDescription
  **/
  @ApiModelProperty(value = "")
  public String getAccountDescription() {
    return accountDescription;
  }

  public void setAccountDescription(String accountDescription) {
    this.accountDescription = accountDescription;
  }

  public PurchaseReceiptLineDto sub(SubAccountDescriptionDto sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @ApiModelProperty(value = "")
  public SubAccountDescriptionDto getSub() {
    return sub;
  }

  public void setSub(SubAccountDescriptionDto sub) {
    this.sub = sub;
  }

  public PurchaseReceiptLineDto actualAccount(AccountNumberTypeDescriptionDto actualAccount) {
    this.actualAccount = actualAccount;
    return this;
  }

   /**
   * Get actualAccount
   * @return actualAccount
  **/
  @ApiModelProperty(value = "")
  public AccountNumberTypeDescriptionDto getActualAccount() {
    return actualAccount;
  }

  public void setActualAccount(AccountNumberTypeDescriptionDto actualAccount) {
    this.actualAccount = actualAccount;
  }

  public PurchaseReceiptLineDto actualSub(SubAccountDescriptionDto actualSub) {
    this.actualSub = actualSub;
    return this;
  }

   /**
   * Get actualSub
   * @return actualSub
  **/
  @ApiModelProperty(value = "")
  public SubAccountDescriptionDto getActualSub() {
    return actualSub;
  }

  public void setActualSub(SubAccountDescriptionDto actualSub) {
    this.actualSub = actualSub;
  }

  public PurchaseReceiptLineDto project(ProjectIdDescriptionDto project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public ProjectIdDescriptionDto getProject() {
    return project;
  }

  public void setProject(ProjectIdDescriptionDto project) {
    this.project = project;
  }

  public PurchaseReceiptLineDto projectTask(ProjectTaskIdDescriptionDto projectTask) {
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

  public PurchaseReceiptLineDto expirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PurchaseReceiptLineDto lotSerialNumber(String lotSerialNumber) {
    this.lotSerialNumber = lotSerialNumber;
    return this;
  }

   /**
   * Get lotSerialNumber
   * @return lotSerialNumber
  **/
  @ApiModelProperty(value = "")
  public String getLotSerialNumber() {
    return lotSerialNumber;
  }

  public void setLotSerialNumber(String lotSerialNumber) {
    this.lotSerialNumber = lotSerialNumber;
  }

  public PurchaseReceiptLineDto poOrderType(PoOrderTypeEnum poOrderType) {
    this.poOrderType = poOrderType;
    return this;
  }

   /**
   * Get poOrderType
   * @return poOrderType
  **/
  @ApiModelProperty(value = "")
  public PoOrderTypeEnum getPoOrderType() {
    return poOrderType;
  }

  public void setPoOrderType(PoOrderTypeEnum poOrderType) {
    this.poOrderType = poOrderType;
  }

  public PurchaseReceiptLineDto poOrderNbr(String poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
    return this;
  }

   /**
   * Get poOrderNbr
   * @return poOrderNbr
  **/
  @ApiModelProperty(value = "")
  public String getPoOrderNbr() {
    return poOrderNbr;
  }

  public void setPoOrderNbr(String poOrderNbr) {
    this.poOrderNbr = poOrderNbr;
  }

  public PurchaseReceiptLineDto poOrderLineNbr(Integer poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
    return this;
  }

   /**
   * Get poOrderLineNbr
   * @return poOrderLineNbr
  **/
  @ApiModelProperty(value = "")
  public Integer getPoOrderLineNbr() {
    return poOrderLineNbr;
  }

  public void setPoOrderLineNbr(Integer poOrderLineNbr) {
    this.poOrderLineNbr = poOrderLineNbr;
  }

  public PurchaseReceiptLineDto transferOrderType(TransferOrderTypeEnum transferOrderType) {
    this.transferOrderType = transferOrderType;
    return this;
  }

   /**
   * Get transferOrderType
   * @return transferOrderType
  **/
  @ApiModelProperty(value = "")
  public TransferOrderTypeEnum getTransferOrderType() {
    return transferOrderType;
  }

  public void setTransferOrderType(TransferOrderTypeEnum transferOrderType) {
    this.transferOrderType = transferOrderType;
  }

  public PurchaseReceiptLineDto transferOrderNbr(String transferOrderNbr) {
    this.transferOrderNbr = transferOrderNbr;
    return this;
  }

   /**
   * Get transferOrderNbr
   * @return transferOrderNbr
  **/
  @ApiModelProperty(value = "")
  public String getTransferOrderNbr() {
    return transferOrderNbr;
  }

  public void setTransferOrderNbr(String transferOrderNbr) {
    this.transferOrderNbr = transferOrderNbr;
  }

  public PurchaseReceiptLineDto transferOrderLineNbr(Integer transferOrderLineNbr) {
    this.transferOrderLineNbr = transferOrderLineNbr;
    return this;
  }

   /**
   * Get transferOrderLineNbr
   * @return transferOrderLineNbr
  **/
  @ApiModelProperty(value = "")
  public Integer getTransferOrderLineNbr() {
    return transferOrderLineNbr;
  }

  public void setTransferOrderLineNbr(Integer transferOrderLineNbr) {
    this.transferOrderLineNbr = transferOrderLineNbr;
  }

  public PurchaseReceiptLineDto completePoLine(Boolean completePoLine) {
    this.completePoLine = completePoLine;
    return this;
  }

   /**
   * Get completePoLine
   * @return completePoLine
  **/
  @ApiModelProperty(value = "")
  public Boolean isCompletePoLine() {
    return completePoLine;
  }

  public void setCompletePoLine(Boolean completePoLine) {
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
    PurchaseReceiptLineDto purchaseReceiptLineDto = (PurchaseReceiptLineDto) o;
    return Objects.equals(this.allocations, purchaseReceiptLineDto.allocations) &&
        Objects.equals(this.lineNbr, purchaseReceiptLineDto.lineNbr) &&
        Objects.equals(this.branch, purchaseReceiptLineDto.branch) &&
        Objects.equals(this.branchNumber, purchaseReceiptLineDto.branchNumber) &&
        Objects.equals(this.inventory, purchaseReceiptLineDto.inventory) &&
        Objects.equals(this.lineType, purchaseReceiptLineDto.lineType) &&
        Objects.equals(this.warehouse, purchaseReceiptLineDto.warehouse) &&
        Objects.equals(this.location, purchaseReceiptLineDto.location) &&
        Objects.equals(this.transactionDescription, purchaseReceiptLineDto.transactionDescription) &&
        Objects.equals(this.uom, purchaseReceiptLineDto.uom) &&
        Objects.equals(this.orderQty, purchaseReceiptLineDto.orderQty) &&
        Objects.equals(this.openQty, purchaseReceiptLineDto.openQty) &&
        Objects.equals(this.receiptQty, purchaseReceiptLineDto.receiptQty) &&
        Objects.equals(this.unitCost, purchaseReceiptLineDto.unitCost) &&
        Objects.equals(this.extCost, purchaseReceiptLineDto.extCost) &&
        Objects.equals(this.discountPercent, purchaseReceiptLineDto.discountPercent) &&
        Objects.equals(this.discountAmount, purchaseReceiptLineDto.discountAmount) &&
        Objects.equals(this.manualDiscount, purchaseReceiptLineDto.manualDiscount) &&
        Objects.equals(this.discountCode, purchaseReceiptLineDto.discountCode) &&
        Objects.equals(this.amount, purchaseReceiptLineDto.amount) &&
        Objects.equals(this.taxCategory, purchaseReceiptLineDto.taxCategory) &&
        Objects.equals(this.account, purchaseReceiptLineDto.account) &&
        Objects.equals(this.accountDescription, purchaseReceiptLineDto.accountDescription) &&
        Objects.equals(this.sub, purchaseReceiptLineDto.sub) &&
        Objects.equals(this.actualAccount, purchaseReceiptLineDto.actualAccount) &&
        Objects.equals(this.actualSub, purchaseReceiptLineDto.actualSub) &&
        Objects.equals(this.project, purchaseReceiptLineDto.project) &&
        Objects.equals(this.projectTask, purchaseReceiptLineDto.projectTask) &&
        Objects.equals(this.expirationDate, purchaseReceiptLineDto.expirationDate) &&
        Objects.equals(this.lotSerialNumber, purchaseReceiptLineDto.lotSerialNumber) &&
        Objects.equals(this.poOrderType, purchaseReceiptLineDto.poOrderType) &&
        Objects.equals(this.poOrderNbr, purchaseReceiptLineDto.poOrderNbr) &&
        Objects.equals(this.poOrderLineNbr, purchaseReceiptLineDto.poOrderLineNbr) &&
        Objects.equals(this.transferOrderType, purchaseReceiptLineDto.transferOrderType) &&
        Objects.equals(this.transferOrderNbr, purchaseReceiptLineDto.transferOrderNbr) &&
        Objects.equals(this.transferOrderLineNbr, purchaseReceiptLineDto.transferOrderLineNbr) &&
        Objects.equals(this.completePoLine, purchaseReceiptLineDto.completePoLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations, lineNbr, branch, branchNumber, inventory, lineType, warehouse, location, transactionDescription, uom, orderQty, openQty, receiptQty, unitCost, extCost, discountPercent, discountAmount, manualDiscount, discountCode, amount, taxCategory, account, accountDescription, sub, actualAccount, actualSub, project, projectTask, expirationDate, lotSerialNumber, poOrderType, poOrderNbr, poOrderLineNbr, transferOrderType, transferOrderNbr, transferOrderLineNbr, completePoLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseReceiptLineDto {\n");
    
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    lineNbr: ").append(toIndentedString(lineNbr)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    orderQty: ").append(toIndentedString(orderQty)).append("\n");
    sb.append("    openQty: ").append(toIndentedString(openQty)).append("\n");
    sb.append("    receiptQty: ").append(toIndentedString(receiptQty)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    extCost: ").append(toIndentedString(extCost)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    manualDiscount: ").append(toIndentedString(manualDiscount)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountDescription: ").append(toIndentedString(accountDescription)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    actualAccount: ").append(toIndentedString(actualAccount)).append("\n");
    sb.append("    actualSub: ").append(toIndentedString(actualSub)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
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
