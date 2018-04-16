
# OrderToApplyDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderType** | **String** |  |  [optional]
**orderNo** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**appliedToOrder** | **Double** |  |  [optional]
**transferredToInvoice** | **Double** |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**dueDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**cashDiscountDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**balance** | **Double** |  |  [optional]
**description** | **String** |  |  [optional]
**orderTotal** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**invoiceNbr** | **String** |  |  [optional]
**invoiceDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
HOLD | &quot;Hold&quot;
CREDITHOLD | &quot;CreditHold&quot;
COMPLETED | &quot;Completed&quot;
CANCELLED | &quot;Cancelled&quot;
BACKORDER | &quot;BackOrder&quot;
SHIPPING | &quot;Shipping&quot;
INVOICED | &quot;Invoiced&quot;



