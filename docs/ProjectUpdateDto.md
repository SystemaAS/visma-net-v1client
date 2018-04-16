
# ProjectUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectID** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customer** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) | Mandatory field | 
**hold** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**template** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**status** | [**DtoValueNullableProjectStatus**](DtoValueNullableProjectStatus.md) |  |  [optional]
**defAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**defSub** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) | Mandatory field when Project Template is not specified. |  [optional]
**defAccrualAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**defAccrualSub** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**startDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) | Mandatory field | 
**endDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**billingPeriod** | [**DtoValueNullableBillingPeriod**](DtoValueNullableBillingPeriod.md) |  |  [optional]
**allocationRule** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**billingRule** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**rateTable** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**projectManger** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**autoAllocate** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**automaticReleaseArDoc** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**restricEmployees** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**restricEquipment** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**customerLocation** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**visibility** | [**VisibilityUpdateDto**](VisibilityUpdateDto.md) |  |  [optional]
**tasks** | [**List&lt;TaskUpdateDto&gt;**](TaskUpdateDto.md) |  |  [optional]
**employees** | [**List&lt;ProjectEmployeeUpdateDto&gt;**](ProjectEmployeeUpdateDto.md) |  |  [optional]



