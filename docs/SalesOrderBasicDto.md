
# SalesOrderBasicDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lines** | [**List&lt;SalesOrderDocumentLineDto&gt;**](SalesOrderDocumentLineDto.md) |  |  [optional]
**orderType** | **String** |  |  [optional]
**orderNo** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**requestOn** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**customerOrder** | **String** |  |  [optional]
**customerRefNo** | **String** |  |  [optional]
**customer** | [**CustomerDescriptionDto**](CustomerDescriptionDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**orderTotal** | **Double** |  |  [optional]
**vatTaxableTotal** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** |  |  [optional]
**taxTotal** | **Double** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**branchNumber** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**note** | **String** |  |  [optional]
**attachments** | [**List&lt;AttachmentDto&gt;**](AttachmentDto.md) | The data containing information about the document attachments |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


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



