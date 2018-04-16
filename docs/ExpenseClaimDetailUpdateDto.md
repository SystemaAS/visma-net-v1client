
# ExpenseClaimDetailUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) |  |  [optional]
**claimDetailId** | [**DtoValueInt32**](DtoValueInt32.md) | Identifies the expense claim detail line to update |  [optional]
**date** | [**DtoValueDateTime**](DtoValueDateTime.md) | The date when the expense was incurred. |  [optional]
**expenseItem** | [**DtoValueString**](DtoValueString.md) | The expense identifier, if an expense of this type is listed as an inventory nonstock item. |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) | A description of the transaction. |  [optional]
**quantity** | [**DtoValueDecimal**](DtoValueDecimal.md) | The quantity of this expense item. |  [optional]
**uom** | [**DtoValueString**](DtoValueString.md) | The unit of measure in which the quantity is shown. |  [optional]
**unitCost** | [**DtoValueDecimal**](DtoValueDecimal.md) | The cost of a unit of the item. |  [optional]
**invoiceable** | [**DtoValueBoolean**](DtoValueBoolean.md) | The currency of the expense receipt. However, if you enter a claim line directly, the currency value is read-only and matching the claim currency. |  [optional]
**project** | [**DtoValueString**](DtoValueString.md) | The project or customer contract associated with the expense claim, if the work performed was for a project or contract. Project Task The task associated with the contract or project. |  [optional]
**projectTask** | [**DtoValueString**](DtoValueString.md) | The task associated with the contract or project. |  [optional]
**expenseAccount** | [**DtoValueString**](DtoValueString.md) | The expense account to which the system should record the part of the expense to be paid back to the employee. |  [optional]
**expenseSubaccount** | [**List&lt;SegmentUpdateDto&gt;**](SegmentUpdateDto.md) | The corresponding subaccount the system uses to record the part of the expense to be paid back to the employee. |  [optional]
**branch** | [**DtoValueString**](DtoValueString.md) | The branch that will reimburse the expenses to the employee. |  [optional]
**taxCategory** | [**DtoValueString**](DtoValueString.md) | The tax category associated with the expense item. |  [optional]
**refNbr** | [**DtoValueString**](DtoValueString.md) | The identifier of the transaction. |  [optional]
**employeePart** | [**DtoValueDecimal**](DtoValueDecimal.md) | The part of the total amount that will not be paid back to the employee. The percentage depends on the company policy. |  [optional]
**customer** | [**DtoValueString**](DtoValueString.md) | The identifier of the customer associated with the expense. |  [optional]
**location** | [**DtoValueString**](DtoValueString.md) | The identifier of the customer location associated with the expense. |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
INSERT | &quot;Insert&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



