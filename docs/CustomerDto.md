
# CustomerDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**internalId** | **Integer** |  |  [optional]
**number** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**mainAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**mainContact** | [**ContactInfoDto**](ContactInfoDto.md) |  |  [optional]
**accountReference** | **String** |  |  [optional]
**parentRecord** | [**ParentRecordDto**](ParentRecordDto.md) |  |  [optional]
**customerClass** | [**ClassDescriptionDto**](ClassDescriptionDto.md) |  |  [optional]
**creditTerms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**currencyId** | **String** |  |  [optional]
**creditVerification** | [**CreditVerificationEnum**](#CreditVerificationEnum) |  |  [optional]
**creditLimit** | **Double** |  |  [optional]
**creditDaysPastDue** | **Integer** |  |  [optional]
**invoiceAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**invoiceContact** | [**ContactInfoDto**](ContactInfoDto.md) |  |  [optional]
**printInvoices** | **Boolean** |  |  [optional]
**acceptAutoInvoices** | **Boolean** |  |  [optional]
**sendInvoicesByEmail** | **Boolean** |  |  [optional]
**printStatements** | **Boolean** |  |  [optional]
**sendStatementsByEmail** | **Boolean** |  |  [optional]
**printMultiCurrencyStatements** | **Boolean** |  |  [optional]
**statementType** | [**StatementTypeEnum**](#StatementTypeEnum) |  |  [optional]
**deliveryAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**deliveryContact** | [**ContactInfoDto**](ContactInfoDto.md) |  |  [optional]
**vatRegistrationId** | **String** |  |  [optional]
**corporateId** | **String** |  |  [optional]
**vatZone** | [**VatZoneDto**](VatZoneDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**attributes** | [**List&lt;AttributeIdValueDto&gt;**](AttributeIdValueDto.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**createdDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**directDebitLines** | [**List&lt;CustomerDirectDebitDto&gt;**](CustomerDirectDebitDto.md) |  |  [optional]
**priceClass** | [**PriceClassDto**](PriceClassDto.md) |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
ONHOLD | &quot;OnHold&quot;
CREDITHOLD | &quot;CreditHold&quot;
INACTIVE | &quot;Inactive&quot;
ONETIME | &quot;OneTime&quot;


<a name="CreditVerificationEnum"></a>
## Enum: CreditVerificationEnum
Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
DAYSPASTDUE | &quot;DaysPastDue&quot;
CREDITLIMIT | &quot;CreditLimit&quot;
LIMITANDDAYSPASTDUE | &quot;LimitAndDaysPastDue&quot;


<a name="StatementTypeEnum"></a>
## Enum: StatementTypeEnum
Name | Value
---- | -----
OPENITEM | &quot;OpenItem&quot;
BALANCEBROUGHTFORWARD | &quot;BalanceBroughtForward&quot;



