
# PurchaseReceiptLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | [**List&lt;AllocationsDto&gt;**](AllocationsDto.md) |  |  [optional]
**lineNbr** | **Integer** |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) | Branch is deprecated, please use BranchNumber instead. |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**inventory** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) |  |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**transactionDescription** | **String** |  |  [optional]
**uom** | **String** |  |  [optional]
**orderQty** | **Double** |  |  [optional]
**openQty** | **Double** |  |  [optional]
**receiptQty** | **Double** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**extCost** | **Double** |  |  [optional]
**discountPercent** | **Double** |  |  [optional]
**discountAmount** | **Double** |  |  [optional]
**manualDiscount** | **Boolean** |  |  [optional]
**discountCode** | [**DiscountCodeNumberDescriptionDto**](DiscountCodeNumberDescriptionDto.md) |  |  [optional]
**amount** | **Double** |  |  [optional]
**taxCategory** | [**TaxCategoryNumberDescriptionDto**](TaxCategoryNumberDescriptionDto.md) |  |  [optional]
**account** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**accountDescription** | **String** |  |  [optional]
**sub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**actualAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**actualSub** | [**SubAccountDescriptionDto**](SubAccountDescriptionDto.md) |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]
**expirationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lotSerialNumber** | **String** |  |  [optional]
**poOrderType** | [**PoOrderTypeEnum**](#PoOrderTypeEnum) |  |  [optional]
**poOrderNbr** | **String** |  |  [optional]
**poOrderLineNbr** | **Integer** |  |  [optional]
**transferOrderType** | [**TransferOrderTypeEnum**](#TransferOrderTypeEnum) |  |  [optional]
**transferOrderNbr** | **String** |  |  [optional]
**transferOrderLineNbr** | **Integer** |  |  [optional]
**completePoLine** | **Boolean** |  |  [optional]


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


<a name="PoOrderTypeEnum"></a>
## Enum: PoOrderTypeEnum
Name | Value
---- | -----
REGULARORDER | &quot;RegularOrder&quot;
DROPSHIP | &quot;DropShip&quot;
BLANKET | &quot;Blanket&quot;
STANDARDBLANKET | &quot;StandardBlanket&quot;


<a name="TransferOrderTypeEnum"></a>
## Enum: TransferOrderTypeEnum
Name | Value
---- | -----
CREDITNOTE | &quot;CreditNote&quot;
DEBITNOTE | &quot;DebitNote&quot;
INVOICE | &quot;Invoice&quot;
QUOTEORDER | &quot;QuoteOrder&quot;
RMAORDER | &quot;RMAOrder&quot;
SALESORDER | &quot;SalesOrder&quot;
STANDARDORDER | &quot;StandardOrder&quot;
TRANSFERORDER | &quot;TransferOrder&quot;



