
# PaymentMethodDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMethodID** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**meansOfPayment** | [**MeansOfPaymentEnum**](#MeansOfPaymentEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**useInAP** | **Boolean** |  |  [optional]
**details** | [**List&lt;PaymentMethodDetailDto&gt;**](PaymentMethodDetailDto.md) |  |  [optional]


<a name="MeansOfPaymentEnum"></a>
## Enum: MeansOfPaymentEnum
Name | Value
---- | -----
CREDITCARD | &quot;CreditCard&quot;
CASHORCHECK | &quot;CashOrCheck&quot;
DIRECTDEPOSIT | &quot;DirectDeposit&quot;



