# CustomerOverdueChargeApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber**](CustomerOverdueChargeApi.md#customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber) | **POST** /controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/attachment | Creates an attachment and associates it with an overdue charge. If the file already exists, a new revision is created.
[**customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber**](CustomerOverdueChargeApi.md#customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber) | **POST** /controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain overdue charge line. If the file already exists, a new revision is created.
[**customerOverdueChargeGetAll**](CustomerOverdueChargeApi.md#customerOverdueChargeGetAll) | **GET** /controller/api/v1/customerOverdueCharge | Get a range of Customer Overdue Charges
[**customerOverdueChargeGetByoverdueChargeNumber**](CustomerOverdueChargeApi.md#customerOverdueChargeGetByoverdueChargeNumber) | **GET** /controller/api/v1/customerOverdueCharge/{overdueChargeNumber} | Get a specific Customer Overdue Charge
[**customerOverdueChargeReleaseDocumentByoverdueChargeNumber**](CustomerOverdueChargeApi.md#customerOverdueChargeReleaseDocumentByoverdueChargeNumber) | **POST** /controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/action/release | Release overdue charge operation
[**customerOverdueChargeUpdateByoverdueChargeNumber**](CustomerOverdueChargeApi.md#customerOverdueChargeUpdateByoverdueChargeNumber) | **PUT** /controller/api/v1/customerOverdueCharge/{overdueChargeNumber} | Update a specific Overdue Charge


<a name="customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber"></a>
# **customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber**
> Object customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber(overdueChargeNumber)

Creates an attachment and associates it with an overdue charge. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
String overdueChargeNumber = "overdueChargeNumber_example"; // String | Identifies the overdue charge
try {
    Object result = apiInstance.customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber(overdueChargeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overdueChargeNumber** | **String**| Identifies the overdue charge |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber"></a>
# **customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber**
> Object customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber(overdueChargeNumber, lineNumber)

Creates an attachment and associates it with a certain overdue charge line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
String overdueChargeNumber = "overdueChargeNumber_example"; // String | Identifies the overdue charge
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber(overdueChargeNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overdueChargeNumber** | **String**| Identifies the overdue charge |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerOverdueChargeGetAll"></a>
# **customerOverdueChargeGetAll**
> List&lt;CustomerOverdueChargeDto&gt; customerOverdueChargeGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Customer Overdue Charges

Data for Customer Overdue Charge

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
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
    List<CustomerOverdueChargeDto> result = apiInstance.customerOverdueChargeGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

[**List&lt;CustomerOverdueChargeDto&gt;**](CustomerOverdueChargeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerOverdueChargeGetByoverdueChargeNumber"></a>
# **customerOverdueChargeGetByoverdueChargeNumber**
> CustomerOverdueChargeDto customerOverdueChargeGetByoverdueChargeNumber(overdueChargeNumber)

Get a specific Customer Overdue Charge

Data for Customer Overdue Charge

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
String overdueChargeNumber = "overdueChargeNumber_example"; // String | Identifies the Customer Overdue Charge
try {
    CustomerOverdueChargeDto result = apiInstance.customerOverdueChargeGetByoverdueChargeNumber(overdueChargeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeGetByoverdueChargeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overdueChargeNumber** | **String**| Identifies the Customer Overdue Charge |

### Return type

[**CustomerOverdueChargeDto**](CustomerOverdueChargeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerOverdueChargeReleaseDocumentByoverdueChargeNumber"></a>
# **customerOverdueChargeReleaseDocumentByoverdueChargeNumber**
> ReleaseCustomerOverdueChargeActionResultDto customerOverdueChargeReleaseDocumentByoverdueChargeNumber(overdueChargeNumber)

Release overdue charge operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
String overdueChargeNumber = "overdueChargeNumber_example"; // String | Reference number of the overdue charge to be released
try {
    ReleaseCustomerOverdueChargeActionResultDto result = apiInstance.customerOverdueChargeReleaseDocumentByoverdueChargeNumber(overdueChargeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeReleaseDocumentByoverdueChargeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overdueChargeNumber** | **String**| Reference number of the overdue charge to be released |

### Return type

[**ReleaseCustomerOverdueChargeActionResultDto**](ReleaseCustomerOverdueChargeActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerOverdueChargeUpdateByoverdueChargeNumber"></a>
# **customerOverdueChargeUpdateByoverdueChargeNumber**
> Object customerOverdueChargeUpdateByoverdueChargeNumber(overdueChargeNumber, overdueCharge)

Update a specific Overdue Charge

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerOverdueChargeApi;

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

CustomerOverdueChargeApi apiInstance = new CustomerOverdueChargeApi();
String overdueChargeNumber = "overdueChargeNumber_example"; // String | Identifies the Overdue Charge to update
CustomerOverdueChargeUpdateDto overdueCharge = new CustomerOverdueChargeUpdateDto(); // CustomerOverdueChargeUpdateDto | Defines the data for the Overdue Charge to update
try {
    Object result = apiInstance.customerOverdueChargeUpdateByoverdueChargeNumber(overdueChargeNumber, overdueCharge);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerOverdueChargeApi#customerOverdueChargeUpdateByoverdueChargeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overdueChargeNumber** | **String**| Identifies the Overdue Charge to update |
 **overdueCharge** | [**CustomerOverdueChargeUpdateDto**](CustomerOverdueChargeUpdateDto.md)| Defines the data for the Overdue Charge to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

