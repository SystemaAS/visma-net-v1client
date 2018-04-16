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
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * RotRutDistributionUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class RotRutDistributionUpdateDto {
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

  @JsonProperty("lineNbr")
  private DtoValueNullableInt32 lineNbr = null;

  @JsonProperty("personalId")
  private DtoValueString personalId = null;

  @JsonProperty("amount")
  private DtoValueNullableDecimal amount = null;

  @JsonProperty("extra")
  private DtoValueNullableBoolean extra = null;

  public RotRutDistributionUpdateDto operation(OperationEnum operation) {
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

  public RotRutDistributionUpdateDto lineNbr(DtoValueNullableInt32 lineNbr) {
    this.lineNbr = lineNbr;
    return this;
  }

   /**
   * Get lineNbr
   * @return lineNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getLineNbr() {
    return lineNbr;
  }

  public void setLineNbr(DtoValueNullableInt32 lineNbr) {
    this.lineNbr = lineNbr;
  }

  public RotRutDistributionUpdateDto personalId(DtoValueString personalId) {
    this.personalId = personalId;
    return this;
  }

   /**
   * Get personalId
   * @return personalId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPersonalId() {
    return personalId;
  }

  public void setPersonalId(DtoValueString personalId) {
    this.personalId = personalId;
  }

  public RotRutDistributionUpdateDto amount(DtoValueNullableDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getAmount() {
    return amount;
  }

  public void setAmount(DtoValueNullableDecimal amount) {
    this.amount = amount;
  }

  public RotRutDistributionUpdateDto extra(DtoValueNullableBoolean extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getExtra() {
    return extra;
  }

  public void setExtra(DtoValueNullableBoolean extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotRutDistributionUpdateDto rotRutDistributionUpdateDto = (RotRutDistributionUpdateDto) o;
    return Objects.equals(this.operation, rotRutDistributionUpdateDto.operation) &&
        Objects.equals(this.lineNbr, rotRutDistributionUpdateDto.lineNbr) &&
        Objects.equals(this.personalId, rotRutDistributionUpdateDto.personalId) &&
        Objects.equals(this.amount, rotRutDistributionUpdateDto.amount) &&
        Objects.equals(this.extra, rotRutDistributionUpdateDto.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, lineNbr, personalId, amount, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotRutDistributionUpdateDto {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    lineNbr: ").append(toIndentedString(lineNbr)).append("\n");
    sb.append("    personalId: ").append(toIndentedString(personalId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
