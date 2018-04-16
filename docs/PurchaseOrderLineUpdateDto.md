
# PurchaseOrderLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inventory** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**lineType** | [**DtoValueNullablePoLineType**](DtoValueNullablePoLineType.md) |  |  [optional]
**warehouse** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**lineDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**orderQty** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**unitCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**extCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountPercent** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**manualDiscount** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**discountCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**amount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**alternateId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**minReceipt** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**maxReceipt** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**completeOn** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**receiptAction** | [**DtoValueNullablePurchaseOrderReceiptAction**](DtoValueNullablePurchaseOrderReceiptAction.md) |  |  [optional]
**taxCategory** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**account** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**sub** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**project** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**projectTask** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**requested** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**promised** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



