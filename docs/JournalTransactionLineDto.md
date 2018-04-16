
# JournalTransactionLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNumber** | **Integer** |  |  [optional]
**accountNumber** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**subaccount** | [**SubAccountDto**](SubAccountDto.md) |  |  [optional]
**referenceNumber** | **String** |  |  [optional]
**debitAmount** | **Double** |  |  [optional]
**debitAmountInCurrency** | **Double** |  |  [optional]
**creditAmount** | **Double** |  |  [optional]
**creditAmountInCurrency** | **Double** |  |  [optional]
**transactionDescription** | **String** |  |  [optional]
**vatCode** | [**VatCodeDto**](VatCodeDto.md) |  |  [optional]
**vat** | [**VatDto**](VatDto.md) |  |  [optional]
**branch** | **String** |  |  [optional]
**customerSupplier** | **String** |  |  [optional]
**transactionType** | **String** |  |  [optional]
**module** | [**ModuleEnum**](#ModuleEnum) |  |  [optional]
**uom** | **String** |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]


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



