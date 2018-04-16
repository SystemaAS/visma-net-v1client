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
import no.systema.visma.v1client.model.InventoryIdNameDto;
import no.systema.visma.v1client.model.LocationIdNameDto;
import no.systema.visma.v1client.model.WarehouseIdDescriptionDto;

/**
 * StocktakeLineDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class StocktakeLineDto {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NOTENTERED("NotEntered"),
    
    ENTERED("Entered"),
    
    SKIPPED("Skipped");

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

  @JsonProperty("lineNbr")
  private Integer lineNbr = null;

  @JsonProperty("tagNbr")
  private Integer tagNbr = null;

  @JsonProperty("inventory")
  private InventoryIdNameDto inventory = null;

  @JsonProperty("location")
  private LocationIdNameDto location = null;

  @JsonProperty("warehouse")
  private WarehouseIdDescriptionDto warehouse = null;

  @JsonProperty("lotSerialNbr")
  private String lotSerialNbr = null;

  @JsonProperty("expirationDate")
  private LocalDateTime expirationDate = null;

  @JsonProperty("bookQuantity")
  private Double bookQuantity = null;

  @JsonProperty("physicalQuantity")
  private Double physicalQuantity = null;

  @JsonProperty("varianceQuantity")
  private Double varianceQuantity = null;

  @JsonProperty("unitCost")
  private Double unitCost = null;

  @JsonProperty("extVarianceCost")
  private Double extVarianceCost = null;

  @JsonProperty("reasonCode")
  private String reasonCode = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public StocktakeLineDto status(StatusEnum status) {
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

  public StocktakeLineDto lineNbr(Integer lineNbr) {
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

  public StocktakeLineDto tagNbr(Integer tagNbr) {
    this.tagNbr = tagNbr;
    return this;
  }

   /**
   * Get tagNbr
   * @return tagNbr
  **/
  @ApiModelProperty(value = "")
  public Integer getTagNbr() {
    return tagNbr;
  }

  public void setTagNbr(Integer tagNbr) {
    this.tagNbr = tagNbr;
  }

  public StocktakeLineDto inventory(InventoryIdNameDto inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public InventoryIdNameDto getInventory() {
    return inventory;
  }

  public void setInventory(InventoryIdNameDto inventory) {
    this.inventory = inventory;
  }

  public StocktakeLineDto location(LocationIdNameDto location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public LocationIdNameDto getLocation() {
    return location;
  }

  public void setLocation(LocationIdNameDto location) {
    this.location = location;
  }

  public StocktakeLineDto warehouse(WarehouseIdDescriptionDto warehouse) {
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

  public StocktakeLineDto lotSerialNbr(String lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
    return this;
  }

   /**
   * Get lotSerialNbr
   * @return lotSerialNbr
  **/
  @ApiModelProperty(value = "")
  public String getLotSerialNbr() {
    return lotSerialNbr;
  }

  public void setLotSerialNbr(String lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
  }

  public StocktakeLineDto expirationDate(LocalDateTime expirationDate) {
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

  public StocktakeLineDto bookQuantity(Double bookQuantity) {
    this.bookQuantity = bookQuantity;
    return this;
  }

   /**
   * Get bookQuantity
   * @return bookQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getBookQuantity() {
    return bookQuantity;
  }

  public void setBookQuantity(Double bookQuantity) {
    this.bookQuantity = bookQuantity;
  }

  public StocktakeLineDto physicalQuantity(Double physicalQuantity) {
    this.physicalQuantity = physicalQuantity;
    return this;
  }

   /**
   * Get physicalQuantity
   * @return physicalQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getPhysicalQuantity() {
    return physicalQuantity;
  }

  public void setPhysicalQuantity(Double physicalQuantity) {
    this.physicalQuantity = physicalQuantity;
  }

  public StocktakeLineDto varianceQuantity(Double varianceQuantity) {
    this.varianceQuantity = varianceQuantity;
    return this;
  }

   /**
   * Get varianceQuantity
   * @return varianceQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getVarianceQuantity() {
    return varianceQuantity;
  }

  public void setVarianceQuantity(Double varianceQuantity) {
    this.varianceQuantity = varianceQuantity;
  }

  public StocktakeLineDto unitCost(Double unitCost) {
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

  public StocktakeLineDto extVarianceCost(Double extVarianceCost) {
    this.extVarianceCost = extVarianceCost;
    return this;
  }

   /**
   * Get extVarianceCost
   * @return extVarianceCost
  **/
  @ApiModelProperty(value = "")
  public Double getExtVarianceCost() {
    return extVarianceCost;
  }

  public void setExtVarianceCost(Double extVarianceCost) {
    this.extVarianceCost = extVarianceCost;
  }

  public StocktakeLineDto reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public StocktakeLineDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StocktakeLineDto stocktakeLineDto = (StocktakeLineDto) o;
    return Objects.equals(this.status, stocktakeLineDto.status) &&
        Objects.equals(this.lineNbr, stocktakeLineDto.lineNbr) &&
        Objects.equals(this.tagNbr, stocktakeLineDto.tagNbr) &&
        Objects.equals(this.inventory, stocktakeLineDto.inventory) &&
        Objects.equals(this.location, stocktakeLineDto.location) &&
        Objects.equals(this.warehouse, stocktakeLineDto.warehouse) &&
        Objects.equals(this.lotSerialNbr, stocktakeLineDto.lotSerialNbr) &&
        Objects.equals(this.expirationDate, stocktakeLineDto.expirationDate) &&
        Objects.equals(this.bookQuantity, stocktakeLineDto.bookQuantity) &&
        Objects.equals(this.physicalQuantity, stocktakeLineDto.physicalQuantity) &&
        Objects.equals(this.varianceQuantity, stocktakeLineDto.varianceQuantity) &&
        Objects.equals(this.unitCost, stocktakeLineDto.unitCost) &&
        Objects.equals(this.extVarianceCost, stocktakeLineDto.extVarianceCost) &&
        Objects.equals(this.reasonCode, stocktakeLineDto.reasonCode) &&
        Objects.equals(this.lastModifiedDateTime, stocktakeLineDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lineNbr, tagNbr, inventory, location, warehouse, lotSerialNbr, expirationDate, bookQuantity, physicalQuantity, varianceQuantity, unitCost, extVarianceCost, reasonCode, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StocktakeLineDto {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineNbr: ").append(toIndentedString(lineNbr)).append("\n");
    sb.append("    tagNbr: ").append(toIndentedString(tagNbr)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    lotSerialNbr: ").append(toIndentedString(lotSerialNbr)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    bookQuantity: ").append(toIndentedString(bookQuantity)).append("\n");
    sb.append("    physicalQuantity: ").append(toIndentedString(physicalQuantity)).append("\n");
    sb.append("    varianceQuantity: ").append(toIndentedString(varianceQuantity)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    extVarianceCost: ").append(toIndentedString(extVarianceCost)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
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

