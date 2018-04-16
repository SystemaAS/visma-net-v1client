
# StocktakeDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNbr** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**summaryStatus** | [**SummaryStatusEnum**](#SummaryStatusEnum) |  |  [optional]
**freezeDate** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**numberOfLines** | **Integer** |  |  [optional]
**physicalQty** | **Double** |  |  [optional]
**varianceQty** | **Double** |  |  [optional]
**varianceCost** | **Double** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**lines** | [**List&lt;StocktakeLineDto&gt;**](StocktakeLineDto.md) |  |  [optional]


<a name="SummaryStatusEnum"></a>
## Enum: SummaryStatusEnum
Name | Value
---- | -----
CANCELLED | &quot;Cancelled&quot;
COMPLETED | &quot;Completed&quot;
COUNTING | &quot;Counting&quot;
ENTERING | &quot;Entering&quot;



