# InventoryReceiptApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryReceiptGetAll**](InventoryReceiptApi.md#inventoryReceiptGetAll) | **GET** /controller/api/v1/inventoryReceipt | Get a range of Inventory Receipts
[**inventoryReceiptGetByinventoryReceiptNumber**](InventoryReceiptApi.md#inventoryReceiptGetByinventoryReceiptNumber) | **GET** /controller/api/v1/inventoryReceipt/{inventoryReceiptNumber} | Get a specific Inventory Receipt document
[**inventoryReceiptPost**](InventoryReceiptApi.md#inventoryReceiptPost) | **POST** /controller/api/v1/inventoryReceipt | Create an inventory item
[**inventoryReceiptPutByreceiptRefNumber**](InventoryReceiptApi.md#inventoryReceiptPutByreceiptRefNumber) | **PUT** /controller/api/v1/inventoryReceipt/{receiptRefNumber} | Update a specific inventory item
[**inventoryReceiptReleaseDocumentByinvoiceNumber**](InventoryReceiptApi.md#inventoryReceiptReleaseDocumentByinvoiceNumber) | **POST** /controller/api/v1/inventoryReceipt/{invoiceNumber}/action/release | Release inventory operation


<a name="inventoryReceiptGetAll"></a>
# **inventoryReceiptGetAll**
> List&lt;InventoryReceiptDto&gt; inventoryReceiptGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Inventory Receipts

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryReceiptApi;

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

InventoryReceiptApi apiInstance = new InventoryReceiptApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<InventoryReceiptDto> result = apiInstance.inventoryReceiptGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryReceiptApi#inventoryReceiptGetAll");
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
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;InventoryReceiptDto&gt;**](InventoryReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryReceiptGetByinventoryReceiptNumber"></a>
# **inventoryReceiptGetByinventoryReceiptNumber**
> InventoryReceiptDto inventoryReceiptGetByinventoryReceiptNumber(inventoryReceiptNumber)

Get a specific Inventory Receipt document

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryReceiptApi;

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

InventoryReceiptApi apiInstance = new InventoryReceiptApi();
String inventoryReceiptNumber = "inventoryReceiptNumber_example"; // String | Identifies the Inventory Issue document
try {
    InventoryReceiptDto result = apiInstance.inventoryReceiptGetByinventoryReceiptNumber(inventoryReceiptNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryReceiptApi#inventoryReceiptGetByinventoryReceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryReceiptNumber** | **String**| Identifies the Inventory Issue document |

### Return type

[**InventoryReceiptDto**](InventoryReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryReceiptPost"></a>
# **inventoryReceiptPost**
> Object inventoryReceiptPost(inventoryReceipt)

Create an inventory item

Response Message has StatusCode Created if POST operation succed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryReceiptApi;

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

InventoryReceiptApi apiInstance = new InventoryReceiptApi();
InventoryReceiptUpdateDto inventoryReceipt = new InventoryReceiptUpdateDto(); // InventoryReceiptUpdateDto | Define the data for the inventory issue to create
try {
    Object result = apiInstance.inventoryReceiptPost(inventoryReceipt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryReceiptApi#inventoryReceiptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryReceipt** | [**InventoryReceiptUpdateDto**](InventoryReceiptUpdateDto.md)| Define the data for the inventory issue to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryReceiptPutByreceiptRefNumber"></a>
# **inventoryReceiptPutByreceiptRefNumber**
> Object inventoryReceiptPutByreceiptRefNumber(receiptRefNumber, receipt)

Update a specific inventory item

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryReceiptApi;

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

InventoryReceiptApi apiInstance = new InventoryReceiptApi();
String receiptRefNumber = "receiptRefNumber_example"; // String | Identifies the inventory receipt to update
InventoryReceiptUpdateDto receipt = new InventoryReceiptUpdateDto(); // InventoryReceiptUpdateDto | The data to update for inventory receipt
try {
    Object result = apiInstance.inventoryReceiptPutByreceiptRefNumber(receiptRefNumber, receipt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryReceiptApi#inventoryReceiptPutByreceiptRefNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptRefNumber** | **String**| Identifies the inventory receipt to update |
 **receipt** | [**InventoryReceiptUpdateDto**](InventoryReceiptUpdateDto.md)| The data to update for inventory receipt |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryReceiptReleaseDocumentByinvoiceNumber"></a>
# **inventoryReceiptReleaseDocumentByinvoiceNumber**
> ReleaseInventoryDocumentActionResultDto inventoryReceiptReleaseDocumentByinvoiceNumber(invoiceNumber)

Release inventory operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryReceiptApi;

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

InventoryReceiptApi apiInstance = new InventoryReceiptApi();
String invoiceNumber = "invoiceNumber_example"; // String | Reference number of the released issue to be released
try {
    ReleaseInventoryDocumentActionResultDto result = apiInstance.inventoryReceiptReleaseDocumentByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryReceiptApi#inventoryReceiptReleaseDocumentByinvoiceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceNumber** | **String**| Reference number of the released issue to be released |

### Return type

[**ReleaseInventoryDocumentActionResultDto**](ReleaseInventoryDocumentActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

