
# InventoryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inventoryId** | **Integer** | The unique internal identifier of the  item as is stored in the database |  [optional]
**inventoryNumber** | **String** | The unique alphanumeric identifier of the  item that is used in UI |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**itemClass** | [**ItemClassDto**](ItemClassDto.md) | The item class to which the item is assigned. Selecting a class provides default settings for the item. |  [optional]
**postingClass** | [**PostingClassDto**](PostingClassDto.md) | The posting class of the item, which by default is the posting class assigned to the item class. |  [optional]
**vatCode** | [**VatCodeDto**](VatCodeDto.md) | The vat category of the item, which by default is the vat category associated with the item class. |  [optional]
**defaultPrice** | **Double** | The price of the item. This price is used as the default price, if there are no other prices |  [optional]
**pendingCost** | **Double** | The pending standard cost for the item. |  [optional]
**pendingCostDate** | [**LocalDateTime**](LocalDateTime.md) | The date when the pending standard cost becomes effective. |  [optional]
**currentCost** | **Double** | The current standard cost for the item. |  [optional]
**effectiveDate** | [**LocalDateTime**](LocalDateTime.md) | The effective date for the current standard cost of the item. |  [optional]
**lastCost** | **Double** | The last standard cost defined for the item. |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**baseUnit** | **String** |  |  [optional]
**salesUnit** | **String** |  |  [optional]
**purchaseUnit** | **String** |  |  [optional]
**costPriceStatistics** | [**CostPriceStatisticsDto**](CostPriceStatisticsDto.md) |  |  [optional]
**crossReferences** | [**List&lt;InventoryCrossReferenceDto&gt;**](InventoryCrossReferenceDto.md) |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**attributes** | [**List&lt;AttributeIdValueDto&gt;**](AttributeIdValueDto.md) |  |  [optional]
**warehouseDetails** | [**List&lt;WarehouseDetailDto&gt;**](WarehouseDetailDto.md) |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
NOSALES | &quot;NoSales&quot;
NOPURCHASES | &quot;NoPurchases&quot;
NOREQUEST | &quot;NoRequest&quot;
INACTIVE | &quot;Inactive&quot;
MARKEDFORDELETION | &quot;MarkedForDeletion&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NONSTOCKITEM | &quot;NonStockItem&quot;
LABORITEM | &quot;LaborItem&quot;
SERVICEITEM | &quot;ServiceItem&quot;
CHARGEITEM | &quot;ChargeItem&quot;
EXPENSEITEM | &quot;ExpenseItem&quot;
FINISHEDGOODITEM | &quot;FinishedGoodItem&quot;
COMPONENTPARTITEM | &quot;ComponentPartItem&quot;
SUBASSEMBLYITEM | &quot;SubassemblyItem&quot;



