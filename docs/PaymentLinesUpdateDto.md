
# PaymentLinesUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**documentType** | [**DtoValueCustomerDocumentTypes**](DtoValueCustomerDocumentTypes.md) |  |  [optional]
**refNbr** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**amountPaid** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**cashDiscountTaken** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**balanceWriteOff** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**writeOffReasonCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**crossRate** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



