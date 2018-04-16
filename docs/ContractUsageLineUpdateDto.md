
# ContractUsageLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**transactionNumber** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inventory** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**date** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



