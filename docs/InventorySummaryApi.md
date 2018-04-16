# InventorySummaryApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inventorySummaryGetAllInventorySummaryByinventoryNumber**](InventorySummaryApi.md#inventorySummaryGetAllInventorySummaryByinventoryNumber) | **GET** /controller/api/v1/inventorysummary/{inventoryNumber} | Get a range of InventorySummary


<a name="inventorySummaryGetAllInventorySummaryByinventoryNumber"></a>
# **inventorySummaryGetAllInventorySummaryByinventoryNumber**
> List&lt;InventorySummaryDto&gt; inventorySummaryGetAllInventorySummaryByinventoryNumber(inventoryNumber, warehouse, location)

Get a range of InventorySummary

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.InventorySummaryApi;

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

InventorySummaryApi apiInstance = new InventorySummaryApi();
String inventoryNumber = "inventoryNumber_example"; // String | 
String warehouse = "warehouse_example"; // String | 
String location = "location_example"; // String | 
try {
    List<InventorySummaryDto> result = apiInstance.inventorySummaryGetAllInventorySummaryByinventoryNumber(inventoryNumber, warehouse, location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventorySummaryApi#inventorySummaryGetAllInventorySummaryByinventoryNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryNumber** | **String**|  |
 **warehouse** | **String**|  | [optional]
 **location** | **String**|  | [optional]

### Return type

[**List&lt;InventorySummaryDto&gt;**](InventorySummaryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

