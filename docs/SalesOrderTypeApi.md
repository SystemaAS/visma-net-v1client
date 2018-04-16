# SalesOrderTypeApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesOrderTypeGetAllSalesOrderTypes**](SalesOrderTypeApi.md#salesOrderTypeGetAllSalesOrderTypes) | **GET** /controller/api/v1/salesordertype | Get a range of SO OrderTypes
[**salesOrderTypeGetSalesOrderTypeByorderType**](SalesOrderTypeApi.md#salesOrderTypeGetSalesOrderTypeByorderType) | **GET** /controller/api/v1/salesordertype/{orderType} | Get a specific SO OrderType


<a name="salesOrderTypeGetAllSalesOrderTypes"></a>
# **salesOrderTypeGetAllSalesOrderTypes**
> List&lt;SalesOrderTypeDto&gt; salesOrderTypeGetAllSalesOrderTypes(numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a range of SO OrderTypes

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderTypeApi;

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

SalesOrderTypeApi apiInstance = new SalesOrderTypeApi();
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<SalesOrderTypeDto> result = apiInstance.salesOrderTypeGetAllSalesOrderTypes(numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderTypeApi#salesOrderTypeGetAllSalesOrderTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;SalesOrderTypeDto&gt;**](SalesOrderTypeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderTypeGetSalesOrderTypeByorderType"></a>
# **salesOrderTypeGetSalesOrderTypeByorderType**
> SalesOrderTypeDto salesOrderTypeGetSalesOrderTypeByorderType(orderType)

Get a specific SO OrderType

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderTypeApi;

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

SalesOrderTypeApi apiInstance = new SalesOrderTypeApi();
String orderType = "orderType_example"; // String | Identifies the SO OrderType
try {
    SalesOrderTypeDto result = apiInstance.salesOrderTypeGetSalesOrderTypeByorderType(orderType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderTypeApi#salesOrderTypeGetSalesOrderTypeByorderType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**| Identifies the SO OrderType |

### Return type

[**SalesOrderTypeDto**](SalesOrderTypeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

