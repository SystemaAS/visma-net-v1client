
# ReverseCashTransactionActionResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNbr** | **String** |  |  [optional]
**cashTransaction** | [**CashTransactionDto**](CashTransactionDto.md) |  |  [optional]
**actionId** | [**UUID**](UUID.md) |  |  [optional]
**actionResult** | [**ActionResultEnum**](#ActionResultEnum) |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="ActionResultEnum"></a>
## Enum: ActionResultEnum
Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
INPROCESS | &quot;InProcess&quot;
FAILED | &quot;Failed&quot;
DONE | &quot;Done&quot;



