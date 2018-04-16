# PurchaseReceiptApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseReceiptGetAllReceiptBasic**](PurchaseReceiptApi.md#purchaseReceiptGetAllReceiptBasic) | **GET** /controller/api/v1/PurchaseReceipt | Get a range of Purchase Receipts
[**purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr**](PurchaseReceiptApi.md#purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr) | **GET** /controller/api/v1/PurchaseReceipt/{receiptNbr} | Get a specific Purchase Receipt
[**purchaseReceiptPost**](PurchaseReceiptApi.md#purchaseReceiptPost) | **POST** /controller/api/v1/PurchaseReceipt | Create a Purchase Receipt
[**purchaseReceiptPrintPurchaseReceiptByreceiptNbr**](PurchaseReceiptApi.md#purchaseReceiptPrintPurchaseReceiptByreceiptNbr) | **GET** /controller/api/v1/PurchaseReceipt/{receiptNbr}/print | Get the print report of a Purchase Receipt
[**purchaseReceiptPutBypoReceiptNumber**](PurchaseReceiptApi.md#purchaseReceiptPutBypoReceiptNumber) | **PUT** /controller/api/v1/PurchaseReceipt/{poReceiptNumber} | Update a specific Purchase Receipt
[**purchaseReceiptReleaseInvoiceByreceiptNumber**](PurchaseReceiptApi.md#purchaseReceiptReleaseInvoiceByreceiptNumber) | **POST** /controller/api/v1/PurchaseReceipt/{receiptNumber}/action/release | Release purchase receipt operation


<a name="purchaseReceiptGetAllReceiptBasic"></a>
# **purchaseReceiptGetAllReceiptBasic**
> List&lt;PurchaseReceiptDto&gt; purchaseReceiptGetAllReceiptBasic(receiptType, greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a range of Purchase Receipts

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
String receiptType = "receiptType_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<PurchaseReceiptDto> result = apiInstance.purchaseReceiptGetAllReceiptBasic(receiptType, greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptGetAllReceiptBasic");
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

[**List&lt;PurchaseReceiptDto&gt;**](PurchaseReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr"></a>
# **purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr**
> PurchaseReceiptDto purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr(receiptNbr)

Get a specific Purchase Receipt

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
String receiptNbr = "receiptNbr_example"; // String | Identifies the Purchase Receipt
try {
    PurchaseReceiptDto result = apiInstance.purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr(receiptNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptGetPurchaseReceiptBasicByreceiptNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNbr** | **String**| Identifies the Purchase Receipt |

### Return type

[**PurchaseReceiptDto**](PurchaseReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="purchaseReceiptPost"></a>
# **purchaseReceiptPost**
> Object purchaseReceiptPost(poReceiptUpdateDto)

Create a Purchase Receipt

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
PurchaseReceiptUpdateDto poReceiptUpdateDto = new PurchaseReceiptUpdateDto(); // PurchaseReceiptUpdateDto | Defines the data for the  Purchase Receipt to create
try {
    Object result = apiInstance.purchaseReceiptPost(poReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poReceiptUpdateDto** | [**PurchaseReceiptUpdateDto**](PurchaseReceiptUpdateDto.md)| Defines the data for the  Purchase Receipt to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseReceiptPrintPurchaseReceiptByreceiptNbr"></a>
# **purchaseReceiptPrintPurchaseReceiptByreceiptNbr**
> Object purchaseReceiptPrintPurchaseReceiptByreceiptNbr(receiptNbr)

Get the print report of a Purchase Receipt

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
String receiptNbr = "receiptNbr_example"; // String | Identifies the receipt
try {
    Object result = apiInstance.purchaseReceiptPrintPurchaseReceiptByreceiptNbr(receiptNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptPrintPurchaseReceiptByreceiptNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNbr** | **String**| Identifies the receipt |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="purchaseReceiptPutBypoReceiptNumber"></a>
# **purchaseReceiptPutBypoReceiptNumber**
> Object purchaseReceiptPutBypoReceiptNumber(poReceiptNumber, poReceiptUpdateDto)

Update a specific Purchase Receipt

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
String poReceiptNumber = "poReceiptNumber_example"; // String | Identifies the  Purchase Receipt  to update
PurchaseReceiptUpdateDto poReceiptUpdateDto = new PurchaseReceiptUpdateDto(); // PurchaseReceiptUpdateDto | Defines the data for the  Purchase Receipt  to update
try {
    Object result = apiInstance.purchaseReceiptPutBypoReceiptNumber(poReceiptNumber, poReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptPutBypoReceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poReceiptNumber** | **String**| Identifies the  Purchase Receipt  to update |
 **poReceiptUpdateDto** | [**PurchaseReceiptUpdateDto**](PurchaseReceiptUpdateDto.md)| Defines the data for the  Purchase Receipt  to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="purchaseReceiptReleaseInvoiceByreceiptNumber"></a>
# **purchaseReceiptReleaseInvoiceByreceiptNumber**
> ReleasePurchaseReceiptActionResultDto purchaseReceiptReleaseInvoiceByreceiptNumber(receiptNumber)

Release purchase receipt operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.PurchaseReceiptApi;

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

PurchaseReceiptApi apiInstance = new PurchaseReceiptApi();
String receiptNumber = "receiptNumber_example"; // String | Reference number of the receipt to be released
try {
    ReleasePurchaseReceiptActionResultDto result = apiInstance.purchaseReceiptReleaseInvoiceByreceiptNumber(receiptNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseReceiptApi#purchaseReceiptReleaseInvoiceByreceiptNumber");
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

