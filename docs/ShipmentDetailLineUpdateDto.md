
# ShipmentDetailLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**warehouse** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**location** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shippedQty** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**lotSerialNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**expirationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) | Property will become obsolete after version 5.31 |  [optional]
**reasonCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**allocations** | [**List&lt;AllocationsUpdateDto&gt;**](AllocationsUpdateDto.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



