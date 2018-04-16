
# TimeCardDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refNbr** | **String** | The unique reference number of the time card, which Acumatica ERP automatically assigns according to the numbering sequence specified as the Time Card Numbering Sequence on the Time and Expenses Preferences (EP.10.10.00) form. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the time card |  [optional]
**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) | The approval status of the time card |  [optional]
**week** | [**WeekNumberDescriptionDto**](WeekNumberDescriptionDto.md) | The week for which the time card has been created. |  [optional]
**employee** | [**EmployeeNumberNameDto**](EmployeeNumberNameDto.md) | The name of the employee whose time card is currently open. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the time card. The following options are available:• Normal: Regular time card• Correction: Corrective time card, which is a time card that updates a released time card |  [optional]
**origRefNbr** | **String** | The reference number of the time card being corrected. This box is filled in only when Correction is specified in the Type box |  [optional]
**timeSpent** | **Integer** | The work hours spent by the employee during the week on activities with the Regular Hours earning type. |  [optional]
**invoiceable** | **Integer** | The invoiceable work hours spent by the employee during the week |  [optional]
**overtimeSpent** | **Integer** | The work hours spent by the employee during the week on activities with the Overtime earning type. |  [optional]
**invoiceableOvertime** | **Integer** | The invoiceable overtime spent by the employee during the week |  [optional]
**totalTimeSpent** | **Integer** | The total working time (regular and overtime) for the week |  [optional]
**invoiceableTotalTime** | **Integer** | The total invoiceable working time (regular and overtime) for the week |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) | The last time the time card line was modified |  [optional]
**summary** | [**List&lt;TimeCardSummaryDto&gt;**](TimeCardSummaryDto.md) | Time Card summary information |  [optional]
**approvalStatusText** | **String** |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
OPEN | &quot;Open&quot;
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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
CORRECTION | &quot;Correction&quot;
NORMALCORRECTED | &quot;NormalCorrected&quot;



