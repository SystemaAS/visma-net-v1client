# CustomerDebitNoteApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerDebitNoteCreate**](CustomerDebitNoteApi.md#customerDebitNoteCreate) | **POST** /controller/api/v1/customerDebitNote | Create a Debit Note
[**customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber**](CustomerDebitNoteApi.md#customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber) | **POST** /controller/api/v1/customerDebitNote/{debitNoteNumber}/attachment | Creates an attachment and associates it with a debit note. If the file already exists, a new revision is created.
[**customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber**](CustomerDebitNoteApi.md#customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber) | **POST** /controller/api/v1/customerDebitNote/{debitNoteNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain debit note line. If the file already exists, a new revision is created.
[**customerDebitNoteGetAll**](CustomerDebitNoteApi.md#customerDebitNoteGetAll) | **GET** /controller/api/v1/customerDebitNote | Get a range of Customer Debit Notes
[**customerDebitNoteGetBydebitNoteNumber**](CustomerDebitNoteApi.md#customerDebitNoteGetBydebitNoteNumber) | **GET** /controller/api/v1/customerDebitNote/{debitNoteNumber} | Get a specific Customer Debit Note
[**customerDebitNotePrintBydebitNoteNumber**](CustomerDebitNoteApi.md#customerDebitNotePrintBydebitNoteNumber) | **GET** /controller/api/v1/customerDebitNote/{debitNoteNumber}/print | Get the print report of a Customer Debit Note
[**customerDebitNoteReleaseDocumentBydebitNoteNumber**](CustomerDebitNoteApi.md#customerDebitNoteReleaseDocumentBydebitNoteNumber) | **POST** /controller/api/v1/customerDebitNote/{debitNoteNumber}/action/release | Release debit note operation
[**customerDebitNoteUpdateBydebitNoteNumber**](CustomerDebitNoteApi.md#customerDebitNoteUpdateBydebitNoteNumber) | **PUT** /controller/api/v1/customerDebitNote/{debitNoteNumber} | Update a specific Debit Note


<a name="customerDebitNoteCreate"></a>
# **customerDebitNoteCreate**
> Object customerDebitNoteCreate(debitNote)

Create a Debit Note

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
CustomerDebitNoteUpdateDto debitNote = new CustomerDebitNoteUpdateDto(); // CustomerDebitNoteUpdateDto | Defines the data for the Debit Note to create
try {
    Object result = apiInstance.customerDebitNoteCreate(debitNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNote** | [**CustomerDebitNoteUpdateDto**](CustomerDebitNoteUpdateDto.md)| Defines the data for the Debit Note to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber"></a>
# **customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber**
> Object customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber(debitNoteNumber)

Creates an attachment and associates it with a debit note. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Identifies the debit note
try {
    Object result = apiInstance.customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber(debitNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteCreateHeaderAttachmentBydebitNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Identifies the debit note |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber"></a>
# **customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber**
> Object customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber(debitNoteNumber, lineNumber)

Creates an attachment and associates it with a certain debit note line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Identifies the debit note
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber(debitNoteNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteCreateLineAttachmentBydebitNoteNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Identifies the debit note |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerDebitNoteGetAll"></a>
# **customerDebitNoteGetAll**
> List&lt;CustomerDebitNoteDto&gt; customerDebitNoteGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Customer Debit Notes

Data for Customer Debit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
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
    List<CustomerDebitNoteDto> result = apiInstance.customerDebitNoteGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteGetAll");
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

[**List&lt;CustomerDebitNoteDto&gt;**](CustomerDebitNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerDebitNoteGetBydebitNoteNumber"></a>
# **customerDebitNoteGetBydebitNoteNumber**
> CustomerDebitNoteDto customerDebitNoteGetBydebitNoteNumber(debitNoteNumber)

Get a specific Customer Debit Note

Data for Customer Debit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Identifies the Customer Debit Note
try {
    CustomerDebitNoteDto result = apiInstance.customerDebitNoteGetBydebitNoteNumber(debitNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteGetBydebitNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Identifies the Customer Debit Note |

### Return type

[**CustomerDebitNoteDto**](CustomerDebitNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerDebitNotePrintBydebitNoteNumber"></a>
# **customerDebitNotePrintBydebitNoteNumber**
> Object customerDebitNotePrintBydebitNoteNumber(debitNoteNumber)

Get the print report of a Customer Debit Note

The File is in Content of the message

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Identifies the customer debit note
try {
    Object result = apiInstance.customerDebitNotePrintBydebitNoteNumber(debitNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNotePrintBydebitNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Identifies the customer debit note |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerDebitNoteReleaseDocumentBydebitNoteNumber"></a>
# **customerDebitNoteReleaseDocumentBydebitNoteNumber**
> ReleaseCustomerDebitNoteActionResultDto customerDebitNoteReleaseDocumentBydebitNoteNumber(debitNoteNumber)

Release debit note operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Reference number of the debit note to be released
try {
    ReleaseCustomerDebitNoteActionResultDto result = apiInstance.customerDebitNoteReleaseDocumentBydebitNoteNumber(debitNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteReleaseDocumentBydebitNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Reference number of the debit note to be released |

### Return type

[**ReleaseCustomerDebitNoteActionResultDto**](ReleaseCustomerDebitNoteActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerDebitNoteUpdateBydebitNoteNumber"></a>
# **customerDebitNoteUpdateBydebitNoteNumber**
> Object customerDebitNoteUpdateBydebitNoteNumber(debitNoteNumber, debitNote)

Update a specific Debit Note

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDebitNoteApi;

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

CustomerDebitNoteApi apiInstance = new CustomerDebitNoteApi();
String debitNoteNumber = "debitNoteNumber_example"; // String | Identifies the Debit Note to update
CustomerDebitNoteUpdateDto debitNote = new CustomerDebitNoteUpdateDto(); // CustomerDebitNoteUpdateDto | Defines the data for the Debit Note to update
try {
    Object result = apiInstance.customerDebitNoteUpdateBydebitNoteNumber(debitNoteNumber, debitNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDebitNoteApi#customerDebitNoteUpdateBydebitNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitNoteNumber** | **String**| Identifies the Debit Note to update |
 **debitNote** | [**CustomerDebitNoteUpdateDto**](CustomerDebitNoteUpdateDto.md)| Defines the data for the Debit Note to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

