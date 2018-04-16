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
import java.util.UUID;

/**
 * ReleasePurchaseReceiptActionResultDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ReleasePurchaseReceiptActionResultDto {
  @JsonProperty("actionId")
  private UUID actionId = null;

  /**
   * Gets or Sets actionResult
   */
  public enum ActionResultEnum {
    QUEUED("Queued"),
    
    INPROCESS("InProcess"),
    
    FAILED("Failed"),
    
    DONE("Done");

    private String value;

    ActionResultEnum(String value) {
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
    public static ActionResultEnum fromValue(String text) {
      for (ActionResultEnum b : ActionResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("actionResult")
  private ActionResultEnum actionResult = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public ReleasePurchaseReceiptActionResultDto actionId(UUID actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @ApiModelProperty(value = "")
  public UUID getActionId() {
    return actionId;
  }

  public void setActionId(UUID actionId) {
    this.actionId = actionId;
  }

  public ReleasePurchaseReceiptActionResultDto actionResult(ActionResultEnum actionResult) {
    this.actionResult = actionResult;
    return this;
  }

   /**
   * Get actionResult
   * @return actionResult
  **/
  @ApiModelProperty(value = "")
  public ActionResultEnum getActionResult() {
    return actionResult;
  }

  public void setActionResult(ActionResultEnum actionResult) {
    this.actionResult = actionResult;
  }

  public ReleasePurchaseReceiptActionResultDto errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @ApiModelProperty(value = "")
  public String getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleasePurchaseReceiptActionResultDto releasePurchaseReceiptActionResultDto = (ReleasePurchaseReceiptActionResultDto) o;
    return Objects.equals(this.actionId, releasePurchaseReceiptActionResultDto.actionId) &&
        Objects.equals(this.actionResult, releasePurchaseReceiptActionResultDto.actionResult) &&
        Objects.equals(this.errorInfo, releasePurchaseReceiptActionResultDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionResult, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleasePurchaseReceiptActionResultDto {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionResult: ").append(toIndentedString(actionResult)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

