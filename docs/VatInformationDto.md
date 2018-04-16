
# VatInformationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vatCategoryId** | **String** | VatCategoryId is deprecated, please use Vat Id instead |  [optional]
**vatId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**deductibleVat** | **Boolean** |  |  [optional]
**reverseVat** | **Boolean** |  |  [optional]
**statisticalVat** | **Boolean** |  |  [optional]
**pendingVat** | **Boolean** |  |  [optional]
**includeinVatExemptTotal** | **Boolean** |  |  [optional]
**includeinVatTotal** | **Boolean** |  |  [optional]
**enterFromVatInvoice** | **Boolean** |  |  [optional]
**calculateOn** | [**CalculateOnEnum**](#CalculateOnEnum) |  |  [optional]
**cashDiscount** | [**CashDiscountEnum**](#CashDiscountEnum) |  |  [optional]
**vatAgencyId** | [**SupplierNumberDto**](SupplierNumberDto.md) |  |  [optional]
**notValidAfter** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**euReportCode** | [**EuReportCodeEnum**](#EuReportCodeEnum) |  |  [optional]
**documentText** | [**DocumentTextEnum**](#DocumentTextEnum) |  |  [optional]
**defaultNonStockItem** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]
**vismaXmlVatType** | [**VismaXmlVatTypeEnum**](#VismaXmlVatTypeEnum) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**glAccounts** | [**VatGlAccountsDto**](VatGlAccountsDto.md) |  |  [optional]
**schedules** | [**List&lt;VatInformationScheduleDto&gt;**](VatInformationScheduleDto.md) |  |  [optional]
**categories** | [**List&lt;VatCategoryDto&gt;**](VatCategoryDto.md) |  |  [optional]
**zones** | [**List&lt;VatZoneDto&gt;**](VatZoneDto.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SALES | &quot;Sales&quot;
USE | &quot;Use&quot;
VAT | &quot;Vat&quot;
WITHHOLDING | &quot;Withholding&quot;
EXEMPTVAT | &quot;ExemptVat&quot;
STATISTICALVAT | &quot;StatisticalVat&quot;
DIRECTVAT | &quot;DirectVat&quot;
PENDINGVAT | &quot;PendingVat&quot;
REVERSEVAT | &quot;ReverseVat&quot;


<a name="CalculateOnEnum"></a>
## Enum: CalculateOnEnum
Name | Value
---- | -----
EXTRACTFROMITEMAMOUNT | &quot;ExtractFromItemAmount&quot;
ITEMAMOUNT | &quot;ItemAmount&quot;
ITEMTAXAMOUNT | &quot;ItemTaxAmount&quot;
DOCUMENTAMOUNT | &quot;DocumentAmount&quot;
DOCUMENTAXAMOUNT | &quot;DocumenTaxAmount&quot;


<a name="CashDiscountEnum"></a>
## Enum: CashDiscountEnum
Name | Value
---- | -----
TOTAXABLEAMOUNT | &quot;ToTaxableAmount&quot;
TOPROMTPAYMENT | &quot;ToPromtPayment&quot;
TOTAXAMOUNT | &quot;ToTaxAmount&quot;
ADJUSTTAX | &quot;AdjustTax&quot;
NOADJUST | &quot;NoAdjust&quot;


<a name="EuReportCodeEnum"></a>
## Enum: EuReportCodeEnum
Name | Value
---- | -----
SALESOFGOODS | &quot;SalesOfGoods&quot;
TRIANGULATION | &quot;Triangulation&quot;
SALESOFSERVICE | &quot;SalesOfService&quot;


<a name="DocumentTextEnum"></a>
## Enum: DocumentTextEnum
Name | Value
---- | -----
CONSTRUCTION | &quot;Construction&quot;
SUPPLYVAT0 | &quot;SupplyVat0&quot;
DENOTEEXPORTSALES | &quot;DenoteExportSales&quot;
EUSALEEXEMPTFROMTAX | &quot;EUSaleExemptFromTax&quot;
TRIANGULATION | &quot;Triangulation&quot;
TRANSPORTOUTSIDEEU | &quot;TransportOutsideEU&quot;
SPECIALTAXFREETRANSFER | &quot;SpecialTaxFreeTransfer&quot;
MEDICALSERVICESALES | &quot;MedicalServiceSales&quot;
BUYERHASVATLIABILITY | &quot;BuyerHasVATLiability&quot;
SALESOFGOLD | &quot;SalesOfGold&quot;
GOODSSERVICESWITHPARTIALDEDUCTION | &quot;GoodsServicesWithPartialDeduction&quot;
MARGINESCHEME | &quot;MargineScheme&quot;
TRAVELAGENTSMARGINESCHEME | &quot;TravelAgentsMargineScheme&quot;
PARTIALLYNONDEDUCTIBLEINUSE | &quot;PartiallyNonDeductibleInUse&quot;
VAT0SALESOUTSIDECOMMUNITY | &quot;Vat0SalesOutsideCommunity&quot;
SELFBILLING | &quot;SelfBilling&quot;
MARGINESCHEMEUSEDITEMS | &quot;MargineSchemeUsedItems&quot;
MARGINESCHEMEWORKSOFART | &quot;MargineSchemeWorksOfArt&quot;
MARGINESCHEMECOLLECTORSITEMS | &quot;MargineSchemeCollectorsItems&quot;


<a name="VismaXmlVatTypeEnum"></a>
## Enum: VismaXmlVatTypeEnum
Name | Value
---- | -----
VATTYPEHIGH | &quot;VatTypeHigh&quot;
VATTYPEMEDIUM | &quot;VatTypeMedium&quot;
VATTYPELOW | &quot;VatTypeLow&quot;
VATTYPEZERO | &quot;VatTypeZero&quot;
VATTYPEEXEMPT | &quot;VatTypeExempt&quot;



