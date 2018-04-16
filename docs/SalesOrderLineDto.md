
# SalesOrderLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invoiceNbr** | **String** |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**freeItem** | **Boolean** |  |  [optional]
**requestedOn** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**shipOn** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**shipComplete** | [**ShipCompleteEnum**](#ShipCompleteEnum) |  |  [optional]
**undershipThreshold** | **Double** |  |  [optional]
**overshipThreshold** | **Double** |  |  [optional]
**completed** | **Boolean** |  |  [optional]
**markForPO** | **Boolean** |  |  [optional]
**poSource** | [**PoSourceEnum**](#PoSourceEnum) |  |  [optional]
**lotSerialNbr** | **String** |  |  [optional]
**expirationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**salesPerson** | [**SalesPersonDto**](SalesPersonDto.md) |  |  [optional]
**taxCategory** | **String** |  |  [optional]
**commissionable** | **Boolean** |  |  [optional]
**alternateID** | **String** |  |  [optional]
**projectTask** | **Integer** |  |  [optional]
**lineNbr** | **Integer** |  |  [optional]
**sortOrder** | **Integer** |  |  [optional]
**inventory** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**uom** | **String** |  |  [optional]
**quantity** | **Double** |  |  [optional]
**qtyOnShipments** | **Double** |  |  [optional]
**openQty** | **Double** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**unitPrice** | **Double** |  |  [optional]
**discountCode** | **String** |  |  [optional]
**discountPercent** | **Double** |  |  [optional]
**discountAmount** | **Double** |  |  [optional]
**manualDiscount** | **Boolean** |  |  [optional]
**discUnitPrice** | **Double** |  |  [optional]
**extPrice** | **Double** |  |  [optional]
**unbilledAmount** | **Double** |  |  [optional]
**lineDescription** | **String** |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**note** | **String** |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) | The data containing information about the document attachments |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
ISSUE | &quot;Issue&quot;
RECEIPT | &quot;Receipt&quot;


<a name="ShipCompleteEnum"></a>
## Enum: ShipCompleteEnum
Name | Value
---- | -----
BACKORDERALLOWED | &quot;BackOrderAllowed&quot;
CANCELREMAINDER | &quot;CancelRemainder&quot;
SHIPCOMPLETE | &quot;ShipComplete&quot;


<a name="PoSourceEnum"></a>
## Enum: PoSourceEnum
Name | Value
---- | -----
DROPSHIPTOORDER | &quot;DropShipToOrder&quot;
MANUFACTURED | &quot;Manufactured&quot;
NONE | &quot;None&quot;
PURCHASED | &quot;Purchased&quot;
PURCHASETOORDER | &quot;PurchaseToOrder&quot;
TRANSFER | &quot;Transfer&quot;



