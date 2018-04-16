
# FinancialsDetailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchNumber** | **String** |  |  [optional]
**branch** | [**BranchNumberDto**](BranchNumberDto.md) |  |  [optional]
**cleared** | **Boolean** |  |  [optional]
**clearDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**taxZone** | [**VatZoneDto**](VatZoneDto.md) |  |  [optional]
**taxCalcMode** | [**TaxCalcModeEnum**](#TaxCalcModeEnum) |  |  [optional]


<a name="TaxCalcModeEnum"></a>
## Enum: TaxCalcModeEnum
Name | Value
---- | -----
TAXSETTING | &quot;TaxSetting&quot;
GROSS | &quot;Gross&quot;
NET | &quot;Net&quot;



