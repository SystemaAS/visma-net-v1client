
# PurchaseOrderLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineNbr** | **Integer** |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**inventory** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) |  |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**lineDescription** | **String** |  |  [optional]
**uom** | **String** |  |  [optional]
**orderQty** | **Double** |  |  [optional]
**qtyOnReceipts** | **Double** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**extCost** | **Double** |  |  [optional]
**discountPercent** | **Double** |  |  [optional]
**discountAmount** | **Double** |  |  [optional]
**manualDiscount** | **Boolean** |  |  [optional]
**discountCode** | [**DiscountCodeNumberDescriptionDto**](DiscountCodeNumberDescriptionDto.md) |  |  [optional]
**amount** | **Double** |  |  [optional]
**receivedAmt** | **Double** |  |  [optional]
**alternateId** | **String** |  |  [optional]
**minReceipt** | **Double** |  |  [optional]
**maxReceipt** | **Double** |  |  [optional]
**completeOn** | **Double** |  |  [optional]
**receiptAction** | [**ReceiptActionEnum**](#ReceiptActionEnum) |  |  [optional]
**taxCategory** | [**TaxCategoryNumberDescriptionDto**](TaxCategoryNumberDescriptionDto.md) |  |  [optional]
**account** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**sub** | [**SubAccountDto**](SubAccountDto.md) |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]
**requested** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**promised** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**completed** | **Boolean** |  |  [optional]
**canceled** | **Boolean** |  |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional]
**orderNumber** | **String** |  |  [optional]


<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum
Name | Value
---- | -----
GOODSFORINVENTORY | &quot;GoodsForInventory&quot;
GOODSFORSALESORDER | &quot;GoodsForSalesOrder&quot;
GOODSFORREPLENISHMENT | &quot;GoodsForReplenishment&quot;
GOODSFORDROPSHIP | &quot;GoodsForDropShip&quot;
NONSTOCKFORDROPSHIP | &quot;NonStockForDropShip&quot;
NONSTOCKFORSALESORDER | &quot;NonStockForSalesOrder&quot;
NONSTOCK | &quot;NonStock&quot;
SERVICE | &quot;Service&quot;
FREIGHT | &quot;Freight&quot;
DESCRIPTION | &quot;Description&quot;


<a name="ReceiptActionEnum"></a>
## Enum: ReceiptActionEnum
Name | Value
---- | -----
REJECT | &quot;Reject&quot;
ACCEPTBUTWARN | &quot;AcceptButWarn&quot;
ACCEPT | &quot;Accept&quot;


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
REGULARORDER | &quot;RegularOrder&quot;
DROPSHIP | &quot;DropShip&quot;
BLANKET | &quot;Blanket&quot;
STANDARDBLANKET | &quot;StandardBlanket&quot;



