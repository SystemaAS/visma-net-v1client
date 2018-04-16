
# TaskDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**plannedStart** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**plannedEnd** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**startDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**rateTable** | [**RateTableIdDescriptionDto**](RateTableIdDescriptionDto.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PLANNED | &quot;Planned&quot;
ACTIVE | &quot;Active&quot;
COMPLETED | &quot;Completed&quot;
CANCELLED | &quot;Cancelled&quot;
ONHOLD | &quot;OnHold&quot;
PENDINGAPPROVAL | &quot;PendingApproval&quot;



