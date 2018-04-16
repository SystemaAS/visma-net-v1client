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
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * CashTransactionTaxDetailUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CashTransactionTaxDetailUpdateDto {
  @JsonProperty("vatId")
  private DtoValueString vatId = null;

  @JsonProperty("taxableAmount")
  private DtoValueNullableDecimal taxableAmount = null;

  @JsonProperty("vatAmount")
  private DtoValueNullableDecimal vatAmount = null;

  @JsonProperty("expenseAmount")
  private DtoValueNullableDecimal expenseAmount = null;

  public CashTransactionTaxDetailUpdateDto vatId(DtoValueString vatId) {
    this.vatId = vatId;
    return this;
  }

   /**
   * Get vatId
   * @return vatId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatId() {
    return vatId;
  }

  public void setVatId(DtoValueString vatId) {
    this.vatId = vatId;
  }

  public CashTransactionTaxDetailUpdateDto taxableAmount(DtoValueNullableDecimal taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Get taxableAmount
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(DtoValueNullableDecimal taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public CashTransactionTaxDetailUpdateDto vatAmount(DtoValueNullableDecimal vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(DtoValueNullableDecimal vatAmount) {
    this.vatAmount = vatAmount;
  }

  public CashTransactionTaxDetailUpdateDto expenseAmount(DtoValueNullableDecimal expenseAmount) {
    this.expenseAmount = expenseAmount;
    return this;
  }

   /**
   * Get expenseAmount
   * @return expenseAmount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(DtoValueNullableDecimal expenseAmount) {
    this.expenseAmount = expenseAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTransactionTaxDetailUpdateDto cashTransactionTaxDetailUpdateDto = (CashTransactionTaxDetailUpdateDto) o;
    return Objects.equals(this.vatId, cashTransactionTaxDetailUpdateDto.vatId) &&
        Objects.equals(this.taxableAmount, cashTransactionTaxDetailUpdateDto.taxableAmount) &&
        Objects.equals(this.vatAmount, cashTransactionTaxDetailUpdateDto.vatAmount) &&
        Objects.equals(this.expenseAmount, cashTransactionTaxDetailUpdateDto.expenseAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vatId, taxableAmount, vatAmount, expenseAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTransactionTaxDetailUpdateDto {\n");
    
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    expenseAmount: ").append(toIndentedString(expenseAmount)).append("\n");
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

