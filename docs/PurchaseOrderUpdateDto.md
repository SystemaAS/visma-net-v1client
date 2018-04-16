
# PurchaseOrderUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingDestinationType** | [**DtoValueNullablePOShippingDestinationType**](DtoValueNullablePOShippingDestinationType.md) |  |  [optional]
**shipTo** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shippingLocation** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shippingContact** | [**DtoValuePurchaseOrderContactUpdateDto**](DtoValuePurchaseOrderContactUpdateDto.md) |  |  [optional]
**shippingAddress** | [**DtoValuePurchaseOrderAddressUpdateDto**](DtoValuePurchaseOrderAddressUpdateDto.md) |  |  [optional]
**fobPoint** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**shipVia** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**remitContact** | [**DtoValuePurchaseOrderContactUpdateDto**](DtoValuePurchaseOrderContactUpdateDto.md) |  |  [optional]
**remitAddress** | [**DtoValuePurchaseOrderAddressUpdateDto**](DtoValuePurchaseOrderAddressUpdateDto.md) |  |  [optional]
**terms** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**supplierVatZone** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**discountDetails** | [**List&lt;DiscountDetailUpdateDto&gt;**](DiscountDetailUpdateDto.md) |  |  [optional]
**dontPrint** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**dontEmail** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**orderType** | [**DtoValueNullablePurchaseOrderType**](DtoValueNullablePurchaseOrderType.md) |  |  [optional]
**orderNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**hold** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**date** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**promisedOn** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**supplier** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**location** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**owner** | [**DtoValueNullableGuid**](DtoValueNullableGuid.md) |  |  [optional]
**currency** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**supplierRef** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**controlTotal** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**lines** | [**List&lt;PurchaseOrderLineUpdateDto&gt;**](PurchaseOrderLineUpdateDto.md) |  |  [optional]
**changeDatesOnLines** | **Boolean** |  |  [optional]



