# CustomerInvoiceApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerInvoiceCreate**](CustomerInvoiceApi.md#customerInvoiceCreate) | **POST** /controller/api/v1/customerinvoice | Create an Invoice
[**customerInvoiceCreateHeaderAttachmentByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceCreateHeaderAttachmentByinvoiceNumber) | **POST** /controller/api/v1/customerinvoice/{invoiceNumber}/attachment | Creates an attachment and associates it with an invoice. If the file already exists, a new revision is created.
[**customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber**](CustomerInvoiceApi.md#customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber) | **POST** /controller/api/v1/customerinvoice/{invoiceNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain invoice line. If the file already exists, a new revision is created.
[**customerInvoiceDeleteByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceDeleteByinvoiceNumber) | **DELETE** /controller/api/v1/customerinvoice/{invoiceNumber} | Deletes a specific Customer Invoice
[**customerInvoiceGetAll**](CustomerInvoiceApi.md#customerInvoiceGetAll) | **GET** /controller/api/v1/customerinvoice | Get a range of Invoices
[**customerInvoiceGetByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceGetByinvoiceNumber) | **GET** /controller/api/v1/customerinvoice/{invoiceNumber} | Get a specific Invoice
[**customerInvoiceGetRotRutByrefNbr**](CustomerInvoiceApi.md#customerInvoiceGetRotRutByrefNbr) | **GET** /controller/api/v1/customerinvoice/{refNbr}/rotrut | Get Rot Rut informations for a Customer Invoice
[**customerInvoiceGetWorkTypes**](CustomerInvoiceApi.md#customerInvoiceGetWorkTypes) | **GET** /controller/api/v1/customerinvoice/worktypes | Get all Work Types
[**customerInvoicePrintInvoiceByrefNbr**](CustomerInvoiceApi.md#customerInvoicePrintInvoiceByrefNbr) | **GET** /controller/api/v1/customerinvoice/{refNbr}/print | Get the print report of a Customer Invoice
[**customerInvoiceReleaseInvoiceByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceReleaseInvoiceByinvoiceNumber) | **POST** /controller/api/v1/customerinvoice/{invoiceNumber}/action/release | Release invoice operation
[**customerInvoiceReverseInvoiceByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceReverseInvoiceByinvoiceNumber) | **POST** /controller/api/v1/customerinvoice/{invoiceNumber}/action/reverse | Reverse an Invoice
[**customerInvoiceUpdateByinvoiceNumber**](CustomerInvoiceApi.md#customerInvoiceUpdateByinvoiceNumber) | **PUT** /controller/api/v1/customerinvoice/{invoiceNumber} | Update a specific Invoice


<a name="customerInvoiceCreate"></a>
# **customerInvoiceCreate**
> Object customerInvoiceCreate(invoice)

Create an Invoice

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
CustomerInvoiceUpdateDto invoice = new CustomerInvoiceUpdateDto(); // CustomerInvoiceUpdateDto | Defines the data for the Invoice to create
try {
    Object result = apiInstance.customerInvoiceCreate(invoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**CustomerInvoiceUpdateDto**](CustomerInvoiceUpdateDto.md)| Defines the data for the Invoice to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerInvoiceCreateHeaderAttachmentByinvoiceNumber"></a>
# **customerInvoiceCreateHeaderAttachmentByinvoiceNumber**
> Object customerInvoiceCreateHeaderAttachmentByinvoiceNumber(invoiceNumber)

Creates an attachment and associates it with an invoice. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the invoice
try {
    Object result = apiInstance.customerInvoiceCreateHeaderAttachmentByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceCreateHeaderAttachmentByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the invoice |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber"></a>
# **customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber**
> Object customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(invoiceNumber, lineNumber)

Creates an attachment and associates it with a certain invoice line. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the invoice
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(invoiceNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceCreateLineAttachmentByinvoiceNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the invoice |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceDeleteByinvoiceNumber"></a>
# **customerInvoiceDeleteByinvoiceNumber**
> Object customerInvoiceDeleteByinvoiceNumber(invoiceNumber)

Deletes a specific Customer Invoice

Response Message has StatusCode NoContent if DELETE operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the Customer Invoice to delete
try {
    Object result = apiInstance.customerInvoiceDeleteByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceDeleteByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the Customer Invoice to delete |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceGetAll"></a>
# **customerInvoiceGetAll**
> List&lt;CustomerInvoiceDto&gt; customerInvoiceGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Invoices

Data for Customer Invoice

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
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
    List<CustomerInvoiceDto> result = apiInstance.customerInvoiceGetAll(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceGetAll");
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

[**List&lt;CustomerInvoiceDto&gt;**](CustomerInvoiceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceGetByinvoiceNumber"></a>
# **customerInvoiceGetByinvoiceNumber**
> CustomerInvoiceDto customerInvoiceGetByinvoiceNumber(invoiceNumber)

Get a specific Invoice

Data for Customer Invoice

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the Invoice
try {
    CustomerInvoiceDto result = apiInstance.customerInvoiceGetByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceGetByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the Invoice |

### Return type

[**CustomerInvoiceDto**](CustomerInvoiceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceGetRotRutByrefNbr"></a>
# **customerInvoiceGetRotRutByrefNbr**
> RotRutDto customerInvoiceGetRotRutByrefNbr(refNbr)

Get Rot Rut informations for a Customer Invoice

Data for the Rot Rut

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String refNbr = "refNbr_example"; // String | Identify the customer invoice for which to return data
try {
    RotRutDto result = apiInstance.customerInvoiceGetRotRutByrefNbr(refNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceGetRotRutByrefNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refNbr** | **String**| Identify the customer invoice for which to return data |

### Return type

[**RotRutDto**](RotRutDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceGetWorkTypes"></a>
# **customerInvoiceGetWorkTypes**
> List&lt;WorkTypeDto&gt; customerInvoiceGetWorkTypes()

Get all Work Types

Data for the Work Type

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
try {
    List<WorkTypeDto> result = apiInstance.customerInvoiceGetWorkTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceGetWorkTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WorkTypeDto&gt;**](WorkTypeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerInvoicePrintInvoiceByrefNbr"></a>
# **customerInvoicePrintInvoiceByrefNbr**
> Object customerInvoicePrintInvoiceByrefNbr(refNbr)

Get the print report of a Customer Invoice

The File is in Content of the message

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String refNbr = "refNbr_example"; // String | Identifies the customer invoice
try {
    Object result = apiInstance.customerInvoicePrintInvoiceByrefNbr(refNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoicePrintInvoiceByrefNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refNbr** | **String**| Identifies the customer invoice |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerInvoiceReleaseInvoiceByinvoiceNumber"></a>
# **customerInvoiceReleaseInvoiceByinvoiceNumber**
> ReleaseInvoiceActionResultDto customerInvoiceReleaseInvoiceByinvoiceNumber(invoiceNumber)

Release invoice operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Reference number of the invoice to be released
try {
    ReleaseInvoiceActionResultDto result = apiInstance.customerInvoiceReleaseInvoiceByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceReleaseInvoiceByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Reference number of the invoice to be released |

### Return type

[**ReleaseInvoiceActionResultDto**](ReleaseInvoiceActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerInvoiceReverseInvoiceByinvoiceNumber"></a>
# **customerInvoiceReverseInvoiceByinvoiceNumber**
> ReverseInvoiceActionResultDto customerInvoiceReverseInvoiceByinvoiceNumber(invoiceNumber, reverseActionDto)

Reverse an Invoice

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Reference number of the released invoice to be reversed
ReverseInvoiceActionDto reverseActionDto = new ReverseInvoiceActionDto(); // ReverseInvoiceActionDto | The action the dto use to condition the action
try {
    ReverseInvoiceActionResultDto result = apiInstance.customerInvoiceReverseInvoiceByinvoiceNumber(invoiceNumber, reverseActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceReverseInvoiceByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Reference number of the released invoice to be reversed |
 **reverseActionDto** | [**ReverseInvoiceActionDto**](ReverseInvoiceActionDto.md)| The action the dto use to condition the action |

### Return type

[**ReverseInvoiceActionResultDto**](ReverseInvoiceActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerInvoiceUpdateByinvoiceNumber"></a>
# **customerInvoiceUpdateByinvoiceNumber**
> Object customerInvoiceUpdateByinvoiceNumber(invoiceNumber, invoice)

Update a specific Invoice

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerInvoiceApi;

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

CustomerInvoiceApi apiInstance = new CustomerInvoiceApi();
String invoiceNumber = "invoiceNumber_example"; // String | Identifies the Invoice to update
CustomerInvoiceUpdateDto invoice = new CustomerInvoiceUpdateDto(); // CustomerInvoiceUpdateDto | Defines the data for the Invoice to update
try {
    Object result = apiInstance.customerInvoiceUpdateByinvoiceNumber(invoiceNumber, invoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoiceApi#customerInvoiceUpdateByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Identifies the Invoice to update |
 **invoice** | [**CustomerInvoiceUpdateDto**](CustomerInvoiceUpdateDto.md)| Defines the data for the Invoice to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

