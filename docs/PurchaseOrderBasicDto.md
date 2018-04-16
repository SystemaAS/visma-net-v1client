
# PurchaseOrderBasicDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  |  [optional]
**orderNbr** | **String** |  |  [optional]
**hold** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**date** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**promisedOn** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**supplier** | [**SupplierDescriptionDto**](SupplierDescriptionDto.md) |  |  [optional]
**location** | [**LocationIdNameDto**](LocationIdNameDto.md) |  |  [optional]
**owner** | [**UserDescriptionDto**](UserDescriptionDto.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**supplierRef** | **String** |  |  [optional]
**lineTotal** | **Double** |  |  [optional]
**vatExemptTotal** | **Double** |  |  [optional]
**taxTotal** | **Double** |  |  [optional]
**orderTotal** | **Double** |  |  [optional]
**controlTotal** | **Double** |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**lines** | [**List&lt;PurchaseOrderLineDto&gt;**](PurchaseOrderLineDto.md) |  |  [optional]
**taxDetails** | [**List&lt;TaxDetailDto&gt;**](TaxDetailDto.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
REGULARORDER | &quot;RegularOrder&quot;
DROPSHIP | &quot;DropShip&quot;
BLANKET | &quot;Blanket&quot;
STANDARDBLANKET | &quot;StandardBlanket&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
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



