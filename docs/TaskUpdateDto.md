
# TaskUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**taskId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**plannedStart** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**plannedEnd** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**startDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**rateTable** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**status** | [**DtoValueNullableProjectStatus**](DtoValueNullableProjectStatus.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



