
# ExpenseClaimDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refNbr** | **String** | The unique reference number of the expense claim document. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current status of the expense claim: On Hold/Pending Approval/Approved/Rejected/Released. |  [optional]
**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) | The approval status of the claim |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) | The date when the claim was entered. |  [optional]
**description** | **String** | A description of the claim. |  [optional]
**claimedBy** | [**EmployeeNumberNameDto**](EmployeeNumberNameDto.md) | The employee who is claiming the expenses. If the claim is released, an Accounts Payable bill will be generated to this employee. |  [optional]
**claimTotal** | **Double** | The total amount of the claim. |  [optional]
**vatTaxableTotal** | **Double** | The document total that is subjected to VAT. |  [optional]
**vatExemptTotal** | **Double** | The document total that is exempt from VAT. |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) | The applicable customer. |  [optional]
**currency** | **String** | The currency of the claim. |  [optional]
**approvalDate** | [**LocalDateTime**](LocalDateTime.md) | The date when the claim was approved. |  [optional]
**department** | [**DepartmentIdDescriptionDto**](DepartmentIdDescriptionDto.md) | The department associated with the expense claim. |  [optional]
**location** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) | The company location associated with the claim. |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) | The lastest time the expense claim was modified |  [optional]
**details** | [**List&lt;ExpenseClaimDetailDto&gt;**](ExpenseClaimDetailDto.md) | Expense Claim detail information |  [optional]
**approvalStatusText** | **String** |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
PENDINGAPPROVAL | &quot;PendingApproval&quot;
APPROVED | &quot;Approved&quot;
REJECTED | &quot;Rejected&quot;
RELEASED | &quot;Released&quot;


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



