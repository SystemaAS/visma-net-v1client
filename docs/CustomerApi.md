# CustomerApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCreateDunningLetterActionBycustomer**](CustomerApi.md#customerCreateDunningLetterActionBycustomer) | **POST** /controller/api/v1/customer/{customer}/action/createDunningLetter | Creates dunning letters for a specific customer
[**customerGetAll**](CustomerApi.md#customerGetAll) | **GET** /controller/api/v1/customer | Get a range of customers
[**customerGetAllCashSalesForCustomerBycustomerNumber**](CustomerApi.md#customerGetAllCashSalesForCustomerBycustomerNumber) | **GET** /controller/api/v1/customer/{customerNumber}/cashSale | Get a range of cash sales for a specific customer
[**customerGetAllContactsForCustomerBycustomerCd**](CustomerApi.md#customerGetAllContactsForCustomerBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/contact | Get a range of Contacts of a specific customer
[**customerGetAllCustomerBalance**](CustomerApi.md#customerGetAllCustomerBalance) | **GET** /controller/api/v1/customer/balance | Get the balance for a range of customers
[**customerGetAllDocumentsForCustomerBycustomerNumber**](CustomerApi.md#customerGetAllDocumentsForCustomerBycustomerNumber) | **GET** /controller/api/v1/customer/{customerNumber}/document | Gets a range of documents for a specific customer
[**customerGetAllInvoicesForCustomerBycustomerNumber**](CustomerApi.md#customerGetAllInvoicesForCustomerBycustomerNumber) | **GET** /controller/api/v1/customer/{customerNumber}/invoice | Get a range of invoices for a specific customer
[**customerGetAllOrderForCustomerBycustomerCd**](CustomerApi.md#customerGetAllOrderForCustomerBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/salesorder | Get a range of SO Orders of a specific customer
[**customerGetAllSalesOrderBasicForCustomerBycustomerCd**](CustomerApi.md#customerGetAllSalesOrderBasicForCustomerBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/salesorderbasic | Get a range of SO Orders Basic of a specific customer
[**customerGetBycustomerCd**](CustomerApi.md#customerGetBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd} | Get a specific customer
[**customerGetCustomerBalanceBycustomerCd**](CustomerApi.md#customerGetCustomerBalanceBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/balance | Get a specific customer&#39;s balance
[**customerGetCustomerClasses**](CustomerApi.md#customerGetCustomerClasses) | **GET** /controller/api/v1/customer/customerClass | Get Customer Classes
[**customerGetCustomerDirectDebitBycustomerCd**](CustomerApi.md#customerGetCustomerDirectDebitBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/directdebit | Get direct debit information for a specific customer(only for Netherlands)
[**customerGetCustomerNoteBycustomerCd**](CustomerApi.md#customerGetCustomerNoteBycustomerCd) | **GET** /controller/api/v1/customer/{customerCd}/note | Get a specific customer&#39;s note
[**customerGetSpecificCustomerClassBycustomerClassId**](CustomerApi.md#customerGetSpecificCustomerClassBycustomerClassId) | **GET** /controller/api/v1/customer/customerClass/{customerClassId} | Get a specific customer class
[**customerPost**](CustomerApi.md#customerPost) | **POST** /controller/api/v1/customer | Creates a customer
[**customerPutBycustomerCd**](CustomerApi.md#customerPutBycustomerCd) | **PUT** /controller/api/v1/customer/{customerCd} | Updates a specific customer


<a name="customerCreateDunningLetterActionBycustomer"></a>
# **customerCreateDunningLetterActionBycustomer**
> CreateDunningLetterActionResultDto customerCreateDunningLetterActionBycustomer(customer, createDunningLetterActionDto)

Creates dunning letters for a specific customer

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customer = "customer_example"; // String | Reference number of the customer for which the dunning letters will be created
CreateDunningLetterActionDto createDunningLetterActionDto = new CreateDunningLetterActionDto(); // CreateDunningLetterActionDto | Defines the data for the dunning letters to be created
try {
    CreateDunningLetterActionResultDto result = apiInstance.customerCreateDunningLetterActionBycustomer(customer, createDunningLetterActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCreateDunningLetterActionBycustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | **String**| Reference number of the customer for which the dunning letters will be created |
 **createDunningLetterActionDto** | [**CreateDunningLetterActionDto**](CreateDunningLetterActionDto.md)| Defines the data for the dunning letters to be created |

### Return type

[**CreateDunningLetterActionResultDto**](CreateDunningLetterActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetAll"></a>
# **customerGetAll**
> List&lt;CustomerDto&gt; customerGetAll(greaterThanValue, numberToRead, skipRecords, name, status, corporateId, vatRegistrationId, email, phone, lastModifiedDateTime, lastModifiedDateTimeCondition, createdDateTime, createdDateTimeCondition, attributes, pageNumber, pageSize)

Get a range of customers

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String name = "name_example"; // String | 
String status = "status_example"; // String | 
String corporateId = "corporateId_example"; // String | 
String vatRegistrationId = "vatRegistrationId_example"; // String | 
String email = "email_example"; // String | 
String phone = "phone_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String createdDateTime = "createdDateTime_example"; // String | 
String createdDateTimeCondition = "createdDateTimeCondition_example"; // String | 
String attributes = "attributes_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CustomerDto> result = apiInstance.customerGetAll(greaterThanValue, numberToRead, skipRecords, name, status, corporateId, vatRegistrationId, email, phone, lastModifiedDateTime, lastModifiedDateTimeCondition, createdDateTime, createdDateTimeCondition, attributes, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **name** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: Active, OnHold, CreditHold, Inactive, OneTime]
 **corporateId** | **String**|  | [optional]
 **vatRegistrationId** | **String**|  | [optional]
 **email** | **String**|  | [optional]
 **phone** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **createdDateTime** | **String**|  | [optional]
 **createdDateTimeCondition** | **String**|  | [optional]
 **attributes** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CustomerDto&gt;**](CustomerDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetAllCashSalesForCustomerBycustomerNumber"></a>
# **customerGetAllCashSalesForCustomerBycustomerNumber**
> List&lt;CashSaleDto&gt; customerGetAllCashSalesForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of cash sales for a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerNumber = "customerNumber_example"; // String | Identifies the customer for which to return data
String documentType = "documentType_example"; // String | The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint.
Integer released = 56; // Integer | 
Integer dunningLevel = 56; // Integer | 
String closedFinancialPeriod = "closedFinancialPeriod_example"; // String | 
String dunningLetterDateTime = "dunningLetterDateTime_example"; // String | 
String dunningLetterDateTimeCondition = "dunningLetterDateTimeCondition_example"; // String | 
String project = "project_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CashSaleDto> result = apiInstance.customerGetAllCashSalesForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllCashSalesForCustomerBycustomerNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerNumber** | **String**| Identifies the customer for which to return data |
 **documentType** | **String**| The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint. | [optional] [enum: Invoice, DebitNote, CreditNote, Payment, VoidPayment, Prepayment, Refund, FinCharge, SmallBalanceWo, SmallCreditWo, CashSale, CashReturn, Undefined, NoUpdate]
 **released** | **Integer**|  | [optional]
 **dunningLevel** | **Integer**|  | [optional]
 **closedFinancialPeriod** | **String**|  | [optional]
 **dunningLetterDateTime** | **String**|  | [optional]
 **dunningLetterDateTimeCondition** | **String**|  | [optional]
 **project** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CashSaleDto&gt;**](CashSaleDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetAllContactsForCustomerBycustomerCd"></a>
# **customerGetAllContactsForCustomerBycustomerCd**
> List&lt;ContactDto&gt; customerGetAllContactsForCustomerBycustomerCd(customerCd, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a range of Contacts of a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<ContactDto> result = apiInstance.customerGetAllContactsForCustomerBycustomerCd(customerCd, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllContactsForCustomerBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**|  |
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;ContactDto&gt;**](ContactDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetAllCustomerBalance"></a>
# **customerGetAllCustomerBalance**
> List&lt;CustomerBalanceDto&gt; customerGetAllCustomerBalance(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get the balance for a range of customers

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<CustomerBalanceDto> result = apiInstance.customerGetAllCustomerBalance(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllCustomerBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;CustomerBalanceDto&gt;**](CustomerBalanceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetAllDocumentsForCustomerBycustomerNumber"></a>
# **customerGetAllDocumentsForCustomerBycustomerNumber**
> List&lt;CustomerDocumentDto&gt; customerGetAllDocumentsForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Gets a range of documents for a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerNumber = "customerNumber_example"; // String | Identifies the customer for which to return data
String documentType = "documentType_example"; // String | The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint.
Integer released = 56; // Integer | 
Integer dunningLevel = 56; // Integer | 
String closedFinancialPeriod = "closedFinancialPeriod_example"; // String | 
String dunningLetterDateTime = "dunningLetterDateTime_example"; // String | 
String dunningLetterDateTimeCondition = "dunningLetterDateTimeCondition_example"; // String | 
String project = "project_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CustomerDocumentDto> result = apiInstance.customerGetAllDocumentsForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllDocumentsForCustomerBycustomerNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerNumber** | **String**| Identifies the customer for which to return data |
 **documentType** | **String**| The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint. | [optional] [enum: Invoice, DebitNote, CreditNote, Payment, VoidPayment, Prepayment, Refund, FinCharge, SmallBalanceWo, SmallCreditWo, CashSale, CashReturn, Undefined, NoUpdate]
 **released** | **Integer**|  | [optional]
 **dunningLevel** | **Integer**|  | [optional]
 **closedFinancialPeriod** | **String**|  | [optional]
 **dunningLetterDateTime** | **String**|  | [optional]
 **dunningLetterDateTimeCondition** | **String**|  | [optional]
 **project** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CustomerDocumentDto&gt;**](CustomerDocumentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetAllInvoicesForCustomerBycustomerNumber"></a>
# **customerGetAllInvoicesForCustomerBycustomerNumber**
> List&lt;CustomerInvoiceDto&gt; customerGetAllInvoicesForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of invoices for a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerNumber = "customerNumber_example"; // String | Identifies the customer for which to return data
String documentType = "documentType_example"; // String | The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint.
Integer released = 56; // Integer | 
Integer dunningLevel = 56; // Integer | 
String closedFinancialPeriod = "closedFinancialPeriod_example"; // String | 
String dunningLetterDateTime = "dunningLetterDateTime_example"; // String | 
String dunningLetterDateTimeCondition = "dunningLetterDateTimeCondition_example"; // String | 
String project = "project_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CustomerInvoiceDto> result = apiInstance.customerGetAllInvoicesForCustomerBycustomerNumber(customerNumber, documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllInvoicesForCustomerBycustomerNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerNumber** | **String**| Identifies the customer for which to return data |
 **documentType** | **String**| The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint. | [optional] [enum: Invoice, DebitNote, CreditNote, Payment, VoidPayment, Prepayment, Refund, FinCharge, SmallBalanceWo, SmallCreditWo, CashSale, CashReturn, Undefined, NoUpdate]
 **released** | **Integer**|  | [optional]
 **dunningLevel** | **Integer**|  | [optional]
 **closedFinancialPeriod** | **String**|  | [optional]
 **dunningLetterDateTime** | **String**|  | [optional]
 **dunningLetterDateTimeCondition** | **String**|  | [optional]
 **project** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CustomerInvoiceDto&gt;**](CustomerInvoiceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetAllOrderForCustomerBycustomerCd"></a>
# **customerGetAllOrderForCustomerBycustomerCd**
> List&lt;SalesOrderDto&gt; customerGetAllOrderForCustomerBycustomerCd(customerCd, orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of SO Orders of a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | 
String orderType = "orderType_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
Boolean showNotes = true; // Boolean | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<SalesOrderDto> result = apiInstance.customerGetAllOrderForCustomerBycustomerCd(customerCd, orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllOrderForCustomerBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**|  |
 **orderType** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **showNotes** | **Boolean**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;SalesOrderDto&gt;**](SalesOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetAllSalesOrderBasicForCustomerBycustomerCd"></a>
# **customerGetAllSalesOrderBasicForCustomerBycustomerCd**
> List&lt;SalesOrderBasicDto&gt; customerGetAllSalesOrderBasicForCustomerBycustomerCd(customerCd, orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of SO Orders Basic of a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | 
String orderType = "orderType_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
Boolean showNotes = true; // Boolean | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<SalesOrderBasicDto> result = apiInstance.customerGetAllSalesOrderBasicForCustomerBycustomerCd(customerCd, orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetAllSalesOrderBasicForCustomerBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**|  |
 **orderType** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **showNotes** | **Boolean**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;SalesOrderBasicDto&gt;**](SalesOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetBycustomerCd"></a>
# **customerGetBycustomerCd**
> CustomerDto customerGetBycustomerCd(customerCd)

Get a specific customer

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | Identifies the customer
try {
    CustomerDto result = apiInstance.customerGetBycustomerCd(customerCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**| Identifies the customer |

### Return type

[**CustomerDto**](CustomerDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetCustomerBalanceBycustomerCd"></a>
# **customerGetCustomerBalanceBycustomerCd**
> CustomerBalanceDto customerGetCustomerBalanceBycustomerCd(customerCd)

Get a specific customer&#39;s balance

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | Identifies the customer for which to return data
try {
    CustomerBalanceDto result = apiInstance.customerGetCustomerBalanceBycustomerCd(customerCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerBalanceBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**| Identifies the customer for which to return data |

### Return type

[**CustomerBalanceDto**](CustomerBalanceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerClasses"></a>
# **customerGetCustomerClasses**
> List&lt;CustomerClassDto&gt; customerGetCustomerClasses()

Get Customer Classes

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
try {
    List<CustomerClassDto> result = apiInstance.customerGetCustomerClasses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerClasses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CustomerClassDto&gt;**](CustomerClassDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerGetCustomerDirectDebitBycustomerCd"></a>
# **customerGetCustomerDirectDebitBycustomerCd**
> List&lt;CustomerDirectDebitDto&gt; customerGetCustomerDirectDebitBycustomerCd(customerCd)

Get direct debit information for a specific customer(only for Netherlands)

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | Identifies the customer for which to return data
try {
    List<CustomerDirectDebitDto> result = apiInstance.customerGetCustomerDirectDebitBycustomerCd(customerCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerDirectDebitBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**| Identifies the customer for which to return data |

### Return type

[**List&lt;CustomerDirectDebitDto&gt;**](CustomerDirectDebitDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetCustomerNoteBycustomerCd"></a>
# **customerGetCustomerNoteBycustomerCd**
> NoteDto customerGetCustomerNoteBycustomerCd(customerCd)

Get a specific customer&#39;s note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | Identifies the customer for which to return data
try {
    NoteDto result = apiInstance.customerGetCustomerNoteBycustomerCd(customerCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetCustomerNoteBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**| Identifies the customer for which to return data |

### Return type

[**NoteDto**](NoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerGetSpecificCustomerClassBycustomerClassId"></a>
# **customerGetSpecificCustomerClassBycustomerClassId**
> CustomerClassDto customerGetSpecificCustomerClassBycustomerClassId(customerClassId)

Get a specific customer class

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerClassId = "customerClassId_example"; // String | Identifies the customer class
try {
    CustomerClassDto result = apiInstance.customerGetSpecificCustomerClassBycustomerClassId(customerClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGetSpecificCustomerClassBycustomerClassId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerClassId** | **String**| Identifies the customer class |

### Return type

[**CustomerClassDto**](CustomerClassDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerPost"></a>
# **customerPost**
> Object customerPost(customer)

Creates a customer

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
CustomerUpdateDto customer = new CustomerUpdateDto(); // CustomerUpdateDto | Defines the data for the customer to create
try {
    Object result = apiInstance.customerPost(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**CustomerUpdateDto**](CustomerUpdateDto.md)| Defines the data for the customer to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerPutBycustomerCd"></a>
# **customerPutBycustomerCd**
> Object customerPutBycustomerCd(customerCd, customer)

Updates a specific customer

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ipp-application-type
ApiKeyAuth ipp-application-type = (ApiKeyAuth) defaultClient.getAuthentication("ipp-application-type");
ipp-application-type.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-application-type.setApiKeyPrefix("Token");

// Configure API key authorization: ipp-company-id
ApiKeyAuth ipp-company-id = (ApiKeyAuth) defaultClient.getAuthentication("ipp-company-id");
ipp-company-id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ipp-company-id.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
String customerCd = "customerCd_example"; // String | Identifies the customer to update
CustomerUpdateDto customer = new CustomerUpdateDto(); // CustomerUpdateDto | The data to update for the customer
try {
    Object result = apiInstance.customerPutBycustomerCd(customerCd, customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerPutBycustomerCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerCd** | **String**| Identifies the customer to update |
 **customer** | [**CustomerUpdateDto**](CustomerUpdateDto.md)| The data to update for the customer |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

