
# ShipmentsQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**orderBy** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
HOLD | &quot;Hold&quot;
COMPLETED | &quot;Completed&quot;
CANCELLED | &quot;Cancelled&quot;
CONFIRMED | &quot;Confirmed&quot;
INVOICED | &quot;Invoiced&quot;
RECEIPTED | &quot;Receipted&quot;
AUTOGENERATED | &quot;AutoGenerated&quot;
PARTIALLYINVOICED | &quot;PartiallyInvoiced&quot;


