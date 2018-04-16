# CustomerCreditNoteApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCreditNoteCreate**](CustomerCreditNoteApi.md#customerCreditNoteCreate) | **POST** /controller/api/v1/customerCreditNote | Create a Credit Note
[**customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber) | **POST** /controller/api/v1/customerCreditNote/{creditNoteNumber}/attachment | Creates an attachment and associates it with a credit note. If the file already exists, a new revision is created.
[**customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber**](CustomerCreditNoteApi.md#customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber) | **POST** /controller/api/v1/customerCreditNote/{creditNoteNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain credit note line. If the file already exists, a new revision is created.
[**customerCreditNoteDeleteBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNoteDeleteBycreditNoteNumber) | **DELETE** /controller/api/v1/customerCreditNote/{creditNoteNumber} | Deletes a specific Customer Credit Note
[**customerCreditNoteGetAll**](CustomerCreditNoteApi.md#customerCreditNoteGetAll) | **GET** /controller/api/v1/customerCreditNote | Get a range of Customer Credit Notes
[**customerCreditNoteGetBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNoteGetBycreditNoteNumber) | **GET** /controller/api/v1/customerCreditNote/{creditNoteNumber} | Get a specific Customer Credit Note
[**customerCreditNotePrintBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNotePrintBycreditNoteNumber) | **GET** /controller/api/v1/customerCreditNote/{creditNoteNumber}/print | Get the print report of a Customer Credit Note
[**customerCreditNoteReleaseDocumentBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNoteReleaseDocumentBycreditNoteNumber) | **POST** /controller/api/v1/customerCreditNote/{creditNoteNumber}/action/release | Release credit note operation
[**customerCreditNoteUpdateBycreditNoteNumber**](CustomerCreditNoteApi.md#customerCreditNoteUpdateBycreditNoteNumber) | **PUT** /controller/api/v1/customerCreditNote/{creditNoteNumber} | Update a specific Credit Note


<a name="customerCreditNoteCreate"></a>
# **customerCreditNoteCreate**
> Object customerCreditNoteCreate(creditNote)

Create a Credit Note

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
CustomerCreditNoteUpdateDto creditNote = new CustomerCreditNoteUpdateDto(); // CustomerCreditNoteUpdateDto | Defines the data for the Credit Note to create
try {
    Object result = apiInstance.customerCreditNoteCreate(creditNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNote** | [**CustomerCreditNoteUpdateDto**](CustomerCreditNoteUpdateDto.md)| Defines the data for the Credit Note to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber"></a>
# **customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber**
> Object customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber(creditNoteNumber)

Creates an attachment and associates it with a credit note. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the credit note
try {
    Object result = apiInstance.customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the credit note |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber"></a>
# **customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber**
> Object customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber(creditNoteNumber, lineNumber)

Creates an attachment and associates it with a certain credit note line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the credit note
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber(creditNoteNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the credit note |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNoteDeleteBycreditNoteNumber"></a>
# **customerCreditNoteDeleteBycreditNoteNumber**
> Object customerCreditNoteDeleteBycreditNoteNumber(creditNoteNumber)

Deletes a specific Customer Credit Note

Response Message has StatusCode NoContent if DELETE operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Customer Credit Note to delete
try {
    Object result = apiInstance.customerCreditNoteDeleteBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteDeleteBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Customer Credit Note to delete |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNoteGetAll"></a>
# **customerCreditNoteGetAll**
> List&lt;CustomerCreditNoteDto&gt; customerCreditNoteGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Customer Credit Notes

Data for Customer Credit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
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
    List<CustomerCreditNoteDto> result = apiInstance.customerCreditNoteGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteGetAll");
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

[**List&lt;CustomerCreditNoteDto&gt;**](CustomerCreditNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNoteGetBycreditNoteNumber"></a>
# **customerCreditNoteGetBycreditNoteNumber**
> CustomerCreditNoteDto customerCreditNoteGetBycreditNoteNumber(creditNoteNumber)

Get a specific Customer Credit Note

Data for Customer Credit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Customer Credit Note
try {
    CustomerCreditNoteDto result = apiInstance.customerCreditNoteGetBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteGetBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Customer Credit Note |

### Return type

[**CustomerCreditNoteDto**](CustomerCreditNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNotePrintBycreditNoteNumber"></a>
# **customerCreditNotePrintBycreditNoteNumber**
> Object customerCreditNotePrintBycreditNoteNumber(creditNoteNumber)

Get the print report of a Customer Credit Note

The File is in Content of the message

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the customer credit note
try {
    Object result = apiInstance.customerCreditNotePrintBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNotePrintBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the customer credit note |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerCreditNoteReleaseDocumentBycreditNoteNumber"></a>
# **customerCreditNoteReleaseDocumentBycreditNoteNumber**
> ReleaseCustomerCreditNoteActionResultDto customerCreditNoteReleaseDocumentBycreditNoteNumber(creditNoteNumber)

Release credit note operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Reference number of the credit note to be released
try {
    ReleaseCustomerCreditNoteActionResultDto result = apiInstance.customerCreditNoteReleaseDocumentBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteReleaseDocumentBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Reference number of the credit note to be released |

### Return type

[**ReleaseCustomerCreditNoteActionResultDto**](ReleaseCustomerCreditNoteActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerCreditNoteUpdateBycreditNoteNumber"></a>
# **customerCreditNoteUpdateBycreditNoteNumber**
> Object customerCreditNoteUpdateBycreditNoteNumber(creditNoteNumber, creditNote)

Update a specific Credit Note

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerCreditNoteApi;

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

CustomerCreditNoteApi apiInstance = new CustomerCreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Credit Note to update
CustomerCreditNoteUpdateDto creditNote = new CustomerCreditNoteUpdateDto(); // CustomerCreditNoteUpdateDto | Defines the data for the Credit Note to update
try {
    Object result = apiInstance.customerCreditNoteUpdateBycreditNoteNumber(creditNoteNumber, creditNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerCreditNoteApi#customerCreditNoteUpdateBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Credit Note to update |
 **creditNote** | [**CustomerCreditNoteUpdateDto**](CustomerCreditNoteUpdateDto.md)| Defines the data for the Credit Note to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

