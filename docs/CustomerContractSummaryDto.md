
# CustomerContractSummaryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setupDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**activationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**expirationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**terminationDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**massRenewal** | **Boolean** |  |  [optional]
**renewalPoint** | **Integer** |  |  [optional]
**gracePeriod** | **Integer** |  |  [optional]
**currency** | **String** |  |  [optional]
**invoicingScheduleStartsOn** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**invoicingPeriod** | [**InvoicingPeriodEnum**](#InvoicingPeriodEnum) |  |  [optional]
**lastInvoicingDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**nextInvoicingDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**invoiceTo** | [**InvoiceToEnum**](#InvoiceToEnum) |  |  [optional]
**invoiceAccount** | [**CustomerNumberDto**](CustomerNumberDto.md) |  |  [optional]
**invoiceLocation** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**owner** | [**EmployeeNumberNameDto**](EmployeeNumberNameDto.md) |  |  [optional]
**salesPerson** | [**SalesPersonDto**](SalesPersonDto.md) |  |  [optional]
**caseCountItem** | [**InventoryNumberDescriptionDto**](InventoryNumberDescriptionDto.md) |  |  [optional]


<a name="InvoicingPeriodEnum"></a>
## Enum: InvoicingPeriodEnum
Name | Value
---- | -----
STATEMENT | &quot;Statement&quot;
QUARTERLY | &quot;Quarterly&quot;
MONTHLY | &quot;Monthly&quot;
ANNUAL | &quot;Annual&quot;
SEMIANNUAL | &quot;SemiAnnual&quot;
WEEKLY | &quot;Weekly&quot;
ONDEMAND | &quot;OnDemand&quot;


<a name="InvoiceToEnum"></a>
## Enum: InvoiceToEnum
Name | Value
---- | -----
PARENTACCOUNT | &quot;ParentAccount&quot;
CUSTOMERACCOUNT | &quot;CustomerAccount&quot;
SPECIFICACCOUNT | &quot;SpecificAccount&quot;



