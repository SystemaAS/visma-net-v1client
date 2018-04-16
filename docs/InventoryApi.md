# InventoryApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventoryGetAll**](InventoryApi.md#inventoryGetAll) | **GET** /controller/api/v1/inventory | Get a range of Inventory items
[**inventoryGetByinventoryNumber**](InventoryApi.md#inventoryGetByinventoryNumber) | **GET** /controller/api/v1/inventory/{inventoryNumber} | Get a specific Inventory item
[**inventoryGetItemClasses**](InventoryApi.md#inventoryGetItemClasses) | **GET** /controller/api/v1/inventory/itemClass | Get Inventory Item Classes
[**inventoryGetItemPostClasses**](InventoryApi.md#inventoryGetItemPostClasses) | **GET** /controller/api/v1/inventory/itemPostClass | Get Inventory Item Post Classes
[**inventoryGetSpecificItemClassByitemClassNumber**](InventoryApi.md#inventoryGetSpecificItemClassByitemClassNumber) | **GET** /controller/api/v1/inventory/itemclass/{itemClassNumber} | Get Specific Inventory Item Class
[**inventoryPost**](InventoryApi.md#inventoryPost) | **POST** /controller/api/v1/inventory | Create an inventory item
[**inventoryPutByinventoryNumber**](InventoryApi.md#inventoryPutByinventoryNumber) | **PUT** /controller/api/v1/inventory/{inventoryNumber} | Update a specific inventory item
[**inventoryUpdateCostNonStockItemByinventoryCd**](InventoryApi.md#inventoryUpdateCostNonStockItemByinventoryCd) | **POST** /controller/api/v1/inventory/{inventoryCd}/action/updateCost | Update Cost action on Non-Stock Item


<a name="inventoryGetAll"></a>
# **inventoryGetAll**
> List&lt;InventoryDto&gt; inventoryGetAll(alternateID, salesCategory, addCostPriceStatistics, attributes, description, availabilityLastModifiedDateTime, availabilityLastModifiedDateTimeCondition, expandCrossReference, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Inventory items

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
String alternateID = "alternateID_example"; // String | 
Integer salesCategory = 56; // Integer | 
Boolean addCostPriceStatistics = true; // Boolean | This filter can be used only for stock items
String attributes = "attributes_example"; // String | 
String description = "description_example"; // String | 
String availabilityLastModifiedDateTime = "availabilityLastModifiedDateTime_example"; // String | 
String availabilityLastModifiedDateTimeCondition = "availabilityLastModifiedDateTimeCondition_example"; // String | 
Boolean expandCrossReference = true; // Boolean | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<InventoryDto> result = apiInstance.inventoryGetAll(alternateID, salesCategory, addCostPriceStatistics, attributes, description, availabilityLastModifiedDateTime, availabilityLastModifiedDateTimeCondition, expandCrossReference, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alternateID** | **String**|  | [optional]
 **salesCategory** | **Integer**|  | [optional]
 **addCostPriceStatistics** | **Boolean**| This filter can be used only for stock items | [optional]
 **attributes** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **availabilityLastModifiedDateTime** | **String**|  | [optional]
 **availabilityLastModifiedDateTimeCondition** | **String**|  | [optional]
 **expandCrossReference** | **Boolean**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;InventoryDto&gt;**](InventoryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="inventoryGetByinventoryNumber"></a>
# **inventoryGetByinventoryNumber**
> InventoryDto inventoryGetByinventoryNumber(inventoryNumber)

Get a specific Inventory item

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
String inventoryNumber = "inventoryNumber_example"; // String | Identifies the Inventory item
try {
    InventoryDto result = apiInstance.inventoryGetByinventoryNumber(inventoryNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryGetByinventoryNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryNumber** | **String**| Identifies the Inventory item |

### Return type

[**InventoryDto**](InventoryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="inventoryGetItemClasses"></a>
# **inventoryGetItemClasses**
> List&lt;ItemClassDto&gt; inventoryGetItemClasses()

Get Inventory Item Classes

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
try {
    List<ItemClassDto> result = apiInstance.inventoryGetItemClasses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryGetItemClasses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ItemClassDto&gt;**](ItemClassDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="inventoryGetItemPostClasses"></a>
# **inventoryGetItemPostClasses**
> List&lt;PostingClassDto&gt; inventoryGetItemPostClasses()

Get Inventory Item Post Classes

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
try {
    List<PostingClassDto> result = apiInstance.inventoryGetItemPostClasses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryGetItemPostClasses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PostingClassDto&gt;**](PostingClassDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inventoryGetSpecificItemClassByitemClassNumber"></a>
# **inventoryGetSpecificItemClassByitemClassNumber**
> ItemClassDto inventoryGetSpecificItemClassByitemClassNumber(itemClassNumber)

Get Specific Inventory Item Class

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
String itemClassNumber = "itemClassNumber_example"; // String | 
try {
    ItemClassDto result = apiInstance.inventoryGetSpecificItemClassByitemClassNumber(itemClassNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryGetSpecificItemClassByitemClassNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemClassNumber** | **String**|  |

### Return type

[**ItemClassDto**](ItemClassDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="inventoryPost"></a>
# **inventoryPost**
> Object inventoryPost(inventory)

Create an inventory item

Response Message has StatusCode Created if POST operation succed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
InventoryUpdateDto inventory = new InventoryUpdateDto(); // InventoryUpdateDto | Define the data for the inventory item to create
try {
    Object result = apiInstance.inventoryPost(inventory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventory** | [**InventoryUpdateDto**](InventoryUpdateDto.md)| Define the data for the inventory item to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryPutByinventoryNumber"></a>
# **inventoryPutByinventoryNumber**
> Object inventoryPutByinventoryNumber(inventoryNumber, inventory)

Update a specific inventory item

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
String inventoryNumber = "inventoryNumber_example"; // String | Identifies the inventory item to update
InventoryUpdateDto inventory = new InventoryUpdateDto(); // InventoryUpdateDto | The data to update for inventory item
try {
    Object result = apiInstance.inventoryPutByinventoryNumber(inventoryNumber, inventory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryPutByinventoryNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryNumber** | **String**| Identifies the inventory item to update |
 **inventory** | [**InventoryUpdateDto**](InventoryUpdateDto.md)| The data to update for inventory item |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="inventoryUpdateCostNonStockItemByinventoryCd"></a>
# **inventoryUpdateCostNonStockItemByinventoryCd**
> UpdateCostActionResultDto inventoryUpdateCostNonStockItemByinventoryCd(inventoryCd)

Update Cost action on Non-Stock Item

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventoryApi;

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

InventoryApi apiInstance = new InventoryApi();
String inventoryCd = "inventoryCd_example"; // String | Identifies the inventory item to update
try {
    UpdateCostActionResultDto result = apiInstance.inventoryUpdateCostNonStockItemByinventoryCd(inventoryCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#inventoryUpdateCostNonStockItemByinventoryCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryCd** | **String**| Identifies the inventory item to update |

### Return type

[**UpdateCostActionResultDto**](UpdateCostActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

