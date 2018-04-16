
# ShipmentPackageLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**confirmed** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**boxId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**weight** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**declaredValue** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**codAmount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**trackingNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customRefNbr1** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customRefNbr2** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



