
# JournalTransactionLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**accountNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**subaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**referenceNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**transactionDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**debitAmountInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**creditAmountInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**vatCodeId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**vatId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



