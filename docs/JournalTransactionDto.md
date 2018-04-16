
# JournalTransactionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**module** | [**ModuleEnum**](#ModuleEnum) |  |  [optional]
**batchNumber** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**transactionDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**financialPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format YYYYMM. |  [optional]
**ledger** | **String** |  |  [optional]
**ledgerDescription** | **String** |  |  [optional]
**currencyId** | **String** |  |  [optional]
**exchangeRate** | **Double** |  |  [optional]
**autoReversing** | **Boolean** |  |  [optional]
**reversingEntry** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**originalBatchNumber** | **String** |  |  [optional]
**debitTotal** | **Double** |  |  [optional]
**debitTotalInCurrency** | **Double** |  |  [optional]
**creditTotal** | **Double** |  |  [optional]
**creditTotalInCurrency** | **Double** |  |  [optional]
**controlTotal** | **Double** |  |  [optional]
**controlTotalInCurrency** | **Double** |  |  [optional]
**createVatTransaction** | **Boolean** |  |  [optional]
**skipVatAmountValidation** | **Boolean** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**transactionCode** | **String** |  |  [optional]
**transactionCodeDescription** | **String** |  |  [optional]
**branch** | **String** |  |  [optional]
**journalTransactionLines** | [**List&lt;JournalTransactionLineDto&gt;**](JournalTransactionLineDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="ModuleEnum"></a>
## Enum: ModuleEnum
Name | Value
---- | -----
MODULEGL | &quot;ModuleGL&quot;
MODULEAP | &quot;ModuleAP&quot;
MODULEAR | &quot;ModuleAR&quot;
MODULECA | &quot;ModuleCA&quot;
MODULECM | &quot;ModuleCM&quot;
MODULEIN | &quot;ModuleIN&quot;
MODULESO | &quot;ModuleSO&quot;
MODULEPO | &quot;ModulePO&quot;
MODULEDR | &quot;ModuleDR&quot;
MODULEFA | &quot;ModuleFA&quot;
MODULEEP | &quot;ModuleEP&quot;
MODULEPM | &quot;ModulePM&quot;
MODULETX | &quot;ModuleTX&quot;
MODULECR | &quot;ModuleCR&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
BALANCED | &quot;Balanced&quot;
UNPOSTED | &quot;Unposted&quot;
POSTED | &quot;Posted&quot;
COMPLETED | &quot;Completed&quot;
VOIDED | &quot;Voided&quot;
RELEASED | &quot;Released&quot;
PARTIALLYRELEASED | &quot;PartiallyReleased&quot;
SCHEDULED | &quot;Scheduled&quot;



