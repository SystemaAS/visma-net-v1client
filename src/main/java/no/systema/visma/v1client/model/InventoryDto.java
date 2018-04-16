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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.AttributeIdValueDto;
import no.systema.visma.v1client.model.CostPriceStatisticsDto;
import no.systema.visma.v1client.model.InventoryCrossReferenceDto;
import no.systema.visma.v1client.model.ItemClassDto;
import no.systema.visma.v1client.model.PostingClassDto;
import no.systema.visma.v1client.model.VatCodeDto;
import no.systema.visma.v1client.model.WarehouseDetailDto;

/**
 * InventoryDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class InventoryDto {
  @JsonProperty("inventoryId")
  private Integer inventoryId = null;

  @JsonProperty("inventoryNumber")
  private String inventoryNumber = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    NOSALES("NoSales"),
    
    NOPURCHASES("NoPurchases"),
    
    NOREQUEST("NoRequest"),
    
    INACTIVE("Inactive"),
    
    MARKEDFORDELETION("MarkedForDeletion");

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    NONSTOCKITEM("NonStockItem"),
    
    LABORITEM("LaborItem"),
    
    SERVICEITEM("ServiceItem"),
    
    CHARGEITEM("ChargeItem"),
    
    EXPENSEITEM("ExpenseItem"),
    
    FINISHEDGOODITEM("FinishedGoodItem"),
    
    COMPONENTPARTITEM("ComponentPartItem"),
    
    SUBASSEMBLYITEM("SubassemblyItem");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("itemClass")
  private ItemClassDto itemClass = null;

  @JsonProperty("postingClass")
  private PostingClassDto postingClass = null;

  @JsonProperty("vatCode")
  private VatCodeDto vatCode = null;

  @JsonProperty("defaultPrice")
  private Double defaultPrice = null;

  @JsonProperty("pendingCost")
  private Double pendingCost = null;

  @JsonProperty("pendingCostDate")
  private LocalDateTime pendingCostDate = null;

  @JsonProperty("currentCost")
  private Double currentCost = null;

  @JsonProperty("effectiveDate")
  private LocalDateTime effectiveDate = null;

  @JsonProperty("lastCost")
  private Double lastCost = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("baseUnit")
  private String baseUnit = null;

  @JsonProperty("salesUnit")
  private String salesUnit = null;

  @JsonProperty("purchaseUnit")
  private String purchaseUnit = null;

  @JsonProperty("costPriceStatistics")
  private CostPriceStatisticsDto costPriceStatistics = null;

  @JsonProperty("crossReferences")
  private List<InventoryCrossReferenceDto> crossReferences = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  @JsonProperty("attributes")
  private List<AttributeIdValueDto> attributes = null;

  @JsonProperty("warehouseDetails")
  private List<WarehouseDetailDto> warehouseDetails = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public InventoryDto inventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

   /**
   * The unique internal identifier of the  item as is stored in the database
   * @return inventoryId
  **/
  @ApiModelProperty(value = "The unique internal identifier of the  item as is stored in the database")
  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public InventoryDto inventoryNumber(String inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
    return this;
  }

   /**
   * The unique alphanumeric identifier of the  item that is used in UI
   * @return inventoryNumber
  **/
  @ApiModelProperty(value = "The unique alphanumeric identifier of the  item that is used in UI")
  public String getInventoryNumber() {
    return inventoryNumber;
  }

  public void setInventoryNumber(String inventoryNumber) {
    this.inventoryNumber = inventoryNumber;
  }

  public InventoryDto status(StatusEnum status) {
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

  public InventoryDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InventoryDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InventoryDto itemClass(ItemClassDto itemClass) {
    this.itemClass = itemClass;
    return this;
  }

   /**
   * The item class to which the item is assigned. Selecting a class provides default settings for the item.
   * @return itemClass
  **/
  @ApiModelProperty(value = "The item class to which the item is assigned. Selecting a class provides default settings for the item.")
  public ItemClassDto getItemClass() {
    return itemClass;
  }

  public void setItemClass(ItemClassDto itemClass) {
    this.itemClass = itemClass;
  }

  public InventoryDto postingClass(PostingClassDto postingClass) {
    this.postingClass = postingClass;
    return this;
  }

   /**
   * The posting class of the item, which by default is the posting class assigned to the item class.
   * @return postingClass
  **/
  @ApiModelProperty(value = "The posting class of the item, which by default is the posting class assigned to the item class.")
  public PostingClassDto getPostingClass() {
    return postingClass;
  }

  public void setPostingClass(PostingClassDto postingClass) {
    this.postingClass = postingClass;
  }

  public InventoryDto vatCode(VatCodeDto vatCode) {
    this.vatCode = vatCode;
    return this;
  }

   /**
   * The vat category of the item, which by default is the vat category associated with the item class.
   * @return vatCode
  **/
  @ApiModelProperty(value = "The vat category of the item, which by default is the vat category associated with the item class.")
  public VatCodeDto getVatCode() {
    return vatCode;
  }

  public void setVatCode(VatCodeDto vatCode) {
    this.vatCode = vatCode;
  }

  public InventoryDto defaultPrice(Double defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

   /**
   * The price of the item. This price is used as the default price, if there are no other prices
   * @return defaultPrice
  **/
  @ApiModelProperty(value = "The price of the item. This price is used as the default price, if there are no other prices")
  public Double getDefaultPrice() {
    return defaultPrice;
  }

  public void setDefaultPrice(Double defaultPrice) {
    this.defaultPrice = defaultPrice;
  }

  public InventoryDto pendingCost(Double pendingCost) {
    this.pendingCost = pendingCost;
    return this;
  }

   /**
   * The pending standard cost for the item.
   * @return pendingCost
  **/
  @ApiModelProperty(value = "The pending standard cost for the item.")
  public Double getPendingCost() {
    return pendingCost;
  }

  public void setPendingCost(Double pendingCost) {
    this.pendingCost = pendingCost;
  }

  public InventoryDto pendingCostDate(LocalDateTime pendingCostDate) {
    this.pendingCostDate = pendingCostDate;
    return this;
  }

   /**
   * The date when the pending standard cost becomes effective.
   * @return pendingCostDate
  **/
  @ApiModelProperty(value = "The date when the pending standard cost becomes effective.")
  public LocalDateTime getPendingCostDate() {
    return pendingCostDate;
  }

  public void setPendingCostDate(LocalDateTime pendingCostDate) {
    this.pendingCostDate = pendingCostDate;
  }

  public InventoryDto currentCost(Double currentCost) {
    this.currentCost = currentCost;
    return this;
  }

   /**
   * The current standard cost for the item.
   * @return currentCost
  **/
  @ApiModelProperty(value = "The current standard cost for the item.")
  public Double getCurrentCost() {
    return currentCost;
  }

  public void setCurrentCost(Double currentCost) {
    this.currentCost = currentCost;
  }

  public InventoryDto effectiveDate(LocalDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The effective date for the current standard cost of the item.
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "The effective date for the current standard cost of the item.")
  public LocalDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public InventoryDto lastCost(Double lastCost) {
    this.lastCost = lastCost;
    return this;
  }

   /**
   * The last standard cost defined for the item.
   * @return lastCost
  **/
  @ApiModelProperty(value = "The last standard cost defined for the item.")
  public Double getLastCost() {
    return lastCost;
  }

  public void setLastCost(Double lastCost) {
    this.lastCost = lastCost;
  }

  public InventoryDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public InventoryDto baseUnit(String baseUnit) {
    this.baseUnit = baseUnit;
    return this;
  }

   /**
   * Get baseUnit
   * @return baseUnit
  **/
  @ApiModelProperty(value = "")
  public String getBaseUnit() {
    return baseUnit;
  }

  public void setBaseUnit(String baseUnit) {
    this.baseUnit = baseUnit;
  }

  public InventoryDto salesUnit(String salesUnit) {
    this.salesUnit = salesUnit;
    return this;
  }

   /**
   * Get salesUnit
   * @return salesUnit
  **/
  @ApiModelProperty(value = "")
  public String getSalesUnit() {
    return salesUnit;
  }

  public void setSalesUnit(String salesUnit) {
    this.salesUnit = salesUnit;
  }

  public InventoryDto purchaseUnit(String purchaseUnit) {
    this.purchaseUnit = purchaseUnit;
    return this;
  }

   /**
   * Get purchaseUnit
   * @return purchaseUnit
  **/
  @ApiModelProperty(value = "")
  public String getPurchaseUnit() {
    return purchaseUnit;
  }

  public void setPurchaseUnit(String purchaseUnit) {
    this.purchaseUnit = purchaseUnit;
  }

  public InventoryDto costPriceStatistics(CostPriceStatisticsDto costPriceStatistics) {
    this.costPriceStatistics = costPriceStatistics;
    return this;
  }

   /**
   * Get costPriceStatistics
   * @return costPriceStatistics
  **/
  @ApiModelProperty(value = "")
  public CostPriceStatisticsDto getCostPriceStatistics() {
    return costPriceStatistics;
  }

  public void setCostPriceStatistics(CostPriceStatisticsDto costPriceStatistics) {
    this.costPriceStatistics = costPriceStatistics;
  }

  public InventoryDto crossReferences(List<InventoryCrossReferenceDto> crossReferences) {
    this.crossReferences = crossReferences;
    return this;
  }

  public InventoryDto addCrossReferencesItem(InventoryCrossReferenceDto crossReferencesItem) {
    if (this.crossReferences == null) {
      this.crossReferences = new ArrayList<>();
    }
    this.crossReferences.add(crossReferencesItem);
    return this;
  }

   /**
   * Get crossReferences
   * @return crossReferences
  **/
  @ApiModelProperty(value = "")
  public List<InventoryCrossReferenceDto> getCrossReferences() {
    return crossReferences;
  }

  public void setCrossReferences(List<InventoryCrossReferenceDto> crossReferences) {
    this.crossReferences = crossReferences;
  }

  public InventoryDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public InventoryDto addAttachmentsItem(AttachmentDto attachmentsItem) {
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

  public InventoryDto attributes(List<AttributeIdValueDto> attributes) {
    this.attributes = attributes;
    return this;
  }

  public InventoryDto addAttributesItem(AttributeIdValueDto attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<AttributeIdValueDto> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeIdValueDto> attributes) {
    this.attributes = attributes;
  }

  public InventoryDto warehouseDetails(List<WarehouseDetailDto> warehouseDetails) {
    this.warehouseDetails = warehouseDetails;
    return this;
  }

  public InventoryDto addWarehouseDetailsItem(WarehouseDetailDto warehouseDetailsItem) {
    if (this.warehouseDetails == null) {
      this.warehouseDetails = new ArrayList<>();
    }
    this.warehouseDetails.add(warehouseDetailsItem);
    return this;
  }

   /**
   * Get warehouseDetails
   * @return warehouseDetails
  **/
  @ApiModelProperty(value = "")
  public List<WarehouseDetailDto> getWarehouseDetails() {
    return warehouseDetails;
  }

  public void setWarehouseDetails(List<WarehouseDetailDto> warehouseDetails) {
    this.warehouseDetails = warehouseDetails;
  }

  public InventoryDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public InventoryDto putExtrasItem(String key, Object extrasItem) {
    if (this.extras == null) {
      this.extras = new HashMap<>();
    }
    this.extras.put(key, extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getExtras() {
    return extras;
  }

  public void setExtras(Map<String, Object> extras) {
    this.extras = extras;
  }

  public InventoryDto errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @ApiModelProperty(value = "")
  public String getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryDto inventoryDto = (InventoryDto) o;
    return Objects.equals(this.inventoryId, inventoryDto.inventoryId) &&
        Objects.equals(this.inventoryNumber, inventoryDto.inventoryNumber) &&
        Objects.equals(this.status, inventoryDto.status) &&
        Objects.equals(this.type, inventoryDto.type) &&
        Objects.equals(this.description, inventoryDto.description) &&
        Objects.equals(this.itemClass, inventoryDto.itemClass) &&
        Objects.equals(this.postingClass, inventoryDto.postingClass) &&
        Objects.equals(this.vatCode, inventoryDto.vatCode) &&
        Objects.equals(this.defaultPrice, inventoryDto.defaultPrice) &&
        Objects.equals(this.pendingCost, inventoryDto.pendingCost) &&
        Objects.equals(this.pendingCostDate, inventoryDto.pendingCostDate) &&
        Objects.equals(this.currentCost, inventoryDto.currentCost) &&
        Objects.equals(this.effectiveDate, inventoryDto.effectiveDate) &&
        Objects.equals(this.lastCost, inventoryDto.lastCost) &&
        Objects.equals(this.lastModifiedDateTime, inventoryDto.lastModifiedDateTime) &&
        Objects.equals(this.baseUnit, inventoryDto.baseUnit) &&
        Objects.equals(this.salesUnit, inventoryDto.salesUnit) &&
        Objects.equals(this.purchaseUnit, inventoryDto.purchaseUnit) &&
        Objects.equals(this.costPriceStatistics, inventoryDto.costPriceStatistics) &&
        Objects.equals(this.crossReferences, inventoryDto.crossReferences) &&
        Objects.equals(this.attachments, inventoryDto.attachments) &&
        Objects.equals(this.attributes, inventoryDto.attributes) &&
        Objects.equals(this.warehouseDetails, inventoryDto.warehouseDetails) &&
        Objects.equals(this.extras, inventoryDto.extras) &&
        Objects.equals(this.errorInfo, inventoryDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryId, inventoryNumber, status, type, description, itemClass, postingClass, vatCode, defaultPrice, pendingCost, pendingCostDate, currentCost, effectiveDate, lastCost, lastModifiedDateTime, baseUnit, salesUnit, purchaseUnit, costPriceStatistics, crossReferences, attachments, attributes, warehouseDetails, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDto {\n");
    
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    inventoryNumber: ").append(toIndentedString(inventoryNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    itemClass: ").append(toIndentedString(itemClass)).append("\n");
    sb.append("    postingClass: ").append(toIndentedString(postingClass)).append("\n");
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
    sb.append("    defaultPrice: ").append(toIndentedString(defaultPrice)).append("\n");
    sb.append("    pendingCost: ").append(toIndentedString(pendingCost)).append("\n");
    sb.append("    pendingCostDate: ").append(toIndentedString(pendingCostDate)).append("\n");
    sb.append("    currentCost: ").append(toIndentedString(currentCost)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    lastCost: ").append(toIndentedString(lastCost)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    baseUnit: ").append(toIndentedString(baseUnit)).append("\n");
    sb.append("    salesUnit: ").append(toIndentedString(salesUnit)).append("\n");
    sb.append("    purchaseUnit: ").append(toIndentedString(purchaseUnit)).append("\n");
    sb.append("    costPriceStatistics: ").append(toIndentedString(costPriceStatistics)).append("\n");
    sb.append("    crossReferences: ").append(toIndentedString(crossReferences)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    warehouseDetails: ").append(toIndentedString(warehouseDetails)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

