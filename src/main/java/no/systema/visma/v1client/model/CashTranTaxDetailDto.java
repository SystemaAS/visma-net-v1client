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
import no.systema.visma.v1client.model.TaxNumberDescriptionDto;

/**
 * CashTranTaxDetailDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CashTranTaxDetailDto {
  @JsonProperty("tax")
  private TaxNumberDescriptionDto tax = null;

  @JsonProperty("taxRate")
  private Double taxRate = null;

  @JsonProperty("taxableAmount")
  private Double taxableAmount = null;

  @JsonProperty("taxAmount")
  private Double taxAmount = null;

  @JsonProperty("deductibleTaxRate")
  private Double deductibleTaxRate = null;

  @JsonProperty("expenseAmount")
  private Double expenseAmount = null;

  @JsonProperty("includeInVatExemptTotal")
  private Boolean includeInVatExemptTotal = null;

  @JsonProperty("pendingVat")
  private Boolean pendingVat = null;

  @JsonProperty("statisticalVat")
  private Boolean statisticalVat = null;

  @JsonProperty("reverseVat")
  private Boolean reverseVat = null;

  /**
   * Gets or Sets taxType
   */
  public enum TaxTypeEnum {
    SALES("Sales"),
    
    USE("Use"),
    
    VAT("Vat"),
    
    WITHHOLDING("Withholding");

    private String value;

    TaxTypeEnum(String value) {
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
    public static TaxTypeEnum fromValue(String text) {
      for (TaxTypeEnum b : TaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("taxType")
  private TaxTypeEnum taxType = null;

  public CashTranTaxDetailDto tax(TaxNumberDescriptionDto tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public TaxNumberDescriptionDto getTax() {
    return tax;
  }

  public void setTax(TaxNumberDescriptionDto tax) {
    this.tax = tax;
  }

  public CashTranTaxDetailDto taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  public CashTranTaxDetailDto taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Get taxableAmount
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public CashTranTaxDetailDto taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public CashTranTaxDetailDto deductibleTaxRate(Double deductibleTaxRate) {
    this.deductibleTaxRate = deductibleTaxRate;
    return this;
  }

   /**
   * Get deductibleTaxRate
   * @return deductibleTaxRate
  **/
  @ApiModelProperty(value = "")
  public Double getDeductibleTaxRate() {
    return deductibleTaxRate;
  }

  public void setDeductibleTaxRate(Double deductibleTaxRate) {
    this.deductibleTaxRate = deductibleTaxRate;
  }

  public CashTranTaxDetailDto expenseAmount(Double expenseAmount) {
    this.expenseAmount = expenseAmount;
    return this;
  }

   /**
   * Get expenseAmount
   * @return expenseAmount
  **/
  @ApiModelProperty(value = "")
  public Double getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(Double expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public CashTranTaxDetailDto includeInVatExemptTotal(Boolean includeInVatExemptTotal) {
    this.includeInVatExemptTotal = includeInVatExemptTotal;
    return this;
  }

   /**
   * Get includeInVatExemptTotal
   * @return includeInVatExemptTotal
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeInVatExemptTotal() {
    return includeInVatExemptTotal;
  }

  public void setIncludeInVatExemptTotal(Boolean includeInVatExemptTotal) {
    this.includeInVatExemptTotal = includeInVatExemptTotal;
  }

  public CashTranTaxDetailDto pendingVat(Boolean pendingVat) {
    this.pendingVat = pendingVat;
    return this;
  }

   /**
   * Get pendingVat
   * @return pendingVat
  **/
  @ApiModelProperty(value = "")
  public Boolean isPendingVat() {
    return pendingVat;
  }

  public void setPendingVat(Boolean pendingVat) {
    this.pendingVat = pendingVat;
  }

  public CashTranTaxDetailDto statisticalVat(Boolean statisticalVat) {
    this.statisticalVat = statisticalVat;
    return this;
  }

   /**
   * Get statisticalVat
   * @return statisticalVat
  **/
  @ApiModelProperty(value = "")
  public Boolean isStatisticalVat() {
    return statisticalVat;
  }

  public void setStatisticalVat(Boolean statisticalVat) {
    this.statisticalVat = statisticalVat;
  }

  public CashTranTaxDetailDto reverseVat(Boolean reverseVat) {
    this.reverseVat = reverseVat;
    return this;
  }

   /**
   * Get reverseVat
   * @return reverseVat
  **/
  @ApiModelProperty(value = "")
  public Boolean isReverseVat() {
    return reverseVat;
  }

  public void setReverseVat(Boolean reverseVat) {
    this.reverseVat = reverseVat;
  }

  public CashTranTaxDetailDto taxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @ApiModelProperty(value = "")
  public TaxTypeEnum getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashTranTaxDetailDto cashTranTaxDetailDto = (CashTranTaxDetailDto) o;
    return Objects.equals(this.tax, cashTranTaxDetailDto.tax) &&
        Objects.equals(this.taxRate, cashTranTaxDetailDto.taxRate) &&
        Objects.equals(this.taxableAmount, cashTranTaxDetailDto.taxableAmount) &&
        Objects.equals(this.taxAmount, cashTranTaxDetailDto.taxAmount) &&
        Objects.equals(this.deductibleTaxRate, cashTranTaxDetailDto.deductibleTaxRate) &&
        Objects.equals(this.expenseAmount, cashTranTaxDetailDto.expenseAmount) &&
        Objects.equals(this.includeInVatExemptTotal, cashTranTaxDetailDto.includeInVatExemptTotal) &&
        Objects.equals(this.pendingVat, cashTranTaxDetailDto.pendingVat) &&
        Objects.equals(this.statisticalVat, cashTranTaxDetailDto.statisticalVat) &&
        Objects.equals(this.reverseVat, cashTranTaxDetailDto.reverseVat) &&
        Objects.equals(this.taxType, cashTranTaxDetailDto.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tax, taxRate, taxableAmount, taxAmount, deductibleTaxRate, expenseAmount, includeInVatExemptTotal, pendingVat, statisticalVat, reverseVat, taxType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashTranTaxDetailDto {\n");
    
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    deductibleTaxRate: ").append(toIndentedString(deductibleTaxRate)).append("\n");
    sb.append("    expenseAmount: ").append(toIndentedString(expenseAmount)).append("\n");
    sb.append("    includeInVatExemptTotal: ").append(toIndentedString(includeInVatExemptTotal)).append("\n");
    sb.append("    pendingVat: ").append(toIndentedString(pendingVat)).append("\n");
    sb.append("    statisticalVat: ").append(toIndentedString(statisticalVat)).append("\n");
    sb.append("    reverseVat: ").append(toIndentedString(reverseVat)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

