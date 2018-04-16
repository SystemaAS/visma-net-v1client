
# CustomerDirectDebitUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**mandateId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**mandateDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**dateOfSignature** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**isDefault** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**oneTime** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**bic** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**iban** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**lastCollectionDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]
**maxAmount** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**expirationDate** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



