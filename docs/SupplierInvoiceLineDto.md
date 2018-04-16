
# SupplierInvoiceLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNumber** | **Integer** |  |  [optional]
**inventoryNumber** | **String** |  |  [optional]
**transactionDescription** | **String** |  |  [optional]
**quantity** | **Double** |  |  [optional]
**uom** | **String** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**unitCostInCurrency** | **Double** |  |  [optional]
**cost** | **Double** |  |  [optional]
**costInCurrency** | **Double** |  |  [optional]
**account** | [**AccountNumberDto**](AccountNumberDto.md) |  |  [optional]
**subaccount** | [**SubAccountDto**](SubAccountDto.md) |  |  [optional]
**deferralSchedule** | **Integer** |  |  [optional]
**deferralCode** | **String** |  |  [optional]
**vatCode** | [**VatCodeDto**](VatCodeDto.md) |  |  [optional]
**poNumber** | **String** |  |  [optional]
**poLineNr** | **Integer** |  |  [optional]
**poReceiptNbr** | **String** |  |  [optional]
**poReceiptLineNbr** | **Integer** |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) | Note: The field type has been changed from string to BranchNumberDto, please consider doing changes accordingly. |  [optional]
**note** | **String** |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]



