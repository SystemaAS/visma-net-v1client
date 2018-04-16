
# ExpenseClaimQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**customer** | **String** |  |  [optional]
**departmentId** | **String** |  |  [optional]
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**orderBy** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
PENDINGAPPROVAL | &quot;PendingApproval&quot;
APPROVED | &quot;Approved&quot;
REJECTED | &quot;Rejected&quot;
RELEASED | &quot;Released&quot;



