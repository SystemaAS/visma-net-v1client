
# InventoryIssueLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**extCost** | **Double** |  |  [optional]
**unitPrice** | **Double** |  |  [optional]
**extPrice** | **Double** |  |  [optional]
**lineNumber** | **Integer** |  |  [optional]
**inventoryItem** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**quantity** | **Double** |  |  [optional]
**uom** | **String** |  |  [optional]
**reasonCode** | [**ReasonCodeDto**](ReasonCodeDto.md) |  |  [optional]
**description** | **String** |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
ISSUE | &quot;Issue&quot;
RETURN | &quot;Return&quot;
INVOICE | &quot;Invoice&quot;
DEBITNOTE | &quot;DebitNote&quot;
CREDITNOTE | &quot;CreditNote&quot;



