# StocktakeApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stocktakeGetAllStocktakes**](StocktakeApi.md#stocktakeGetAllStocktakes) | **GET** /controller/api/v1/stocktake | Get a range of stocktakes
[**stocktakeGetByreferenceNumber**](StocktakeApi.md#stocktakeGetByreferenceNumber) | **GET** /controller/api/v1/stocktake/{referenceNumber} | Get a specific
[**stocktakePutByreferenceNumber**](StocktakeApi.md#stocktakePutByreferenceNumber) | **PUT** /controller/api/v1/stocktake/{referenceNumber} | Update a specific stocktake


<a name="stocktakeGetAllStocktakes"></a>
# **stocktakeGetAllStocktakes**
> List&lt;StocktakeDto&gt; stocktakeGetAllStocktakes(warehouse, location, inventory, lotSerialNumber, summaryStatus, numberToRead, startWithLine, endWithLine, freezeDateTime, freezeDateTimeCondition, lastModifiedDateTime, lastModifiedDateTimeCondition, expirationDateTime, expirationDateTimeCondition, status, skipRecords)

Get a range of stocktakes

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.StocktakeApi;

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

StocktakeApi apiInstance = new StocktakeApi();
String warehouse = "warehouse_example"; // String | 
String location = "location_example"; // String | 
String inventory = "inventory_example"; // String | 
String lotSerialNumber = "lotSerialNumber_example"; // String | 
String summaryStatus = "summaryStatus_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer startWithLine = 56; // Integer | 
Integer endWithLine = 56; // Integer | 
String freezeDateTime = "freezeDateTime_example"; // String | 
String freezeDateTimeCondition = "freezeDateTimeCondition_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String expirationDateTime = "expirationDateTime_example"; // String | 
String expirationDateTimeCondition = "expirationDateTimeCondition_example"; // String | 
String status = "status_example"; // String | 
Integer skipRecords = 56; // Integer | 
try {
    List<StocktakeDto> result = apiInstance.stocktakeGetAllStocktakes(warehouse, location, inventory, lotSerialNumber, summaryStatus, numberToRead, startWithLine, endWithLine, freezeDateTime, freezeDateTimeCondition, lastModifiedDateTime, lastModifiedDateTimeCondition, expirationDateTime, expirationDateTimeCondition, status, skipRecords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocktakeApi#stocktakeGetAllStocktakes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warehouse** | **String**|  | [optional]
 **location** | **String**|  | [optional]
 **inventory** | **String**|  | [optional]
 **lotSerialNumber** | **String**|  | [optional]
 **summaryStatus** | **String**|  | [optional] [enum: Cancelled, Completed, Counting, Entering]
 **numberToRead** | **Integer**|  | [optional]
 **startWithLine** | **Integer**|  | [optional]
 **endWithLine** | **Integer**|  | [optional]
 **freezeDateTime** | **String**|  | [optional]
 **freezeDateTimeCondition** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **expirationDateTime** | **String**|  | [optional]
 **expirationDateTimeCondition** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: NotEntered, Entered, Skipped]
 **skipRecords** | **Integer**|  | [optional]

### Return type

[**List&lt;StocktakeDto&gt;**](StocktakeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stocktakeGetByreferenceNumber"></a>
# **stocktakeGetByreferenceNumber**
> StocktakeDto stocktakeGetByreferenceNumber(referenceNumber)

Get a specific

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.StocktakeApi;

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

StocktakeApi apiInstance = new StocktakeApi();
String referenceNumber = "referenceNumber_example"; // String | Identifies the Stocktake
try {
    StocktakeDto result = apiInstance.stocktakeGetByreferenceNumber(referenceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocktakeApi#stocktakeGetByreferenceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNumber** | **String**| Identifies the Stocktake |

### Return type

[**StocktakeDto**](StocktakeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stocktakePutByreferenceNumber"></a>
# **stocktakePutByreferenceNumber**
> Object stocktakePutByreferenceNumber(referenceNumber, stocktake)

Update a specific stocktake

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.StocktakeApi;

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

StocktakeApi apiInstance = new StocktakeApi();
String referenceNumber = "referenceNumber_example"; // String | Identifies the stocktake to update
StocktakeUpdateDto stocktake = new StocktakeUpdateDto(); // StocktakeUpdateDto | The data to update for stocktake
try {
    Object result = apiInstance.stocktakePutByreferenceNumber(referenceNumber, stocktake);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocktakeApi#stocktakePutByreferenceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNumber** | **String**| Identifies the stocktake to update |
 **stocktake** | [**StocktakeUpdateDto**](StocktakeUpdateDto.md)| The data to update for stocktake |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

