# InventoryTransferApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryTransferGetAll**](InventoryTransferApi.md#inventoryTransferGetAll) | **GET** /controller/api/v1/inventoryTransfer | Get a range of Inventory Transfers
[**inventoryTransferGetByinventoryTransferNumber**](InventoryTransferApi.md#inventoryTransferGetByinventoryTransferNumber) | **GET** /controller/api/v1/inventoryTransfer/{inventoryTransferNumber} | Get a specific Inventory Transfer document
[**inventoryTransferPost**](InventoryTransferApi.md#inventoryTransferPost) | **POST** /controller/api/v1/inventoryTransfer | Create an inventory transfer
[**inventoryTransferPutBytransferRefNumber**](InventoryTransferApi.md#inventoryTransferPutBytransferRefNumber) | **PUT** /controller/api/v1/inventoryTransfer/{transferRefNumber} | Update a specific inventory transfer
[**inventoryTransferReleaseDocumentBytransferNumber**](InventoryTransferApi.md#inventoryTransferReleaseDocumentBytransferNumber) | **POST** /controller/api/v1/inventoryTransfer/{transferNumber}/action/release | Release inventory operation


<a name="inventoryTransferGetAll"></a>
# **inventoryTransferGetAll**
> List&lt;InventoryTransferDto&gt; inventoryTransferGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Inventory Transfers

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryTransferApi;

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

InventoryTransferApi apiInstance = new InventoryTransferApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<InventoryTransferDto> result = apiInstance.inventoryTransferGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryTransferApi#inventoryTransferGetAll");
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

[**List&lt;InventoryTransferDto&gt;**](InventoryTransferDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryTransferGetByinventoryTransferNumber"></a>
# **inventoryTransferGetByinventoryTransferNumber**
> InventoryTransferDto inventoryTransferGetByinventoryTransferNumber(inventoryTransferNumber)

Get a specific Inventory Transfer document

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryTransferApi;

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

InventoryTransferApi apiInstance = new InventoryTransferApi();
String inventoryTransferNumber = "inventoryTransferNumber_example"; // String | Identifies the Inventory Transfer document
try {
    InventoryTransferDto result = apiInstance.inventoryTransferGetByinventoryTransferNumber(inventoryTransferNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryTransferApi#inventoryTransferGetByinventoryTransferNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryTransferNumber** | **String**| Identifies the Inventory Transfer document |

### Return type

[**InventoryTransferDto**](InventoryTransferDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryTransferPost"></a>
# **inventoryTransferPost**
> Object inventoryTransferPost(inventoryTransfer)

Create an inventory transfer

Response Message has StatusCode Created if POST operation succed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryTransferApi;

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

InventoryTransferApi apiInstance = new InventoryTransferApi();
InventoryTransferUpdateDto inventoryTransfer = new InventoryTransferUpdateDto(); // InventoryTransferUpdateDto | Define the data for the inventory transfer to create
try {
    Object result = apiInstance.inventoryTransferPost(inventoryTransfer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryTransferApi#inventoryTransferPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryTransfer** | [**InventoryTransferUpdateDto**](InventoryTransferUpdateDto.md)| Define the data for the inventory transfer to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryTransferPutBytransferRefNumber"></a>
# **inventoryTransferPutBytransferRefNumber**
> Object inventoryTransferPutBytransferRefNumber(transferRefNumber, transfer)

Update a specific inventory transfer

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryTransferApi;

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

InventoryTransferApi apiInstance = new InventoryTransferApi();
String transferRefNumber = "transferRefNumber_example"; // String | Identifies the inventory transfer to update
InventoryTransferUpdateDto transfer = new InventoryTransferUpdateDto(); // InventoryTransferUpdateDto | The data to update for inventory transfer
try {
    Object result = apiInstance.inventoryTransferPutBytransferRefNumber(transferRefNumber, transfer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryTransferApi#inventoryTransferPutBytransferRefNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferRefNumber** | **String**| Identifies the inventory transfer to update |
 **transfer** | [**InventoryTransferUpdateDto**](InventoryTransferUpdateDto.md)| The data to update for inventory transfer |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryTransferReleaseDocumentBytransferNumber"></a>
# **inventoryTransferReleaseDocumentBytransferNumber**
> ReleaseInventoryDocumentActionResultDto inventoryTransferReleaseDocumentBytransferNumber(transferNumber)

Release inventory operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryTransferApi;

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

InventoryTransferApi apiInstance = new InventoryTransferApi();
String transferNumber = "transferNumber_example"; // String | Reference number of the released transfer to be released
try {
    ReleaseInventoryDocumentActionResultDto result = apiInstance.inventoryTransferReleaseDocumentBytransferNumber(transferNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryTransferApi#inventoryTransferReleaseDocumentBytransferNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferNumber** | **String**| Reference number of the released transfer to be released |

### Return type

[**ReleaseInventoryDocumentActionResultDto**](ReleaseInventoryDocumentActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

