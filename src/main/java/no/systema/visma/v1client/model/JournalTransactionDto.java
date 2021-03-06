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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.JournalTransactionLineDto;

/**
 * This class represents a journal transaction in JournalTransactionController. Used by getting data.
 */
@ApiModel(description = "This class represents a journal transaction in JournalTransactionController. Used by getting data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class JournalTransactionDto {
  /**
   * Gets or Sets module
   */
  public enum ModuleEnum {
    MODULEGL("ModuleGL"),
    
    MODULEAP("ModuleAP"),
    
    MODULEAR("ModuleAR"),
    
    MODULECA("ModuleCA"),
    
    MODULECM("ModuleCM"),
    
    MODULEIN("ModuleIN"),
    
    MODULESO("ModuleSO"),
    
    MODULEPO("ModulePO"),
    
    MODULEDR("ModuleDR"),
    
    MODULEFA("ModuleFA"),
    
    MODULEEP("ModuleEP"),
    
    MODULEPM("ModulePM"),
    
    MODULETX("ModuleTX"),
    
    MODULECR("ModuleCR");

    private String value;

    ModuleEnum(String value) {
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
    public static ModuleEnum fromValue(String text) {
      for (ModuleEnum b : ModuleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("module")
  private ModuleEnum module = null;

  @JsonProperty("batchNumber")
  private String batchNumber = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HOLD("Hold"),
    
    BALANCED("Balanced"),
    
    UNPOSTED("Unposted"),
    
    POSTED("Posted"),
    
    COMPLETED("Completed"),
    
    VOIDED("Voided"),
    
    RELEASED("Released"),
    
    PARTIALLYRELEASED("PartiallyReleased"),
    
    SCHEDULED("Scheduled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("hold")
  private Boolean hold = null;

  @JsonProperty("transactionDate")
  private LocalDateTime transactionDate = null;

  @JsonProperty("postPeriod")
  private String postPeriod = null;

  @JsonProperty("financialPeriod")
  private String financialPeriod = null;

  @JsonProperty("ledger")
  private String ledger = null;

  @JsonProperty("ledgerDescription")
  private String ledgerDescription = null;

  @JsonProperty("currencyId")
  private String currencyId = null;

  @JsonProperty("exchangeRate")
  private Double exchangeRate = null;

  @JsonProperty("autoReversing")
  private Boolean autoReversing = null;

  @JsonProperty("reversingEntry")
  private Boolean reversingEntry = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("originalBatchNumber")
  private String originalBatchNumber = null;

  @JsonProperty("debitTotal")
  private Double debitTotal = null;

  @JsonProperty("debitTotalInCurrency")
  private Double debitTotalInCurrency = null;

  @JsonProperty("creditTotal")
  private Double creditTotal = null;

  @JsonProperty("creditTotalInCurrency")
  private Double creditTotalInCurrency = null;

  @JsonProperty("controlTotal")
  private Double controlTotal = null;

  @JsonProperty("controlTotalInCurrency")
  private Double controlTotalInCurrency = null;

  @JsonProperty("createVatTransaction")
  private Boolean createVatTransaction = null;

  @JsonProperty("skipVatAmountValidation")
  private Boolean skipVatAmountValidation = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("transactionCode")
  private String transactionCode = null;

  @JsonProperty("transactionCodeDescription")
  private String transactionCodeDescription = null;

  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("journalTransactionLines")
  private List<JournalTransactionLineDto> journalTransactionLines = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public JournalTransactionDto module(ModuleEnum module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @ApiModelProperty(value = "")
  public ModuleEnum getModule() {
    return module;
  }

  public void setModule(ModuleEnum module) {
    this.module = module;
  }

  public JournalTransactionDto batchNumber(String batchNumber) {
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

  public JournalTransactionDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public JournalTransactionDto hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public Boolean isHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public JournalTransactionDto transactionDate(LocalDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public JournalTransactionDto postPeriod(String postPeriod) {
    this.postPeriod = postPeriod;
    return this;
  }

   /**
   * The financial period to which the transactions recorded in the document should be posted. Format MMYYYY.
   * @return postPeriod
  **/
  @ApiModelProperty(value = "The financial period to which the transactions recorded in the document should be posted. Format MMYYYY.")
  public String getPostPeriod() {
    return postPeriod;
  }

  public void setPostPeriod(String postPeriod) {
    this.postPeriod = postPeriod;
  }

  public JournalTransactionDto financialPeriod(String financialPeriod) {
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

  public JournalTransactionDto ledger(String ledger) {
    this.ledger = ledger;
    return this;
  }

   /**
   * Get ledger
   * @return ledger
  **/
  @ApiModelProperty(value = "")
  public String getLedger() {
    return ledger;
  }

  public void setLedger(String ledger) {
    this.ledger = ledger;
  }

  public JournalTransactionDto ledgerDescription(String ledgerDescription) {
    this.ledgerDescription = ledgerDescription;
    return this;
  }

   /**
   * Get ledgerDescription
   * @return ledgerDescription
  **/
  @ApiModelProperty(value = "")
  public String getLedgerDescription() {
    return ledgerDescription;
  }

  public void setLedgerDescription(String ledgerDescription) {
    this.ledgerDescription = ledgerDescription;
  }

  public JournalTransactionDto currencyId(String currencyId) {
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

  public JournalTransactionDto exchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "")
  public Double getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public JournalTransactionDto autoReversing(Boolean autoReversing) {
    this.autoReversing = autoReversing;
    return this;
  }

   /**
   * Get autoReversing
   * @return autoReversing
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoReversing() {
    return autoReversing;
  }

  public void setAutoReversing(Boolean autoReversing) {
    this.autoReversing = autoReversing;
  }

  public JournalTransactionDto reversingEntry(Boolean reversingEntry) {
    this.reversingEntry = reversingEntry;
    return this;
  }

   /**
   * Get reversingEntry
   * @return reversingEntry
  **/
  @ApiModelProperty(value = "")
  public Boolean isReversingEntry() {
    return reversingEntry;
  }

  public void setReversingEntry(Boolean reversingEntry) {
    this.reversingEntry = reversingEntry;
  }

  public JournalTransactionDto description(String description) {
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

  public JournalTransactionDto originalBatchNumber(String originalBatchNumber) {
    this.originalBatchNumber = originalBatchNumber;
    return this;
  }

   /**
   * Get originalBatchNumber
   * @return originalBatchNumber
  **/
  @ApiModelProperty(value = "")
  public String getOriginalBatchNumber() {
    return originalBatchNumber;
  }

  public void setOriginalBatchNumber(String originalBatchNumber) {
    this.originalBatchNumber = originalBatchNumber;
  }

  public JournalTransactionDto debitTotal(Double debitTotal) {
    this.debitTotal = debitTotal;
    return this;
  }

   /**
   * Get debitTotal
   * @return debitTotal
  **/
  @ApiModelProperty(value = "")
  public Double getDebitTotal() {
    return debitTotal;
  }

  public void setDebitTotal(Double debitTotal) {
    this.debitTotal = debitTotal;
  }

  public JournalTransactionDto debitTotalInCurrency(Double debitTotalInCurrency) {
    this.debitTotalInCurrency = debitTotalInCurrency;
    return this;
  }

   /**
   * Get debitTotalInCurrency
   * @return debitTotalInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getDebitTotalInCurrency() {
    return debitTotalInCurrency;
  }

  public void setDebitTotalInCurrency(Double debitTotalInCurrency) {
    this.debitTotalInCurrency = debitTotalInCurrency;
  }

  public JournalTransactionDto creditTotal(Double creditTotal) {
    this.creditTotal = creditTotal;
    return this;
  }

   /**
   * Get creditTotal
   * @return creditTotal
  **/
  @ApiModelProperty(value = "")
  public Double getCreditTotal() {
    return creditTotal;
  }

  public void setCreditTotal(Double creditTotal) {
    this.creditTotal = creditTotal;
  }

  public JournalTransactionDto creditTotalInCurrency(Double creditTotalInCurrency) {
    this.creditTotalInCurrency = creditTotalInCurrency;
    return this;
  }

   /**
   * Get creditTotalInCurrency
   * @return creditTotalInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getCreditTotalInCurrency() {
    return creditTotalInCurrency;
  }

  public void setCreditTotalInCurrency(Double creditTotalInCurrency) {
    this.creditTotalInCurrency = creditTotalInCurrency;
  }

  public JournalTransactionDto controlTotal(Double controlTotal) {
    this.controlTotal = controlTotal;
    return this;
  }

   /**
   * Get controlTotal
   * @return controlTotal
  **/
  @ApiModelProperty(value = "")
  public Double getControlTotal() {
    return controlTotal;
  }

  public void setControlTotal(Double controlTotal) {
    this.controlTotal = controlTotal;
  }

  public JournalTransactionDto controlTotalInCurrency(Double controlTotalInCurrency) {
    this.controlTotalInCurrency = controlTotalInCurrency;
    return this;
  }

   /**
   * Get controlTotalInCurrency
   * @return controlTotalInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getControlTotalInCurrency() {
    return controlTotalInCurrency;
  }

  public void setControlTotalInCurrency(Double controlTotalInCurrency) {
    this.controlTotalInCurrency = controlTotalInCurrency;
  }

  public JournalTransactionDto createVatTransaction(Boolean createVatTransaction) {
    this.createVatTransaction = createVatTransaction;
    return this;
  }

   /**
   * Get createVatTransaction
   * @return createVatTransaction
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateVatTransaction() {
    return createVatTransaction;
  }

  public void setCreateVatTransaction(Boolean createVatTransaction) {
    this.createVatTransaction = createVatTransaction;
  }

  public JournalTransactionDto skipVatAmountValidation(Boolean skipVatAmountValidation) {
    this.skipVatAmountValidation = skipVatAmountValidation;
    return this;
  }

   /**
   * Get skipVatAmountValidation
   * @return skipVatAmountValidation
  **/
  @ApiModelProperty(value = "")
  public Boolean isSkipVatAmountValidation() {
    return skipVatAmountValidation;
  }

  public void setSkipVatAmountValidation(Boolean skipVatAmountValidation) {
    this.skipVatAmountValidation = skipVatAmountValidation;
  }

  public JournalTransactionDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public JournalTransactionDto transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @ApiModelProperty(value = "")
  public String getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }

  public JournalTransactionDto transactionCodeDescription(String transactionCodeDescription) {
    this.transactionCodeDescription = transactionCodeDescription;
    return this;
  }

   /**
   * Get transactionCodeDescription
   * @return transactionCodeDescription
  **/
  @ApiModelProperty(value = "")
  public String getTransactionCodeDescription() {
    return transactionCodeDescription;
  }

  public void setTransactionCodeDescription(String transactionCodeDescription) {
    this.transactionCodeDescription = transactionCodeDescription;
  }

  public JournalTransactionDto branch(String branch) {
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

  public JournalTransactionDto journalTransactionLines(List<JournalTransactionLineDto> journalTransactionLines) {
    this.journalTransactionLines = journalTransactionLines;
    return this;
  }

  public JournalTransactionDto addJournalTransactionLinesItem(JournalTransactionLineDto journalTransactionLinesItem) {
    if (this.journalTransactionLines == null) {
      this.journalTransactionLines = new ArrayList<>();
    }
    this.journalTransactionLines.add(journalTransactionLinesItem);
    return this;
  }

   /**
   * Get journalTransactionLines
   * @return journalTransactionLines
  **/
  @ApiModelProperty(value = "")
  public List<JournalTransactionLineDto> getJournalTransactionLines() {
    return journalTransactionLines;
  }

  public void setJournalTransactionLines(List<JournalTransactionLineDto> journalTransactionLines) {
    this.journalTransactionLines = journalTransactionLines;
  }

  public JournalTransactionDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public JournalTransactionDto addAttachmentsItem(AttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<AttachmentDto> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
  }

  public JournalTransactionDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public JournalTransactionDto putExtrasItem(String key, Object extrasItem) {
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

  public JournalTransactionDto errorInfo(String errorInfo) {
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
    JournalTransactionDto journalTransactionDto = (JournalTransactionDto) o;
    return Objects.equals(this.module, journalTransactionDto.module) &&
        Objects.equals(this.batchNumber, journalTransactionDto.batchNumber) &&
        Objects.equals(this.status, journalTransactionDto.status) &&
        Objects.equals(this.hold, journalTransactionDto.hold) &&
        Objects.equals(this.transactionDate, journalTransactionDto.transactionDate) &&
        Objects.equals(this.postPeriod, journalTransactionDto.postPeriod) &&
        Objects.equals(this.financialPeriod, journalTransactionDto.financialPeriod) &&
        Objects.equals(this.ledger, journalTransactionDto.ledger) &&
        Objects.equals(this.ledgerDescription, journalTransactionDto.ledgerDescription) &&
        Objects.equals(this.currencyId, journalTransactionDto.currencyId) &&
        Objects.equals(this.exchangeRate, journalTransactionDto.exchangeRate) &&
        Objects.equals(this.autoReversing, journalTransactionDto.autoReversing) &&
        Objects.equals(this.reversingEntry, journalTransactionDto.reversingEntry) &&
        Objects.equals(this.description, journalTransactionDto.description) &&
        Objects.equals(this.originalBatchNumber, journalTransactionDto.originalBatchNumber) &&
        Objects.equals(this.debitTotal, journalTransactionDto.debitTotal) &&
        Objects.equals(this.debitTotalInCurrency, journalTransactionDto.debitTotalInCurrency) &&
        Objects.equals(this.creditTotal, journalTransactionDto.creditTotal) &&
        Objects.equals(this.creditTotalInCurrency, journalTransactionDto.creditTotalInCurrency) &&
        Objects.equals(this.controlTotal, journalTransactionDto.controlTotal) &&
        Objects.equals(this.controlTotalInCurrency, journalTransactionDto.controlTotalInCurrency) &&
        Objects.equals(this.createVatTransaction, journalTransactionDto.createVatTransaction) &&
        Objects.equals(this.skipVatAmountValidation, journalTransactionDto.skipVatAmountValidation) &&
        Objects.equals(this.lastModifiedDateTime, journalTransactionDto.lastModifiedDateTime) &&
        Objects.equals(this.transactionCode, journalTransactionDto.transactionCode) &&
        Objects.equals(this.transactionCodeDescription, journalTransactionDto.transactionCodeDescription) &&
        Objects.equals(this.branch, journalTransactionDto.branch) &&
        Objects.equals(this.journalTransactionLines, journalTransactionDto.journalTransactionLines) &&
        Objects.equals(this.attachments, journalTransactionDto.attachments) &&
        Objects.equals(this.extras, journalTransactionDto.extras) &&
        Objects.equals(this.errorInfo, journalTransactionDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, batchNumber, status, hold, transactionDate, postPeriod, financialPeriod, ledger, ledgerDescription, currencyId, exchangeRate, autoReversing, reversingEntry, description, originalBatchNumber, debitTotal, debitTotalInCurrency, creditTotal, creditTotalInCurrency, controlTotal, controlTotalInCurrency, createVatTransaction, skipVatAmountValidation, lastModifiedDateTime, transactionCode, transactionCodeDescription, branch, journalTransactionLines, attachments, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalTransactionDto {\n");
    
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    postPeriod: ").append(toIndentedString(postPeriod)).append("\n");
    sb.append("    financialPeriod: ").append(toIndentedString(financialPeriod)).append("\n");
    sb.append("    ledger: ").append(toIndentedString(ledger)).append("\n");
    sb.append("    ledgerDescription: ").append(toIndentedString(ledgerDescription)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    autoReversing: ").append(toIndentedString(autoReversing)).append("\n");
    sb.append("    reversingEntry: ").append(toIndentedString(reversingEntry)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    originalBatchNumber: ").append(toIndentedString(originalBatchNumber)).append("\n");
    sb.append("    debitTotal: ").append(toIndentedString(debitTotal)).append("\n");
    sb.append("    debitTotalInCurrency: ").append(toIndentedString(debitTotalInCurrency)).append("\n");
    sb.append("    creditTotal: ").append(toIndentedString(creditTotal)).append("\n");
    sb.append("    creditTotalInCurrency: ").append(toIndentedString(creditTotalInCurrency)).append("\n");
    sb.append("    controlTotal: ").append(toIndentedString(controlTotal)).append("\n");
    sb.append("    controlTotalInCurrency: ").append(toIndentedString(controlTotalInCurrency)).append("\n");
    sb.append("    createVatTransaction: ").append(toIndentedString(createVatTransaction)).append("\n");
    sb.append("    skipVatAmountValidation: ").append(toIndentedString(skipVatAmountValidation)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    transactionCodeDescription: ").append(toIndentedString(transactionCodeDescription)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    journalTransactionLines: ").append(toIndentedString(journalTransactionLines)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

