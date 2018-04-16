
# WarehouseDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouseID** | **String** |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**replenishmentClass** | [**ReplenishmentClassIdDescriptionDto**](ReplenishmentClassIdDescriptionDto.md) |  |  [optional]
**active** | **Boolean** |  |  [optional]
**lockSitePICountEntry** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**locationEntry** | [**LocationEntryEnum**](#LocationEntryEnum) |  |  [optional]
**avgDefaultCost** | [**AvgDefaultCostEnum**](#AvgDefaultCostEnum) |  |  [optional]
**fifoDefaultCost** | [**FifoDefaultCostEnum**](#FifoDefaultCostEnum) |  |  [optional]
**receiptLocation** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**shipLocation** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**returnLocation** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**dropShipLocation** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**contact** | [**WarehouseContactDto**](WarehouseContactDto.md) |  |  [optional]
**address** | [**WarehouseAddressDto**](WarehouseAddressDto.md) |  |  [optional]
**locations** | [**List&lt;WarehouseLocationDto&gt;**](WarehouseLocationDto.md) |  |  [optional]


<a name="LocationEntryEnum"></a>
## Enum: LocationEntryEnum
Name | Value
---- | -----
VALIDATE | &quot;Validate&quot;
WARN | &quot;Warn&quot;
NOVALIDATE | &quot;NoValidate&quot;


<a name="AvgDefaultCostEnum"></a>
## Enum: AvgDefaultCostEnum
Name | Value
---- | -----
AVERAGECOST | &quot;AverageCost&quot;
LASTCOST | &quot;LastCost&quot;


<a name="FifoDefaultCostEnum"></a>
## Enum: FifoDefaultCostEnum
Name | Value
---- | -----
AVERAGECOST | &quot;AverageCost&quot;
LASTCOST | &quot;LastCost&quot;



