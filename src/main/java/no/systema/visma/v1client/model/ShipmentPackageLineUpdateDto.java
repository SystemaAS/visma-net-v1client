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
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * ShipmentPackageLineUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ShipmentPackageLineUpdateDto {
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

  @JsonProperty("confirmed")
  private DtoValueNullableBoolean confirmed = null;

  @JsonProperty("boxId")
  private DtoValueString boxId = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("weight")
  private DtoValueNullableDecimal weight = null;

  @JsonProperty("declaredValue")
  private DtoValueNullableDecimal declaredValue = null;

  @JsonProperty("codAmount")
  private DtoValueNullableDecimal codAmount = null;

  @JsonProperty("trackingNumber")
  private DtoValueString trackingNumber = null;

  @JsonProperty("customRefNbr1")
  private DtoValueString customRefNbr1 = null;

  @JsonProperty("customRefNbr2")
  private DtoValueString customRefNbr2 = null;

  public ShipmentPackageLineUpdateDto operation(OperationEnum operation) {
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

  public ShipmentPackageLineUpdateDto lineNumber(DtoValueInt32 lineNumber) {
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

  public ShipmentPackageLineUpdateDto confirmed(DtoValueNullableBoolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(DtoValueNullableBoolean confirmed) {
    this.confirmed = confirmed;
  }

  public ShipmentPackageLineUpdateDto boxId(DtoValueString boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * Get boxId
   * @return boxId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getBoxId() {
    return boxId;
  }

  public void setBoxId(DtoValueString boxId) {
    this.boxId = boxId;
  }

  public ShipmentPackageLineUpdateDto description(DtoValueString description) {
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

  public ShipmentPackageLineUpdateDto weight(DtoValueNullableDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getWeight() {
    return weight;
  }

  public void setWeight(DtoValueNullableDecimal weight) {
    this.weight = weight;
  }

  public ShipmentPackageLineUpdateDto declaredValue(DtoValueNullableDecimal declaredValue) {
    this.declaredValue = declaredValue;
    return this;
  }

   /**
   * Get declaredValue
   * @return declaredValue
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getDeclaredValue() {
    return declaredValue;
  }

  public void setDeclaredValue(DtoValueNullableDecimal declaredValue) {
    this.declaredValue = declaredValue;
  }

  public ShipmentPackageLineUpdateDto codAmount(DtoValueNullableDecimal codAmount) {
    this.codAmount = codAmount;
    return this;
  }

   /**
   * Get codAmount
   * @return codAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getCodAmount() {
    return codAmount;
  }

  public void setCodAmount(DtoValueNullableDecimal codAmount) {
    this.codAmount = codAmount;
  }

  public ShipmentPackageLineUpdateDto trackingNumber(DtoValueString trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(DtoValueString trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ShipmentPackageLineUpdateDto customRefNbr1(DtoValueString customRefNbr1) {
    this.customRefNbr1 = customRefNbr1;
    return this;
  }

   /**
   * Get customRefNbr1
   * @return customRefNbr1
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomRefNbr1() {
    return customRefNbr1;
  }

  public void setCustomRefNbr1(DtoValueString customRefNbr1) {
    this.customRefNbr1 = customRefNbr1;
  }

  public ShipmentPackageLineUpdateDto customRefNbr2(DtoValueString customRefNbr2) {
    this.customRefNbr2 = customRefNbr2;
    return this;
  }

   /**
   * Get customRefNbr2
   * @return customRefNbr2
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCustomRefNbr2() {
    return customRefNbr2;
  }

  public void setCustomRefNbr2(DtoValueString customRefNbr2) {
    this.customRefNbr2 = customRefNbr2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentPackageLineUpdateDto shipmentPackageLineUpdateDto = (ShipmentPackageLineUpdateDto) o;
    return Objects.equals(this.operation, shipmentPackageLineUpdateDto.operation) &&
        Objects.equals(this.lineNumber, shipmentPackageLineUpdateDto.lineNumber) &&
        Objects.equals(this.confirmed, shipmentPackageLineUpdateDto.confirmed) &&
        Objects.equals(this.boxId, shipmentPackageLineUpdateDto.boxId) &&
        Objects.equals(this.description, shipmentPackageLineUpdateDto.description) &&
        Objects.equals(this.weight, shipmentPackageLineUpdateDto.weight) &&
        Objects.equals(this.declaredValue, shipmentPackageLineUpdateDto.declaredValue) &&
        Objects.equals(this.codAmount, shipmentPackageLineUpdateDto.codAmount) &&
        Objects.equals(this.trackingNumber, shipmentPackageLineUpdateDto.trackingNumber) &&
        Objects.equals(this.customRefNbr1, shipmentPackageLineUpdateDto.customRefNbr1) &&
        Objects.equals(this.customRefNbr2, shipmentPackageLineUpdateDto.customRefNbr2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, lineNumber, confirmed, boxId, description, weight, declaredValue, codAmount, trackingNumber, customRefNbr1, customRefNbr2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentPackageLineUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    declaredValue: ").append(toIndentedString(declaredValue)).append("\n");
    sb.append("    codAmount: ").append(toIndentedString(codAmount)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    customRefNbr1: ").append(toIndentedString(customRefNbr1)).append("\n");
    sb.append("    customRefNbr2: ").append(toIndentedString(customRefNbr2)).append("\n");
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
