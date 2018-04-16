
# CustomerContractDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractId** | **String** |  |  [optional]
**contractTemplate** | [**ContractTemplateIdDescriptionDto**](ContractTemplateIdDescriptionDto.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**customer** | [**CustomerNumberDto**](CustomerNumberDto.md) |  |  [optional]
**location** | [**LocationNameDescriptionDto**](LocationNameDescriptionDto.md) |  |  [optional]
**description** | **String** |  |  [optional]
**balance** | **Double** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**summary** | [**CustomerContractSummaryDto**](CustomerContractSummaryDto.md) |  |  [optional]
**details** | [**CustomerContractDetailsDto**](CustomerContractDetailsDto.md) |  |  [optional]
**attributes** | [**List&lt;AttributeIdValueDto&gt;**](AttributeIdValueDto.md) |  |  [optional]


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



