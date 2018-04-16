
# SalesOrderLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesOrderOperation** | [**DtoValueNullableSalesOrderOperations**](DtoValueNullableSalesOrderOperations.md) |  |  [optional]
**freeItem** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**requestedOn** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**shipOn** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**shipComplete** | [**DtoValueNullableSalesOrderShipCompleteStatuses**](DtoValueNullableSalesOrderShipCompleteStatuses.md) |  |  [optional]
**undershipThreshold** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**overshipThreshold** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**completed** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**markForPO** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**poSource** | [**DtoValueNullableInventoryReplenishmentSources**](DtoValueNullableInventoryReplenishmentSources.md) |  |  [optional]
**lotSerialNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**expirationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**reasonCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesPerson** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**taxCategory** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**commissionable** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**alternateID** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**projectTask** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNbr** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**inventoryId** | [**DtoValueString**](DtoValueString.md) | InventoryId is deprecated, please use InventoryNumber instead. |  [optional]
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) | Mandatory field | 
**warehouse** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**unitCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**unitPrice** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountPercent** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountAmount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**discountCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**manualDiscount** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**discUnitPrice** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**lineDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



