
# PaymentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**refNbr** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**applicationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**applicationPeriod** | **String** |  |  [optional]
**paymentRef** | **String** |  |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**paymentMethod** | [**PaymentMethodIdDescriptionDto**](PaymentMethodIdDescriptionDto.md) |  |  [optional]
**cashAccount** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**paymentAmount** | **Double** |  |  [optional]
**invoiceText** | **String** |  |  [optional]
**appliedToDocuments** | **Double** |  |  [optional]
**appliedToOrders** | **Double** |  |  [optional]
**availableBalance** | **Double** |  |  [optional]
**writeOffAmount** | **Double** |  |  [optional]
**financeCharges** | **Double** |  |  [optional]
**deductedCharges** | **Double** |  |  [optional]
**branch** | **String** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**paymentLines** | [**List&lt;PaymentLineDto&gt;**](PaymentLineDto.md) |  |  [optional]
**ordersToApply** | [**List&lt;OrderToApplyDto&gt;**](OrderToApplyDto.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PAYMENT | &quot;Payment&quot;
CREDITNOTE | &quot;CreditNote&quot;
PREPAYMENT | &quot;Prepayment&quot;
REFUND | &quot;Refund&quot;
VOIDPAYMENT | &quot;VoidPayment&quot;
SMALLBALANCEWO | &quot;SmallBalanceWo&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
BALANCED | &quot;Balanced&quot;
VOIDED | &quot;Voided&quot;
SCHEDULED | &quot;Scheduled&quot;
OPEN | &quot;Open&quot;
CLOSED | &quot;Closed&quot;
PENDINGPRINT | &quot;PendingPrint&quot;
PENDINGEMAIL | &quot;PendingEmail&quot;
CREDITHOLD | &quot;CreditHold&quot;
CCHOLD | &quot;CcHold&quot;
RESERVED | &quot;Reserved&quot;



