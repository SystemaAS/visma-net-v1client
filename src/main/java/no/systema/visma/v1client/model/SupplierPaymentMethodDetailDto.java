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

/**
 * This class represents a Payment Method Detail in SupplierController. Used to get data for SupplierPaymentMethodDetails of a Supplier.
 */
@ApiModel(description = "This class represents a Payment Method Detail in SupplierController. Used to get data for SupplierPaymentMethodDetails of a Supplier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class SupplierPaymentMethodDetailDto {
  @JsonProperty("paymentMethodDetailDescription")
  private String paymentMethodDetailDescription = null;

  @JsonProperty("paymentMethodDetailValue")
  private String paymentMethodDetailValue = null;

  public SupplierPaymentMethodDetailDto paymentMethodDetailDescription(String paymentMethodDetailDescription) {
    this.paymentMethodDetailDescription = paymentMethodDetailDescription;
    return this;
  }

   /**
   * Get paymentMethodDetailDescription
   * @return paymentMethodDetailDescription
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethodDetailDescription() {
    return paymentMethodDetailDescription;
  }

  public void setPaymentMethodDetailDescription(String paymentMethodDetailDescription) {
    this.paymentMethodDetailDescription = paymentMethodDetailDescription;
  }

  public SupplierPaymentMethodDetailDto paymentMethodDetailValue(String paymentMethodDetailValue) {
    this.paymentMethodDetailValue = paymentMethodDetailValue;
    return this;
  }

   /**
   * Get paymentMethodDetailValue
   * @return paymentMethodDetailValue
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethodDetailValue() {
    return paymentMethodDetailValue;
  }

  public void setPaymentMethodDetailValue(String paymentMethodDetailValue) {
    this.paymentMethodDetailValue = paymentMethodDetailValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplierPaymentMethodDetailDto supplierPaymentMethodDetailDto = (SupplierPaymentMethodDetailDto) o;
    return Objects.equals(this.paymentMethodDetailDescription, supplierPaymentMethodDetailDto.paymentMethodDetailDescription) &&
        Objects.equals(this.paymentMethodDetailValue, supplierPaymentMethodDetailDto.paymentMethodDetailValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodDetailDescription, paymentMethodDetailValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplierPaymentMethodDetailDto {\n");
    
    sb.append("    paymentMethodDetailDescription: ").append(toIndentedString(paymentMethodDetailDescription)).append("\n");
    sb.append("    paymentMethodDetailValue: ").append(toIndentedString(paymentMethodDetailValue)).append("\n");
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

