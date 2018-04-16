# SupplierInvoiceApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supplierInvoiceCreateHeaderAttachmentByinvoiceNumber**](SupplierInvoiceApi.md#supplierInvoiceCreateHeaderAttachmentByinvoiceNumber) | **POST** /controller/api/v1/supplierInvoice/{invoiceNumber}/attachment | Creates an attachment and associates it with a supplier invoice. If the file already exists, a new revision is created.
[**supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber**](SupplierInvoiceApi.md#supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber) | **POST** /controller/api/v1/supplierInvoice/{invoiceNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain supplier invoice line. If the file already exists, a new revision is created.
[**supplierInvoiceGetAllInvoices**](SupplierInvoiceApi.md#supplierInvoiceGetAllInvoices) | **GET** /controller/api/v1/supplierInvoice | Get a range of Invoices
[**supplierInvoiceGetByinvoiceNumber**](SupplierInvoiceApi.md#supplierInvoiceGetByinvoiceNumber) | **GET** /controller/api/v1/supplierInvoice/{invoiceNumber} | Get a specific Invoice
[**supplierInvoicePost**](SupplierInvoiceApi.md#supplierInvoicePost) | **POST** /controller/api/v1/supplierInvoice | Create an SupplierInvoice
[**supplierInvoicePutBysupplierInvoiceNumber**](SupplierInvoiceApi.md#supplierInvoicePutBysupplierInvoiceNumber) | **PUT** /controller/api/v1/supplierInvoice/{supplierInvoiceNumber} | Update a specific SupplierInvoice
[**supplierInvoiceReleaseInvoiceByinvoiceNumber**](SupplierInvoiceApi.md#supplierInvoiceReleaseInvoiceByinvoiceNumber) | **POST** /controller/api/v1/supplierInvoice/{invoiceNumber}/action/release | Release invoice operation


<a name="supplierInvoiceCreateHeaderAttachmentByinvoiceNumber"></a>
# **supplierInvoiceCreateHeaderAttachmentByinvoiceNumber**
> Object supplierInvoiceCreateHeaderAttachmentByinvoiceNumber(invoiceNumber)

Creates an attachment and associates it with a supplier invoice. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the supplier invoice
try {
    Object result = apiInstance.supplierInvoiceCreateHeaderAttachmentByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoiceCreateHeaderAttachmentByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the supplier invoice |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber"></a>
# **supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber**
> Object supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(invoiceNumber, lineNumber)

Creates an attachment and associates it with a certain supplier invoice line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the supplier invoice
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(invoiceNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the supplier invoice |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="supplierInvoiceGetAllInvoices"></a>
# **supplierInvoiceGetAllInvoices**
> List&lt;SupplierInvoiceDto&gt; supplierInvoiceGetAllInvoices(documentType, released, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Invoices

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String documentType = "documentType_example"; // String | 
Integer released = 56; // Integer | 
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
    List<SupplierInvoiceDto> result = apiInstance.supplierInvoiceGetAllInvoices(documentType, released, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoiceGetAllInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentType** | **String**|  | [optional] [enum: Invoice, CreditAdj, DebitAdj, Prepayment]
 **released** | **Integer**|  | [optional]
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

[**List&lt;SupplierInvoiceDto&gt;**](SupplierInvoiceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="supplierInvoiceGetByinvoiceNumber"></a>
# **supplierInvoiceGetByinvoiceNumber**
> SupplierInvoiceDto supplierInvoiceGetByinvoiceNumber(invoiceNumber)

Get a specific Invoice

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the Invoice
try {
    SupplierInvoiceDto result = apiInstance.supplierInvoiceGetByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoiceGetByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the Invoice |

### Return type

[**SupplierInvoiceDto**](SupplierInvoiceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="supplierInvoicePost"></a>
# **supplierInvoicePost**
> Object supplierInvoicePost(supplierInvoice)

Create an SupplierInvoice

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
SupplierInvoiceUpdateDto supplierInvoice = new SupplierInvoiceUpdateDto(); // SupplierInvoiceUpdateDto | Defines the data for the SupplierInvoice to create
try {
    Object result = apiInstance.supplierInvoicePost(supplierInvoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoicePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplierInvoice** | [**SupplierInvoiceUpdateDto**](SupplierInvoiceUpdateDto.md)| Defines the data for the SupplierInvoice to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="supplierInvoicePutBysupplierInvoiceNumber"></a>
# **supplierInvoicePutBysupplierInvoiceNumber**
> Object supplierInvoicePutBysupplierInvoiceNumber(supplierInvoiceNumber, supplierInvoice)

Update a specific SupplierInvoice

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String supplierInvoiceNumber = "supplierInvoiceNumber_example"; // String | Identifies the SupplierInvoice to update
SupplierInvoiceUpdateDto supplierInvoice = new SupplierInvoiceUpdateDto(); // SupplierInvoiceUpdateDto | Defines the data for the Invoice to update
try {
    Object result = apiInstance.supplierInvoicePutBysupplierInvoiceNumber(supplierInvoiceNumber, supplierInvoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoicePutBysupplierInvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **supplierInvoiceNumber** | **String**| Identifies the SupplierInvoice to update |
 **supplierInvoice** | [**SupplierInvoiceUpdateDto**](SupplierInvoiceUpdateDto.md)| Defines the data for the Invoice to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="supplierInvoiceReleaseInvoiceByinvoiceNumber"></a>
# **supplierInvoiceReleaseInvoiceByinvoiceNumber**
> ReleaseSupplierInvoiceActionResultDto supplierInvoiceReleaseInvoiceByinvoiceNumber(invoiceNumber)

Release invoice operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SupplierInvoiceApi;

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

SupplierInvoiceApi apiInstance = new SupplierInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Reference number of the released invoice to be reversed
try {
    ReleaseSupplierInvoiceActionResultDto result = apiInstance.supplierInvoiceReleaseInvoiceByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SupplierInvoiceApi#supplierInvoiceReleaseInvoiceByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Reference number of the released invoice to be reversed |

### Return type

[**ReleaseSupplierInvoiceActionResultDto**](ReleaseSupplierInvoiceActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

