
# GeneralLedgerBalanceQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**periodId** | **String** |  |  [optional]
**periodIdCondition** | **String** |  |  [optional]
**orderBy** | **String** | Order Options: AccountId, FinancialPeriod |  [optional]
**accountId** | **String** |  |  [optional]
**yearClosed** | **Integer** |  |  [optional]
**balanceType** | [**BalanceTypeEnum**](#BalanceTypeEnum) |  |  [optional]
**toggleBalanceSigns** | **Integer** | Parameter can be used in order to change the balance sign for liability accounts and expense accounts, in order to match the UI |  [optional]
**pageNumber** | **Integer** |  |  [optional]
**pageSize** | **Integer** |  |  [optional]


<a name="BalanceTypeEnum"></a>
## Enum: BalanceTypeEnum
Name | Value
---- | -----
ACTUAL | &quot;Actual&quot;
REPORT | &quot;Report&quot;
STATISTICAL | &quot;Statistical&quot;
BUDGET | &quot;Budget&quot;



