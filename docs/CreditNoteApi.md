# CreditNoteApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditNoteCreateCreditNote**](CreditNoteApi.md#creditNoteCreateCreditNote) | **POST** /controller/api/v1/creditNote | Create a Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNoteCreateHeaderAttachmentBycreditNoteNumber**](CreditNoteApi.md#creditNoteCreateHeaderAttachmentBycreditNoteNumber) | **POST** /controller/api/v1/creditNote/{creditNoteNumber}/attachment | Creates an attachment and associates it with a Credit Note. If the file already exists, a new revision is created.   - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber**](CreditNoteApi.md#creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber) | **POST** /controller/api/v1/creditNote/{creditNoteNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain Credit Note line. If the file already exists, a new revision is created.   - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNoteGetAllCreditNotesDto**](CreditNoteApi.md#creditNoteGetAllCreditNotesDto) | **GET** /controller/api/v1/creditNote | Get a range of Credit Notes - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNoteGetBycreditNoteNumber**](CreditNoteApi.md#creditNoteGetBycreditNoteNumber) | **GET** /controller/api/v1/creditNote/{creditNoteNumber} | Get a specific Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNotePutBycreditNoteNumber**](CreditNoteApi.md#creditNotePutBycreditNoteNumber) | **PUT** /controller/api/v1/creditNote/{creditNoteNumber} | Update a specific Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note
[**creditNoteReleaseInvoiceBycreditNoteNumber**](CreditNoteApi.md#creditNoteReleaseInvoiceBycreditNoteNumber) | **POST** /controller/api/v1/creditNote/{creditNoteNumber}/action/release | Release credit note operation - Method is deprecated start using the new method in endpoint Customer Credit Note


<a name="creditNoteCreateCreditNote"></a>
# **creditNoteCreateCreditNote**
> Object creditNoteCreateCreditNote(creditNoteUpdateDto)

Create a Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
CreditNoteUpdateDto creditNoteUpdateDto = new CreditNoteUpdateDto(); // CreditNoteUpdateDto | Defines the data for the Credit Note to create
try {
    Object result = apiInstance.creditNoteCreateCreditNote(creditNoteUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteCreateCreditNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteUpdateDto** | [**CreditNoteUpdateDto**](CreditNoteUpdateDto.md)| Defines the data for the Credit Note to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="creditNoteCreateHeaderAttachmentBycreditNoteNumber"></a>
# **creditNoteCreateHeaderAttachmentBycreditNoteNumber**
> Object creditNoteCreateHeaderAttachmentBycreditNoteNumber(creditNoteNumber)

Creates an attachment and associates it with a Credit Note. If the file already exists, a new revision is created.   - Method is deprecated start using the new method in endpoint Customer Credit Note

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Credit Note
try {
    Object result = apiInstance.creditNoteCreateHeaderAttachmentBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteCreateHeaderAttachmentBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Credit Note |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber"></a>
# **creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber**
> Object creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber(creditNoteNumber, lineNumber)

Creates an attachment and associates it with a certain Credit Note line. If the file already exists, a new revision is created.   - Method is deprecated start using the new method in endpoint Customer Credit Note

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Credit Note
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber(creditNoteNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteCreateLineAttachmentBycreditNoteNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Credit Note |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="creditNoteGetAllCreditNotesDto"></a>
# **creditNoteGetAllCreditNotesDto**
> List&lt;CreditNoteDto&gt; creditNoteGetAllCreditNotesDto(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Credit Notes - Method is deprecated start using the new method in endpoint Customer Credit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
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
    List<CreditNoteDto> result = apiInstance.creditNoteGetAllCreditNotesDto(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteGetAllCreditNotesDto");
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

[**List&lt;CreditNoteDto&gt;**](CreditNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="creditNoteGetBycreditNoteNumber"></a>
# **creditNoteGetBycreditNoteNumber**
> CreditNoteDto creditNoteGetBycreditNoteNumber(creditNoteNumber)

Get a specific Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Credit Note
try {
    CreditNoteDto result = apiInstance.creditNoteGetBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteGetBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Credit Note |

### Return type

[**CreditNoteDto**](CreditNoteDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="creditNotePutBycreditNoteNumber"></a>
# **creditNotePutBycreditNoteNumber**
> Object creditNotePutBycreditNoteNumber(creditNoteNumber, creditNoteUpdateDto)

Update a specific Credit Note - Method is deprecated start using the new method in endpoint Customer Credit Note

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Identifies the Credit Note to update
CreditNoteUpdateDto creditNoteUpdateDto = new CreditNoteUpdateDto(); // CreditNoteUpdateDto | Defines the data for the Credit Note to update
try {
    Object result = apiInstance.creditNotePutBycreditNoteNumber(creditNoteNumber, creditNoteUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNotePutBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Identifies the Credit Note to update |
 **creditNoteUpdateDto** | [**CreditNoteUpdateDto**](CreditNoteUpdateDto.md)| Defines the data for the Credit Note to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="creditNoteReleaseInvoiceBycreditNoteNumber"></a>
# **creditNoteReleaseInvoiceBycreditNoteNumber**
> ReleaseInvoiceActionResultDto creditNoteReleaseInvoiceBycreditNoteNumber(creditNoteNumber)

Release credit note operation - Method is deprecated start using the new method in endpoint Customer Credit Note

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CreditNoteApi;

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

CreditNoteApi apiInstance = new CreditNoteApi();
String creditNoteNumber = "creditNoteNumber_example"; // String | Reference number of the credit note to be released
try {
    ReleaseInvoiceActionResultDto result = apiInstance.creditNoteReleaseInvoiceBycreditNoteNumber(creditNoteNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreditNoteApi#creditNoteReleaseInvoiceBycreditNoteNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditNoteNumber** | **String**| Reference number of the credit note to be released |

### Return type

[**ReleaseInvoiceActionResultDto**](ReleaseInvoiceActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

