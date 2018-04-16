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
import java.util.ArrayList;
import java.util.List;
import no.systema.visma.v1client.model.AccountNumberDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.FinancialPeriodAmountDto;
import no.systema.visma.v1client.model.SubAccountDescriptionDto;

/**
 * BudgetDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class BudgetDto {
  @JsonProperty("financialYear")
  private String financialYear = null;

  @JsonProperty("released")
  private Boolean released = null;

  @JsonProperty("releasedAmount")
  private Double releasedAmount = null;

  @JsonProperty("account")
  private AccountNumberDto account = null;

  @JsonProperty("subaccount")
  private SubAccountDescriptionDto subaccount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("distributedAmount")
  private Double distributedAmount = null;

  @JsonProperty("periods")
  private List<FinancialPeriodAmountDto> periods = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  public BudgetDto financialYear(String financialYear) {
    this.financialYear = financialYear;
    return this;
  }

   /**
   * Get financialYear
   * @return financialYear
  **/
  @ApiModelProperty(value = "")
  public String getFinancialYear() {
    return financialYear;
  }

  public void setFinancialYear(String financialYear) {
    this.financialYear = financialYear;
  }

  public BudgetDto released(Boolean released) {
    this.released = released;
    return this;
  }

   /**
   * Get released
   * @return released
  **/
  @ApiModelProperty(value = "")
  public Boolean isReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }

  public BudgetDto releasedAmount(Double releasedAmount) {
    this.releasedAmount = releasedAmount;
    return this;
  }

   /**
   * Get releasedAmount
   * @return releasedAmount
  **/
  @ApiModelProperty(value = "")
  public Double getReleasedAmount() {
    return releasedAmount;
  }

  public void setReleasedAmount(Double releasedAmount) {
    this.releasedAmount = releasedAmount;
  }

  public BudgetDto account(AccountNumberDto account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountNumberDto getAccount() {
    return account;
  }

  public void setAccount(AccountNumberDto account) {
    this.account = account;
  }

  public BudgetDto subaccount(SubAccountDescriptionDto subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * Get subaccount
   * @return subaccount
  **/
  @ApiModelProperty(value = "")
  public SubAccountDescriptionDto getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(SubAccountDescriptionDto subaccount) {
    this.subaccount = subaccount;
  }

  public BudgetDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BudgetDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public BudgetDto distributedAmount(Double distributedAmount) {
    this.distributedAmount = distributedAmount;
    return this;
  }

   /**
   * Get distributedAmount
   * @return distributedAmount
  **/
  @ApiModelProperty(value = "")
  public Double getDistributedAmount() {
    return distributedAmount;
  }

  public void setDistributedAmount(Double distributedAmount) {
    this.distributedAmount = distributedAmount;
  }

  public BudgetDto periods(List<FinancialPeriodAmountDto> periods) {
    this.periods = periods;
    return this;
  }

  public BudgetDto addPeriodsItem(FinancialPeriodAmountDto periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Get periods
   * @return periods
  **/
  @ApiModelProperty(value = "")
  public List<FinancialPeriodAmountDto> getPeriods() {
    return periods;
  }

  public void setPeriods(List<FinancialPeriodAmountDto> periods) {
    this.periods = periods;
  }

  public BudgetDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public BudgetDto branchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Get branchNumber
   * @return branchNumber
  **/
  @ApiModelProperty(value = "")
  public BranchNumberDto getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetDto budgetDto = (BudgetDto) o;
    return Objects.equals(this.financialYear, budgetDto.financialYear) &&
        Objects.equals(this.released, budgetDto.released) &&
        Objects.equals(this.releasedAmount, budgetDto.releasedAmount) &&
        Objects.equals(this.account, budgetDto.account) &&
        Objects.equals(this.subaccount, budgetDto.subaccount) &&
        Objects.equals(this.description, budgetDto.description) &&
        Objects.equals(this.amount, budgetDto.amount) &&
        Objects.equals(this.distributedAmount, budgetDto.distributedAmount) &&
        Objects.equals(this.periods, budgetDto.periods) &&
        Objects.equals(this.lastModifiedDateTime, budgetDto.lastModifiedDateTime) &&
        Objects.equals(this.branchNumber, budgetDto.branchNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialYear, released, releasedAmount, account, subaccount, description, amount, distributedAmount, periods, lastModifiedDateTime, branchNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetDto {\n");
    
    sb.append("    financialYear: ").append(toIndentedString(financialYear)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    releasedAmount: ").append(toIndentedString(releasedAmount)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    distributedAmount: ").append(toIndentedString(distributedAmount)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
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
