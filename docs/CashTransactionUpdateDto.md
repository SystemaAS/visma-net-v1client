
# CashTransactionUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**hold** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**tranDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**finanacialPeriod** | [**DtoValueString**](DtoValueString.md) | The property is now considered obsolete. Use Financial Period instead |  [optional]
**financialPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM. |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**cashAccount** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**entryType** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**documentRef** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**controlTotal** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**vatAmount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**vatZone** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**taxCalculationMode** | [**DtoValueNullableTaxCalcMode**](DtoValueNullableTaxCalcMode.md) |  |  [optional]
**cashTransactionDetails** | [**List&lt;CashTransactionDetailUpdateDto&gt;**](CashTransactionDetailUpdateDto.md) |  |  [optional]
**cashTransactionTaxDetails** | [**List&lt;CashTransactionTaxDetailUpdateDto&gt;**](CashTransactionTaxDetailUpdateDto.md) |  |  [optional]



