
# WarehouseLocationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**inclQtyAvail** | **Boolean** |  |  [optional]
**isCosted** | **Boolean** |  |  [optional]
**salesValid** | **Boolean** |  |  [optional]
**receiptsValid** | **Boolean** |  |  [optional]
**transfersValid** | **Boolean** |  |  [optional]
**assemblyValid** | **Boolean** |  |  [optional]
**primaryItemValid** | [**PrimaryItemValidEnum**](#PrimaryItemValidEnum) |  |  [optional]
**primaryItem** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**primaryItemClass** | [**ItemClassDto**](ItemClassDto.md) |  |  [optional]
**project** | [**ProjectIdDescriptionDto**](ProjectIdDescriptionDto.md) |  |  [optional]
**projectTask** | [**ProjectTaskIdDescriptionDto**](ProjectTaskIdDescriptionDto.md) |  |  [optional]


<a name="PrimaryItemValidEnum"></a>
## Enum: PrimaryItemValidEnum
Name | Value
---- | -----
PRIMARYNOTHING | &quot;PrimaryNothing&quot;
PRIMARYITEMWARNING | &quot;PrimaryItemWarning&quot;
PRIMARYITEMERROR | &quot;PrimaryItemError&quot;
PRIMARYITEMCLASSWARNING | &quot;PrimaryItemClassWarning&quot;
PRIMARYITEMCLASSERROR | &quot;PrimaryItemClassError&quot;



