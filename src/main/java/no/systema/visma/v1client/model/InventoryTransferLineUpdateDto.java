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
import no.systema.visma.v1client.model.DtoValueInt32;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * InventoryTransferLineUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class InventoryTransferLineUpdateDto {
  @JsonProperty("toLocationId")
  private DtoValueString toLocationId = null;

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

  @JsonProperty("lineNumber")
  private DtoValueInt32 lineNumber = null;

  @JsonProperty("inventoryNumber")
  private DtoValueString inventoryNumber = null;

  @JsonProperty("locationId")
  private DtoValueString locationId = null;

  @JsonProperty("quantity")
  private DtoValueNullableDecimal quantity = null;

  @JsonProperty("uom")
  private DtoValueString uom = null;

  @JsonProperty("reasonCode")
  private DtoValueString reasonCode = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("branchNumber")
  private DtoValueString branchNumber = null;

  public InventoryTransferLineUpdateDto toLocationId(DtoValueString toLocationId) {
    this.toLocationId = toLocationId;
    return this;
  }

   /**
   * Get toLocationId
   * @return toLocationId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getToLocationId() {
    return toLocationId;
  }

  public void setToLocationId(DtoValueString toLocationId) {
    this.toLocationId = toLocationId;
  }

  public InventoryTransferLineUpdateDto operation(OperationEnum operation) {
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

  public InventoryTransferLineUpdateDto lineNumber(DtoValueInt32 lineNumber) {
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

  public InventoryTransferLineUpdateDto inventoryNumber(DtoValueString inventoryNumber) {
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

  public InventoryTransferLineUpdateDto locationId(DtoValueString locationId) {
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

  public InventoryTransferLineUpdateDto quantity(DtoValueNullableDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(DtoValueNullableDecimal quantity) {
    this.quantity = quantity;
  }

  public InventoryTransferLineUpdateDto uom(DtoValueString uom) {
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

  public InventoryTransferLineUpdateDto reasonCode(DtoValueString reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(DtoValueString reasonCode) {
    this.reasonCode = reasonCode;
  }

  public InventoryTransferLineUpdateDto description(DtoValueString description) {
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

  public InventoryTransferLineUpdateDto branchNumber(DtoValueString branchNumber) {
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
    InventoryTransferLineUpdateDto inventoryTransferLineUpdateDto = (InventoryTransferLineUpdateDto) o;
    return Objects.equals(this.toLocationId, inventoryTransferLineUpdateDto.toLocationId) &&
        Objects.equals(this.operation, inventoryTransferLineUpdateDto.operation) &&
        Objects.equals(this.lineNumber, inventoryTransferLineUpdateDto.lineNumber) &&
        Objects.equals(this.inventoryNumber, inventoryTransferLineUpdateDto.inventoryNumber) &&
        Objects.equals(this.locationId, inventoryTransferLineUpdateDto.locationId) &&
        Objects.equals(this.quantity, inventoryTransferLineUpdateDto.quantity) &&
        Objects.equals(this.uom, inventoryTransferLineUpdateDto.uom) &&
        Objects.equals(this.reasonCode, inventoryTransferLineUpdateDto.reasonCode) &&
        Objects.equals(this.description, inventoryTransferLineUpdateDto.description) &&
        Objects.equals(this.branchNumber, inventoryTransferLineUpdateDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toLocationId, operation, lineNumber, inventoryNumber, locationId, quantity, uom, reasonCode, description, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryTransferLineUpdateDto {\n");
    
    sb.append("    toLocationId: ").append(toIndentedString(toLocationId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    inventoryNumber: ").append(toIndentedString(inventoryNumber)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
