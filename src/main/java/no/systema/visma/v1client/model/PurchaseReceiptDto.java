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
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.LandedCostDto;
import no.systema.visma.v1client.model.LocationDescriptionDto;
import no.systema.visma.v1client.model.PurchaseReceiptLineDto;
import no.systema.visma.v1client.model.SupplierDescriptionDto;
import no.systema.visma.v1client.model.WarehouseIdDescriptionDto;

/**
 * This class represents a Purchase Receipt in PurchaseReceiptController. Used for getting data.
 */
@ApiModel(description = "This class represents a Purchase Receipt in PurchaseReceiptController. Used for getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PurchaseReceiptDto {
  @JsonProperty("landedCost")
  private List<LandedCostDto> landedCost = null;

  /**
   * Gets or Sets receiptType
   */
  public enum ReceiptTypeEnum {
    PORECEIPT("PoReceipt"),
    
    PORETURN("PoReturn"),
    
    TRANSFERRECEIPT("TransferReceipt");

    private String value;

    ReceiptTypeEnum(String value) {
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
    public static ReceiptTypeEnum fromValue(String text) {
      for (ReceiptTypeEnum b : ReceiptTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("receiptType")
  private ReceiptTypeEnum receiptType = null;

  @JsonProperty("receiptNbr")
  private String receiptNbr = null;

  @JsonProperty("hold")
  private Boolean hold = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HOLD("Hold"),
    
    BALANCED("Balanced"),
    
    RELEASED("Released");

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

  @JsonProperty("date")
  private LocalDateTime date = null;

  @JsonProperty("postPeriod")
  private String postPeriod = null;

  @JsonProperty("warehouse")
  private WarehouseIdDescriptionDto warehouse = null;

  @JsonProperty("supplier")
  private SupplierDescriptionDto supplier = null;

  @JsonProperty("location")
  private LocationDescriptionDto location = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("createBill")
  private Boolean createBill = null;

  @JsonProperty("supplierRef")
  private String supplierRef = null;

  @JsonProperty("totalQty")
  private Double totalQty = null;

  @JsonProperty("controlQty")
  private Double controlQty = null;

  @JsonProperty("vatExemptTotal")
  private Double vatExemptTotal = null;

  @JsonProperty("vatTaxableTotal")
  private Double vatTaxableTotal = null;

  @JsonProperty("totalAmt")
  private Double totalAmt = null;

  @JsonProperty("controlTotal")
  private Double controlTotal = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  @JsonProperty("lines")
  private List<PurchaseReceiptLineDto> lines = null;

  public PurchaseReceiptDto landedCost(List<LandedCostDto> landedCost) {
    this.landedCost = landedCost;
    return this;
  }

  public PurchaseReceiptDto addLandedCostItem(LandedCostDto landedCostItem) {
    if (this.landedCost == null) {
      this.landedCost = new ArrayList<>();
    }
    this.landedCost.add(landedCostItem);
    return this;
  }

   /**
   * Get landedCost
   * @return landedCost
  **/
  @ApiModelProperty(value = "")
  public List<LandedCostDto> getLandedCost() {
    return landedCost;
  }

  public void setLandedCost(List<LandedCostDto> landedCost) {
    this.landedCost = landedCost;
  }

  public PurchaseReceiptDto receiptType(ReceiptTypeEnum receiptType) {
    this.receiptType = receiptType;
    return this;
  }

   /**
   * Get receiptType
   * @return receiptType
  **/
  @ApiModelProperty(value = "")
  public ReceiptTypeEnum getReceiptType() {
    return receiptType;
  }

  public void setReceiptType(ReceiptTypeEnum receiptType) {
    this.receiptType = receiptType;
  }

  public PurchaseReceiptDto receiptNbr(String receiptNbr) {
    this.receiptNbr = receiptNbr;
    return this;
  }

   /**
   * Get receiptNbr
   * @return receiptNbr
  **/
  @ApiModelProperty(value = "")
  public String getReceiptNbr() {
    return receiptNbr;
  }

  public void setReceiptNbr(String receiptNbr) {
    this.receiptNbr = receiptNbr;
  }

  public PurchaseReceiptDto hold(Boolean hold) {
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

  public PurchaseReceiptDto status(StatusEnum status) {
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

  public PurchaseReceiptDto date(LocalDateTime date) {
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

  public PurchaseReceiptDto postPeriod(String postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Format MMYYYY.
   * @return postPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Format MMYYYY.")
  public String getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(String postPeriod) {
    this.postPeriod = postPeriod;
  }

  public PurchaseReceiptDto warehouse(WarehouseIdDescriptionDto warehouse) {
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

  public PurchaseReceiptDto supplier(SupplierDescriptionDto supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @ApiModelProperty(value = "")
  public SupplierDescriptionDto getSupplier() {
    return supplier;
  }

  public void setSupplier(SupplierDescriptionDto supplier) {
    this.supplier = supplier;
  }

  public PurchaseReceiptDto location(LocationDescriptionDto location) {
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

  public PurchaseReceiptDto currency(String currency) {
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

  public PurchaseReceiptDto createBill(Boolean createBill) {
    this.createBill = createBill;
    return this;
  }

   /**
   * Get createBill
   * @return createBill
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateBill() {
    return createBill;
  }

  public void setCreateBill(Boolean createBill) {
    this.createBill = createBill;
  }

  public PurchaseReceiptDto supplierRef(String supplierRef) {
    this.supplierRef = supplierRef;
    return this;
  }

   /**
   * Get supplierRef
   * @return supplierRef
  **/
  @ApiModelProperty(value = "")
  public String getSupplierRef() {
    return supplierRef;
  }

  public void setSupplierRef(String supplierRef) {
    this.supplierRef = supplierRef;
  }

  public PurchaseReceiptDto totalQty(Double totalQty) {
    this.totalQty = totalQty;
    return this;
  }

   /**
   * Get totalQty
   * @return totalQty
  **/
  @ApiModelProperty(value = "")
  public Double getTotalQty() {
    return totalQty;
  }

  public void setTotalQty(Double totalQty) {
    this.totalQty = totalQty;
  }

  public PurchaseReceiptDto controlQty(Double controlQty) {
    this.controlQty = controlQty;
    return this;
  }

   /**
   * Get controlQty
   * @return controlQty
  **/
  @ApiModelProperty(value = "")
  public Double getControlQty() {
    return controlQty;
  }

  public void setControlQty(Double controlQty) {
    this.controlQty = controlQty;
  }

  public PurchaseReceiptDto vatExemptTotal(Double vatExemptTotal) {
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

  public PurchaseReceiptDto vatTaxableTotal(Double vatTaxableTotal) {
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

  public PurchaseReceiptDto totalAmt(Double totalAmt) {
    this.totalAmt = totalAmt;
    return this;
  }

   /**
   * Get totalAmt
   * @return totalAmt
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAmt() {
    return totalAmt;
  }

  public void setTotalAmt(Double totalAmt) {
    this.totalAmt = totalAmt;
  }

  public PurchaseReceiptDto controlTotal(Double controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

   /**
   * Get controlTotal
   * @return controlTotal
  **/
  @ApiModelProperty(value = "")
  public Double getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(Double controlTotal) {
    this.controlTotal = controlTotal;
  }

  public PurchaseReceiptDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public PurchaseReceiptDto branchNumber(BranchNumberDto branchNumber) {
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

  public PurchaseReceiptDto lines(List<PurchaseReceiptLineDto> lines) {
    this.lines = lines;
    return this;
  }

  public PurchaseReceiptDto addLinesItem(PurchaseReceiptLineDto linesItem) {
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
  public List<PurchaseReceiptLineDto> getLines() {
    return lines;
  }

  public void setLines(List<PurchaseReceiptLineDto> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseReceiptDto purchaseReceiptDto = (PurchaseReceiptDto) o;
    return Objects.equals(this.landedCost, purchaseReceiptDto.landedCost) &&
        Objects.equals(this.receiptType, purchaseReceiptDto.receiptType) &&
        Objects.equals(this.receiptNbr, purchaseReceiptDto.receiptNbr) &&
        Objects.equals(this.hold, purchaseReceiptDto.hold) &&
        Objects.equals(this.status, purchaseReceiptDto.status) &&
        Objects.equals(this.date, purchaseReceiptDto.date) &&
        Objects.equals(this.postPeriod, purchaseReceiptDto.postPeriod) &&
        Objects.equals(this.warehouse, purchaseReceiptDto.warehouse) &&
        Objects.equals(this.supplier, purchaseReceiptDto.supplier) &&
        Objects.equals(this.location, purchaseReceiptDto.location) &&
        Objects.equals(this.currency, purchaseReceiptDto.currency) &&
        Objects.equals(this.createBill, purchaseReceiptDto.createBill) &&
        Objects.equals(this.supplierRef, purchaseReceiptDto.supplierRef) &&
        Objects.equals(this.totalQty, purchaseReceiptDto.totalQty) &&
        Objects.equals(this.controlQty, purchaseReceiptDto.controlQty) &&
        Objects.equals(this.vatExemptTotal, purchaseReceiptDto.vatExemptTotal) &&
        Objects.equals(this.vatTaxableTotal, purchaseReceiptDto.vatTaxableTotal) &&
        Objects.equals(this.totalAmt, purchaseReceiptDto.totalAmt) &&
        Objects.equals(this.controlTotal, purchaseReceiptDto.controlTotal) &&
        Objects.equals(this.lastModifiedDateTime, purchaseReceiptDto.lastModifiedDateTime) &&
        Objects.equals(this.branchNumber, purchaseReceiptDto.branchNumber) &&
        Objects.equals(this.lines, purchaseReceiptDto.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(landedCost, receiptType, receiptNbr, hold, status, date, postPeriod, warehouse, supplier, location, currency, createBill, supplierRef, totalQty, controlQty, vatExemptTotal, vatTaxableTotal, totalAmt, controlTotal, lastModifiedDateTime, branchNumber, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseReceiptDto {\n");
    
    sb.append("    landedCost: ").append(toIndentedString(landedCost)).append("\n");
    sb.append("    receiptType: ").append(toIndentedString(receiptType)).append("\n");
    sb.append("    receiptNbr: ").append(toIndentedString(receiptNbr)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    postPeriod: ").append(toIndentedString(postPeriod)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createBill: ").append(toIndentedString(createBill)).append("\n");
    sb.append("    supplierRef: ").append(toIndentedString(supplierRef)).append("\n");
    sb.append("    totalQty: ").append(toIndentedString(totalQty)).append("\n");
    sb.append("    controlQty: ").append(toIndentedString(controlQty)).append("\n");
    sb.append("    vatExemptTotal: ").append(toIndentedString(vatExemptTotal)).append("\n");
    sb.append("    vatTaxableTotal: ").append(toIndentedString(vatTaxableTotal)).append("\n");
    sb.append("    totalAmt: ").append(toIndentedString(totalAmt)).append("\n");
    sb.append("    controlTotal: ").append(toIndentedString(controlTotal)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

