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
import java.util.UUID;
import no.systema.visma.v1client.model.AccountNumberDto;
import no.systema.visma.v1client.model.AttachmentDto;
import no.systema.visma.v1client.model.BranchNumberDto;
import no.systema.visma.v1client.model.CustomerNumberDto;
import no.systema.visma.v1client.model.InventoryNumberDescriptionDto;
import no.systema.visma.v1client.model.LocationNameDescriptionDto;
import no.systema.visma.v1client.model.ProjectIdDescriptionDto;
import no.systema.visma.v1client.model.ProjectTaskIdDescriptionDto;
import no.systema.visma.v1client.model.SubAccountDescriptionDto;
import no.systema.visma.v1client.model.TaxCategoryNumberDescriptionDto;

/**
 * ExpenseClaimDetailDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ExpenseClaimDetailDto {
  @JsonProperty("claimDetailId")
  private Integer claimDetailId = null;

  @JsonProperty("lineId")
  private UUID lineId = null;

  @JsonProperty("date")
  private LocalDateTime date = null;

  @JsonProperty("expenseItem")
  private InventoryNumberDescriptionDto expenseItem = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("uom")
  private String uom = null;

  @JsonProperty("unitCost")
  private Double unitCost = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("invoiceable")
  private Boolean invoiceable = null;

  @JsonProperty("claimAmount")
  private Double claimAmount = null;

  @JsonProperty("amountInClaimCurr")
  private Double amountInClaimCurr = null;

  @JsonProperty("project")
  private ProjectIdDescriptionDto project = null;

  @JsonProperty("projectTask")
  private ProjectTaskIdDescriptionDto projectTask = null;

  @JsonProperty("expenseAccount")
  private AccountNumberDto expenseAccount = null;

  @JsonProperty("expenseSubaccount")
  private SubAccountDescriptionDto expenseSubaccount = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("taxCategory")
  private TaxCategoryNumberDescriptionDto taxCategory = null;

  @JsonProperty("refNbr")
  private String refNbr = null;

  @JsonProperty("salesAccount")
  private AccountNumberDto salesAccount = null;

  @JsonProperty("salesSubaccount")
  private SubAccountDescriptionDto salesSubaccount = null;

  @JsonProperty("employeePart")
  private Double employeePart = null;

  @JsonProperty("customer")
  private CustomerNumberDto customer = null;

  @JsonProperty("location")
  private LocationNameDescriptionDto location = null;

  @JsonProperty("arReferenceNbr")
  private String arReferenceNbr = null;

  /**
   * The approval status, which indicates whether the detail row requires approval and, if it does, what the current state of approval is.
   */
  public enum ApprovalStatusEnum {
    NEW("New"),
    
    CANCELED("Canceled"),
    
    SENTTOAPPROVAL("SentToApproval"),
    
    RECEIVEDBYAPPROVAL("ReceivedByApproval"),
    
    INPROGRESSAPPROVAL("InProgressApproval"),
    
    REJECTEDINAPPROVAL("RejectedInApproval"),
    
    APPROVEDINAPPROVAL("ApprovedInApproval"),
    
    ACTIVEWORKFLOWAPPROVAL("ActiveWorkflowApproval");

    private String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String text) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("approvalStatus")
  private ApprovalStatusEnum approvalStatus = null;

  @JsonProperty("approvalStatusText")
  private String approvalStatusText = null;

  @JsonProperty("approver")
  private String approver = null;

  @JsonProperty("attachments")
  private List<AttachmentDto> attachments = null;

  public ExpenseClaimDetailDto claimDetailId(Integer claimDetailId) {
    this.claimDetailId = claimDetailId;
    return this;
  }

   /**
   * Identifies the expense claim detail id, necessary when updatind detail information
   * @return claimDetailId
  **/
  @ApiModelProperty(value = "Identifies the expense claim detail id, necessary when updatind detail information")
  public Integer getClaimDetailId() {
    return claimDetailId;
  }

  public void setClaimDetailId(Integer claimDetailId) {
    this.claimDetailId = claimDetailId;
  }

  public ExpenseClaimDetailDto lineId(UUID lineId) {
    this.lineId = lineId;
    return this;
  }

   /**
   * The expense claim line id
   * @return lineId
  **/
  @ApiModelProperty(value = "The expense claim line id")
  public UUID getLineId() {
    return lineId;
  }

  public void setLineId(UUID lineId) {
    this.lineId = lineId;
  }

  public ExpenseClaimDetailDto date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date when the expense was incurred.
   * @return date
  **/
  @ApiModelProperty(value = "The date when the expense was incurred.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public ExpenseClaimDetailDto expenseItem(InventoryNumberDescriptionDto expenseItem) {
    this.expenseItem = expenseItem;
    return this;
  }

   /**
   * The expense identifier, if an expense of this type is listed as an inventory nonstock item.
   * @return expenseItem
  **/
  @ApiModelProperty(value = "The expense identifier, if an expense of this type is listed as an inventory nonstock item.")
  public InventoryNumberDescriptionDto getExpenseItem() {
    return expenseItem;
  }

  public void setExpenseItem(InventoryNumberDescriptionDto expenseItem) {
    this.expenseItem = expenseItem;
  }

  public ExpenseClaimDetailDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the transaction.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the transaction.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExpenseClaimDetailDto quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this expense item.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of this expense item.")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public ExpenseClaimDetailDto uom(String uom) {
    this.uom = uom;
    return this;
  }

   /**
   * The unit of measure in which the quantity is shown.
   * @return uom
  **/
  @ApiModelProperty(value = "The unit of measure in which the quantity is shown.")
  public String getUom() {
    return uom;
  }

  public void setUom(String uom) {
    this.uom = uom;
  }

  public ExpenseClaimDetailDto unitCost(Double unitCost) {
    this.unitCost = unitCost;
    return this;
  }

   /**
   * The cost of a unit of the item.
   * @return unitCost
  **/
  @ApiModelProperty(value = "The cost of a unit of the item.")
  public Double getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(Double unitCost) {
    this.unitCost = unitCost;
  }

  public ExpenseClaimDetailDto currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the expense receipt. However, if you enter a claim line directly, the currency value is read-only and matching the claim currency.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency of the expense receipt. However, if you enter a claim line directly, the currency value is read-only and matching the claim currency.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ExpenseClaimDetailDto totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total amount paid for the expense item in the specified quantity.
   * @return totalAmount
  **/
  @ApiModelProperty(value = "The total amount paid for the expense item in the specified quantity.")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ExpenseClaimDetailDto invoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * A check box that, if selected, indicates that the claim amount is invoiceable to the customer (the total amount minus the employee&#39;s part).
   * @return invoiceable
  **/
  @ApiModelProperty(value = "A check box that, if selected, indicates that the claim amount is invoiceable to the customer (the total amount minus the employee's part).")
  public Boolean isInvoiceable() {
    return invoiceable;
  }

  public void setInvoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
  }

  public ExpenseClaimDetailDto claimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
    return this;
  }

   /**
   * The amount claimed by the employee, which is calculated as the total claim amount minus the employee part.
   * @return claimAmount
  **/
  @ApiModelProperty(value = "The amount claimed by the employee, which is calculated as the total claim amount minus the employee part.")
  public Double getClaimAmount() {
    return claimAmount;
  }

  public void setClaimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
  }

  public ExpenseClaimDetailDto amountInClaimCurr(Double amountInClaimCurr) {
    this.amountInClaimCurr = amountInClaimCurr;
    return this;
  }

   /**
   * The amount claimed by the employee, which is expressed in the currency of the expense claim.
   * @return amountInClaimCurr
  **/
  @ApiModelProperty(value = "The amount claimed by the employee, which is expressed in the currency of the expense claim.")
  public Double getAmountInClaimCurr() {
    return amountInClaimCurr;
  }

  public void setAmountInClaimCurr(Double amountInClaimCurr) {
    this.amountInClaimCurr = amountInClaimCurr;
  }

  public ExpenseClaimDetailDto project(ProjectIdDescriptionDto project) {
    this.project = project;
    return this;
  }

   /**
   * The project or customer contract associated with the expense claim, if the work performed was for a project or contract. Project Task The task associated with the contract or project.
   * @return project
  **/
  @ApiModelProperty(value = "The project or customer contract associated with the expense claim, if the work performed was for a project or contract. Project Task The task associated with the contract or project.")
  public ProjectIdDescriptionDto getProject() {
    return project;
  }

  public void setProject(ProjectIdDescriptionDto project) {
    this.project = project;
  }

  public ExpenseClaimDetailDto projectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * The task associated with the contract or project.
   * @return projectTask
  **/
  @ApiModelProperty(value = "The task associated with the contract or project.")
  public ProjectTaskIdDescriptionDto getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
  }

  public ExpenseClaimDetailDto expenseAccount(AccountNumberDto expenseAccount) {
    this.expenseAccount = expenseAccount;
    return this;
  }

   /**
   * The expense account to which the system should record the part of the expense to be paid back to the employee.
   * @return expenseAccount
  **/
  @ApiModelProperty(value = "The expense account to which the system should record the part of the expense to be paid back to the employee.")
  public AccountNumberDto getExpenseAccount() {
    return expenseAccount;
  }

  public void setExpenseAccount(AccountNumberDto expenseAccount) {
    this.expenseAccount = expenseAccount;
  }

  public ExpenseClaimDetailDto expenseSubaccount(SubAccountDescriptionDto expenseSubaccount) {
    this.expenseSubaccount = expenseSubaccount;
    return this;
  }

   /**
   * The corresponding subaccount the system uses to record the part of the expense to be paid back to the employee.
   * @return expenseSubaccount
  **/
  @ApiModelProperty(value = "The corresponding subaccount the system uses to record the part of the expense to be paid back to the employee.")
  public SubAccountDescriptionDto getExpenseSubaccount() {
    return expenseSubaccount;
  }

  public void setExpenseSubaccount(SubAccountDescriptionDto expenseSubaccount) {
    this.expenseSubaccount = expenseSubaccount;
  }

  public ExpenseClaimDetailDto branch(BranchNumberDto branch) {
    this.branch = branch;
    return this;
  }

   /**
   * The branch that will reimburse the expenses to the employee.
   * @return branch
  **/
  @ApiModelProperty(value = "The branch that will reimburse the expenses to the employee.")
  public BranchNumberDto getBranch() {
    return branch;
  }

  public void setBranch(BranchNumberDto branch) {
    this.branch = branch;
  }

  public ExpenseClaimDetailDto taxCategory(TaxCategoryNumberDescriptionDto taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

   /**
   * The tax category associated with the expense item.
   * @return taxCategory
  **/
  @ApiModelProperty(value = "The tax category associated with the expense item.")
  public TaxCategoryNumberDescriptionDto getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(TaxCategoryNumberDescriptionDto taxCategory) {
    this.taxCategory = taxCategory;
  }

  public ExpenseClaimDetailDto refNbr(String refNbr) {
    this.refNbr = refNbr;
    return this;
  }

   /**
   * The identifier of the transaction.
   * @return refNbr
  **/
  @ApiModelProperty(value = "The identifier of the transaction.")
  public String getRefNbr() {
    return refNbr;
  }

  public void setRefNbr(String refNbr) {
    this.refNbr = refNbr;
  }

  public ExpenseClaimDetailDto salesAccount(AccountNumberDto salesAccount) {
    this.salesAccount = salesAccount;
    return this;
  }

   /**
   * The sales account to which the system should record the part of the amount to charge the customer for. This is applicable only when a customer has been specified.
   * @return salesAccount
  **/
  @ApiModelProperty(value = "The sales account to which the system should record the part of the amount to charge the customer for. This is applicable only when a customer has been specified.")
  public AccountNumberDto getSalesAccount() {
    return salesAccount;
  }

  public void setSalesAccount(AccountNumberDto salesAccount) {
    this.salesAccount = salesAccount;
  }

  public ExpenseClaimDetailDto salesSubaccount(SubAccountDescriptionDto salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
    return this;
  }

   /**
   * The corresponding subaccount the system uses to record the amount to charge the customer for. This is applicable only when a customer has been specified.
   * @return salesSubaccount
  **/
  @ApiModelProperty(value = "The corresponding subaccount the system uses to record the amount to charge the customer for. This is applicable only when a customer has been specified.")
  public SubAccountDescriptionDto getSalesSubaccount() {
    return salesSubaccount;
  }

  public void setSalesSubaccount(SubAccountDescriptionDto salesSubaccount) {
    this.salesSubaccount = salesSubaccount;
  }

  public ExpenseClaimDetailDto employeePart(Double employeePart) {
    this.employeePart = employeePart;
    return this;
  }

   /**
   * The part of the total amount that will not be paid back to the employee. The percentage depends on the company policy.
   * @return employeePart
  **/
  @ApiModelProperty(value = "The part of the total amount that will not be paid back to the employee. The percentage depends on the company policy.")
  public Double getEmployeePart() {
    return employeePart;
  }

  public void setEmployeePart(Double employeePart) {
    this.employeePart = employeePart;
  }

  public ExpenseClaimDetailDto customer(CustomerNumberDto customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The identifier of the customer associated with the expense.
   * @return customer
  **/
  @ApiModelProperty(value = "The identifier of the customer associated with the expense.")
  public CustomerNumberDto getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerNumberDto customer) {
    this.customer = customer;
  }

  public ExpenseClaimDetailDto location(LocationNameDescriptionDto location) {
    this.location = location;
    return this;
  }

   /**
   * The identifier of the customer location associated with the expense.
   * @return location
  **/
  @ApiModelProperty(value = "The identifier of the customer location associated with the expense.")
  public LocationNameDescriptionDto getLocation() {
    return location;
  }

  public void setLocation(LocationNameDescriptionDto location) {
    this.location = location;
  }

  public ExpenseClaimDetailDto arReferenceNbr(String arReferenceNbr) {
    this.arReferenceNbr = arReferenceNbr;
    return this;
  }

   /**
   * The reference number of the AR document.
   * @return arReferenceNbr
  **/
  @ApiModelProperty(value = "The reference number of the AR document.")
  public String getArReferenceNbr() {
    return arReferenceNbr;
  }

  public void setArReferenceNbr(String arReferenceNbr) {
    this.arReferenceNbr = arReferenceNbr;
  }

  public ExpenseClaimDetailDto approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * The approval status, which indicates whether the detail row requires approval and, if it does, what the current state of approval is.
   * @return approvalStatus
  **/
  @ApiModelProperty(value = "The approval status, which indicates whether the detail row requires approval and, if it does, what the current state of approval is.")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public ExpenseClaimDetailDto approvalStatusText(String approvalStatusText) {
    this.approvalStatusText = approvalStatusText;
    return this;
  }

   /**
   * The approval status text suitable for display
   * @return approvalStatusText
  **/
  @ApiModelProperty(value = "The approval status text suitable for display")
  public String getApprovalStatusText() {
    return approvalStatusText;
  }

  public void setApprovalStatusText(String approvalStatusText) {
    this.approvalStatusText = approvalStatusText;
  }

  public ExpenseClaimDetailDto approver(String approver) {
    this.approver = approver;
    return this;
  }

   /**
   * The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager.
   * @return approver
  **/
  @ApiModelProperty(value = "The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager.")
  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }

  public ExpenseClaimDetailDto attachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ExpenseClaimDetailDto addAttachmentsItem(AttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Expense claim detail line attachtments
   * @return attachments
  **/
  @ApiModelProperty(value = "Expense claim detail line attachtments")
  public List<AttachmentDto> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentDto> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseClaimDetailDto expenseClaimDetailDto = (ExpenseClaimDetailDto) o;
    return Objects.equals(this.claimDetailId, expenseClaimDetailDto.claimDetailId) &&
        Objects.equals(this.lineId, expenseClaimDetailDto.lineId) &&
        Objects.equals(this.date, expenseClaimDetailDto.date) &&
        Objects.equals(this.expenseItem, expenseClaimDetailDto.expenseItem) &&
        Objects.equals(this.description, expenseClaimDetailDto.description) &&
        Objects.equals(this.quantity, expenseClaimDetailDto.quantity) &&
        Objects.equals(this.uom, expenseClaimDetailDto.uom) &&
        Objects.equals(this.unitCost, expenseClaimDetailDto.unitCost) &&
        Objects.equals(this.currency, expenseClaimDetailDto.currency) &&
        Objects.equals(this.totalAmount, expenseClaimDetailDto.totalAmount) &&
        Objects.equals(this.invoiceable, expenseClaimDetailDto.invoiceable) &&
        Objects.equals(this.claimAmount, expenseClaimDetailDto.claimAmount) &&
        Objects.equals(this.amountInClaimCurr, expenseClaimDetailDto.amountInClaimCurr) &&
        Objects.equals(this.project, expenseClaimDetailDto.project) &&
        Objects.equals(this.projectTask, expenseClaimDetailDto.projectTask) &&
        Objects.equals(this.expenseAccount, expenseClaimDetailDto.expenseAccount) &&
        Objects.equals(this.expenseSubaccount, expenseClaimDetailDto.expenseSubaccount) &&
        Objects.equals(this.branch, expenseClaimDetailDto.branch) &&
        Objects.equals(this.taxCategory, expenseClaimDetailDto.taxCategory) &&
        Objects.equals(this.refNbr, expenseClaimDetailDto.refNbr) &&
        Objects.equals(this.salesAccount, expenseClaimDetailDto.salesAccount) &&
        Objects.equals(this.salesSubaccount, expenseClaimDetailDto.salesSubaccount) &&
        Objects.equals(this.employeePart, expenseClaimDetailDto.employeePart) &&
        Objects.equals(this.customer, expenseClaimDetailDto.customer) &&
        Objects.equals(this.location, expenseClaimDetailDto.location) &&
        Objects.equals(this.arReferenceNbr, expenseClaimDetailDto.arReferenceNbr) &&
        Objects.equals(this.approvalStatus, expenseClaimDetailDto.approvalStatus) &&
        Objects.equals(this.approvalStatusText, expenseClaimDetailDto.approvalStatusText) &&
        Objects.equals(this.approver, expenseClaimDetailDto.approver) &&
        Objects.equals(this.attachments, expenseClaimDetailDto.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimDetailId, lineId, date, expenseItem, description, quantity, uom, unitCost, currency, totalAmount, invoiceable, claimAmount, amountInClaimCurr, project, projectTask, expenseAccount, expenseSubaccount, branch, taxCategory, refNbr, salesAccount, salesSubaccount, employeePart, customer, location, arReferenceNbr, approvalStatus, approvalStatusText, approver, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseClaimDetailDto {\n");
    
    sb.append("    claimDetailId: ").append(toIndentedString(claimDetailId)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    expenseItem: ").append(toIndentedString(expenseItem)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    claimAmount: ").append(toIndentedString(claimAmount)).append("\n");
    sb.append("    amountInClaimCurr: ").append(toIndentedString(amountInClaimCurr)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("    expenseAccount: ").append(toIndentedString(expenseAccount)).append("\n");
    sb.append("    expenseSubaccount: ").append(toIndentedString(expenseSubaccount)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    refNbr: ").append(toIndentedString(refNbr)).append("\n");
    sb.append("    salesAccount: ").append(toIndentedString(salesAccount)).append("\n");
    sb.append("    salesSubaccount: ").append(toIndentedString(salesSubaccount)).append("\n");
    sb.append("    employeePart: ").append(toIndentedString(employeePart)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    arReferenceNbr: ").append(toIndentedString(arReferenceNbr)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    approvalStatusText: ").append(toIndentedString(approvalStatusText)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
