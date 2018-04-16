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
import no.systema.visma.v1client.model.VatZoneDto;

/**
 * FinancialsDetailDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class FinancialsDetailDto {
  @JsonProperty("batchNumber")
  private String batchNumber = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("cleared")
  private Boolean cleared = null;

  @JsonProperty("clearDate")
  private LocalDateTime clearDate = null;

  @JsonProperty("taxZone")
  private VatZoneDto taxZone = null;

  /**
   * Gets or Sets taxCalcMode
   */
  public enum TaxCalcModeEnum {
    TAXSETTING("TaxSetting"),
    
    GROSS("Gross"),
    
    NET("Net");

    private String value;

    TaxCalcModeEnum(String value) {
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
    public static TaxCalcModeEnum fromValue(String text) {
      for (TaxCalcModeEnum b : TaxCalcModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("taxCalcMode")
  private TaxCalcModeEnum taxCalcMode = null;

  public FinancialsDetailDto batchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

   /**
   * Get batchNumber
   * @return batchNumber
  **/
  @ApiModelProperty(value = "")
  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }

  public FinancialsDetailDto branch(BranchNumberDto branch) {
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

  public FinancialsDetailDto cleared(Boolean cleared) {
    this.cleared = cleared;
    return this;
  }

   /**
   * Get cleared
   * @return cleared
  **/
  @ApiModelProperty(value = "")
  public Boolean isCleared() {
    return cleared;
  }

  public void setCleared(Boolean cleared) {
    this.cleared = cleared;
  }

  public FinancialsDetailDto clearDate(LocalDateTime clearDate) {
    this.clearDate = clearDate;
    return this;
  }

   /**
   * Get clearDate
   * @return clearDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getClearDate() {
    return clearDate;
  }

  public void setClearDate(LocalDateTime clearDate) {
    this.clearDate = clearDate;
  }

  public FinancialsDetailDto taxZone(VatZoneDto taxZone) {
    this.taxZone = taxZone;
    return this;
  }

   /**
   * Get taxZone
   * @return taxZone
  **/
  @ApiModelProperty(value = "")
  public VatZoneDto getTaxZone() {
    return taxZone;
  }

  public void setTaxZone(VatZoneDto taxZone) {
    this.taxZone = taxZone;
  }

  public FinancialsDetailDto taxCalcMode(TaxCalcModeEnum taxCalcMode) {
    this.taxCalcMode = taxCalcMode;
    return this;
  }

   /**
   * Get taxCalcMode
   * @return taxCalcMode
  **/
  @ApiModelProperty(value = "")
  public TaxCalcModeEnum getTaxCalcMode() {
    return taxCalcMode;
  }

  public void setTaxCalcMode(TaxCalcModeEnum taxCalcMode) {
    this.taxCalcMode = taxCalcMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialsDetailDto financialsDetailDto = (FinancialsDetailDto) o;
    return Objects.equals(this.batchNumber, financialsDetailDto.batchNumber) &&
        Objects.equals(this.branch, financialsDetailDto.branch) &&
        Objects.equals(this.cleared, financialsDetailDto.cleared) &&
        Objects.equals(this.clearDate, financialsDetailDto.clearDate) &&
        Objects.equals(this.taxZone, financialsDetailDto.taxZone) &&
        Objects.equals(this.taxCalcMode, financialsDetailDto.taxCalcMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNumber, branch, cleared, clearDate, taxZone, taxCalcMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialsDetailDto {\n");
    
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    clearDate: ").append(toIndentedString(clearDate)).append("\n");
    sb.append("    taxZone: ").append(toIndentedString(taxZone)).append("\n");
    sb.append("    taxCalcMode: ").append(toIndentedString(taxCalcMode)).append("\n");
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
