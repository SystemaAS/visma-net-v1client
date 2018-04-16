
# LandedCostUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNbr** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**landedCostCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**purchaseInvoiceNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**supplierId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**locationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**apBillDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**currency** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**amount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**taxCategory** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**terms** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inventoryId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**apDocType** | [**DtoValueNullableSupplierDocumentType**](DtoValueNullableSupplierDocumentType.md) |  |  [optional]
**apRefNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**inDocType** | [**DtoValueCustomerDocumentTypes**](DtoValueCustomerDocumentTypes.md) |  |  [optional]
**inRefNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**postponePurchaseInvoiceCreation** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



