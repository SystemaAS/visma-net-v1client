# InventoryIssueApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryIssueGetAll**](InventoryIssueApi.md#inventoryIssueGetAll) | **GET** /controller/api/v1/inventoryissue | Get a range of Inventory items
[**inventoryIssueGetByinventoryIssueNumber**](InventoryIssueApi.md#inventoryIssueGetByinventoryIssueNumber) | **GET** /controller/api/v1/inventoryissue/{inventoryIssueNumber} | Get a specific Inventory Issue document
[**inventoryIssuePost**](InventoryIssueApi.md#inventoryIssuePost) | **POST** /controller/api/v1/inventoryissue | Create an inventory item
[**inventoryIssuePutByissueRefNumber**](InventoryIssueApi.md#inventoryIssuePutByissueRefNumber) | **PUT** /controller/api/v1/inventoryissue/{issueRefNumber} | Update a specific inventory item
[**inventoryIssueReleaseDocumentByinvoiceNumber**](InventoryIssueApi.md#inventoryIssueReleaseDocumentByinvoiceNumber) | **POST** /controller/api/v1/inventoryissue/{invoiceNumber}/action/release | Release inventory operation


<a name="inventoryIssueGetAll"></a>
# **inventoryIssueGetAll**
> List&lt;InventoryIssueDto&gt; inventoryIssueGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Inventory items

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryIssueApi;

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

InventoryIssueApi apiInstance = new InventoryIssueApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<InventoryIssueDto> result = apiInstance.inventoryIssueGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryIssueApi#inventoryIssueGetAll");
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

[**List&lt;InventoryIssueDto&gt;**](InventoryIssueDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryIssueGetByinventoryIssueNumber"></a>
# **inventoryIssueGetByinventoryIssueNumber**
> InventoryIssueDto inventoryIssueGetByinventoryIssueNumber(inventoryIssueNumber)

Get a specific Inventory Issue document

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryIssueApi;

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

InventoryIssueApi apiInstance = new InventoryIssueApi();
String inventoryIssueNumber = "inventoryIssueNumber_example"; // String | Identifies the Inventory Issue document
try {
    InventoryIssueDto result = apiInstance.inventoryIssueGetByinventoryIssueNumber(inventoryIssueNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryIssueApi#inventoryIssueGetByinventoryIssueNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryIssueNumber** | **String**| Identifies the Inventory Issue document |

### Return type

[**InventoryIssueDto**](InventoryIssueDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryIssuePost"></a>
# **inventoryIssuePost**
> Object inventoryIssuePost(inventoryIssue)

Create an inventory item

Response Message has StatusCode Created if POST operation succed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryIssueApi;

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

InventoryIssueApi apiInstance = new InventoryIssueApi();
InventoryIssueUpdateDto inventoryIssue = new InventoryIssueUpdateDto(); // InventoryIssueUpdateDto | Define the data for the inventory issue to create
try {
    Object result = apiInstance.inventoryIssuePost(inventoryIssue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryIssueApi#inventoryIssuePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryIssue** | [**InventoryIssueUpdateDto**](InventoryIssueUpdateDto.md)| Define the data for the inventory issue to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryIssuePutByissueRefNumber"></a>
# **inventoryIssuePutByissueRefNumber**
> Object inventoryIssuePutByissueRefNumber(issueRefNumber, issue)

Update a specific inventory item

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryIssueApi;

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

InventoryIssueApi apiInstance = new InventoryIssueApi();
String issueRefNumber = "issueRefNumber_example"; // String | Identifies the inventory item to update
InventoryIssueUpdateDto issue = new InventoryIssueUpdateDto(); // InventoryIssueUpdateDto | The data to update for inventory item
try {
    Object result = apiInstance.inventoryIssuePutByissueRefNumber(issueRefNumber, issue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryIssueApi#inventoryIssuePutByissueRefNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueRefNumber** | **String**| Identifies the inventory item to update |
 **issue** | [**InventoryIssueUpdateDto**](InventoryIssueUpdateDto.md)| The data to update for inventory item |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryIssueReleaseDocumentByinvoiceNumber"></a>
# **inventoryIssueReleaseDocumentByinvoiceNumber**
> ReleaseInventoryDocumentActionResultDto inventoryIssueReleaseDocumentByinvoiceNumber(invoiceNumber)

Release inventory operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryIssueApi;

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

InventoryIssueApi apiInstance = new InventoryIssueApi();
String invoiceNumber = "invoiceNumber_example"; // String | Reference number of the released issue to be released
try {
    ReleaseInventoryDocumentActionResultDto result = apiInstance.inventoryIssueReleaseDocumentByinvoiceNumber(invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryIssueApi#inventoryIssueReleaseDocumentByinvoiceNumber");
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

