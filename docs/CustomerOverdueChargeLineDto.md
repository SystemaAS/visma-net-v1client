
# CustomerOverdueChargeLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) |  |  [optional]
**lineNumber** | **Integer** |  |  [optional]
**inventoryNumber** | **String** |  |  [optional]
**description** | **String** | Any comments relevant to the transaction. The alphanumeric string may contain up to 30 characters. |  [optional]
**quantity** | **Double** |  |  [optional]
**unitPrice** | **Double** | The unit price set for the item or service. If you want to update the unit price  automatically to the current value(that is, the applicable sales or default price),  you can use the Recalculate Prices and Discounts action.If you have modified  the unit price and saved the document, the value will not be updated by the  system if you change the document date. |  [optional]
**unitPriceInCurrency** | **Double** |  |  [optional]
**manualAmount** | **Double** |  |  [optional]
**manualAmountInCurrency** | **Double** |  |  [optional]
**amount** | **Double** | The amount after the discount has been applied. The value of this read-only box  is calculated automatically by deducting the discount amount from the extended price. |  [optional]
**amountInCurrency** | **Double** |  |  [optional]
**account** | [**AccountNumberDto**](AccountNumberDto.md) |  |  [optional]
**vatCode** | [**VatCodeDto**](VatCodeDto.md) |  |  [optional]
**uom** | **String** |  |  [optional]
**discountPercent** | **Double** | The percent of the line-level discount that has been applied manually or  automatically.The system selects the Manual Discount check box and  calculates the discount amount after you have entered the percent manually and  saved your changes or added a new line. |  [optional]
**discountAmount** | **Double** | The amount of the line-level discount that has been applied manually or  automatically to this line.The system selects the Manual Discount check box  and calculates the line amount after you have entered the discount amount  manually and save your changes or added a new line. |  [optional]
**discountAmountInCurrency** | **Double** |  |  [optional]
**manualDiscount** | **Boolean** | A check box that indicates (if selected) that the discount has been applied  manually.If you clear the check box, the system clears entered discount percent,  or discount amount, or selected discount code. |  [optional]
**subaccount** | [**SubAccountDto**](SubAccountDto.md) |  |  [optional]
**salesperson** | **String** |  |  [optional]
**deferralSchedule** | **Integer** |  |  [optional]
**deferralCode** | **String** | The deferral code assigned to the stock item or non-stock item specified in this  document line.Upon release of the document, the system generates a deferral  schedule (or schedules) based on the settings defined in this deferral code. |  [optional]
**discountCode** | **String** | The code of the line discount that has been applied to this line automatically or manually. |  [optional]
**note** | **String** |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]



