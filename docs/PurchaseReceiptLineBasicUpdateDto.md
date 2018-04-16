
# PurchaseReceiptLineBasicUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNbr** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**lineType** | [**DtoValueNullablePoLineType**](DtoValueNullablePoLineType.md) |  |  [optional]
**branchId** | [**DtoValueString**](DtoValueString.md) | BranchId is deprecated, please use BranchNumber instead. |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inventoryId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**warehouseId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**locationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**transactionDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**receiptQty** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**unitCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**extCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountPercent** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountAmount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**manualDiscount** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**discountCodeId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**amount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**taxCategoryId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**accountId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**accountDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**subaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**actualAccountId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**actualSubaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**projectId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**projectTaskId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**expirationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**lotSerialNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**poOrderType** | [**DtoValueNullablePurchaseOrderType**](DtoValueNullablePurchaseOrderType.md) | Deprecated, property will be replaced by an action |  [optional]
**poOrderNbr** | [**DtoValueString**](DtoValueString.md) | Deprecated, property will be replaced by an action |  [optional]
**poOrderLineNbr** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) | Deprecated, property will be replaced by an action |  [optional]
**transferOrderType** | [**DtoValueNullableSalesOrderTypes**](DtoValueNullableSalesOrderTypes.md) |  |  [optional]
**transferOrderNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**transferOrderLineNbr** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**completePoLine** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



