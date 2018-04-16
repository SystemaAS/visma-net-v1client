
# VatCategoryLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vatId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**calculateOn** | [**CalculateOnEnum**](#CalculateOnEnum) |  |  [optional]
**cashDiscount** | [**CashDiscountEnum**](#CashDiscountEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SALES | &quot;Sales&quot;
USE | &quot;Use&quot;
VAT | &quot;Vat&quot;
WITHHOLDING | &quot;Withholding&quot;
EXEMPTVAT | &quot;ExemptVat&quot;
STATISTICALVAT | &quot;StatisticalVat&quot;
DIRECTVAT | &quot;DirectVat&quot;
PENDINGVAT | &quot;PendingVat&quot;
REVERSEVAT | &quot;ReverseVat&quot;


<a name="CalculateOnEnum"></a>
## Enum: CalculateOnEnum
Name | Value
---- | -----
EXTRACTFROMITEMAMOUNT | &quot;ExtractFromItemAmount&quot;
ITEMAMOUNT | &quot;ItemAmount&quot;
ITEMTAXAMOUNT | &quot;ItemTaxAmount&quot;
DOCUMENTAMOUNT | &quot;DocumentAmount&quot;
DOCUMENTAXAMOUNT | &quot;DocumenTaxAmount&quot;


<a name="CashDiscountEnum"></a>
## Enum: CashDiscountEnum
Name | Value
---- | -----
TOTAXABLEAMOUNT | &quot;ToTaxableAmount&quot;
TOPROMTPAYMENT | &quot;ToPromtPayment&quot;
TOTAXAMOUNT | &quot;ToTaxAmount&quot;
ADJUSTTAX | &quot;AdjustTax&quot;
NOADJUST | &quot;NoAdjust&quot;



