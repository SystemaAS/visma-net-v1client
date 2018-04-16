
# SupplierInvoiceLineUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**lineNumber** | [**DtoValueInt32**](DtoValueInt32.md) |  |  [optional]
**inventoryNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**transactionDescription** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**quantity** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**unitCostInCurrency** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**costInCurrency** | [**DtoValueNullableDecimal**](DtoValueNullableDecimal.md) |  |  [optional]
**accountNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**subaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) |  |  [optional]
**deferralSchedule** | [**DtoValueNullableInt32**](DtoValueNullableInt32.md) |  |  [optional]
**deferralCode** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**vatCodeId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) | Branch is deprecated, please use BranchNumber instead. |  [optional]
**branchNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



