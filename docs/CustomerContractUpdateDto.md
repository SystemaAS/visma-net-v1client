
# CustomerContractUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractId** | [**DtoValueString**](DtoValueString.md) | Mandatory for POST, not applicable for PUT. |  [optional]
**contractTemplate** | [**DtoValueString**](DtoValueString.md) | Mandatory for POST, not applicable for PUT. |  [optional]
**customer** | [**DtoValueString**](DtoValueString.md) | Mandatory for POST, not applicable for PUT. |  [optional]
**location** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**setupDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**activationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**expirationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**massRenewal** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**renewalPoint** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**gracePeriod** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**invoiceTo** | [**DtoValueNullableInvoiceToType**](DtoValueNullableInvoiceToType.md) |  |  [optional]
**invoiceAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**invoiceLocation** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**owner** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesPerson** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**details** | [**List&lt;CustomerContractDetailsUpdateDto&gt;**](CustomerContractDetailsUpdateDto.md) |  |  [optional]
**attributeLines** | [**List&lt;AttributeLineUpdateDto&gt;**](AttributeLineUpdateDto.md) |  |  [optional]



