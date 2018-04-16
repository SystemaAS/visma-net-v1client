
# PurchaseOrderBasicUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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



