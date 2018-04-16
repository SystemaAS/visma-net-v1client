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
import no.systema.visma.v1client.model.SupplierDescriptionDto;

/**
 * SupplierPOBalanceDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class SupplierPOBalanceDto {
  @JsonProperty("supplier")
  private SupplierDescriptionDto supplier = null;

  @JsonProperty("totalPOOnHoldOrderTotal")
  private Double totalPOOnHoldOrderTotal = null;

  @JsonProperty("totalPOOnHoldLineTotal")
  private Double totalPOOnHoldLineTotal = null;

  @JsonProperty("totalOpenPOOrderTotal")
  private Double totalOpenPOOrderTotal = null;

  @JsonProperty("totalOpenPOLineTotal")
  private Double totalOpenPOLineTotal = null;

  @JsonProperty("totalClosedPOOrderTotal")
  private Double totalClosedPOOrderTotal = null;

  @JsonProperty("totalClosedPOLineTotal")
  private Double totalClosedPOLineTotal = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public SupplierPOBalanceDto supplier(SupplierDescriptionDto supplier) {
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

  public SupplierPOBalanceDto totalPOOnHoldOrderTotal(Double totalPOOnHoldOrderTotal) {
    this.totalPOOnHoldOrderTotal = totalPOOnHoldOrderTotal;
    return this;
  }

   /**
   * Get totalPOOnHoldOrderTotal
   * @return totalPOOnHoldOrderTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalPOOnHoldOrderTotal() {
    return totalPOOnHoldOrderTotal;
  }

  public void setTotalPOOnHoldOrderTotal(Double totalPOOnHoldOrderTotal) {
    this.totalPOOnHoldOrderTotal = totalPOOnHoldOrderTotal;
  }

  public SupplierPOBalanceDto totalPOOnHoldLineTotal(Double totalPOOnHoldLineTotal) {
    this.totalPOOnHoldLineTotal = totalPOOnHoldLineTotal;
    return this;
  }

   /**
   * Get totalPOOnHoldLineTotal
   * @return totalPOOnHoldLineTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalPOOnHoldLineTotal() {
    return totalPOOnHoldLineTotal;
  }

  public void setTotalPOOnHoldLineTotal(Double totalPOOnHoldLineTotal) {
    this.totalPOOnHoldLineTotal = totalPOOnHoldLineTotal;
  }

  public SupplierPOBalanceDto totalOpenPOOrderTotal(Double totalOpenPOOrderTotal) {
    this.totalOpenPOOrderTotal = totalOpenPOOrderTotal;
    return this;
  }

   /**
   * Get totalOpenPOOrderTotal
   * @return totalOpenPOOrderTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalOpenPOOrderTotal() {
    return totalOpenPOOrderTotal;
  }

  public void setTotalOpenPOOrderTotal(Double totalOpenPOOrderTotal) {
    this.totalOpenPOOrderTotal = totalOpenPOOrderTotal;
  }

  public SupplierPOBalanceDto totalOpenPOLineTotal(Double totalOpenPOLineTotal) {
    this.totalOpenPOLineTotal = totalOpenPOLineTotal;
    return this;
  }

   /**
   * Get totalOpenPOLineTotal
   * @return totalOpenPOLineTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalOpenPOLineTotal() {
    return totalOpenPOLineTotal;
  }

  public void setTotalOpenPOLineTotal(Double totalOpenPOLineTotal) {
    this.totalOpenPOLineTotal = totalOpenPOLineTotal;
  }

  public SupplierPOBalanceDto totalClosedPOOrderTotal(Double totalClosedPOOrderTotal) {
    this.totalClosedPOOrderTotal = totalClosedPOOrderTotal;
    return this;
  }

   /**
   * Get totalClosedPOOrderTotal
   * @return totalClosedPOOrderTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalClosedPOOrderTotal() {
    return totalClosedPOOrderTotal;
  }

  public void setTotalClosedPOOrderTotal(Double totalClosedPOOrderTotal) {
    this.totalClosedPOOrderTotal = totalClosedPOOrderTotal;
  }

  public SupplierPOBalanceDto totalClosedPOLineTotal(Double totalClosedPOLineTotal) {
    this.totalClosedPOLineTotal = totalClosedPOLineTotal;
    return this;
  }

   /**
   * Get totalClosedPOLineTotal
   * @return totalClosedPOLineTotal
  **/
  @ApiModelProperty(value = "")
  public Double getTotalClosedPOLineTotal() {
    return totalClosedPOLineTotal;
  }

  public void setTotalClosedPOLineTotal(Double totalClosedPOLineTotal) {
    this.totalClosedPOLineTotal = totalClosedPOLineTotal;
  }

  public SupplierPOBalanceDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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
    SupplierPOBalanceDto supplierPOBalanceDto = (SupplierPOBalanceDto) o;
    return Objects.equals(this.supplier, supplierPOBalanceDto.supplier) &&
        Objects.equals(this.totalPOOnHoldOrderTotal, supplierPOBalanceDto.totalPOOnHoldOrderTotal) &&
        Objects.equals(this.totalPOOnHoldLineTotal, supplierPOBalanceDto.totalPOOnHoldLineTotal) &&
        Objects.equals(this.totalOpenPOOrderTotal, supplierPOBalanceDto.totalOpenPOOrderTotal) &&
        Objects.equals(this.totalOpenPOLineTotal, supplierPOBalanceDto.totalOpenPOLineTotal) &&
        Objects.equals(this.totalClosedPOOrderTotal, supplierPOBalanceDto.totalClosedPOOrderTotal) &&
        Objects.equals(this.totalClosedPOLineTotal, supplierPOBalanceDto.totalClosedPOLineTotal) &&
        Objects.equals(this.lastModifiedDateTime, supplierPOBalanceDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, totalPOOnHoldOrderTotal, totalPOOnHoldLineTotal, totalOpenPOOrderTotal, totalOpenPOLineTotal, totalClosedPOOrderTotal, totalClosedPOLineTotal, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierPOBalanceDto {\n");
    
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    totalPOOnHoldOrderTotal: ").append(toIndentedString(totalPOOnHoldOrderTotal)).append("\n");
    sb.append("    totalPOOnHoldLineTotal: ").append(toIndentedString(totalPOOnHoldLineTotal)).append("\n");
    sb.append("    totalOpenPOOrderTotal: ").append(toIndentedString(totalOpenPOOrderTotal)).append("\n");
    sb.append("    totalOpenPOLineTotal: ").append(toIndentedString(totalOpenPOLineTotal)).append("\n");
    sb.append("    totalClosedPOOrderTotal: ").append(toIndentedString(totalClosedPOOrderTotal)).append("\n");
    sb.append("    totalClosedPOLineTotal: ").append(toIndentedString(totalClosedPOLineTotal)).append("\n");
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
