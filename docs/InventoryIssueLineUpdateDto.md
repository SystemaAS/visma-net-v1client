
# InventoryIssueLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouseId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**unitCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**extCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**unitPrice** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**extPrice** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**tranType** | [**DtoValueNullableInventoryTransactionType**](DtoValueNullableInventoryTransactionType.md) |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**locationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**reasonCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



