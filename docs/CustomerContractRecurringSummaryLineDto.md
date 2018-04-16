
# CustomerContractRecurringSummaryLineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemCode** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**itemId** | **String** |  |  [optional]
**uom** | **String** |  |  [optional]
**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional]
**included** | **Double** |  |  [optional]
**recurringPrice** | **Double** |  |  [optional]
**recurringDiscount** | **Double** |  |  [optional]
**extraUsagePrice** | **Double** |  |  [optional]
**unInvoiced** | **Double** |  |  [optional]
**usedTotal** | **Double** |  |  [optional]


<a name="InvoiceTypeEnum"></a>
## Enum: InvoiceTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
PREPAY | &quot;Prepay&quot;
USAGE | &quot;Usage&quot;
DEPOSITS | &quot;Deposits&quot;



