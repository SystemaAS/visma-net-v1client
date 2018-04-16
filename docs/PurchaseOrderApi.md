# PurchaseOrderApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseOrderGetAllOrder**](PurchaseOrderApi.md#purchaseOrderGetAllOrder) | **GET** /controller/api/v1/purchaseorder | Get a range of Purchase Order
[**purchaseOrderGetOrderByorderNbr**](PurchaseOrderApi.md#purchaseOrderGetOrderByorderNbr) | **GET** /controller/api/v1/purchaseorder/{orderNbr} | Get a specific Purchase Order
[**purchaseOrderPost**](PurchaseOrderApi.md#purchaseOrderPost) | **POST** /controller/api/v1/purchaseorder | Create a Purchase Order
[**purchaseOrderPutBypurchaseOrderNumber**](PurchaseOrderApi.md#purchaseOrderPutBypurchaseOrderNumber) | **PUT** /controller/api/v1/purchaseorder/{purchaseOrderNumber} | Update a Purchase Order


<a name="purchaseOrderGetAllOrder"></a>
# **purchaseOrderGetAllOrder**
> List&lt;PurchaseOrderDto&gt; purchaseOrderGetAllOrder(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, orderType, orderStatus, supplier)

Get a range of Purchase Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderApi;

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

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String orderType = "orderType_example"; // String | 
String orderStatus = "orderStatus_example"; // String | 
String supplier = "supplier_example"; // String | 
try {
    List<PurchaseOrderDto> result = apiInstance.purchaseOrderGetAllOrder(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, orderType, orderStatus, supplier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#purchaseOrderGetAllOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **orderType** | **String**|  | [optional] [enum: RegularOrder, DropShip, Blanket, StandardBlanket]
 **orderStatus** | **String**|  | [optional] [enum: Balanced, Cancelled, Closed, Hold, Open, PendingEmail, PendingPrint, Printed, Voided]
 **supplier** | **String**|  | [optional]

### Return type

[**List&lt;PurchaseOrderDto&gt;**](PurchaseOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="purchaseOrderGetOrderByorderNbr"></a>
# **purchaseOrderGetOrderByorderNbr**
> PurchaseOrderDto purchaseOrderGetOrderByorderNbr(orderNbr)

Get a specific Purchase Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderApi;

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

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
String orderNbr = "orderNbr_example"; // String | Identifies the Purchase Order
try {
    PurchaseOrderDto result = apiInstance.purchaseOrderGetOrderByorderNbr(orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#purchaseOrderGetOrderByorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNbr** | **String**| Identifies the Purchase Order |

### Return type

[**PurchaseOrderDto**](PurchaseOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="purchaseOrderPost"></a>
# **purchaseOrderPost**
> Object purchaseOrderPost(purchaseOrderUpdateDto)

Create a Purchase Order

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderApi;

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

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
PurchaseOrderUpdateDto purchaseOrderUpdateDto = new PurchaseOrderUpdateDto(); // PurchaseOrderUpdateDto | Defines the data for the Purchase Order to create
try {
    Object result = apiInstance.purchaseOrderPost(purchaseOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#purchaseOrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderUpdateDto** | [**PurchaseOrderUpdateDto**](PurchaseOrderUpdateDto.md)| Defines the data for the Purchase Order to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseOrderPutBypurchaseOrderNumber"></a>
# **purchaseOrderPutBypurchaseOrderNumber**
> Object purchaseOrderPutBypurchaseOrderNumber(purchaseOrderNumber, purchaseOrderUpdateDto)

Update a Purchase Order

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderApi;

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

PurchaseOrderApi apiInstance = new PurchaseOrderApi();
String purchaseOrderNumber = "purchaseOrderNumber_example"; // String | Identifies the Purchase Order to update
PurchaseOrderUpdateDto purchaseOrderUpdateDto = new PurchaseOrderUpdateDto(); // PurchaseOrderUpdateDto | Defines the data for the Purchase Order to update
try {
    Object result = apiInstance.purchaseOrderPutBypurchaseOrderNumber(purchaseOrderNumber, purchaseOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderApi#purchaseOrderPutBypurchaseOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderNumber** | **String**| Identifies the Purchase Order to update |
 **purchaseOrderUpdateDto** | [**PurchaseOrderUpdateDto**](PurchaseOrderUpdateDto.md)| Defines the data for the Purchase Order to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

