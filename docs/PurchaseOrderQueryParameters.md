
# PurchaseOrderQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional]
**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) |  |  [optional]
**supplier** | **String** |  |  [optional]


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
REGULARORDER | &quot;RegularOrder&quot;
DROPSHIP | &quot;DropShip&quot;
BLANKET | &quot;Blanket&quot;
STANDARDBLANKET | &quot;StandardBlanket&quot;


<a name="OrderStatusEnum"></a>
## Enum: OrderStatusEnum
Name | Value
---- | -----
BALANCED | &quot;Balanced&quot;
CANCELLED | &quot;Cancelled&quot;
CLOSED | &quot;Closed&quot;
HOLD | &quot;Hold&quot;
OPEN | &quot;Open&quot;
PENDINGEMAIL | &quot;PendingEmail&quot;
PENDINGPRINT | &quot;PendingPrint&quot;
PRINTED | &quot;Printed&quot;
VOIDED | &quot;Voided&quot;



