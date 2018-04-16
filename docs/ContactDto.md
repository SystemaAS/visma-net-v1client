
# ContactDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**title** | [**TitleEnum**](#TitleEnum) |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**position** | **String** |  |  [optional]
**businessAccount** | **String** |  |  [optional]
**sameAsAccount** | **Boolean** |  |  [optional]
**address** | [**AddressDto**](AddressDto.md) |  |  [optional]
**email** | **String** |  |  [optional]
**web** | **String** |  |  [optional]
**phone1** | **String** |  |  [optional]
**phone2** | **String** |  |  [optional]
**phone3** | **String** |  |  [optional]
**fax** | **String** |  |  [optional]
**contactMethod** | [**ContactMethodEnum**](#ContactMethodEnum) |  |  [optional]
**doNotCall** | **Boolean** |  |  [optional]
**doNotFax** | **Boolean** |  |  [optional]
**doNotEmail** | **Boolean** |  |  [optional]
**doNotMail** | **Boolean** |  |  [optional]
**noMassMail** | **Boolean** |  |  [optional]
**noMarketing** | **Boolean** |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**contactId** | **Integer** |  |  [optional]


<a name="TitleEnum"></a>
## Enum: TitleEnum
Name | Value
---- | -----
DOCTOR | &quot;Doctor&quot;
MISS | &quot;Miss&quot;
MR | &quot;Mr&quot;
MRS | &quot;Mrs&quot;
MS | &quot;Ms&quot;
PROF | &quot;Prof&quot;


<a name="ContactMethodEnum"></a>
## Enum: ContactMethodEnum
Name | Value
---- | -----
ANY | &quot;Any&quot;
EMAIL | &quot;Email&quot;
MAIL | &quot;Mail&quot;
FAX | &quot;Fax&quot;
PHONE | &quot;Phone&quot;



