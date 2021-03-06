
# CustomerInvoiceUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethodId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**creditTermsId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**currencyId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customerRefNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**cashDiscountDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**documentDueDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**externalReference** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**exchangeRate** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**domesticServicesDeductibleDocument** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**rotRutDetails** | [**RotRutUpdateDto**](RotRutUpdateDto.md) |  |  [optional]
**paymentReference** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**contact** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**project** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**taxDetailLines** | [**List&lt;TaxDetailUpdateDto&gt;**](TaxDetailUpdateDto.md) |  |  [optional]
**invoiceLines** | [**List&lt;CustomerInvoiceLinesUpdateDto&gt;**](CustomerInvoiceLinesUpdateDto.md) |  |  [optional]
**referenceNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**customerNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**documentDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**hold** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**postPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY. |  [optional]
**financialPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM. |  [optional]
**invoiceText** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**locationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**salesPersonID** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**cashAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]



