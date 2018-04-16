
# SupplierInvoiceUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentType** | [**DtoValueNullableSupplierInvoiceTypes**](DtoValueNullableSupplierInvoiceTypes.md) |  |  [optional]
**referenceNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**hold** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**date** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**postPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY. |  [optional]
**financialPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM. |  [optional]
**supplierReference** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**supplierNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**locationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**currencyId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**paymentRefNo** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**creditTermsId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**dueDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**cashDiscountDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**exchangeRate** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**taxDetailLines** | [**List&lt;TaxDetailUpdateDto&gt;**](TaxDetailUpdateDto.md) |  |  [optional]
**invoiceLines** | [**List&lt;SupplierInvoiceLineUpdateDto&gt;**](SupplierInvoiceLineUpdateDto.md) |  |  [optional]



