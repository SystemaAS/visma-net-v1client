
# CustomerDebitNoteLinesUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**domesticServicesDeductible** | [**DtoValueNullableBoolean**](DtoValueNullableBoolean.md) |  |  [optional]
**itemType** | [**DtoValueNullableRutRotItemTypes**](DtoValueNullableRutRotItemTypes.md) |  |  [optional]
**typeOfWork** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**unitPriceInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**manualAmountInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**accountNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**vatCodeId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**discountPercent** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**discountAmountInCurrency** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**manualDiscount** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**subaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**salesperson** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**deferralSchedule** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**deferralCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**termStartDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**termEndDate** | [**DtoValueDateTime**](DtoValueDateTime.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



