
# CashTransactionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tranType** | [**TranTypeEnum**](#TranTypeEnum) |  |  [optional]
**referenceNbr** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**tranDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**finPeriod** | **String** | The property is now considered obsolete. Use Financial Period instead |  [optional]
**financialPeriod** | **String** |  |  [optional]
**cashAccount** | [**AccountNumberTypeDescriptionDto**](AccountNumberTypeDescriptionDto.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**entryType** | [**EntryTypeIdDescriptionDto**](EntryTypeIdDescriptionDto.md) |  |  [optional]
**disbReceipt** | [**DisbReceiptEnum**](#DisbReceiptEnum) |  |  [optional]
**documentRef** | **String** |  |  [optional]
**owner** | [**EmployeeNumberNameDto**](EmployeeNumberNameDto.md) |  |  [optional]
**description** | **String** |  |  [optional]
**amount** | **Double** |  |  [optional]
**vatTaxableTotal** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** |  |  [optional]
**taxTotal** | **Double** |  |  [optional]
**controlTotal** | **Double** |  |  [optional]
**taxAmount** | **Double** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**transactionDetails** | [**List&lt;TransactionDetailDto&gt;**](TransactionDetailDto.md) |  |  [optional]
**taxDetails** | [**List&lt;CashTranTaxDetailDto&gt;**](CashTranTaxDetailDto.md) |  |  [optional]
**financialsDetail** | [**FinancialsDetailDto**](FinancialsDetailDto.md) |  |  [optional]


<a name="TranTypeEnum"></a>
## Enum: TranTypeEnum
Name | Value
---- | -----
TRANSFEROUT | &quot;TransferOut&quot;
TRANSFERIN | &quot;TransferIn&quot;
TRANSFEREXP | &quot;TransferExp&quot;
ADJUSTMENT | &quot;Adjustment&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
BALANCED | &quot;Balanced&quot;
HOLD | &quot;Hold&quot;
RELEASED | &quot;Released&quot;
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;


<a name="DisbReceiptEnum"></a>
## Enum: DisbReceiptEnum
Name | Value
---- | -----
DISBURSEMENT | &quot;Disbursement&quot;
RECEIPT | &quot;Receipt&quot;



