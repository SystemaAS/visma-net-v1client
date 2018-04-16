
# RotRutDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**docType** | [**DocTypeEnum**](#DocTypeEnum) |  |  [optional]
**refNbr** | **String** |  |  [optional]
**distributedAutomaticaly** | **Boolean** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**totalDeductableAmount** | **Double** |  |  [optional]
**otherCost** | **Double** |  |  [optional]
**materialCost** | **Double** |  |  [optional]
**workPrice** | **Double** |  |  [optional]
**distributedAmount** | **Double** |  |  [optional]
**appartment** | **String** |  |  [optional]
**estate** | **String** |  |  [optional]
**organizationNbr** | **String** |  |  [optional]
**distribution** | [**List&lt;RotRutDistributionDto&gt;**](RotRutDistributionDto.md) |  |  [optional]


<a name="DocTypeEnum"></a>
## Enum: DocTypeEnum
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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
RUT | &quot;Rut&quot;
ROT | &quot;Rot&quot;



