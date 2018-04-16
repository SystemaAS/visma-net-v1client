
# InventoryReceiptUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferNumber** | [**DtoValueString**](DtoValueString.md) | The unique reference number of the receipt, which the system automatically assigns according to the numbering sequence selected for receipts on the Inventory Preferences IN.10.10.00) form. |  [optional]
**controlCost** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) | The manually entered summary amount for all specified inventory receipt items. |  [optional]
**receiptLines** | [**List&lt;InventoryReceiptLineUpdateDto&gt;**](InventoryReceiptLineUpdateDto.md) | The inventory issue lines |  [optional]
**referenceNumber** | [**DtoValueString**](DtoValueString.md) | The unique reference number of the receipt, which the system automatically assigns according to the numbering sequence selected for receipts on the Inventory Preferences IN.10.10.00) form. |  [optional]
**hold** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) | A check box that you select to give the receipt the On Hold status. Clear the check box to save the receipt with the Balanced status. |  [optional]
**date** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) | The date when the receipt was created. All transactions included in this document will have this transaction date. |  [optional]
**postPeriod** | [**DtoValueString**](DtoValueString.md) | The financial period to which the transactions recorded in the document should be posted. Use the format MMYYYY. |  [optional]
**externalReference** | [**DtoValueString**](DtoValueString.md) | The external reference number of the inventory issue document (for example, the vendor’s reference code). |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) | A brief description of the inventory issue or its transactions. |  [optional]
**controlQuantity** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) | The manually entered quantity of inventory items. Control Qty. is available only if the Validate Document Totals on Entry option is selected on the Inventory Preferences form. If the Control Qty. and Total Qty.values do not match, the system generates a warning message and the issue cannot be saved. |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) | The Branch associated |  [optional]



