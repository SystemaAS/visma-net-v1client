# PurchaseOrderBasicApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseOrderBasicGetAllOrderBasic**](PurchaseOrderBasicApi.md#purchaseOrderBasicGetAllOrderBasic) | **GET** /controller/api/v1/purchaseorderbasic | Get a range of Purchase Order
[**purchaseOrderBasicGetPurchaseOrderBasicByorderNbr**](PurchaseOrderBasicApi.md#purchaseOrderBasicGetPurchaseOrderBasicByorderNbr) | **GET** /controller/api/v1/purchaseorderbasic/{orderNbr} | Get a specific Purchase Order
[**purchaseOrderBasicPost**](PurchaseOrderBasicApi.md#purchaseOrderBasicPost) | **POST** /controller/api/v1/purchaseorderbasic | Create a Purchase Order Basic
[**purchaseOrderBasicPutBypurchaseOrderNumber**](PurchaseOrderBasicApi.md#purchaseOrderBasicPutBypurchaseOrderNumber) | **PUT** /controller/api/v1/purchaseorderbasic/{purchaseOrderNumber} | Update a Purchase Order Basic


<a name="purchaseOrderBasicGetAllOrderBasic"></a>
# **purchaseOrderBasicGetAllOrderBasic**
> List&lt;PurchaseOrderBasicDto&gt; purchaseOrderBasicGetAllOrderBasic(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, orderType, orderStatus, supplier)

Get a range of Purchase Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderBasicApi;

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

PurchaseOrderBasicApi apiInstance = new PurchaseOrderBasicApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String orderType = "orderType_example"; // String | 
String orderStatus = "orderStatus_example"; // String | 
String supplier = "supplier_example"; // String | 
try {
    List<PurchaseOrderBasicDto> result = apiInstance.purchaseOrderBasicGetAllOrderBasic(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, orderType, orderStatus, supplier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderBasicApi#purchaseOrderBasicGetAllOrderBasic");
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

[**List&lt;PurchaseOrderBasicDto&gt;**](PurchaseOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="purchaseOrderBasicGetPurchaseOrderBasicByorderNbr"></a>
# **purchaseOrderBasicGetPurchaseOrderBasicByorderNbr**
> PurchaseOrderBasicDto purchaseOrderBasicGetPurchaseOrderBasicByorderNbr(orderNbr)

Get a specific Purchase Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderBasicApi;

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

PurchaseOrderBasicApi apiInstance = new PurchaseOrderBasicApi();
String orderNbr = "orderNbr_example"; // String | Identifies the Purchase Order
try {
    PurchaseOrderBasicDto result = apiInstance.purchaseOrderBasicGetPurchaseOrderBasicByorderNbr(orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderBasicApi#purchaseOrderBasicGetPurchaseOrderBasicByorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNbr** | **String**| Identifies the Purchase Order |

### Return type

[**PurchaseOrderBasicDto**](PurchaseOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="purchaseOrderBasicPost"></a>
# **purchaseOrderBasicPost**
> Object purchaseOrderBasicPost(purchaseOrderBasicUpdateDto)

Create a Purchase Order Basic

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderBasicApi;

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

PurchaseOrderBasicApi apiInstance = new PurchaseOrderBasicApi();
PurchaseOrderBasicUpdateDto purchaseOrderBasicUpdateDto = new PurchaseOrderBasicUpdateDto(); // PurchaseOrderBasicUpdateDto | Defines the data for the Purchase Order to create
try {
    Object result = apiInstance.purchaseOrderBasicPost(purchaseOrderBasicUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderBasicApi#purchaseOrderBasicPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderBasicUpdateDto** | [**PurchaseOrderBasicUpdateDto**](PurchaseOrderBasicUpdateDto.md)| Defines the data for the Purchase Order to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseOrderBasicPutBypurchaseOrderNumber"></a>
# **purchaseOrderBasicPutBypurchaseOrderNumber**
> Object purchaseOrderBasicPutBypurchaseOrderNumber(purchaseOrderNumber, purchaseOrderBasicUpdateDto)

Update a Purchase Order Basic

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseOrderBasicApi;

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

PurchaseOrderBasicApi apiInstance = new PurchaseOrderBasicApi();
String purchaseOrderNumber = "purchaseOrderNumber_example"; // String | Identifies the Purchase Order to update
PurchaseOrderBasicUpdateDto purchaseOrderBasicUpdateDto = new PurchaseOrderBasicUpdateDto(); // PurchaseOrderBasicUpdateDto | Defines the data for the Purchase Order to update
try {
    Object result = apiInstance.purchaseOrderBasicPutBypurchaseOrderNumber(purchaseOrderNumber, purchaseOrderBasicUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseOrderBasicApi#purchaseOrderBasicPutBypurchaseOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderNumber** | **String**| Identifies the Purchase Order to update |
 **purchaseOrderBasicUpdateDto** | [**PurchaseOrderBasicUpdateDto**](PurchaseOrderBasicUpdateDto.md)| Defines the data for the Purchase Order to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

