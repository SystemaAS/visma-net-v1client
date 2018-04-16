
# SupplierDto

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
**supplierClass** | [**ClassDescriptionDto**](ClassDescriptionDto.md) |  |  [optional]
**creditTerms** | [**CreditTermsDto**](CreditTermsDto.md) |  |  [optional]
**documentLanguage** | **String** |  |  [optional]
**currencyId** | **String** |  |  [optional]
**remitAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**remitContact** | [**ContactInfoDto**](ContactInfoDto.md) |  |  [optional]
**paymentMethod** | [**PaymentMethodIdDescriptionDto**](PaymentMethodIdDescriptionDto.md) |  |  [optional]
**cashAccount** | **String** |  |  [optional]
**chargeBearer** | [**ChargeBearerEnum**](#ChargeBearerEnum) |  |  [optional]
**accountUsedForPayment** | [**AccountUsedForPaymentEnum**](#AccountUsedForPaymentEnum) |  |  [optional]
**paymentBy** | [**PaymentByEnum**](#PaymentByEnum) |  |  [optional]
**paymentLeadTime** | **Integer** |  |  [optional]
**paymentRefDisplayMask** | **String** |  |  [optional]
**paySeparately** | **Boolean** |  |  [optional]
**supplierAddress** | [**AddressDto**](AddressDto.md) |  |  [optional]
**supplierContact** | [**ContactInfoDto**](ContactInfoDto.md) |  |  [optional]
**location** | [**LocationDescriptionDto**](LocationDescriptionDto.md) |  |  [optional]
**vatRegistrationId** | **String** |  |  [optional]
**corporateId** | **String** |  |  [optional]
**vatZone** | [**VatZoneDto**](VatZoneDto.md) |  |  [optional]
**attributes** | [**List&lt;AttributeIdValueDto&gt;**](AttributeIdValueDto.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**supplierPaymentMethodDetails** | [**List&lt;SupplierPaymentMethodDetailDto&gt;**](SupplierPaymentMethodDetailDto.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
ONHOLD | &quot;OnHold&quot;
HOLDPAYMENTS | &quot;HoldPayments&quot;
INACTIVE | &quot;Inactive&quot;
ONETIME | &quot;OneTime&quot;


<a name="ChargeBearerEnum"></a>
## Enum: ChargeBearerEnum
Name | Value
---- | -----
PAYER | &quot;Payer&quot;
BENEFICIARY | &quot;Beneficiary&quot;
SHARED | &quot;Shared&quot;
SERVICELEVEL | &quot;ServiceLevel&quot;


<a name="AccountUsedForPaymentEnum"></a>
## Enum: AccountUsedForPaymentEnum
Name | Value
---- | -----
IBAN | &quot;IBAN&quot;
BBAN | &quot;BBAN&quot;
BANKGIRO | &quot;BANKGIRO&quot;
PLUSGIRO | &quot;PLUSGIRO&quot;


<a name="PaymentByEnum"></a>
## Enum: PaymentByEnum
Name | Value
---- | -----
DUEDATE | &quot;DueDate&quot;
DISCOUNTDATE | &quot;DiscountDate&quot;



