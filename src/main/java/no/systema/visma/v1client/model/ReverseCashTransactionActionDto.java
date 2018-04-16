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
 * ReverseCashTransactionActionDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ReverseCashTransactionActionDto {
  @JsonProperty("returnCashTransaction")
  private Boolean returnCashTransaction = null;

  public ReverseCashTransactionActionDto returnCashTransaction(Boolean returnCashTransaction) {
    this.returnCashTransaction = returnCashTransaction;
    return this;
  }

   /**
   * Get returnCashTransaction
   * @return returnCashTransaction
  **/
  @ApiModelProperty(value = "")
  public Boolean isReturnCashTransaction() {
    return returnCashTransaction;
  }

  public void setReturnCashTransaction(Boolean returnCashTransaction) {
    this.returnCashTransaction = returnCashTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReverseCashTransactionActionDto reverseCashTransactionActionDto = (ReverseCashTransactionActionDto) o;
    return Objects.equals(this.returnCashTransaction, reverseCashTransactionActionDto.returnCashTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnCashTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseCashTransactionActionDto {\n");
    
    sb.append("    returnCashTransaction: ").append(toIndentedString(returnCashTransaction)).append("\n");
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
