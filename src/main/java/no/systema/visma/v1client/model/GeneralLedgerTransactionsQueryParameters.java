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
 * GeneralLedgerTransactionsQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class GeneralLedgerTransactionsQueryParameters {
  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("ledger")
  private String ledger = null;

  @JsonProperty("fromPeriod")
  private String fromPeriod = null;

  @JsonProperty("toPeriod")
  private String toPeriod = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("subaccountId")
  private String subaccountId = null;

  @JsonProperty("fromDate")
  private String fromDate = null;

  @JsonProperty("toDate")
  private String toDate = null;

  @JsonProperty("includeUnposted")
  private Boolean includeUnposted = null;

  @JsonProperty("includeUnreleased")
  private Boolean includeUnreleased = null;

  @JsonProperty("skipRecords")
  private Integer skipRecords = null;

  @JsonProperty("numberToRead")
  private Integer numberToRead = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lastModifiedDateTimeCondition")
  private String lastModifiedDateTimeCondition = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public GeneralLedgerTransactionsQueryParameters branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public GeneralLedgerTransactionsQueryParameters ledger(String ledger) {
    this.ledger = ledger;
    return this;
  }

   /**
   * Mandatory
   * @return ledger
  **/
  @ApiModelProperty(value = "Mandatory")
  public String getLedger() {
    return ledger;
  }

  public void setLedger(String ledger) {
    this.ledger = ledger;
  }

  public GeneralLedgerTransactionsQueryParameters fromPeriod(String fromPeriod) {
    this.fromPeriod = fromPeriod;
    return this;
  }

   /**
   * Mandatory
   * @return fromPeriod
  **/
  @ApiModelProperty(value = "Mandatory")
  public String getFromPeriod() {
    return fromPeriod;
  }

  public void setFromPeriod(String fromPeriod) {
    this.fromPeriod = fromPeriod;
  }

  public GeneralLedgerTransactionsQueryParameters toPeriod(String toPeriod) {
    this.toPeriod = toPeriod;
    return this;
  }

   /**
   * Mandatory
   * @return toPeriod
  **/
  @ApiModelProperty(value = "Mandatory")
  public String getToPeriod() {
    return toPeriod;
  }

  public void setToPeriod(String toPeriod) {
    this.toPeriod = toPeriod;
  }

  public GeneralLedgerTransactionsQueryParameters account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public GeneralLedgerTransactionsQueryParameters subaccountId(String subaccountId) {
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

  public GeneralLedgerTransactionsQueryParameters fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(value = "")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public GeneralLedgerTransactionsQueryParameters toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(value = "")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public GeneralLedgerTransactionsQueryParameters includeUnposted(Boolean includeUnposted) {
    this.includeUnposted = includeUnposted;
    return this;
  }

   /**
   * Get includeUnposted
   * @return includeUnposted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeUnposted() {
    return includeUnposted;
  }

  public void setIncludeUnposted(Boolean includeUnposted) {
    this.includeUnposted = includeUnposted;
  }

  public GeneralLedgerTransactionsQueryParameters includeUnreleased(Boolean includeUnreleased) {
    this.includeUnreleased = includeUnreleased;
    return this;
  }

   /**
   * Get includeUnreleased
   * @return includeUnreleased
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeUnreleased() {
    return includeUnreleased;
  }

  public void setIncludeUnreleased(Boolean includeUnreleased) {
    this.includeUnreleased = includeUnreleased;
  }

  public GeneralLedgerTransactionsQueryParameters skipRecords(Integer skipRecords) {
    this.skipRecords = skipRecords;
    return this;
  }

   /**
   * Get skipRecords
   * @return skipRecords
  **/
  @ApiModelProperty(value = "")
  public Integer getSkipRecords() {
    return skipRecords;
  }

  public void setSkipRecords(Integer skipRecords) {
    this.skipRecords = skipRecords;
  }

  public GeneralLedgerTransactionsQueryParameters numberToRead(Integer numberToRead) {
    this.numberToRead = numberToRead;
    return this;
  }

   /**
   * Get numberToRead
   * @return numberToRead
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberToRead() {
    return numberToRead;
  }

  public void setNumberToRead(Integer numberToRead) {
    this.numberToRead = numberToRead;
  }

  public GeneralLedgerTransactionsQueryParameters lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }

  public GeneralLedgerTransactionsQueryParameters lastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
    this.lastModifiedDateTimeCondition = lastModifiedDateTimeCondition;
    return this;
  }

   /**
   * Get lastModifiedDateTimeCondition
   * @return lastModifiedDateTimeCondition
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedDateTimeCondition() {
    return lastModifiedDateTimeCondition;
  }

  public void setLastModifiedDateTimeCondition(String lastModifiedDateTimeCondition) {
    this.lastModifiedDateTimeCondition = lastModifiedDateTimeCondition;
  }

  public GeneralLedgerTransactionsQueryParameters pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public GeneralLedgerTransactionsQueryParameters pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralLedgerTransactionsQueryParameters generalLedgerTransactionsQueryParameters = (GeneralLedgerTransactionsQueryParameters) o;
    return Objects.equals(this.branch, generalLedgerTransactionsQueryParameters.branch) &&
        Objects.equals(this.ledger, generalLedgerTransactionsQueryParameters.ledger) &&
        Objects.equals(this.fromPeriod, generalLedgerTransactionsQueryParameters.fromPeriod) &&
        Objects.equals(this.toPeriod, generalLedgerTransactionsQueryParameters.toPeriod) &&
        Objects.equals(this.account, generalLedgerTransactionsQueryParameters.account) &&
        Objects.equals(this.subaccountId, generalLedgerTransactionsQueryParameters.subaccountId) &&
        Objects.equals(this.fromDate, generalLedgerTransactionsQueryParameters.fromDate) &&
        Objects.equals(this.toDate, generalLedgerTransactionsQueryParameters.toDate) &&
        Objects.equals(this.includeUnposted, generalLedgerTransactionsQueryParameters.includeUnposted) &&
        Objects.equals(this.includeUnreleased, generalLedgerTransactionsQueryParameters.includeUnreleased) &&
        Objects.equals(this.skipRecords, generalLedgerTransactionsQueryParameters.skipRecords) &&
        Objects.equals(this.numberToRead, generalLedgerTransactionsQueryParameters.numberToRead) &&
        Objects.equals(this.lastModifiedDateTime, generalLedgerTransactionsQueryParameters.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedDateTimeCondition, generalLedgerTransactionsQueryParameters.lastModifiedDateTimeCondition) &&
        Objects.equals(this.pageNumber, generalLedgerTransactionsQueryParameters.pageNumber) &&
        Objects.equals(this.pageSize, generalLedgerTransactionsQueryParameters.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, ledger, fromPeriod, toPeriod, account, subaccountId, fromDate, toDate, includeUnposted, includeUnreleased, skipRecords, numberToRead, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralLedgerTransactionsQueryParameters {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    ledger: ").append(toIndentedString(ledger)).append("\n");
    sb.append("    fromPeriod: ").append(toIndentedString(fromPeriod)).append("\n");
    sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    includeUnposted: ").append(toIndentedString(includeUnposted)).append("\n");
    sb.append("    includeUnreleased: ").append(toIndentedString(includeUnreleased)).append("\n");
    sb.append("    skipRecords: ").append(toIndentedString(skipRecords)).append("\n");
    sb.append("    numberToRead: ").append(toIndentedString(numberToRead)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastModifiedDateTimeCondition: ").append(toIndentedString(lastModifiedDateTimeCondition)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

