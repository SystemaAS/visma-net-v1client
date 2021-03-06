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
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.InventoryAdjustmentLineUpdateDto;

/**
 * This class represents a inventory issue in InventoryIssueController. Used by getting data.
 */
@ApiModel(description = "This class represents a inventory issue in InventoryIssueController. Used by getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class InventoryAdjustmentUpdateDto {
  @JsonProperty("controlCost")
  private DtoValueNullableDecimal controlCost = null;

  @JsonProperty("adjustmentLines")
  private List<InventoryAdjustmentLineUpdateDto> adjustmentLines = null;

  @JsonProperty("referenceNumber")
  private DtoValueString referenceNumber = null;

  @JsonProperty("hold")
  private DtoValueNullableBoolean hold = null;

  @JsonProperty("date")
  private DtoValueNullableDateTime date = null;

  @JsonProperty("postPeriod")
  private DtoValueString postPeriod = null;

  @JsonProperty("externalReference")
  private DtoValueString externalReference = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("controlQuantity")
  private DtoValueNullableDecimal controlQuantity = null;

  @JsonProperty("branchNumber")
  private DtoValueString branchNumber = null;

  public InventoryAdjustmentUpdateDto controlCost(DtoValueNullableDecimal controlCost) {
    this.controlCost = controlCost;
    return this;
  }

   /**
   * The manually entered summary cost for all specified inventory adjustment items.
   * @return controlCost
  **/
  @ApiModelProperty(value = "The manually entered summary cost for all specified inventory adjustment items.")
  public DtoValueNullableDecimal getControlCost() {
    return controlCost;
  }

  public void setControlCost(DtoValueNullableDecimal controlCost) {
    this.controlCost = controlCost;
  }

  public InventoryAdjustmentUpdateDto adjustmentLines(List<InventoryAdjustmentLineUpdateDto> adjustmentLines) {
    this.adjustmentLines = adjustmentLines;
    return this;
  }

  public InventoryAdjustmentUpdateDto addAdjustmentLinesItem(InventoryAdjustmentLineUpdateDto adjustmentLinesItem) {
    if (this.adjustmentLines == null) {
      this.adjustmentLines = new ArrayList<>();
    }
    this.adjustmentLines.add(adjustmentLinesItem);
    return this;
  }

   /**
   * The inventory adjustment lines
   * @return adjustmentLines
  **/
  @ApiModelProperty(value = "The inventory adjustment lines")
  public List<InventoryAdjustmentLineUpdateDto> getAdjustmentLines() {
    return adjustmentLines;
  }

  public void setAdjustmentLines(List<InventoryAdjustmentLineUpdateDto> adjustmentLines) {
    this.adjustmentLines = adjustmentLines;
  }

  public InventoryAdjustmentUpdateDto referenceNumber(DtoValueString referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The unique reference number of the receipt, which the system automatically assigns according to the numbering sequence selected for receipts on the Inventory Preferences IN.10.10.00) form.
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "The unique reference number of the receipt, which the system automatically assigns according to the numbering sequence selected for receipts on the Inventory Preferences IN.10.10.00) form.")
  public DtoValueString getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(DtoValueString referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public InventoryAdjustmentUpdateDto hold(DtoValueNullableBoolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * A check box that you select to give the receipt the On Hold status. Clear the check box to save the receipt with the Balanced status.
   * @return hold
  **/
  @ApiModelProperty(value = "A check box that you select to give the receipt the On Hold status. Clear the check box to save the receipt with the Balanced status.")
  public DtoValueNullableBoolean getHold() {
    return hold;
  }

  public void setHold(DtoValueNullableBoolean hold) {
    this.hold = hold;
  }

  public InventoryAdjustmentUpdateDto date(DtoValueNullableDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date when the receipt was created. All transactions included in this document will have this transaction date.
   * @return date
  **/
  @ApiModelProperty(value = "The date when the receipt was created. All transactions included in this document will have this transaction date.")
  public DtoValueNullableDateTime getDate() {
    return date;
  }

  public void setDate(DtoValueNullableDateTime date) {
    this.date = date;
  }

  public InventoryAdjustmentUpdateDto postPeriod(DtoValueString postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY.
   * @return postPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY.")
  public DtoValueString getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(DtoValueString postPeriod) {
    this.postPeriod = postPeriod;
  }

  public InventoryAdjustmentUpdateDto externalReference(DtoValueString externalReference) {
    this.externalReference = externalReference;
    return this;
  }

   /**
   * The external reference number of the inventory issue document (for example, the vendor’s reference code).
   * @return externalReference
  **/
  @ApiModelProperty(value = "The external reference number of the inventory issue document (for example, the vendor’s reference code).")
  public DtoValueString getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(DtoValueString externalReference) {
    this.externalReference = externalReference;
  }

  public InventoryAdjustmentUpdateDto description(DtoValueString description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of the inventory issue or its transactions.
   * @return description
  **/
  @ApiModelProperty(value = "A brief description of the inventory issue or its transactions.")
  public DtoValueString getDescription() {
    return description;
  }

  public void setDescription(DtoValueString description) {
    this.description = description;
  }

  public InventoryAdjustmentUpdateDto controlQuantity(DtoValueNullableDecimal controlQuantity) {
    this.controlQuantity = controlQuantity;
    return this;
  }

   /**
   * The manually entered quantity of inventory items. Control Qty. is available only if the Validate Document Totals on Entry option is selected on the Inventory Preferences form. If the Control Qty. and Total Qty.values do not match, the system generates a warning message and the issue cannot be saved.
   * @return controlQuantity
  **/
  @ApiModelProperty(value = "The manually entered quantity of inventory items. Control Qty. is available only if the Validate Document Totals on Entry option is selected on the Inventory Preferences form. If the Control Qty. and Total Qty.values do not match, the system generates a warning message and the issue cannot be saved.")
  public DtoValueNullableDecimal getControlQuantity() {
    return controlQuantity;
  }

  public void setControlQuantity(DtoValueNullableDecimal controlQuantity) {
    this.controlQuantity = controlQuantity;
  }

  public InventoryAdjustmentUpdateDto branchNumber(DtoValueString branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * The Branch associated
   * @return branchNumber
  **/
  @ApiModelProperty(value = "The Branch associated")
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
    InventoryAdjustmentUpdateDto inventoryAdjustmentUpdateDto = (InventoryAdjustmentUpdateDto) o;
    return Objects.equals(this.controlCost, inventoryAdjustmentUpdateDto.controlCost) &&
        Objects.equals(this.adjustmentLines, inventoryAdjustmentUpdateDto.adjustmentLines) &&
        Objects.equals(this.referenceNumber, inventoryAdjustmentUpdateDto.referenceNumber) &&
        Objects.equals(this.hold, inventoryAdjustmentUpdateDto.hold) &&
        Objects.equals(this.date, inventoryAdjustmentUpdateDto.date) &&
        Objects.equals(this.postPeriod, inventoryAdjustmentUpdateDto.postPeriod) &&
        Objects.equals(this.externalReference, inventoryAdjustmentUpdateDto.externalReference) &&
        Objects.equals(this.description, inventoryAdjustmentUpdateDto.description) &&
        Objects.equals(this.controlQuantity, inventoryAdjustmentUpdateDto.controlQuantity) &&
        Objects.equals(this.branchNumber, inventoryAdjustmentUpdateDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlCost, adjustmentLines, referenceNumber, hold, date, postPeriod, externalReference, description, controlQuantity, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAdjustmentUpdateDto {\n");
    
    sb.append("    controlCost: ").append(toIndentedString(controlCost)).append("\n");
    sb.append("    adjustmentLines: ").append(toIndentedString(adjustmentLines)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    postPeriod: ").append(toIndentedString(postPeriod)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    controlQuantity: ").append(toIndentedString(controlQuantity)).append("\n");
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

