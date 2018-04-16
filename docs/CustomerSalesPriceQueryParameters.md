
# CustomerSalesPriceQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) |  |  [optional]
**priceCode** | **String** |  |  [optional]
**inventoryId** | **String** |  |  [optional]
**effectiveAsOf** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**pageNumber** | **Integer** |  |  [optional]
**pageSize** | **Integer** |  |  [optional]


<a name="PriceTypeEnum"></a>
## Enum: PriceTypeEnum
Name | Value
---- | -----
ALL | &quot;All&quot;
BASE | &quot;Base&quot;
CUSTOMER | &quot;Customer&quot;
CUSTOMERPRICECLASS | &quot;CustomerPriceClass&quot;



