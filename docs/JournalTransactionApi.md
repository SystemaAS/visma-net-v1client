# JournalTransactionApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**journalTransactionCreateHeaderAttachmentByjournalTransactionNumber**](JournalTransactionApi.md#journalTransactionCreateHeaderAttachmentByjournalTransactionNumber) | **POST** /controller/api/v1/journaltransaction/{journalTransactionNumber}/attachment | Creates an attachment and associates it with an journalTransaction. If the file already exists, a new revision is created.
[**journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber**](JournalTransactionApi.md#journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber) | **POST** /controller/api/v1/journaltransaction/{journalTransactionNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain journalTransaction line. If the file already exists, a new revision is created.
[**journalTransactionGetAllJournalTransactions**](JournalTransactionApi.md#journalTransactionGetAllJournalTransactions) | **GET** /controller/api/v1/journaltransaction | Get a range of Journal Transactions
[**journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber**](JournalTransactionApi.md#journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber) | **GET** /controller/api/v1/journaltransaction/{journalTransactionNumber} | Get a specific Journal Transaction
[**journalTransactionPost**](JournalTransactionApi.md#journalTransactionPost) | **POST** /controller/api/v1/journaltransaction | Create a Journal Transaction
[**journalTransactionPutByjournalTransactionNumber**](JournalTransactionApi.md#journalTransactionPutByjournalTransactionNumber) | **PUT** /controller/api/v1/journaltransaction/{journalTransactionNumber} | Update a Journal Transaction
[**journalTransactionReleaseJournalTransactionByjournalTransactionNumber**](JournalTransactionApi.md#journalTransactionReleaseJournalTransactionByjournalTransactionNumber) | **POST** /controller/api/v1/journaltransaction/{journalTransactionNumber}/action/release | Release journal transaction operation


<a name="journalTransactionCreateHeaderAttachmentByjournalTransactionNumber"></a>
# **journalTransactionCreateHeaderAttachmentByjournalTransactionNumber**
> Object journalTransactionCreateHeaderAttachmentByjournalTransactionNumber(journalTransactionNumber)

Creates an attachment and associates it with an journalTransaction. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String journalTransactionNumber = "journalTransactionNumber_example"; // String | Identifies the journalTransaction
try {
    Object result = apiInstance.journalTransactionCreateHeaderAttachmentByjournalTransactionNumber(journalTransactionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionCreateHeaderAttachmentByjournalTransactionNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransactionNumber** | **String**| Identifies the journalTransaction |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber"></a>
# **journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber**
> Object journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber(journalTransactionNumber, lineNumber)

Creates an attachment and associates it with a certain journalTransaction line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String journalTransactionNumber = "journalTransactionNumber_example"; // String | Identifies the journalTransaction
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber(journalTransactionNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransactionNumber** | **String**| Identifies the journalTransaction |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="journalTransactionGetAllJournalTransactions"></a>
# **journalTransactionGetAllJournalTransactions**
> List&lt;JournalTransactionDto&gt; journalTransactionGetAllJournalTransactions(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, customerSupplierStart, customerSupplierEnd, released, pageNumber, pageSize)

Get a range of Journal Transactions

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String customerSupplierStart = "customerSupplierStart_example"; // String | 
String customerSupplierEnd = "customerSupplierEnd_example"; // String | 
Integer released = 56; // Integer | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<JournalTransactionDto> result = apiInstance.journalTransactionGetAllJournalTransactions(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, customerSupplierStart, customerSupplierEnd, released, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionGetAllJournalTransactions");
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
 **customerSupplierStart** | **String**|  | [optional]
 **customerSupplierEnd** | **String**|  | [optional]
 **released** | **Integer**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;JournalTransactionDto&gt;**](JournalTransactionDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber"></a>
# **journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber**
> JournalTransactionDto journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber(journalTransactionNumber)

Get a specific Journal Transaction

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String journalTransactionNumber = "journalTransactionNumber_example"; // String | Identifies the Journal Transaction
try {
    JournalTransactionDto result = apiInstance.journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber(journalTransactionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransactionNumber** | **String**| Identifies the Journal Transaction |

### Return type

[**JournalTransactionDto**](JournalTransactionDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="journalTransactionPost"></a>
# **journalTransactionPost**
> Object journalTransactionPost(journalTransaction)

Create a Journal Transaction

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
JournalTransactionUpdateDto journalTransaction = new JournalTransactionUpdateDto(); // JournalTransactionUpdateDto | Defines the data for the Journal Transaction to create
try {
    Object result = apiInstance.journalTransactionPost(journalTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransaction** | [**JournalTransactionUpdateDto**](JournalTransactionUpdateDto.md)| Defines the data for the Journal Transaction to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="journalTransactionPutByjournalTransactionNumber"></a>
# **journalTransactionPutByjournalTransactionNumber**
> Object journalTransactionPutByjournalTransactionNumber(journalTransactionNumber, journalTransaction)

Update a Journal Transaction

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String journalTransactionNumber = "journalTransactionNumber_example"; // String | Identifies the Journal Transaction to update
JournalTransactionUpdateDto journalTransaction = new JournalTransactionUpdateDto(); // JournalTransactionUpdateDto | Defines the data for the Journal Transaction to update
try {
    Object result = apiInstance.journalTransactionPutByjournalTransactionNumber(journalTransactionNumber, journalTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionPutByjournalTransactionNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransactionNumber** | **String**| Identifies the Journal Transaction to update |
 **journalTransaction** | [**JournalTransactionUpdateDto**](JournalTransactionUpdateDto.md)| Defines the data for the Journal Transaction to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="journalTransactionReleaseJournalTransactionByjournalTransactionNumber"></a>
# **journalTransactionReleaseJournalTransactionByjournalTransactionNumber**
> ReleaseJournalTransactionActionResultDto journalTransactionReleaseJournalTransactionByjournalTransactionNumber(journalTransactionNumber)

Release journal transaction operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.JournalTransactionApi;

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

JournalTransactionApi apiInstance = new JournalTransactionApi();
String journalTransactionNumber = "journalTransactionNumber_example"; // String | Reference number of the journal transaction to be released
try {
    ReleaseJournalTransactionActionResultDto result = apiInstance.journalTransactionReleaseJournalTransactionByjournalTransactionNumber(journalTransactionNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JournalTransactionApi#journalTransactionReleaseJournalTransactionByjournalTransactionNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalTransactionNumber** | **String**| Reference number of the journal transaction to be released |

### Return type

[**ReleaseJournalTransactionActionResultDto**](ReleaseJournalTransactionActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

