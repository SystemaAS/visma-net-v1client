
# EmployeeTimeCardQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**week** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**greaterThanValue** | **String** |  |  [optional]
**numberToRead** | **Integer** |  |  [optional]
**skipRecords** | **Integer** |  |  [optional]
**orderBy** | **String** |  |  [optional]
**lastModifiedDateTime** | **String** |  |  [optional]
**lastModifiedDateTimeCondition** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HOLD | &quot;Hold&quot;
OPEN | &quot;Open&quot;
APPROVED | &quot;Approved&quot;
REJECTED | &quot;Rejected&quot;
RELEASED | &quot;Released&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
CORRECTION | &quot;Correction&quot;
NORMALCORRECTED | &quot;NormalCorrected&quot;



