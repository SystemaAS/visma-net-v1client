
# SalesOrderUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**printDescriptionOnInvoice** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**printNoteOnExternalDocuments** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**printNoteOnInternalDocuments** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**soBillingContact** | [**DtoValueSalesOrderContactUpdateDto**](DtoValueSalesOrderContactUpdateDto.md) |  |  [optional]
**soBillingAddress** | [**DtoValueSalesOrderAddressUpdateDto**](DtoValueSalesOrderAddressUpdateDto.md) |  |  [optional]
**customerVATZone** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**invoiceSeparately** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**terms** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesPerson** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**owner** | [**DtoValueNullableGuid**](DtoValueNullableGuid.md) |  |  [optional]
**origOrderType** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**origOrderNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**soShippingContact** | [**DtoValueSalesOrderContactUpdateDto**](DtoValueSalesOrderContactUpdateDto.md) |  |  [optional]
**soShippingAddress** | [**DtoValueSalesOrderAddressUpdateDto**](DtoValueSalesOrderAddressUpdateDto.md) |  |  [optional]
**schedShipment** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**shipSeparately** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**shipComplete** | [**DtoValueNullableSalesOrderShipCompleteStatuses**](DtoValueNullableSalesOrderShipCompleteStatuses.md) |  |  [optional]
**cancelBy** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**canceled** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**preferredWarehouse** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shipVia** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**fobPoint** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**priority** | [**DtoValueNullableInt16**](DtoValueNullableInt16.md) |  |  [optional]
**shippingTerms** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shippingZone** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**residentialDelivery** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**saturdayDelivery** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**insurance** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**transactionType** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**lines** | [**List&lt;SalesOrderLineUpdateDto&gt;**](SalesOrderLineUpdateDto.md) |  |  [optional]
**orderType** | [**DtoValueString**](DtoValueString.md) | Mandatory field | 
**orderNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**hold** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**date** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**requestOn** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**customerOrder** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customerRefNo** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customer** | [**DtoValueString**](DtoValueString.md) | Mandatory field | 
**location** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**currency** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**recalculateShipment** | **Boolean** |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]



