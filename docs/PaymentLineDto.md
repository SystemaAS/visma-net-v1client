
# PaymentLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**refNbr** | **String** |  |  [optional]
**amountPaid** | **Double** |  |  [optional]
**cashDiscountTaken** | **Double** |  |  [optional]
**balanceWriteOff** | **Double** |  |  [optional]
**writeOffReasonCode** | [**ReasonCodeDto**](ReasonCodeDto.md) |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**dueDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**cashDiscountDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**balance** | **Double** |  |  [optional]
**cashDiscountBalance** | **Double** |  |  [optional]
**description** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**customerOrder** | **String** |  |  [optional]
**crossRate** | **Double** |  |  [optional]


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



