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
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.InventoryNumberDescriptionDto;
import no.systema.visma.v1client.model.LocationDescriptionDto;
import no.systema.visma.v1client.model.ReasonCodeDto;

/**
 * InventoryTransferLineDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class InventoryTransferLineDto {
  @JsonProperty("toLocation")
  private LocationDescriptionDto toLocation = null;

  @JsonProperty("lineNumber")
  private Integer lineNumber = null;

  @JsonProperty("inventoryItem")
  private InventoryNumberDescriptionDto inventoryItem = null;

  @JsonProperty("location")
  private LocationDescriptionDto location = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("reasonCode")
  private ReasonCodeDto reasonCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  public InventoryTransferLineDto toLocation(LocationDescriptionDto toLocation) {
    this.toLocation = toLocation;
    return this;
  }

   /**
   * Get toLocation
   * @return toLocation
  **/
  @ApiModelProperty(value = "")
  public LocationDescriptionDto getToLocation() {
    return toLocation;
  }

  public void setToLocation(LocationDescriptionDto toLocation) {
    this.toLocation = toLocation;
  }

  public InventoryTransferLineDto lineNumber(Integer lineNumber) {
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

  public InventoryTransferLineDto inventoryItem(InventoryNumberDescriptionDto inventoryItem) {
    this.inventoryItem = inventoryItem;
    return this;
  }

   /**
   * Get inventoryItem
   * @return inventoryItem
  **/
  @ApiModelProperty(value = "")
  public InventoryNumberDescriptionDto getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryNumberDescriptionDto inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  public InventoryTransferLineDto location(LocationDescriptionDto location) {
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

  public InventoryTransferLineDto quantity(Double quantity) {
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

  public InventoryTransferLineDto uom(String uom) {
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

  public InventoryTransferLineDto reasonCode(ReasonCodeDto reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")
  public ReasonCodeDto getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(ReasonCodeDto reasonCode) {
    this.reasonCode = reasonCode;
  }

  public InventoryTransferLineDto description(String description) {
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

  public InventoryTransferLineDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public InventoryTransferLineDto addAttachmentsItem(AttachmentDto attachmentsItem) {
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

  public InventoryTransferLineDto branchNumber(BranchNumberDto branchNumber) {
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
    InventoryTransferLineDto inventoryTransferLineDto = (InventoryTransferLineDto) o;
    return Objects.equals(this.toLocation, inventoryTransferLineDto.toLocation) &&
        Objects.equals(this.lineNumber, inventoryTransferLineDto.lineNumber) &&
        Objects.equals(this.inventoryItem, inventoryTransferLineDto.inventoryItem) &&
        Objects.equals(this.location, inventoryTransferLineDto.location) &&
        Objects.equals(this.quantity, inventoryTransferLineDto.quantity) &&
        Objects.equals(this.uom, inventoryTransferLineDto.uom) &&
        Objects.equals(this.reasonCode, inventoryTransferLineDto.reasonCode) &&
        Objects.equals(this.description, inventoryTransferLineDto.description) &&
        Objects.equals(this.attachments, inventoryTransferLineDto.attachments) &&
        Objects.equals(this.branchNumber, inventoryTransferLineDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toLocation, lineNumber, inventoryItem, location, quantity, uom, reasonCode, description, attachments, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryTransferLineDto {\n");
    
    sb.append("    toLocation: ").append(toIndentedString(toLocation)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    inventoryItem: ").append(toIndentedString(inventoryItem)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

