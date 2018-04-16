
# CashTranTaxDetailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax** | [**TaxNumberDescriptionDto**](TaxNumberDescriptionDto.md) |  |  [optional]
**taxRate** | **Double** |  |  [optional]
**taxableAmount** | **Double** |  |  [optional]
**taxAmount** | **Double** |  |  [optional]
**deductibleTaxRate** | **Double** |  |  [optional]
**expenseAmount** | **Double** |  |  [optional]
**includeInVatExemptTotal** | **Boolean** |  |  [optional]
**pendingVat** | **Boolean** |  |  [optional]
**statisticalVat** | **Boolean** |  |  [optional]
**reverseVat** | **Boolean** |  |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) |  |  [optional]


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
SALES | &quot;Sales&quot;
USE | &quot;Use&quot;
VAT | &quot;Vat&quot;
WITHHOLDING | &quot;Withholding&quot;



