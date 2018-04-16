
# CustomerUpdateDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**name** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**status** | [**DtoValueCustomerStatus**](DtoValueCustomerStatus.md) |  |  [optional]
**accountReference** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**parentRecordNumber** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**currencyId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**creditLimit** | [**DtoValueDecimal**](DtoValueDecimal.md) |  |  [optional]
**creditDaysPastDue** | [**DtoValueNullableInt16**](DtoValueNullableInt16.md) |  |  [optional]
**overrideWithClassValues** | **Boolean** |  |  [optional]
**customerClassId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**creditTermsId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**printInvoices** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**acceptAutoInvoices** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**sendInvoicesByEmail** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**printStatements** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**sendStatementsByEmail** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**printMultiCurrencyStatements** | [**DtoValueBoolean**](DtoValueBoolean.md) |  |  [optional]
**vatRegistrationId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**corporateId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**vatZoneId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**note** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**mainAddress** | [**DtoValueAddressUpdateDto**](DtoValueAddressUpdateDto.md) |  |  [optional]
**mainContact** | [**DtoValueContactInfoUpdateDto**](DtoValueContactInfoUpdateDto.md) |  |  [optional]
**creditVerification** | [**DtoValueCreditRule**](DtoValueCreditRule.md) |  |  [optional]
**invoiceAddress** | [**DtoValueAddressUpdateDto**](DtoValueAddressUpdateDto.md) |  |  [optional]
**invoiceContact** | [**DtoValueContactInfoUpdateDto**](DtoValueContactInfoUpdateDto.md) |  |  [optional]
**statementType** | [**DtoValueStatementTypes**](DtoValueStatementTypes.md) |  |  [optional]
**deliveryAddress** | [**DtoValueAddressUpdateDto**](DtoValueAddressUpdateDto.md) |  |  [optional]
**deliveryContact** | [**DtoValueContactInfoUpdateDto**](DtoValueContactInfoUpdateDto.md) |  |  [optional]
**priceClassId** | [**DtoValueString**](DtoValueString.md) |  |  [optional]
**directDebitLines** | [**List&lt;CustomerDirectDebitUpdateDto&gt;**](CustomerDirectDebitUpdateDto.md) | Update direct debit information for a customer(only for Netherlands) |  [optional]
**attributeLines** | [**List&lt;AttributeLineUpdateDto&gt;**](AttributeLineUpdateDto.md) |  |  [optional]



