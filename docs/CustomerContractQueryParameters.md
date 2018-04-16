
# CustomerContractQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**orderBy** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]
**contractTemplate** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**customer** | **String** |  |  [optional]
**expandSummary** | **Boolean** |  |  [optional]
**expandDetails** | **Boolean** |  |  [optional]
**attributes** | **String** |  |  [optional]
**expandAttributes** | **Boolean** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;Draft&quot;
INAPPROVAL | &quot;InApproval&quot;
ACTIVE | &quot;Active&quot;
EXPIRED | &quot;Expired&quot;
CANCELED | &quot;Canceled&quot;
COMPLETED | &quot;Completed&quot;
INUPGRADE | &quot;InUpgrade&quot;
PENDINGACTIVATION | &quot;PendingActivation&quot;



