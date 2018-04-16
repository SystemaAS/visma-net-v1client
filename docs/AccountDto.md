
# AccountDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountID** | **Integer** |  |  [optional]
**accountCD** | **String** |  |  [optional]
**accountClass** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**active** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**useDefaultSub** | **Boolean** |  |  [optional]
**postOption** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**taxCategory** | **String** |  |  [optional]
**cashAccount** | **Boolean** |  |  [optional]
**publicCode1** | **Integer** |  |  [optional]
**externalCode1** | **String** |  |  [optional]
**externalCode2** | **String** |  |  [optional]
**analysisCode** | **String** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ASSET | &quot;Asset&quot;
LIABILITY | &quot;Liability&quot;
INCOME | &quot;Income&quot;
EXPENSE | &quot;Expense&quot;



