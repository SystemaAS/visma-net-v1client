
# ExpenseReceiptDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internalId** | **Integer** |  |  [optional]
**receiptId** | **String** |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**currency** | [**CurrencyIdDescriptionDto**](CurrencyIdDescriptionDto.md) |  |  [optional]
**refNbr** | **String** |  |  [optional]
**inventory** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**description** | **String** |  |  [optional]
**uom** | **String** |  |  [optional]
**quantity** | **Double** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**totalAmount** | **Double** |  |  [optional]
**employeePart** | **Double** |  |  [optional]
**claimAmount** | **Double** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**claimedBy** | [**EmployeeDto**](EmployeeDto.md) |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**expenseClaim** | [**ExpenseClaimNumberDescriptionDto**](ExpenseClaimNumberDescriptionDto.md) |  |  [optional]
**invoiceable** | **Boolean** |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) |  |  [optional]
**location** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**expenseAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**expenseSub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**salesAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**salesSub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**taxCategory** | [**TaxCategoryNumberDescriptionDto**](TaxCategoryNumberDescriptionDto.md) |  |  [optional]
**image** | [**AttachmentDto**](AttachmentDto.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
PENDING | &quot;Pending&quot;
APPROVED | &quot;Approved&quot;
REJECTED | &quot;Rejected&quot;
RELEASED | &quot;Released&quot;



