# CashTransactionApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cashTransactionCreateCashTransaction**](CashTransactionApi.md#cashTransactionCreateCashTransaction) | **POST** /controller/api/v1/cashTransaction | Create a Cash Transaction
[**cashTransactionGetAll**](CashTransactionApi.md#cashTransactionGetAll) | **GET** /controller/api/v1/cashTransaction | Get all Transaction
[**cashTransactionGetByreferenceNumber**](CashTransactionApi.md#cashTransactionGetByreferenceNumber) | **GET** /controller/api/v1/cashTransaction/{referenceNumber} | Get a specific Transaction
[**cashTransactionPutByreferenceNbr**](CashTransactionApi.md#cashTransactionPutByreferenceNbr) | **PUT** /controller/api/v1/cashTransaction/{referenceNbr} | Update a specific CashTransaction
[**cashTransactionReleaseByreferenceNbr**](CashTransactionApi.md#cashTransactionReleaseByreferenceNbr) | **POST** /controller/api/v1/cashTransaction/{referenceNbr}/action/release | Release cash transaction
[**cashTransactionReverseByreferenceNbr**](CashTransactionApi.md#cashTransactionReverseByreferenceNbr) | **POST** /controller/api/v1/cashTransaction/{referenceNbr}/action/reverse | Reverse a Cash Transaction


<a name="cashTransactionCreateCashTransaction"></a>
# **cashTransactionCreateCashTransaction**
> Object cashTransactionCreateCashTransaction(cashTransaction)

Create a Cash Transaction

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
CashTransactionUpdateDto cashTransaction = new CashTransactionUpdateDto(); // CashTransactionUpdateDto | Defines the data for the Cash Transaction to create
try {
    Object result = apiInstance.cashTransactionCreateCashTransaction(cashTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionCreateCashTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashTransaction** | [**CashTransactionUpdateDto**](CashTransactionUpdateDto.md)| Defines the data for the Cash Transaction to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="cashTransactionGetAll"></a>
# **cashTransactionGetAll**
> List&lt;CashTransactionDto&gt; cashTransactionGetAll(numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get all Transaction

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<CashTransactionDto> result = apiInstance.cashTransactionGetAll(numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;CashTransactionDto&gt;**](CashTransactionDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="cashTransactionGetByreferenceNumber"></a>
# **cashTransactionGetByreferenceNumber**
> CashTransactionDto cashTransactionGetByreferenceNumber(referenceNumber)

Get a specific Transaction

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
String referenceNumber = "referenceNumber_example"; // String | Identifies the Transaction
try {
    CashTransactionDto result = apiInstance.cashTransactionGetByreferenceNumber(referenceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionGetByreferenceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNumber** | **String**| Identifies the Transaction |

### Return type

[**CashTransactionDto**](CashTransactionDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="cashTransactionPutByreferenceNbr"></a>
# **cashTransactionPutByreferenceNbr**
> Object cashTransactionPutByreferenceNbr(referenceNbr, cashTransaction)

Update a specific CashTransaction

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
String referenceNbr = "referenceNbr_example"; // String | Identifies the Cash Transaction to update
CashTransactionUpdateDto cashTransaction = new CashTransactionUpdateDto(); // CashTransactionUpdateDto | Defines the data for the Cash Transaction to update
try {
    Object result = apiInstance.cashTransactionPutByreferenceNbr(referenceNbr, cashTransaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionPutByreferenceNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNbr** | **String**| Identifies the Cash Transaction to update |
 **cashTransaction** | [**CashTransactionUpdateDto**](CashTransactionUpdateDto.md)| Defines the data for the Cash Transaction to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="cashTransactionReleaseByreferenceNbr"></a>
# **cashTransactionReleaseByreferenceNbr**
> ReleaseCashTransactionActionResultDto cashTransactionReleaseByreferenceNbr(referenceNbr)

Release cash transaction

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
String referenceNbr = "referenceNbr_example"; // String | Reference number of the cash transaction to be released.
try {
    ReleaseCashTransactionActionResultDto result = apiInstance.cashTransactionReleaseByreferenceNbr(referenceNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionReleaseByreferenceNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNbr** | **String**| Reference number of the cash transaction to be released. |

### Return type

[**ReleaseCashTransactionActionResultDto**](ReleaseCashTransactionActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cashTransactionReverseByreferenceNbr"></a>
# **cashTransactionReverseByreferenceNbr**
> ReverseCashTransactionActionResultDto cashTransactionReverseByreferenceNbr(referenceNbr, reverseActionDto)

Reverse a Cash Transaction

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CashTransactionApi;

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

CashTransactionApi apiInstance = new CashTransactionApi();
String referenceNbr = "referenceNbr_example"; // String | Reference number of the cash transaction to be reversed.
ReverseCashTransactionActionDto reverseActionDto = new ReverseCashTransactionActionDto(); // ReverseCashTransactionActionDto | The action dto use to condition the action
try {
    ReverseCashTransactionActionResultDto result = apiInstance.cashTransactionReverseByreferenceNbr(referenceNbr, reverseActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashTransactionApi#cashTransactionReverseByreferenceNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNbr** | **String**| Reference number of the cash transaction to be reversed. |
 **reverseActionDto** | [**ReverseCashTransactionActionDto**](ReverseCashTransactionActionDto.md)| The action dto use to condition the action |

### Return type

[**ReverseCashTransactionActionResultDto**](ReverseCashTransactionActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

