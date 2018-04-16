
# AccountNumberDescriptionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**externalCode1** | **String** | ExternalCode1 is deprecated, please use ExternalCode1Info instead. |  [optional]
**externalCode2** | **String** | ExternalCode2 is deprecated, please use ExternalCode2Info instead. |  [optional]
**externalCode1Info** | [**ExternalCodeNumberDescriptionDto**](ExternalCodeNumberDescriptionDto.md) |  |  [optional]
**externalCode2Info** | [**ExternalCodeNumberDescriptionDto**](ExternalCodeNumberDescriptionDto.md) |  |  [optional]
**number** | **String** |  |  [optional]
**description** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ASSET | &quot;Asset&quot;
LIABILITY | &quot;Liability&quot;
INCOME | &quot;Income&quot;
EXPENSE | &quot;Expense&quot;



