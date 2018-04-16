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
import no.systema.visma.v1client.model.DtoValueInt32;
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * ShipmentDetailLineUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ShipmentDetailLineUpdateDto {
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

  @JsonProperty("warehouse")
  private DtoValueString warehouse = null;

  @JsonProperty("location")
  private DtoValueString location = null;

  @JsonProperty("uom")
  private DtoValueString uom = null;

  @JsonProperty("shippedQty")
  private DtoValueNullableDecimal shippedQty = null;

  @JsonProperty("lotSerialNbr")
  private DtoValueString lotSerialNbr = null;

  @JsonProperty("expirationDate")
  private DtoValueNullableDateTime expirationDate = null;

  @JsonProperty("reasonCode")
  private DtoValueString reasonCode = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("allocations")
  private List<AllocationsUpdateDto> allocations = null;

  public ShipmentDetailLineUpdateDto operation(OperationEnum operation) {
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

  public ShipmentDetailLineUpdateDto lineNumber(DtoValueInt32 lineNumber) {
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

  public ShipmentDetailLineUpdateDto warehouse(DtoValueString warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(DtoValueString warehouse) {
    this.warehouse = warehouse;
  }

  public ShipmentDetailLineUpdateDto location(DtoValueString location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLocation() {
    return location;
  }

  public void setLocation(DtoValueString location) {
    this.location = location;
  }

  public ShipmentDetailLineUpdateDto uom(DtoValueString uom) {
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

  public ShipmentDetailLineUpdateDto shippedQty(DtoValueNullableDecimal shippedQty) {
    this.shippedQty = shippedQty;
    return this;
  }

   /**
   * Get shippedQty
   * @return shippedQty
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getShippedQty() {
    return shippedQty;
  }

  public void setShippedQty(DtoValueNullableDecimal shippedQty) {
    this.shippedQty = shippedQty;
  }

  public ShipmentDetailLineUpdateDto lotSerialNbr(DtoValueString lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
    return this;
  }

   /**
   * Get lotSerialNbr
   * @return lotSerialNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLotSerialNbr() {
    return lotSerialNbr;
  }

  public void setLotSerialNbr(DtoValueString lotSerialNbr) {
    this.lotSerialNbr = lotSerialNbr;
  }

  public ShipmentDetailLineUpdateDto expirationDate(DtoValueNullableDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Property will become obsolete after version 5.31
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Property will become obsolete after version 5.31")
  public DtoValueNullableDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DtoValueNullableDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ShipmentDetailLineUpdateDto reasonCode(DtoValueString reasonCode) {
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

  public ShipmentDetailLineUpdateDto description(DtoValueString description) {
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

  public ShipmentDetailLineUpdateDto allocations(List<AllocationsUpdateDto> allocations) {
    this.allocations = allocations;
    return this;
  }

  public ShipmentDetailLineUpdateDto addAllocationsItem(AllocationsUpdateDto allocationsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDetailLineUpdateDto shipmentDetailLineUpdateDto = (ShipmentDetailLineUpdateDto) o;
    return Objects.equals(this.operation, shipmentDetailLineUpdateDto.operation) &&
        Objects.equals(this.lineNumber, shipmentDetailLineUpdateDto.lineNumber) &&
        Objects.equals(this.warehouse, shipmentDetailLineUpdateDto.warehouse) &&
        Objects.equals(this.location, shipmentDetailLineUpdateDto.location) &&
        Objects.equals(this.uom, shipmentDetailLineUpdateDto.uom) &&
        Objects.equals(this.shippedQty, shipmentDetailLineUpdateDto.shippedQty) &&
        Objects.equals(this.lotSerialNbr, shipmentDetailLineUpdateDto.lotSerialNbr) &&
        Objects.equals(this.expirationDate, shipmentDetailLineUpdateDto.expirationDate) &&
        Objects.equals(this.reasonCode, shipmentDetailLineUpdateDto.reasonCode) &&
        Objects.equals(this.description, shipmentDetailLineUpdateDto.description) &&
        Objects.equals(this.allocations, shipmentDetailLineUpdateDto.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, lineNumber, warehouse, location, uom, shippedQty, lotSerialNbr, expirationDate, reasonCode, description, allocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDetailLineUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    shippedQty: ").append(toIndentedString(shippedQty)).append("\n");
    sb.append("    lotSerialNbr: ").append(toIndentedString(lotSerialNbr)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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

