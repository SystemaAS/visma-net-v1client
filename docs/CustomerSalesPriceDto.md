
# CustomerSalesPriceDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordId** | **Integer** |  |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) |  |  [optional]
**priceCode** | **String** |  |  [optional]
**inventoryId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**uoM** | **String** |  |  [optional]
**promotion** | **Boolean** |  |  [optional]
**breakQty** | **Double** |  |  [optional]
**price** | **Double** |  |  [optional]
**currency** | **String** |  |  [optional]
**vat** | **String** |  |  [optional]
**effectiveDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**expirationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="PriceTypeEnum"></a>
## Enum: PriceTypeEnum
Name | Value
---- | -----
ALL | &quot;All&quot;
BASE | &quot;Base&quot;
CUSTOMER | &quot;Customer&quot;
CUSTOMERPRICECLASS | &quot;CustomerPriceClass&quot;



