
# ProjectDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internalID** | **Integer** |  |  [optional]
**projectID** | **String** |  |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**template** | [**TemplateNumberDescriptionDto**](TemplateNumberDescriptionDto.md) |  |  [optional]
**description** | **String** |  |  [optional]
**assets** | **Double** |  |  [optional]
**liability** | **Double** |  |  [optional]
**income** | **Double** |  |  [optional]
**expenses** | **Double** |  |  [optional]
**startDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**endDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**projectManager** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional]
**restrictEmployees** | **Boolean** |  |  [optional]
**restrictEquipment** | **Boolean** |  |  [optional]
**visibility** | [**VisibilityDto**](VisibilityDto.md) |  |  [optional]
**defAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**defSub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**defAccrualAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**defAccrualSub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**billingPeriod** | [**BillingPeriodEnum**](#BillingPeriodEnum) |  |  [optional]
**nextBillingDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lastBillingDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**customerLocation** | [**LocationIdNameDto**](LocationIdNameDto.md) |  |  [optional]
**allocationRule** | [**AllocationRuleIdDescriptionDto**](AllocationRuleIdDescriptionDto.md) |  |  [optional]
**billingRule** | [**BillingRuleIdDescriptionDto**](BillingRuleIdDescriptionDto.md) |  |  [optional]
**rateTable** | [**RateTableIdDescriptionDto**](RateTableIdDescriptionDto.md) |  |  [optional]
**autoAllocate** | **Boolean** |  |  [optional]
**automaticReleaseAr** | **Boolean** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**tasks** | [**List&lt;TaskDto&gt;**](TaskDto.md) |  |  [optional]
**employees** | [**List&lt;EmployeeDto&gt;**](EmployeeDto.md) |  |  [optional]
**systemTemplate** | **Boolean** |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


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


<a name="BillingPeriodEnum"></a>
## Enum: BillingPeriodEnum
Name | Value
---- | -----
WEEKLY | &quot;Weekly&quot;
MONTHLY | &quot;Monthly&quot;
QUARTERLY | &quot;Quarterly&quot;
ANNUAL | &quot;Annual&quot;
ONDEMAND | &quot;OnDemand&quot;



