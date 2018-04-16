
# PurchaseOrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingDestinationType** | [**ShippingDestinationTypeEnum**](#ShippingDestinationTypeEnum) |  |  [optional]
**shipTo** | [**BAccountDescriptionDto**](BAccountDescriptionDto.md) |  |  [optional]
**shippingLocation** | [**LocationIdNameDto**](LocationIdNameDto.md) |  |  [optional]
**shippingContact** | [**PurchaseOrderContactDto**](PurchaseOrderContactDto.md) |  |  [optional]
**shippingAddress** | [**PurchaseOrderAddressDto**](PurchaseOrderAddressDto.md) |  |  [optional]
**fobPoint** | **String** |  |  [optional]
**shipVia** | **String** |  |  [optional]
**remitContact** | [**PurchaseOrderContactDto**](PurchaseOrderContactDto.md) |  |  [optional]
**remitAddress** | [**PurchaseOrderAddressDto**](PurchaseOrderAddressDto.md) |  |  [optional]
**terms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**supplierVatZone** | [**VatZoneDto**](VatZoneDto.md) |  |  [optional]
**discountDetails** | [**List&lt;DiscountDetailDto&gt;**](DiscountDetailDto.md) |  |  [optional]
**salesOrderType** | **String** |  |  [optional]
**salesOrderNbr** | **String** |  |  [optional]
**requisitionRefNbr** | **String** |  |  [optional]
**paymentRefNbr** | **String** |  |  [optional]
**workgroupID** | **Integer** |  |  [optional]
**dontPrint** | **Boolean** |  |  [optional]
**printed** | **Boolean** |  |  [optional]
**dontEmail** | **Boolean** |  |  [optional]
**emailed** | **Boolean** |  |  [optional]
**openQuantity** | **Double** |  |  [optional]
**openBalance** | **Double** |  |  [optional]
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


<a name="ShippingDestinationTypeEnum"></a>
## Enum: ShippingDestinationTypeEnum
Name | Value
---- | -----
COMPANYLOCATION | &quot;CompanyLocation&quot;
CUSTOMER | &quot;Customer&quot;
VENDOR | &quot;Vendor&quot;
SITE | &quot;Site&quot;


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



