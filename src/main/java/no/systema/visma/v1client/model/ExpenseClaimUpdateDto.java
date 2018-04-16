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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.DtoValueNullableDateTime;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.ExpenseClaimDetailUpdateDto;

/**
 * ExpenseClaimUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ExpenseClaimUpdateDto {
  @JsonProperty("date")
  private DtoValueNullableDateTime date = null;

  @JsonProperty("description")
  private DtoValueString description = null;

  @JsonProperty("claimedBy")
  private DtoValueString claimedBy = null;

  @JsonProperty("customer")
  private DtoValueString customer = null;

  /**
   * If the customer is updated the claim details customer information can be updated using the provided answer. By default &#39;SelectedCustomer&#39; is selected.
   */
  public enum CustomerUpdateAnswerEnum {
    SELECTEDCUSTOMER("SelectedCustomer"),
    
    ALLLINES("AllLines"),
    
    NOTHING("Nothing");

    private String value;

    CustomerUpdateAnswerEnum(String value) {
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
    public static CustomerUpdateAnswerEnum fromValue(String text) {
      for (CustomerUpdateAnswerEnum b : CustomerUpdateAnswerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerUpdateAnswer")
  private CustomerUpdateAnswerEnum customerUpdateAnswer = null;

  @JsonProperty("location")
  private DtoValueString location = null;

  @JsonProperty("details")
  private List<ExpenseClaimDetailUpdateDto> details = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public ExpenseClaimUpdateDto date(DtoValueNullableDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date when the claim was entered.
   * @return date
  **/
  @ApiModelProperty(value = "The date when the claim was entered.")
  public DtoValueNullableDateTime getDate() {
    return date;
  }

  public void setDate(DtoValueNullableDateTime date) {
    this.date = date;
  }

  public ExpenseClaimUpdateDto description(DtoValueString description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the claim.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the claim.")
  public DtoValueString getDescription() {
    return description;
  }

  public void setDescription(DtoValueString description) {
    this.description = description;
  }

  public ExpenseClaimUpdateDto claimedBy(DtoValueString claimedBy) {
    this.claimedBy = claimedBy;
    return this;
  }

   /**
   * The employee who is claiming the expenses. If the claim is released, an Accounts Payable bill will be generated to this employee.
   * @return claimedBy
  **/
  @ApiModelProperty(value = "The employee who is claiming the expenses. If the claim is released, an Accounts Payable bill will be generated to this employee.")
  public DtoValueString getClaimedBy() {
    return claimedBy;
  }

  public void setClaimedBy(DtoValueString claimedBy) {
    this.claimedBy = claimedBy;
  }

  public ExpenseClaimUpdateDto customer(DtoValueString customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The applicable customer.
   * @return customer
  **/
  @ApiModelProperty(value = "The applicable customer.")
  public DtoValueString getCustomer() {
    return customer;
  }

  public void setCustomer(DtoValueString customer) {
    this.customer = customer;
  }

  public ExpenseClaimUpdateDto customerUpdateAnswer(CustomerUpdateAnswerEnum customerUpdateAnswer) {
    this.customerUpdateAnswer = customerUpdateAnswer;
    return this;
  }

   /**
   * If the customer is updated the claim details customer information can be updated using the provided answer. By default &#39;SelectedCustomer&#39; is selected.
   * @return customerUpdateAnswer
  **/
  @ApiModelProperty(value = "If the customer is updated the claim details customer information can be updated using the provided answer. By default 'SelectedCustomer' is selected.")
  public CustomerUpdateAnswerEnum getCustomerUpdateAnswer() {
    return customerUpdateAnswer;
  }

  public void setCustomerUpdateAnswer(CustomerUpdateAnswerEnum customerUpdateAnswer) {
    this.customerUpdateAnswer = customerUpdateAnswer;
  }

  public ExpenseClaimUpdateDto location(DtoValueString location) {
    this.location = location;
    return this;
  }

   /**
   * The company location associated with the claim.
   * @return location
  **/
  @ApiModelProperty(value = "The company location associated with the claim.")
  public DtoValueString getLocation() {
    return location;
  }

  public void setLocation(DtoValueString location) {
    this.location = location;
  }

  public ExpenseClaimUpdateDto details(List<ExpenseClaimDetailUpdateDto> details) {
    this.details = details;
    return this;
  }

  public ExpenseClaimUpdateDto addDetailsItem(ExpenseClaimDetailUpdateDto detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Expense Claim detail information
   * @return details
  **/
  @ApiModelProperty(value = "Expense Claim detail information")
  public List<ExpenseClaimDetailUpdateDto> getDetails() {
    return details;
  }

  public void setDetails(List<ExpenseClaimDetailUpdateDto> details) {
    this.details = details;
  }

  public ExpenseClaimUpdateDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public ExpenseClaimUpdateDto putExtrasItem(String key, Object extrasItem) {
    if (this.extras == null) {
      this.extras = new HashMap<>();
    }
    this.extras.put(key, extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getExtras() {
    return extras;
  }

  public void setExtras(Map<String, Object> extras) {
    this.extras = extras;
  }

  public ExpenseClaimUpdateDto errorInfo(String errorInfo) {
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
    ExpenseClaimUpdateDto expenseClaimUpdateDto = (ExpenseClaimUpdateDto) o;
    return Objects.equals(this.date, expenseClaimUpdateDto.date) &&
        Objects.equals(this.description, expenseClaimUpdateDto.description) &&
        Objects.equals(this.claimedBy, expenseClaimUpdateDto.claimedBy) &&
        Objects.equals(this.customer, expenseClaimUpdateDto.customer) &&
        Objects.equals(this.customerUpdateAnswer, expenseClaimUpdateDto.customerUpdateAnswer) &&
        Objects.equals(this.location, expenseClaimUpdateDto.location) &&
        Objects.equals(this.details, expenseClaimUpdateDto.details) &&
        Objects.equals(this.extras, expenseClaimUpdateDto.extras) &&
        Objects.equals(this.errorInfo, expenseClaimUpdateDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, description, claimedBy, customer, customerUpdateAnswer, location, details, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseClaimUpdateDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    claimedBy: ").append(toIndentedString(claimedBy)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerUpdateAnswer: ").append(toIndentedString(customerUpdateAnswer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
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

