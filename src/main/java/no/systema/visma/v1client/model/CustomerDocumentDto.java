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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.systema.visma.v1client.model.AccountNumberDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.CustomerNumberDto;
import no.systema.visma.v1client.model.LocationDescriptionDto;
import no.systema.visma.v1client.model.PaymentMethodIdDescriptionDto;
import no.systema.visma.v1client.model.ProjectIdDescriptionDto;
import no.systema.visma.v1client.model.SubAccountDto;

/**
 * CustomerDocumentDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CustomerDocumentDto {
  @JsonProperty("documentDueDate")
  private LocalDateTime documentDueDate = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("customer")
  private CustomerNumberDto customer = null;

  /**
   * Gets or Sets documentType
   */
  public enum DocumentTypeEnum {
    INVOICE("Invoice"),
    
    DEBITNOTE("DebitNote"),
    
    CREDITNOTE("CreditNote"),
    
    PAYMENT("Payment"),
    
    VOIDPAYMENT("VoidPayment"),
    
    PREPAYMENT("Prepayment"),
    
    REFUND("Refund"),
    
    FINCHARGE("FinCharge"),
    
    SMALLBALANCEWO("SmallBalanceWo"),
    
    SMALLCREDITWO("SmallCreditWo"),
    
    CASHSALE("CashSale"),
    
    CASHRETURN("CashReturn"),
    
    UNDEFINED("Undefined"),
    
    NOUPDATE("NoUpdate");

    private String value;

    DocumentTypeEnum(String value) {
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
    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("documentType")
  private DocumentTypeEnum documentType = null;

  @JsonProperty("referenceNumber")
  private String referenceNumber = null;

  @JsonProperty("postPeriod")
  private String postPeriod = null;

  @JsonProperty("financialPeriod")
  private String financialPeriod = null;

  @JsonProperty("closedFinancialPeriod")
  private String closedFinancialPeriod = null;

  @JsonProperty("documentDate")
  private LocalDateTime documentDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    HOLD("Hold"),
    
    BALANCED("Balanced"),
    
    VOIDED("Voided"),
    
    SCHEDULED("Scheduled"),
    
    OPEN("Open"),
    
    CLOSED("Closed"),
    
    PENDINGPRINT("PendingPrint"),
    
    PENDINGEMAIL("PendingEmail"),
    
    CREDITHOLD("CreditHold"),
    
    CCHOLD("CcHold"),
    
    RESERVED("Reserved");

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

  @JsonProperty("currencyId")
  private String currencyId = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("amountInCurrency")
  private Double amountInCurrency = null;

  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("balanceInCurrency")
  private Double balanceInCurrency = null;

  @JsonProperty("cashDiscount")
  private Double cashDiscount = null;

  @JsonProperty("cashDiscountInCurrency")
  private Double cashDiscountInCurrency = null;

  @JsonProperty("paymentMethod")
  private PaymentMethodIdDescriptionDto paymentMethod = null;

  @JsonProperty("customerRefNumber")
  private String customerRefNumber = null;

  @JsonProperty("invoiceText")
  private String invoiceText = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  @JsonProperty("createdDateTime")
  private LocalDateTime createdDateTime = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("vatTotal")
  private Double vatTotal = null;

  @JsonProperty("vatTotalInCurrency")
  private Double vatTotalInCurrency = null;

  @JsonProperty("location")
  private LocationDescriptionDto location = null;

  @JsonProperty("branchNumber")
  private BranchNumberDto branchNumber = null;

  @JsonProperty("cashAccount")
  private String cashAccount = null;

  @JsonProperty("project")
  private ProjectIdDescriptionDto project = null;

  @JsonProperty("account")
  private AccountNumberDto account = null;

  @JsonProperty("subaccount")
  private SubAccountDto subaccount = null;

  @JsonProperty("extras")
  private Map<String, Object> extras = null;

  @JsonProperty("errorInfo")
  private String errorInfo = null;

  public CustomerDocumentDto documentDueDate(LocalDateTime documentDueDate) {
    this.documentDueDate = documentDueDate;
    return this;
  }

   /**
   * Get documentDueDate
   * @return documentDueDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getDocumentDueDate() {
    return documentDueDate;
  }

  public void setDocumentDueDate(LocalDateTime documentDueDate) {
    this.documentDueDate = documentDueDate;
  }

  public CustomerDocumentDto branch(BranchNumberDto branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Branch is deprecated, please use BranchNumber instead.
   * @return branch
  **/
  @ApiModelProperty(value = "Branch is deprecated, please use BranchNumber instead.")
  public BranchNumberDto getBranch() {
    return branch;
  }

  public void setBranch(BranchNumberDto branch) {
    this.branch = branch;
  }

  public CustomerDocumentDto customer(CustomerNumberDto customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The customer associated with the document.
   * @return customer
  **/
  @ApiModelProperty(value = "The customer associated with the document.")
  public CustomerNumberDto getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerNumberDto customer) {
    this.customer = customer;
  }

  public CustomerDocumentDto documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public CustomerDocumentDto referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The reference number of the Accounts Receivable document in the system.
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "The reference number of the Accounts Receivable document in the system.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public CustomerDocumentDto postPeriod(String postPeriod) {
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

  public CustomerDocumentDto financialPeriod(String financialPeriod) {
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

  public CustomerDocumentDto closedFinancialPeriod(String closedFinancialPeriod) {
    this.closedFinancialPeriod = closedFinancialPeriod;
    return this;
  }

   /**
   * Format YYYYMM.
   * @return closedFinancialPeriod
  **/
  @ApiModelProperty(value = "Format YYYYMM.")
  public String getClosedFinancialPeriod() {
    return closedFinancialPeriod;
  }

  public void setClosedFinancialPeriod(String closedFinancialPeriod) {
    this.closedFinancialPeriod = closedFinancialPeriod;
  }

  public CustomerDocumentDto documentDate(LocalDateTime documentDate) {
    this.documentDate = documentDate;
    return this;
  }

   /**
   * The date when the Accounts Receivable document was created.   By default, for a new document, it is the current business date, but you can change the date.
   * @return documentDate
  **/
  @ApiModelProperty(value = "The date when the Accounts Receivable document was created.   By default, for a new document, it is the current business date, but you can change the date.")
  public LocalDateTime getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(LocalDateTime documentDate) {
    this.documentDate = documentDate;
  }

  public CustomerDocumentDto status(StatusEnum status) {
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

  public CustomerDocumentDto currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * The currency of the document. By default, it is the customer&#39;s default currency,  but it can be changed if the Allow Currency Override check box is selected on   the Customers
   * @return currencyId
  **/
  @ApiModelProperty(value = "The currency of the document. By default, it is the customer's default currency,  but it can be changed if the Allow Currency Override check box is selected on   the Customers")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public CustomerDocumentDto amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount paid by the document. The value appears for new documents if the   Validate Document Totals on Entry check box is selected on the Accounts Receivable Preferences screen.  If the check box is cleared, then the value appears when the document status is Open.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount paid by the document. The value appears for new documents if the   Validate Document Totals on Entry check box is selected on the Accounts Receivable Preferences screen.  If the check box is cleared, then the value appears when the document status is Open.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CustomerDocumentDto amountInCurrency(Double amountInCurrency) {
    this.amountInCurrency = amountInCurrency;
    return this;
  }

   /**
   * Get amountInCurrency
   * @return amountInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getAmountInCurrency() {
    return amountInCurrency;
  }

  public void setAmountInCurrency(Double amountInCurrency) {
    this.amountInCurrency = amountInCurrency;
  }

  public CustomerDocumentDto balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * For an open Accounts Receivable document, the balance after any cash discount was taken.  For a document used in the application process, this is the balance  after the payments were applied.
   * @return balance
  **/
  @ApiModelProperty(value = "For an open Accounts Receivable document, the balance after any cash discount was taken.  For a document used in the application process, this is the balance  after the payments were applied.")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public CustomerDocumentDto balanceInCurrency(Double balanceInCurrency) {
    this.balanceInCurrency = balanceInCurrency;
    return this;
  }

   /**
   * Get balanceInCurrency
   * @return balanceInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getBalanceInCurrency() {
    return balanceInCurrency;
  }

  public void setBalanceInCurrency(Double balanceInCurrency) {
    this.balanceInCurrency = balanceInCurrency;
  }

  public CustomerDocumentDto cashDiscount(Double cashDiscount) {
    this.cashDiscount = cashDiscount;
    return this;
  }

   /**
   * The cash discount amount that has been or will be taken on the document, which  the system calculates based on the specified credit terms.
   * @return cashDiscount
  **/
  @ApiModelProperty(value = "The cash discount amount that has been or will be taken on the document, which  the system calculates based on the specified credit terms.")
  public Double getCashDiscount() {
    return cashDiscount;
  }

  public void setCashDiscount(Double cashDiscount) {
    this.cashDiscount = cashDiscount;
  }

  public CustomerDocumentDto cashDiscountInCurrency(Double cashDiscountInCurrency) {
    this.cashDiscountInCurrency = cashDiscountInCurrency;
    return this;
  }

   /**
   * Get cashDiscountInCurrency
   * @return cashDiscountInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getCashDiscountInCurrency() {
    return cashDiscountInCurrency;
  }

  public void setCashDiscountInCurrency(Double cashDiscountInCurrency) {
    this.cashDiscountInCurrency = cashDiscountInCurrency;
  }

  public CustomerDocumentDto paymentMethod(PaymentMethodIdDescriptionDto paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodIdDescriptionDto getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodIdDescriptionDto paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public CustomerDocumentDto customerRefNumber(String customerRefNumber) {
    this.customerRefNumber = customerRefNumber;
    return this;
  }

   /**
   * Get customerRefNumber
   * @return customerRefNumber
  **/
  @ApiModelProperty(value = "")
  public String getCustomerRefNumber() {
    return customerRefNumber;
  }

  public void setCustomerRefNumber(String customerRefNumber) {
    this.customerRefNumber = customerRefNumber;
  }

  public CustomerDocumentDto invoiceText(String invoiceText) {
    this.invoiceText = invoiceText;
    return this;
  }

   /**
   * Any user-provided description of the Accounts Receivable document.
   * @return invoiceText
  **/
  @ApiModelProperty(value = "Any user-provided description of the Accounts Receivable document.")
  public String getInvoiceText() {
    return invoiceText;
  }

  public void setInvoiceText(String invoiceText) {
    this.invoiceText = invoiceText;
  }

  public CustomerDocumentDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
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

  public CustomerDocumentDto createdDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public CustomerDocumentDto note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public CustomerDocumentDto vatTotal(Double vatTotal) {
    this.vatTotal = vatTotal;
    return this;
  }

   /**
   * The document vat amount, as defined on the Tax Details tab.
   * @return vatTotal
  **/
  @ApiModelProperty(value = "The document vat amount, as defined on the Tax Details tab.")
  public Double getVatTotal() {
    return vatTotal;
  }

  public void setVatTotal(Double vatTotal) {
    this.vatTotal = vatTotal;
  }

  public CustomerDocumentDto vatTotalInCurrency(Double vatTotalInCurrency) {
    this.vatTotalInCurrency = vatTotalInCurrency;
    return this;
  }

   /**
   * Get vatTotalInCurrency
   * @return vatTotalInCurrency
  **/
  @ApiModelProperty(value = "")
  public Double getVatTotalInCurrency() {
    return vatTotalInCurrency;
  }

  public void setVatTotalInCurrency(Double vatTotalInCurrency) {
    this.vatTotalInCurrency = vatTotalInCurrency;
  }

  public CustomerDocumentDto location(LocationDescriptionDto location) {
    this.location = location;
    return this;
  }

   /**
   * The location of the customer related to the document. By default, it is the default  location of the selected customer or, if the invoice is created from an opportunity,  it is the customer location specified for the opportunity.
   * @return location
  **/
  @ApiModelProperty(value = "The location of the customer related to the document. By default, it is the default  location of the selected customer or, if the invoice is created from an opportunity,  it is the customer location specified for the opportunity.")
  public LocationDescriptionDto getLocation() {
    return location;
  }

  public void setLocation(LocationDescriptionDto location) {
    this.location = location;
  }

  public CustomerDocumentDto branchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * The branch with which this invoice or memo is associated.
   * @return branchNumber
  **/
  @ApiModelProperty(value = "The branch with which this invoice or memo is associated.")
  public BranchNumberDto getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(BranchNumberDto branchNumber) {
    this.branchNumber = branchNumber;
  }

  public CustomerDocumentDto cashAccount(String cashAccount) {
    this.cashAccount = cashAccount;
    return this;
  }

   /**
   * The cash account associated with the payment method.
   * @return cashAccount
  **/
  @ApiModelProperty(value = "The cash account associated with the payment method.")
  public String getCashAccount() {
    return cashAccount;
  }

  public void setCashAccount(String cashAccount) {
    this.cashAccount = cashAccount;
  }

  public CustomerDocumentDto project(ProjectIdDescriptionDto project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public ProjectIdDescriptionDto getProject() {
    return project;
  }

  public void setProject(ProjectIdDescriptionDto project) {
    this.project = project;
  }

  public CustomerDocumentDto account(AccountNumberDto account) {
    this.account = account;
    return this;
  }

   /**
   * The liability account specified as the AR account for the selected location of the customer.
   * @return account
  **/
  @ApiModelProperty(value = "The liability account specified as the AR account for the selected location of the customer.")
  public AccountNumberDto getAccount() {
    return account;
  }

  public void setAccount(AccountNumberDto account) {
    this.account = account;
  }

  public CustomerDocumentDto subaccount(SubAccountDto subaccount) {
    this.subaccount = subaccount;
    return this;
  }

   /**
   * The corresponding subaccount used for the customer.
   * @return subaccount
  **/
  @ApiModelProperty(value = "The corresponding subaccount used for the customer.")
  public SubAccountDto getSubaccount() {
    return subaccount;
  }

  public void setSubaccount(SubAccountDto subaccount) {
    this.subaccount = subaccount;
  }

  public CustomerDocumentDto extras(Map<String, Object> extras) {
    this.extras = extras;
    return this;
  }

  public CustomerDocumentDto putExtrasItem(String key, Object extrasItem) {
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

  public CustomerDocumentDto errorInfo(String errorInfo) {
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
    CustomerDocumentDto customerDocumentDto = (CustomerDocumentDto) o;
    return Objects.equals(this.documentDueDate, customerDocumentDto.documentDueDate) &&
        Objects.equals(this.branch, customerDocumentDto.branch) &&
        Objects.equals(this.customer, customerDocumentDto.customer) &&
        Objects.equals(this.documentType, customerDocumentDto.documentType) &&
        Objects.equals(this.referenceNumber, customerDocumentDto.referenceNumber) &&
        Objects.equals(this.postPeriod, customerDocumentDto.postPeriod) &&
        Objects.equals(this.financialPeriod, customerDocumentDto.financialPeriod) &&
        Objects.equals(this.closedFinancialPeriod, customerDocumentDto.closedFinancialPeriod) &&
        Objects.equals(this.documentDate, customerDocumentDto.documentDate) &&
        Objects.equals(this.status, customerDocumentDto.status) &&
        Objects.equals(this.currencyId, customerDocumentDto.currencyId) &&
        Objects.equals(this.amount, customerDocumentDto.amount) &&
        Objects.equals(this.amountInCurrency, customerDocumentDto.amountInCurrency) &&
        Objects.equals(this.balance, customerDocumentDto.balance) &&
        Objects.equals(this.balanceInCurrency, customerDocumentDto.balanceInCurrency) &&
        Objects.equals(this.cashDiscount, customerDocumentDto.cashDiscount) &&
        Objects.equals(this.cashDiscountInCurrency, customerDocumentDto.cashDiscountInCurrency) &&
        Objects.equals(this.paymentMethod, customerDocumentDto.paymentMethod) &&
        Objects.equals(this.customerRefNumber, customerDocumentDto.customerRefNumber) &&
        Objects.equals(this.invoiceText, customerDocumentDto.invoiceText) &&
        Objects.equals(this.lastModifiedDateTime, customerDocumentDto.lastModifiedDateTime) &&
        Objects.equals(this.createdDateTime, customerDocumentDto.createdDateTime) &&
        Objects.equals(this.note, customerDocumentDto.note) &&
        Objects.equals(this.vatTotal, customerDocumentDto.vatTotal) &&
        Objects.equals(this.vatTotalInCurrency, customerDocumentDto.vatTotalInCurrency) &&
        Objects.equals(this.location, customerDocumentDto.location) &&
        Objects.equals(this.branchNumber, customerDocumentDto.branchNumber) &&
        Objects.equals(this.cashAccount, customerDocumentDto.cashAccount) &&
        Objects.equals(this.project, customerDocumentDto.project) &&
        Objects.equals(this.account, customerDocumentDto.account) &&
        Objects.equals(this.subaccount, customerDocumentDto.subaccount) &&
        Objects.equals(this.extras, customerDocumentDto.extras) &&
        Objects.equals(this.errorInfo, customerDocumentDto.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDueDate, branch, customer, documentType, referenceNumber, postPeriod, financialPeriod, closedFinancialPeriod, documentDate, status, currencyId, amount, amountInCurrency, balance, balanceInCurrency, cashDiscount, cashDiscountInCurrency, paymentMethod, customerRefNumber, invoiceText, lastModifiedDateTime, createdDateTime, note, vatTotal, vatTotalInCurrency, location, branchNumber, cashAccount, project, account, subaccount, extras, errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDocumentDto {\n");
    
    sb.append("    documentDueDate: ").append(toIndentedString(documentDueDate)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    postPeriod: ").append(toIndentedString(postPeriod)).append("\n");
    sb.append("    financialPeriod: ").append(toIndentedString(financialPeriod)).append("\n");
    sb.append("    closedFinancialPeriod: ").append(toIndentedString(closedFinancialPeriod)).append("\n");
    sb.append("    documentDate: ").append(toIndentedString(documentDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountInCurrency: ").append(toIndentedString(amountInCurrency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceInCurrency: ").append(toIndentedString(balanceInCurrency)).append("\n");
    sb.append("    cashDiscount: ").append(toIndentedString(cashDiscount)).append("\n");
    sb.append("    cashDiscountInCurrency: ").append(toIndentedString(cashDiscountInCurrency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    customerRefNumber: ").append(toIndentedString(customerRefNumber)).append("\n");
    sb.append("    invoiceText: ").append(toIndentedString(invoiceText)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    vatTotal: ").append(toIndentedString(vatTotal)).append("\n");
    sb.append("    vatTotalInCurrency: ").append(toIndentedString(vatTotalInCurrency)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    cashAccount: ").append(toIndentedString(cashAccount)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    subaccount: ").append(toIndentedString(subaccount)).append("\n");
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

