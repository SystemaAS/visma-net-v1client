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
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * CustomerContractDetailsUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerContractDetailsUpdateDto {
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

  @JsonProperty("contractDetailId")
  private DtoValueInt32 contractDetailId = null;

  @JsonProperty("itemCode")
  private DtoValueString itemCode = null;

  @JsonProperty("included")
  private DtoValueNullableDecimal included = null;

  public CustomerContractDetailsUpdateDto operation(OperationEnum operation) {
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

  public CustomerContractDetailsUpdateDto contractDetailId(DtoValueInt32 contractDetailId) {
    this.contractDetailId = contractDetailId;
    return this;
  }

   /**
   * Get contractDetailId
   * @return contractDetailId
  **/
  @ApiModelProperty(value = "")
  public DtoValueInt32 getContractDetailId() {
    return contractDetailId;
  }

  public void setContractDetailId(DtoValueInt32 contractDetailId) {
    this.contractDetailId = contractDetailId;
  }

  public CustomerContractDetailsUpdateDto itemCode(DtoValueString itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Get itemCode
   * @return itemCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getItemCode() {
    return itemCode;
  }

  public void setItemCode(DtoValueString itemCode) {
    this.itemCode = itemCode;
  }

  public CustomerContractDetailsUpdateDto included(DtoValueNullableDecimal included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getIncluded() {
    return included;
  }

  public void setIncluded(DtoValueNullableDecimal included) {
    this.included = included;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerContractDetailsUpdateDto customerContractDetailsUpdateDto = (CustomerContractDetailsUpdateDto) o;
    return Objects.equals(this.operation, customerContractDetailsUpdateDto.operation) &&
        Objects.equals(this.contractDetailId, customerContractDetailsUpdateDto.contractDetailId) &&
        Objects.equals(this.itemCode, customerContractDetailsUpdateDto.itemCode) &&
        Objects.equals(this.included, customerContractDetailsUpdateDto.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, contractDetailId, itemCode, included);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerContractDetailsUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    contractDetailId: ").append(toIndentedString(contractDetailId)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

