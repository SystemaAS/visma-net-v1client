
# TimeCardSummaryUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**earningType** | [**DtoValueString**](DtoValueString.md) | The type of the work time spent by the employee |  [optional]
**project** | [**DtoValueString**](DtoValueString.md) | The project that the employee worked on. |  [optional]
**projectTask** | [**DtoValueString**](DtoValueString.md) | The project task that the employee worked on. |  [optional]
**mon** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Monday, including overtime. |  [optional]
**tue** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Tuesday, including overtime. |  [optional]
**wed** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Wednesday, including overtime. |  [optional]
**thu** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Thursday, including overtime. |  [optional]
**fri** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Friday, including overtime. |  [optional]
**sat** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Saturday, including overtime. |  [optional]
**sun** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | The work time reported for Sunday, including overtime. |  [optional]
**invoiceable** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) | A check box that you select to indicate that these work hours are invoiceable. |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) | The description of the reported work hours. |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



