# SalesCategoryApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesCategoryGet**](SalesCategoryApi.md#salesCategoryGet) | **GET** /controller/api/v1/salescategory | Get Sales Categories
[**salesCategoryGetCategoryBycategoryId**](SalesCategoryApi.md#salesCategoryGetCategoryBycategoryId) | **GET** /controller/api/v1/salescategory/{categoryId} | Get a Sales Category
[**salesCategoryGetItemsForCategoryBycategoryId**](SalesCategoryApi.md#salesCategoryGetItemsForCategoryBycategoryId) | **GET** /controller/api/v1/salescategory/{categoryId}/item | Get a range of Inventory Items from a specific Sales Category


<a name="salesCategoryGet"></a>
# **salesCategoryGet**
> List&lt;SalesCategoryDto&gt; salesCategoryGet()

Get Sales Categories

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesCategoryApi;

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

SalesCategoryApi apiInstance = new SalesCategoryApi();
try {
    List<SalesCategoryDto> result = apiInstance.salesCategoryGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesCategoryApi#salesCategoryGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SalesCategoryDto&gt;**](SalesCategoryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesCategoryGetCategoryBycategoryId"></a>
# **salesCategoryGetCategoryBycategoryId**
> SalesCategoryDto salesCategoryGetCategoryBycategoryId(categoryId)

Get a Sales Category

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesCategoryApi;

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

SalesCategoryApi apiInstance = new SalesCategoryApi();
Integer categoryId = 56; // Integer | Identifies the Sales Category
try {
    SalesCategoryDto result = apiInstance.salesCategoryGetCategoryBycategoryId(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesCategoryApi#salesCategoryGetCategoryBycategoryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| Identifies the Sales Category |

### Return type

[**SalesCategoryDto**](SalesCategoryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesCategoryGetItemsForCategoryBycategoryId"></a>
# **salesCategoryGetItemsForCategoryBycategoryId**
> List&lt;InventoryDto&gt; salesCategoryGetItemsForCategoryBycategoryId(categoryId)

Get a range of Inventory Items from a specific Sales Category

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesCategoryApi;

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

SalesCategoryApi apiInstance = new SalesCategoryApi();
Integer categoryId = 56; // Integer | Identifies the Sales Category
try {
    List<InventoryDto> result = apiInstance.salesCategoryGetItemsForCategoryBycategoryId(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesCategoryApi#salesCategoryGetItemsForCategoryBycategoryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| Identifies the Sales Category |

### Return type

[**List&lt;InventoryDto&gt;**](InventoryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

