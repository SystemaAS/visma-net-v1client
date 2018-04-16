
# SalesOrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | **Integer** |  |  [optional]
**printDescriptionOnInvoice** | **Boolean** |  |  [optional]
**printNoteOnExternalDocuments** | **Boolean** |  |  [optional]
**printNoteOnInternalDocuments** | **Boolean** |  |  [optional]
**soBillingContact** | [**SalesOrderContactDto**](SalesOrderContactDto.md) |  |  [optional]
**soBillingAddress** | [**SalesOrderAddressDto**](SalesOrderAddressDto.md) |  |  [optional]
**customerVATZone** | [**VatZoneDto**](VatZoneDto.md) |  |  [optional]
**invoiceSeparately** | **Boolean** |  |  [optional]
**invoiceNbr** | **String** |  |  [optional]
**invoiceDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**terms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**dueDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**cashDiscountDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**postPeriod** | **String** | The financial period to which the transactions recorded in the document should be posted. Format MMYYYY. |  [optional]
**salesPerson** | [**SalesPersonDto**](SalesPersonDto.md) |  |  [optional]
**owner** | [**UserDescriptionDto**](UserDescriptionDto.md) |  |  [optional]
**origOrderType** | **String** |  |  [optional]
**origOrderNbr** | **String** |  |  [optional]
**soShippingContact** | [**SalesOrderContactDto**](SalesOrderContactDto.md) |  |  [optional]
**soShippingAddress** | [**SalesOrderAddressDto**](SalesOrderAddressDto.md) |  |  [optional]
**schedShipment** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**shipSeparately** | **Boolean** |  |  [optional]
**shipComplete** | [**ShipCompleteEnum**](#ShipCompleteEnum) |  |  [optional]
**cancelBy** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**canceled** | **Boolean** |  |  [optional]
**preferredWarehouse** | [**WarehouseIdDescriptionDto**](WarehouseIdDescriptionDto.md) |  |  [optional]
**shipVia** | [**CarrierDescriptionDto**](CarrierDescriptionDto.md) |  |  [optional]
**fobPoint** | [**FOBPointDescriptionDto**](FOBPointDescriptionDto.md) |  |  [optional]
**priority** | **Integer** |  |  [optional]
**shippingTerms** | [**ShippingTermsDescriptionDto**](ShippingTermsDescriptionDto.md) |  |  [optional]
**shippingZone** | [**ShippingZoneDescriptionDto**](ShippingZoneDescriptionDto.md) |  |  [optional]
**residentialDelivery** | **Boolean** |  |  [optional]
**saturdayDelivery** | **Boolean** |  |  [optional]
**insurance** | **Boolean** |  |  [optional]
**transactionType** | [**SigmaIntrastatTransactionDescriptionDto**](SigmaIntrastatTransactionDescriptionDto.md) |  |  [optional]
**lines** | [**List&lt;SalesOrderLineDto&gt;**](SalesOrderLineDto.md) |  |  [optional]
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


<a name="ShipCompleteEnum"></a>
## Enum: ShipCompleteEnum
Name | Value
---- | -----
BACKORDERALLOWED | &quot;BackOrderAllowed&quot;
CANCELREMAINDER | &quot;CancelRemainder&quot;
SHIPCOMPLETE | &quot;ShipComplete&quot;


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



