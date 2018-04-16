
# StocktakeQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouse** | **String** |  |  [optional]
**location** | **String** |  |  [optional]
**inventory** | **String** |  |  [optional]
**lotSerialNumber** | **String** |  |  [optional]
**summaryStatus** | [**SummaryStatusEnum**](#SummaryStatusEnum) |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**startWithLine** | **Integer** |  |  [optional]
**endWithLine** | **Integer** |  |  [optional]
**freezeDateTime** | **String** |  |  [optional]
**freezeDateTimeCondition** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**expirationDateTime** | **String** |  |  [optional]
**expirationDateTimeCondition** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]


<a name="SummaryStatusEnum"></a>
## Enum: SummaryStatusEnum
Name | Value
---- | -----
CANCELLED | &quot;Cancelled&quot;
COMPLETED | &quot;Completed&quot;
COUNTING | &quot;Counting&quot;
ENTERING | &quot;Entering&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTENTERED | &quot;NotEntered&quot;
ENTERED | &quot;Entered&quot;
SKIPPED | &quot;Skipped&quot;



