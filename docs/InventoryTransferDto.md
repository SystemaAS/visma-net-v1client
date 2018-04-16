
# InventoryTransferDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**toWarehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**transferLines** | [**List&lt;InventoryTransferLineDto&gt;**](InventoryTransferLineDto.md) | The inventory transfer lines |  [optional]
**referenceNumber** | **String** | The unique reference number of the receipt, which the system automatically assigns according to the numbering sequence selected for receipts on the Inventory Preferences IN.10.10.00) form. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  The current status of the receipt. The following options are available:   On Hold:The receipt/issue is a draft and can be edited. Receipts with this status cannot be released.  Balanced: The receipt/issue data has been validated by the system and the receipt can be released. It also can be modified or deleted, but changes can be saved only if the receipt is balanced.  Released: The receipt/issue has been released and cannot be edited or deleted. |  [optional]
**hold** | **Boolean** | A check box that you select to give the receipt the On Hold status. Clear the check box to save the receipt with the Balanced status. |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) | The date when the receipt was created. All transactions included in this document will have this transaction date. |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**externalReference** | **String** | The external reference number of the inventory issue document (for example, the vendor’s reference code). |  [optional]
**description** | **String** | A brief description of the inventory issue or its transactions. |  [optional]
**totalQuantity** | **Double** | The total quantity of inventory items, which the system calculates automatically, for the document. |  [optional]
**controlQuantity** | **Double** | The manually entered quantity of inventory items. Control Qty. is available only if the Validate Document Totals on Entry option is selected on the Inventory Preferences form. If the Control Qty. and Total Qty.values do not match, the system generates a warning message and the issue cannot be saved. |  [optional]
**batchNumber** | **String** | The reference number of the batch generated for the receipt. Click the number to open the Journal Transactions (GL.30.10.00) form and view the details of the transactions. |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) | The date when the document was last modified. |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) | The Branch associated |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) | The data containing information about the document attachments |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
BALANCED | &quot;Balanced&quot;
RELEASED | &quot;Released&quot;



