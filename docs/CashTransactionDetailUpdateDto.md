
# CashTransactionDetailUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**price** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**amount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**offsetAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**offsetSubaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**vatCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**notInvoiceable** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



