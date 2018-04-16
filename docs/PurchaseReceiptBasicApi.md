# PurchaseReceiptBasicApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseReceiptBasicGetAllReceiptBasic**](PurchaseReceiptBasicApi.md#purchaseReceiptBasicGetAllReceiptBasic) | **GET** /controller/api/v1/PurchaseReceiptBasic | 
[**purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr**](PurchaseReceiptBasicApi.md#purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr) | **GET** /controller/api/v1/PurchaseReceiptBasic/{receiptNbr} | Get a specific Purchase Receipt
[**purchaseReceiptBasicPost**](PurchaseReceiptBasicApi.md#purchaseReceiptBasicPost) | **POST** /controller/api/v1/PurchaseReceiptBasic | Create a Purchase Receipt
[**purchaseReceiptBasicPutBypoReceiptNumber**](PurchaseReceiptBasicApi.md#purchaseReceiptBasicPutBypoReceiptNumber) | **PUT** /controller/api/v1/PurchaseReceiptBasic/{poReceiptNumber} | Update a specific Purchase Receipt
[**purchaseReceiptBasicReleaseInvoiceByreceiptNumber**](PurchaseReceiptBasicApi.md#purchaseReceiptBasicReleaseInvoiceByreceiptNumber) | **POST** /controller/api/v1/PurchaseReceiptBasic/{receiptNumber}/action/release | Release purchase receipt operation


<a name="purchaseReceiptBasicGetAllReceiptBasic"></a>
# **purchaseReceiptBasicGetAllReceiptBasic**
> List&lt;PurchaseReceiptBasicDto&gt; purchaseReceiptBasicGetAllReceiptBasic(receiptType, greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition)



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptBasicApi;

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

PurchaseReceiptBasicApi apiInstance = new PurchaseReceiptBasicApi();
String receiptType = "receiptType_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<PurchaseReceiptBasicDto> result = apiInstance.purchaseReceiptBasicGetAllReceiptBasic(receiptType, greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptBasicApi#purchaseReceiptBasicGetAllReceiptBasic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptType** | **String**|  | [optional] [enum: PoReceipt, PoReturn, TransferReceipt]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;PurchaseReceiptBasicDto&gt;**](PurchaseReceiptBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr"></a>
# **purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr**
> PurchaseReceiptBasicDto purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr(receiptNbr)

Get a specific Purchase Receipt

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptBasicApi;

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

PurchaseReceiptBasicApi apiInstance = new PurchaseReceiptBasicApi();
String receiptNbr = "receiptNbr_example"; // String | Identifies the Purchase Receipt
try {
    PurchaseReceiptBasicDto result = apiInstance.purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr(receiptNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptBasicApi#purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNbr** | **String**| Identifies the Purchase Receipt |

### Return type

[**PurchaseReceiptBasicDto**](PurchaseReceiptBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseReceiptBasicPost"></a>
# **purchaseReceiptBasicPost**
> Object purchaseReceiptBasicPost(poReceiptUpdateDto)

Create a Purchase Receipt

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptBasicApi;

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

PurchaseReceiptBasicApi apiInstance = new PurchaseReceiptBasicApi();
PurchaseReceiptBasicUpdateDto poReceiptUpdateDto = new PurchaseReceiptBasicUpdateDto(); // PurchaseReceiptBasicUpdateDto | Defines the data for the  Purchase Receipt to create
try {
    Object result = apiInstance.purchaseReceiptBasicPost(poReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptBasicApi#purchaseReceiptBasicPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poReceiptUpdateDto** | [**PurchaseReceiptBasicUpdateDto**](PurchaseReceiptBasicUpdateDto.md)| Defines the data for the  Purchase Receipt to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseReceiptBasicPutBypoReceiptNumber"></a>
# **purchaseReceiptBasicPutBypoReceiptNumber**
> Object purchaseReceiptBasicPutBypoReceiptNumber(poReceiptNumber, poReceiptUpdateDto)

Update a specific Purchase Receipt

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptBasicApi;

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

PurchaseReceiptBasicApi apiInstance = new PurchaseReceiptBasicApi();
String poReceiptNumber = "poReceiptNumber_example"; // String | Identifies the  Purchase Receipt  to update
PurchaseReceiptBasicUpdateDto poReceiptUpdateDto = new PurchaseReceiptBasicUpdateDto(); // PurchaseReceiptBasicUpdateDto | Defines the data for the  Purchase Receipt  to update
try {
    Object result = apiInstance.purchaseReceiptBasicPutBypoReceiptNumber(poReceiptNumber, poReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptBasicApi#purchaseReceiptBasicPutBypoReceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poReceiptNumber** | **String**| Identifies the  Purchase Receipt  to update |
 **poReceiptUpdateDto** | [**PurchaseReceiptBasicUpdateDto**](PurchaseReceiptBasicUpdateDto.md)| Defines the data for the  Purchase Receipt  to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseReceiptBasicReleaseInvoiceByreceiptNumber"></a>
# **purchaseReceiptBasicReleaseInvoiceByreceiptNumber**
> ReleasePurchaseReceiptActionResultDto purchaseReceiptBasicReleaseInvoiceByreceiptNumber(receiptNumber)

Release purchase receipt operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptBasicApi;

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

PurchaseReceiptBasicApi apiInstance = new PurchaseReceiptBasicApi();
String receiptNumber = "receiptNumber_example"; // String | Reference number of the receipt to be released
try {
    ReleasePurchaseReceiptActionResultDto result = apiInstance.purchaseReceiptBasicReleaseInvoiceByreceiptNumber(receiptNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptBasicApi#purchaseReceiptBasicReleaseInvoiceByreceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNumber** | **String**| Reference number of the receipt to be released |

### Return type

[**ReleasePurchaseReceiptActionResultDto**](ReleasePurchaseReceiptActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

