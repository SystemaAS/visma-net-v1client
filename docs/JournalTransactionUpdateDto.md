
# JournalTransactionUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**hold** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**transactionDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**postPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY. |  [optional]
**financialPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format YYYYMM. |  [optional]
**ledger** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**currencyId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**exchangeRate** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**autoReversing** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**controlTotalInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**createVatTransaction** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**skipVatAmountValidation** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**transactionCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**journalTransactionLines** | [**List&lt;JournalTransactionLineUpdateDto&gt;**](JournalTransactionLineUpdateDto.md) |  |  [optional]



