
# GeneralLedgerBalanceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**ledger** | [**LedgerDescriptionDto**](LedgerDescriptionDto.md) |  |  [optional]
**balanceType** | [**BalanceTypeEnum**](#BalanceTypeEnum) |  |  [optional]
**financialPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format YYYYMM. |  [optional]
**account** | [**AccountNumberDescriptionDto**](AccountNumberDescriptionDto.md) |  |  [optional]
**subaccountId** | **String** |  |  [optional]
**currencyId** | **String** |  |  [optional]
**periodToDateDebit** | **Double** |  |  [optional]
**periodToDateCredit** | **Double** |  |  [optional]
**beginningBalance** | **Double** |  |  [optional]
**yearToDateBalance** | **Double** |  |  [optional]
**periodToDateDebitInCurrency** | **Double** |  |  [optional]
**periodToDateCreditInCurrency** | **Double** |  |  [optional]
**beginningBalanceInCurrency** | **Double** |  |  [optional]
**yearToDateBalanceInCurrency** | **Double** |  |  [optional]
**yearClosed** | **Boolean** |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="BalanceTypeEnum"></a>
## Enum: BalanceTypeEnum
Name | Value
---- | -----
ACTUAL | &quot;Actual&quot;
REPORT | &quot;Report&quot;
STATISTICAL | &quot;Statistical&quot;
BUDGET | &quot;Budget&quot;



