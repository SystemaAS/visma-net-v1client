
# ExpenseClaimDetailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claimDetailId** | **Integer** | Identifies the expense claim detail id, necessary when updatind detail information |  [optional]
**lineId** | [**UUID**](UUID.md) | The expense claim line id |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) | The date when the expense was incurred. |  [optional]
**expenseItem** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) | The expense identifier, if an expense of this type is listed as an inventory nonstock item. |  [optional]
**description** | **String** | A description of the transaction. |  [optional]
**quantity** | **Double** | The quantity of this expense item. |  [optional]
**uom** | **String** | The unit of measure in which the quantity is shown. |  [optional]
**unitCost** | **Double** | The cost of a unit of the item. |  [optional]
**currency** | **String** | The currency of the expense receipt. However, if you enter a claim line directly, the currency value is read-only and matching the claim currency. |  [optional]
**totalAmount** | **Double** | The total amount paid for the expense item in the specified quantity. |  [optional]
**invoiceable** | **Boolean** | A check box that, if selected, indicates that the claim amount is invoiceable to the customer (the total amount minus the employee&#39;s part). |  [optional]
**claimAmount** | **Double** | The amount claimed by the employee, which is calculated as the total claim amount minus the employee part. |  [optional]
**amountInClaimCurr** | **Double** | The amount claimed by the employee, which is expressed in the currency of the expense claim. |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) | The project or customer contract associated with the expense claim, if the work performed was for a project or contract. Project Task The task associated with the contract or project. |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) | The task associated with the contract or project. |  [optional]
**expenseAccount** | [**AccountNumberDto**](AccountNumberDto.md) | The expense account to which the system should record the part of the expense to be paid back to the employee. |  [optional]
**expenseSubaccount** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) | The corresponding subaccount the system uses to record the part of the expense to be paid back to the employee. |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) | The branch that will reimburse the expenses to the employee. |  [optional]
**taxCategory** | [**TaxCategoryNumberDescriptionDto**](TaxCategoryNumberDescriptionDto.md) | The tax category associated with the expense item. |  [optional]
**refNbr** | **String** | The identifier of the transaction. |  [optional]
**salesAccount** | [**AccountNumberDto**](AccountNumberDto.md) | The sales account to which the system should record the part of the amount to charge the customer for. This is applicable only when a customer has been specified. |  [optional]
**salesSubaccount** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) | The corresponding subaccount the system uses to record the amount to charge the customer for. This is applicable only when a customer has been specified. |  [optional]
**employeePart** | **Double** | The part of the total amount that will not be paid back to the employee. The percentage depends on the company policy. |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) | The identifier of the customer associated with the expense. |  [optional]
**location** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) | The identifier of the customer location associated with the expense. |  [optional]
**arReferenceNbr** | **String** | The reference number of the AR document. |  [optional]
**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) | The approval status, which indicates whether the detail row requires approval and, if it does, what the current state of approval is. |  [optional]
**approvalStatusText** | **String** | The approval status text suitable for display |  [optional]
**approver** | **String** | The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager. |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) | Expense claim detail line attachtments |  [optional]


<a name="ApprovalStatusEnum"></a>
## Enum: ApprovalStatusEnum
Name | Value
---- | -----
NEW | &quot;New&quot;
CANCELED | &quot;Canceled&quot;
SENTTOAPPROVAL | &quot;SentToApproval&quot;
RECEIVEDBYAPPROVAL | &quot;ReceivedByApproval&quot;
INPROGRESSAPPROVAL | &quot;InProgressApproval&quot;
REJECTEDINAPPROVAL | &quot;RejectedInApproval&quot;
APPROVEDINAPPROVAL | &quot;ApprovedInApproval&quot;
ACTIVEWORKFLOWAPPROVAL | &quot;ActiveWorkflowApproval&quot;



