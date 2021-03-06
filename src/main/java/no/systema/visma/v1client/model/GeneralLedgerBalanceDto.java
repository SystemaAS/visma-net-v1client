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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AccountNumberDescriptionDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.LedgerDescriptionDto;

/**
 * This class represents a General Ledger Balance in GeneralLedgerBalanceController. Used by getting data.
 */
@ApiModel(description = "This class represents a General Ledger Balance in GeneralLedgerBalanceController. Used by getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class GeneralLedgerBalanceDto {
  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("ledger")
  private LedgerDescriptionDto ledger = null;

  /**
   * Gets or Sets balanceType
   */
  public enum BalanceTypeEnum {
    ACTUAL("Actual"),
    
    REPORT("Report"),
    
    STATISTICAL("Statistical"),
    
    BUDGET("Budget");

    private String value;

    BalanceTypeEnum(String value) {
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
    public static BalanceTypeEnum fromValue(String text) {
      for (BalanceTypeEnum b : BalanceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("balanceType")
  private BalanceTypeEnum balanceType = null;

  @JsonProperty("financialPeriod")
  private String financialPeriod = null;

  @JsonProperty("account")
  private AccountNumberDescriptionDto account = null;

  @JsonProperty("subaccountId")
  private String subaccountId = null;

  @JsonProperty("currencyId")
  private String currencyId = null;

  @JsonProperty("periodToDateDebit")
  private Double periodToDateDebit = null;

  @JsonProperty("periodToDateCredit")
  private Double periodToDateCredit = null;

  @JsonProperty("beginningBalance")
  private Double beginningBalance = null;

  @JsonProperty("yearToDateBalance")
  private Double yearToDateBalance = null;

  @JsonProperty("periodToDateDebitInCurrency")
  private Double periodToDateDebitInCurrency = null;

  @JsonProperty("periodToDateCreditInCurrency")
  private Double periodToDateCreditInCurrency = null;

  @JsonProperty("beginningBalanceInCurrency")
  private Double beginningBalanceInCurrency = null;

  @JsonProperty("yearToDateBalanceInCurrency")
  private Double yearToDateBalanceInCurrency = null;

  @JsonProperty("yearClosed")
  private Boolean yearClosed = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public GeneralLedgerBalanceDto branch(BranchNumberDto branch) {
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

  public GeneralLedgerBalanceDto ledger(LedgerDescriptionDto ledger) {
    this.ledger = ledger;
    return this;
  }

   /**
   * Get ledger
   * @return ledger
  **/
  @ApiModelProperty(value = "")
  public LedgerDescriptionDto getLedger() {
    return ledger;
  }

  public void setLedger(LedgerDescriptionDto ledger) {
    this.ledger = ledger;
  }

  public GeneralLedgerBalanceDto balanceType(BalanceTypeEnum balanceType) {
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @ApiModelProperty(value = "")
  public BalanceTypeEnum getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(BalanceTypeEnum balanceType) {
    this.balanceType = balanceType;
  }

  public GeneralLedgerBalanceDto financialPeriod(String financialPeriod) {
    this.financialPeriod = financialPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Format YYYYMM.
   * @return financialPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Format YYYYMM.")
  public String getFinancialPeriod() {
    return financialPeriod;
  }

  public void setFinancialPeriod(String financialPeriod) {
    this.financialPeriod = financialPeriod;
  }

  public GeneralLedgerBalanceDto account(AccountNumberDescriptionDto account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountNumberDescriptionDto getAccount() {
    return account;
  }

  public void setAccount(AccountNumberDescriptionDto account) {
    this.account = account;
  }

  public GeneralLedgerBalanceDto subaccountId(String subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

   /**
   * Get subaccountId
   * @return subaccountId
  **/
  @ApiModelProperty(value = "")
  public String getSubaccountId() {
    return subaccountId;
  }

  public void setSubaccountId(String subaccountId) {
    this.subaccountId = subaccountId;
  }

  public GeneralLedgerBalanceDto currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public GeneralLedgerBalanceDto periodToDateDebit(Double periodToDateDebit) {
    this.periodToDateDebit = periodToDateDebit;
    return this;
  }

   /**
   * Get periodToDateDebit
   * @return periodToDateDebit
  **/
  @ApiModelProperty(value = "")
  public Double getPeriodToDateDebit() {
    return periodToDateDebit;
  }

  public void setPeriodToDateDebit(Double periodToDateDebit) {
    this.periodToDateDebit = periodToDateDebit;
  }

  public GeneralLedgerBalanceDto periodToDateCredit(Double periodToDateCredit) {
    this.periodToDateCredit = periodToDateCredit;
    return this;
  }

   /**
   * Get periodToDateCredit
   * @return periodToDateCredit
  **/
  @ApiModelProperty(value = "")
  public Double getPeriodToDateCredit() {
    return periodToDateCredit;
  }

  public void setPeriodToDateCredit(Double periodToDateCredit) {
    this.periodToDateCredit = periodToDateCredit;
  }

  public GeneralLedgerBalanceDto beginningBalance(Double beginningBalance) {
    this.beginningBalance = beginningBalance;
    return this;
  }

   /**
   * Get beginningBalance
   * @return beginningBalance
  **/
  @ApiModelProperty(value = "")
  public Double getBeginningBalance() {
    return beginningBalance;
  }

  public void setBeginningBalance(Double beginningBalance) {
    this.beginningBalance = beginningBalance;
  }

  public GeneralLedgerBalanceDto yearToDateBalance(Double yearToDateBalance) {
    this.yearToDateBalance = yearToDateBalance;
    return this;
  }

   /**
   * Get yearToDateBalance
   * @return yearToDateBalance
  **/
  @ApiModelProperty(value = "")
  public Double getYearToDateBalance() {
    return yearToDateBalance;
  }

  public void setYearToDateBalance(Double yearToDateBalance) {
    this.yearToDateBalance = yearToDateBalance;
  }

  public GeneralLedgerBalanceDto periodToDateDebitInCurrency(Double periodToDateDebitInCurrency) {
    this.periodToDateDebitInCurrency = periodToDateDebitInCurrency;
    return this;
  }

   /**
   * Get periodToDateDebitInCurrency
   * @return periodToDateDebitInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getPeriodToDateDebitInCurrency() {
    return periodToDateDebitInCurrency;
  }

  public void setPeriodToDateDebitInCurrency(Double periodToDateDebitInCurrency) {
    this.periodToDateDebitInCurrency = periodToDateDebitInCurrency;
  }

  public GeneralLedgerBalanceDto periodToDateCreditInCurrency(Double periodToDateCreditInCurrency) {
    this.periodToDateCreditInCurrency = periodToDateCreditInCurrency;
    return this;
  }

   /**
   * Get periodToDateCreditInCurrency
   * @return periodToDateCreditInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getPeriodToDateCreditInCurrency() {
    return periodToDateCreditInCurrency;
  }

  public void setPeriodToDateCreditInCurrency(Double periodToDateCreditInCurrency) {
    this.periodToDateCreditInCurrency = periodToDateCreditInCurrency;
  }

  public GeneralLedgerBalanceDto beginningBalanceInCurrency(Double beginningBalanceInCurrency) {
    this.beginningBalanceInCurrency = beginningBalanceInCurrency;
    return this;
  }

   /**
   * Get beginningBalanceInCurrency
   * @return beginningBalanceInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getBeginningBalanceInCurrency() {
    return beginningBalanceInCurrency;
  }

  public void setBeginningBalanceInCurrency(Double beginningBalanceInCurrency) {
    this.beginningBalanceInCurrency = beginningBalanceInCurrency;
  }

  public GeneralLedgerBalanceDto yearToDateBalanceInCurrency(Double yearToDateBalanceInCurrency) {
    this.yearToDateBalanceInCurrency = yearToDateBalanceInCurrency;
    return this;
  }

   /**
   * Get yearToDateBalanceInCurrency
   * @return yearToDateBalanceInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getYearToDateBalanceInCurrency() {
    return yearToDateBalanceInCurrency;
  }

  public void setYearToDateBalanceInCurrency(Double yearToDateBalanceInCurrency) {
    this.yearToDateBalanceInCurrency = yearToDateBalanceInCurrency;
  }

  public GeneralLedgerBalanceDto yearClosed(Boolean yearClosed) {
    this.yearClosed = yearClosed;
    return this;
  }

   /**
   * Get yearClosed
   * @return yearClosed
  **/
  @ApiModelProperty(value = "")
  public Boolean isYearClosed() {
    return yearClosed;
  }

  public void setYearClosed(Boolean yearClosed) {
    this.yearClosed = yearClosed;
  }

  public GeneralLedgerBalanceDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public GeneralLedgerBalanceDto putExtrasItem(String key, Object extrasItem) {
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

  public GeneralLedgerBalanceDto errorInfo(String errorInfo) {
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
    GeneralLedgerBalanceDto generalLedgerBalanceDto = (GeneralLedgerBalanceDto) o;
    return Objects.equals(this.branch, generalLedgerBalanceDto.branch) &&
        Objects.equals(this.ledger, generalLedgerBalanceDto.ledger) &&
        Objects.equals(this.balanceType, generalLedgerBalanceDto.balanceType) &&
        Objects.equals(this.financialPeriod, generalLedgerBalanceDto.financialPeriod) &&
        Objects.equals(this.account, generalLedgerBalanceDto.account) &&
        Objects.equals(this.subaccountId, generalLedgerBalanceDto.subaccountId) &&
        Objects.equals(this.currencyId, generalLedgerBalanceDto.currencyId) &&
        Objects.equals(this.periodToDateDebit, generalLedgerBalanceDto.periodToDateDebit) &&
        Objects.equals(this.periodToDateCredit, generalLedgerBalanceDto.periodToDateCredit) &&
        Objects.equals(this.beginningBalance, generalLedgerBalanceDto.beginningBalance) &&
        Objects.equals(this.yearToDateBalance, generalLedgerBalanceDto.yearToDateBalance) &&
        Objects.equals(this.periodToDateDebitInCurrency, generalLedgerBalanceDto.periodToDateDebitInCurrency) &&
        Objects.equals(this.periodToDateCreditInCurrency, generalLedgerBalanceDto.periodToDateCreditInCurrency) &&
        Objects.equals(this.beginningBalanceInCurrency, generalLedgerBalanceDto.beginningBalanceInCurrency) &&
        Objects.equals(this.yearToDateBalanceInCurrency, generalLedgerBalanceDto.yearToDateBalanceInCurrency) &&
        Objects.equals(this.yearClosed, generalLedgerBalanceDto.yearClosed) &&
        Objects.equals(this.extras, generalLedgerBalanceDto.extras) &&
        Objects.equals(this.errorInfo, generalLedgerBalanceDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, ledger, balanceType, financialPeriod, account, subaccountId, currencyId, periodToDateDebit, periodToDateCredit, beginningBalance, yearToDateBalance, periodToDateDebitInCurrency, periodToDateCreditInCurrency, beginningBalanceInCurrency, yearToDateBalanceInCurrency, yearClosed, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralLedgerBalanceDto {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    ledger: ").append(toIndentedString(ledger)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    financialPeriod: ").append(toIndentedString(financialPeriod)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    periodToDateDebit: ").append(toIndentedString(periodToDateDebit)).append("\n");
    sb.append("    periodToDateCredit: ").append(toIndentedString(periodToDateCredit)).append("\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
    sb.append("    yearToDateBalance: ").append(toIndentedString(yearToDateBalance)).append("\n");
    sb.append("    periodToDateDebitInCurrency: ").append(toIndentedString(periodToDateDebitInCurrency)).append("\n");
    sb.append("    periodToDateCreditInCurrency: ").append(toIndentedString(periodToDateCreditInCurrency)).append("\n");
    sb.append("    beginningBalanceInCurrency: ").append(toIndentedString(beginningBalanceInCurrency)).append("\n");
    sb.append("    yearToDateBalanceInCurrency: ").append(toIndentedString(yearToDateBalanceInCurrency)).append("\n");
    sb.append("    yearClosed: ").append(toIndentedString(yearClosed)).append("\n");
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

