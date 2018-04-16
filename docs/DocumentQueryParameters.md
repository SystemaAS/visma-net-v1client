
# DocumentQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint. |  [optional]
**released** | **Integer** |  |  [optional]
**dunningLevel** | **Integer** |  |  [optional]
**closedFinancialPeriod** | **String** |  |  [optional]
**dunningLetterDateTime** | **String** |  |  [optional]
**dunningLetterDateTimeCondition** | **String** |  |  [optional]
**project** | **String** |  |  [optional]
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**orderBy** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**pageNumber** | **Integer** |  |  [optional]
**pageSize** | **Integer** |  |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
INVOICE | &quot;Invoice&quot;
DEBITNOTE | &quot;DebitNote&quot;
CREDITNOTE | &quot;CreditNote&quot;
PAYMENT | &quot;Payment&quot;
VOIDPAYMENT | &quot;VoidPayment&quot;
PREPAYMENT | &quot;Prepayment&quot;
REFUND | &quot;Refund&quot;
FINCHARGE | &quot;FinCharge&quot;
SMALLBALANCEWO | &quot;SmallBalanceWo&quot;
SMALLCREDITWO | &quot;SmallCreditWo&quot;
CASHSALE | &quot;CashSale&quot;
CASHRETURN | &quot;CashReturn&quot;
UNDEFINED | &quot;Undefined&quot;
NOUPDATE | &quot;NoUpdate&quot;



