
# TimeCardSummaryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNumber** | **Integer** | The time card line number |  [optional]
**lineId** | [**UUID**](UUID.md) | The time card line id |  [optional]
**earningType** | [**EarningTypeDto**](EarningTypeDto.md) | The type of the work time spent by the employee |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) | The project that the employee worked on. |  [optional]
**mon** | **Integer** | The work time reported for Monday, including overtime. |  [optional]
**tue** | **Integer** | The work time reported for Tuesday, including overtime. |  [optional]
**wed** | **Integer** | The work time reported for Wednesday, including overtime. |  [optional]
**thu** | **Integer** | The work time reported for Thursday, including overtime. |  [optional]
**fri** | **Integer** | The work time reported for Friday, including overtime. |  [optional]
**sat** | **Integer** | The work time reported for Saturday, including overtime. |  [optional]
**sun** | **Integer** | The work time reported for Sunday, including overtime. |  [optional]
**invoiceable** | **Boolean** | A check box that you select to indicate that these work hours are invoiceable. |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) | The project task that the employee worked on. |  [optional]
**timeSpent** | **Integer** | The work time (regular and overtime) that the employee spent on the project and task during the week. |  [optional]
**description** | **String** | The description of the reported work hours. |  [optional]
**approvalStatus** | [**ApprovalStatusEnum**](#ApprovalStatusEnum) | The approval status, which indicates whether the summary row requires approval and, if it does, what the current state of approval is. |  [optional]
**approver** | **String** | The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager. |  [optional]
**approvalStatusText** | **String** | The approval status text suitable for display |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) | The last time the time card line was modified |  [optional]


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



