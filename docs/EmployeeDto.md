
# EmployeeDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeId** | **Integer** |  |  [optional]
**employeeNumber** | **String** |  |  [optional]
**employeeName** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**department** | **String** |  |  [optional]
**contact** | [**EmployeeContactDto**](EmployeeContactDto.md) |  |  [optional]
**address** | [**AddressDto**](AddressDto.md) |  |  [optional]
**lastModifiedDateTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**extras** | **Map&lt;String, Object&gt;** |  |  [optional]
**errorInfo** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
ONHOLD | &quot;OnHold&quot;
HOLDPAYMENTS | &quot;HoldPayments&quot;
INACTIVE | &quot;Inactive&quot;
ONETIME | &quot;OneTime&quot;



