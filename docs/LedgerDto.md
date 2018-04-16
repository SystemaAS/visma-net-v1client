
# LedgerDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internalId** | **Integer** |  |  [optional]
**number** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**balanceType** | [**BalanceTypeEnum**](#BalanceTypeEnum) |  |  [optional]
**currencyId** | **String** |  |  [optional]
**consolidationSource** | **Boolean** |  |  [optional]
**consolBranch** | [**ConsolBranchDto**](ConsolBranchDto.md) |  |  [optional]
**branchAccounting** | **Boolean** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="BalanceTypeEnum"></a>
## Enum: BalanceTypeEnum
Name | Value
---- | -----
ACTUAL | &quot;Actual&quot;
REPORT | &quot;Report&quot;
STATISTICAL | &quot;Statistical&quot;
BUDGET | &quot;Budget&quot;



