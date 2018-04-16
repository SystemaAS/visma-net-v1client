
# StocktakeLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**lineNbr** | **Integer** |  |  [optional]
**tagNbr** | **Integer** |  |  [optional]
**inventory** | [**InventoryIdNameDto**](InventoryIdNameDto.md) |  |  [optional]
**location** | [**LocationIdNameDto**](LocationIdNameDto.md) |  |  [optional]
**warehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**lotSerialNbr** | **String** |  |  [optional]
**expirationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**bookQuantity** | **Double** |  |  [optional]
**physicalQuantity** | **Double** |  |  [optional]
**varianceQuantity** | **Double** |  |  [optional]
**unitCost** | **Double** |  |  [optional]
**extVarianceCost** | **Double** |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTENTERED | &quot;NotEntered&quot;
ENTERED | &quot;Entered&quot;
SKIPPED | &quot;Skipped&quot;



