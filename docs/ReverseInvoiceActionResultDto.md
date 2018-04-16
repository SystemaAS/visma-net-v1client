
# ReverseInvoiceActionResultDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceNumber** | **String** |  |  [optional]
**creditNoteDto** | [**CreditNoteDto**](CreditNoteDto.md) |  |  [optional]
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



