
# ExpenseClaimUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**DtoValueNullableDateTime**](DtoValueNullableDateTime.md) | The date when the claim was entered. |  [optional]
**description** | [**DtoValueString**](DtoValueString.md) | A description of the claim. |  [optional]
**claimedBy** | [**DtoValueString**](DtoValueString.md) | The employee who is claiming the expenses. If the claim is released, an Accounts Payable bill will be generated to this employee. |  [optional]
**customer** | [**DtoValueString**](DtoValueString.md) | The applicable customer. |  [optional]
**customerUpdateAnswer** | [**CustomerUpdateAnswerEnum**](#CustomerUpdateAnswerEnum) | If the customer is updated the claim details customer information can be updated using the provided answer. By default &#39;SelectedCustomer&#39; is selected. |  [optional]
**location** | [**DtoValueString**](DtoValueString.md) | The company location associated with the claim. |  [optional]
**details** | [**List&lt;ExpenseClaimDetailUpdateDto&gt;**](ExpenseClaimDetailUpdateDto.md) | Expense Claim detail information |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="CustomerUpdateAnswerEnum"></a>
## Enum: CustomerUpdateAnswerEnum
Name | Value
---- | -----
SELECTEDCUSTOMER | &quot;SelectedCustomer&quot;
ALLLINES | &quot;AllLines&quot;
NOTHING | &quot;Nothing&quot;



