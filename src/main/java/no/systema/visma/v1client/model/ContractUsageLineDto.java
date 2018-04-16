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
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.InventoryNumberDescriptionDto;

/**
 * ContractUsageLineDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ContractUsageLineDto {
  @JsonProperty("transactionNumber")
  private Integer transactionNumber = null;

  @JsonProperty("billed")
  private Boolean billed = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("item")
  private InventoryNumberDescriptionDto item = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("date")
  private LocalDateTime date = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("referenceNbr")
  private String referenceNbr = null;

  @JsonProperty("billingDate")
  private LocalDateTime billingDate = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public ContractUsageLineDto transactionNumber(Integer transactionNumber) {
    this.transactionNumber = transactionNumber;
    return this;
  }

   /**
   * Get transactionNumber
   * @return transactionNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getTransactionNumber() {
    return transactionNumber;
  }

  public void setTransactionNumber(Integer transactionNumber) {
    this.transactionNumber = transactionNumber;
  }

  public ContractUsageLineDto billed(Boolean billed) {
    this.billed = billed;
    return this;
  }

   /**
   * Get billed
   * @return billed
  **/
  @ApiModelProperty(value = "")
  public Boolean isBilled() {
    return billed;
  }

  public void setBilled(Boolean billed) {
    this.billed = billed;
  }

  public ContractUsageLineDto branch(BranchNumberDto branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public BranchNumberDto getBranch() {
    return branch;
  }

  public void setBranch(BranchNumberDto branch) {
    this.branch = branch;
  }

  public ContractUsageLineDto item(InventoryNumberDescriptionDto item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  public InventoryNumberDescriptionDto getItem() {
    return item;
  }

  public void setItem(InventoryNumberDescriptionDto item) {
    this.item = item;
  }

  public ContractUsageLineDto description(String description) {
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

  public ContractUsageLineDto uom(String uom) {
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

  public ContractUsageLineDto quantity(Double quantity) {
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

  public ContractUsageLineDto date(LocalDateTime date) {
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

  public ContractUsageLineDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ContractUsageLineDto referenceNbr(String referenceNbr) {
    this.referenceNbr = referenceNbr;
    return this;
  }

   /**
   * Get referenceNbr
   * @return referenceNbr
  **/
  @ApiModelProperty(value = "")
  public String getReferenceNbr() {
    return referenceNbr;
  }

  public void setReferenceNbr(String referenceNbr) {
    this.referenceNbr = referenceNbr;
  }

  public ContractUsageLineDto billingDate(LocalDateTime billingDate) {
    this.billingDate = billingDate;
    return this;
  }

   /**
   * Get billingDate
   * @return billingDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(LocalDateTime billingDate) {
    this.billingDate = billingDate;
  }

  public ContractUsageLineDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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
    ContractUsageLineDto contractUsageLineDto = (ContractUsageLineDto) o;
    return Objects.equals(this.transactionNumber, contractUsageLineDto.transactionNumber) &&
        Objects.equals(this.billed, contractUsageLineDto.billed) &&
        Objects.equals(this.branch, contractUsageLineDto.branch) &&
        Objects.equals(this.item, contractUsageLineDto.item) &&
        Objects.equals(this.description, contractUsageLineDto.description) &&
        Objects.equals(this.uom, contractUsageLineDto.uom) &&
        Objects.equals(this.quantity, contractUsageLineDto.quantity) &&
        Objects.equals(this.date, contractUsageLineDto.date) &&
        Objects.equals(this.type, contractUsageLineDto.type) &&
        Objects.equals(this.referenceNbr, contractUsageLineDto.referenceNbr) &&
        Objects.equals(this.billingDate, contractUsageLineDto.billingDate) &&
        Objects.equals(this.lastModifiedDateTime, contractUsageLineDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionNumber, billed, branch, item, description, uom, quantity, date, type, referenceNbr, billingDate, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractUsageLineDto {\n");
    
    sb.append("    transactionNumber: ").append(toIndentedString(transactionNumber)).append("\n");
    sb.append("    billed: ").append(toIndentedString(billed)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referenceNbr: ").append(toIndentedString(referenceNbr)).append("\n");
    sb.append("    billingDate: ").append(toIndentedString(billingDate)).append("\n");
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
