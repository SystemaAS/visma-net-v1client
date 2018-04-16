# InventoryAdjustmentApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryAdjustmentGetAll**](InventoryAdjustmentApi.md#inventoryAdjustmentGetAll) | **GET** /controller/api/v1/inventoryadjustment | Get a range of Inventory Adjustment Dto
[**inventoryAdjustmentGetByinventoryAdjustmentNumber**](InventoryAdjustmentApi.md#inventoryAdjustmentGetByinventoryAdjustmentNumber) | **GET** /controller/api/v1/inventoryadjustment/{inventoryAdjustmentNumber} | Get a specific Inventory Adjustment document
[**inventoryAdjustmentPost**](InventoryAdjustmentApi.md#inventoryAdjustmentPost) | **POST** /controller/api/v1/inventoryadjustment | Create an inventory item
[**inventoryAdjustmentPutByadjRefNumber**](InventoryAdjustmentApi.md#inventoryAdjustmentPutByadjRefNumber) | **PUT** /controller/api/v1/inventoryadjustment/{adjRefNumber} | Update a specific inventory item
[**inventoryAdjustmentReleaseDocumentByadjRefNumber**](InventoryAdjustmentApi.md#inventoryAdjustmentReleaseDocumentByadjRefNumber) | **POST** /controller/api/v1/inventoryadjustment/{adjRefNumber}/action/release | Release inventory document action


<a name="inventoryAdjustmentGetAll"></a>
# **inventoryAdjustmentGetAll**
> List&lt;InventoryAdjustmentDto&gt; inventoryAdjustmentGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Inventory Adjustment Dto

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryAdjustmentApi;

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

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<InventoryAdjustmentDto> result = apiInstance.inventoryAdjustmentGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#inventoryAdjustmentGetAll");
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

[**List&lt;InventoryAdjustmentDto&gt;**](InventoryAdjustmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryAdjustmentGetByinventoryAdjustmentNumber"></a>
# **inventoryAdjustmentGetByinventoryAdjustmentNumber**
> InventoryAdjustmentDto inventoryAdjustmentGetByinventoryAdjustmentNumber(inventoryAdjustmentNumber)

Get a specific Inventory Adjustment document

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryAdjustmentApi;

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

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
String inventoryAdjustmentNumber = "inventoryAdjustmentNumber_example"; // String | Identifies the Inventory Adjustment document
try {
    InventoryAdjustmentDto result = apiInstance.inventoryAdjustmentGetByinventoryAdjustmentNumber(inventoryAdjustmentNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#inventoryAdjustmentGetByinventoryAdjustmentNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustmentNumber** | **String**| Identifies the Inventory Adjustment document |

### Return type

[**InventoryAdjustmentDto**](InventoryAdjustmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryAdjustmentPost"></a>
# **inventoryAdjustmentPost**
> Object inventoryAdjustmentPost(inventoryAdjustment)

Create an inventory item

Response Message has StatusCode Created if POST operation succed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryAdjustmentApi;

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

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
InventoryAdjustmentUpdateDto inventoryAdjustment = new InventoryAdjustmentUpdateDto(); // InventoryAdjustmentUpdateDto | Define the data for the inventory adjustment to create
try {
    Object result = apiInstance.inventoryAdjustmentPost(inventoryAdjustment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#inventoryAdjustmentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryAdjustment** | [**InventoryAdjustmentUpdateDto**](InventoryAdjustmentUpdateDto.md)| Define the data for the inventory adjustment to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryAdjustmentPutByadjRefNumber"></a>
# **inventoryAdjustmentPutByadjRefNumber**
> Object inventoryAdjustmentPutByadjRefNumber(adjRefNumber, adjustment)

Update a specific inventory item

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryAdjustmentApi;

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

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
String adjRefNumber = "adjRefNumber_example"; // String | Identifies the inventory item to update
InventoryAdjustmentUpdateDto adjustment = new InventoryAdjustmentUpdateDto(); // InventoryAdjustmentUpdateDto | The data to update for inventory item
try {
    Object result = apiInstance.inventoryAdjustmentPutByadjRefNumber(adjRefNumber, adjustment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#inventoryAdjustmentPutByadjRefNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adjRefNumber** | **String**| Identifies the inventory item to update |
 **adjustment** | [**InventoryAdjustmentUpdateDto**](InventoryAdjustmentUpdateDto.md)| The data to update for inventory item |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryAdjustmentReleaseDocumentByadjRefNumber"></a>
# **inventoryAdjustmentReleaseDocumentByadjRefNumber**
> ReleaseInventoryDocumentActionResultDto inventoryAdjustmentReleaseDocumentByadjRefNumber(adjRefNumber)

Release inventory document action

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryAdjustmentApi;

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

InventoryAdjustmentApi apiInstance = new InventoryAdjustmentApi();
String adjRefNumber = "adjRefNumber_example"; // String | Reference number of the released adjustment to be released
try {
    ReleaseInventoryDocumentActionResultDto result = apiInstance.inventoryAdjustmentReleaseDocumentByadjRefNumber(adjRefNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryAdjustmentApi#inventoryAdjustmentReleaseDocumentByadjRefNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adjRefNumber** | **String**| Reference number of the released adjustment to be released |

### Return type

[**ReleaseInventoryDocumentActionResultDto**](ReleaseInventoryDocumentActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

