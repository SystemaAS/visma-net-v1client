
# TaxDetailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxId** | **String** | The identifier of a tax applied to the document. |  [optional]
**recordId** | **Integer** | The id as stored in the database. It can be used when we want to update a tax record. |  [optional]
**vatId** | [**TaxNumberDescriptionDto**](TaxNumberDescriptionDto.md) |  |  [optional]
**vatRate** | **Double** | The tax rate of the tax. |  [optional]
**taxableAmount** | **Double** | The taxable amount for the tax, which is calculated at the document level. |  [optional]
**vatAmount** | **Double** | The tax amount for the specific tax, which is calculated at the document level. |  [optional]



