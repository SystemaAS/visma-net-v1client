# ExpenseReceiptApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**expenseReceiptGetAll**](ExpenseReceiptApi.md#expenseReceiptGetAll) | **GET** /controller/api/v1/expenseReceipt | Get a range of Expense Receipts, a filter needs to be specified
[**expenseReceiptGetByreceiptNumber**](ExpenseReceiptApi.md#expenseReceiptGetByreceiptNumber) | **GET** /controller/api/v1/expenseReceipt/{receiptNumber} | Get a specific ExpenseReceipt
[**expenseReceiptPost**](ExpenseReceiptApi.md#expenseReceiptPost) | **POST** /controller/api/v1/expenseReceipt | Create a Expense Receipt
[**expenseReceiptPutByreceiptNumber**](ExpenseReceiptApi.md#expenseReceiptPutByreceiptNumber) | **PUT** /controller/api/v1/expenseReceipt/{receiptNumber} | Update a Expense Receipt


<a name="expenseReceiptGetAll"></a>
# **expenseReceiptGetAll**
> List&lt;ExpenseReceiptDto&gt; expenseReceiptGetAll(date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer)

Get a range of Expense Receipts, a filter needs to be specified

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseReceiptApi;

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

ExpenseReceiptApi apiInstance = new ExpenseReceiptApi();
String date = "date_example"; // String | 
String dateCondition = "dateCondition_example"; // String | 
String inventory = "inventory_example"; // String | 
String project = "project_example"; // String | 
String claimedBy = "claimedBy_example"; // String | 
String projectTask = "projectTask_example"; // String | 
Boolean invoiceable = true; // Boolean | 
String status = "status_example"; // String | 
String customer = "customer_example"; // String | 
try {
    List<ExpenseReceiptDto> result = apiInstance.expenseReceiptGetAll(date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseReceiptApi#expenseReceiptGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  | [optional]
 **dateCondition** | **String**|  | [optional]
 **inventory** | **String**|  | [optional]
 **project** | **String**|  | [optional]
 **claimedBy** | **String**|  | [optional]
 **projectTask** | **String**|  | [optional]
 **invoiceable** | **Boolean**|  | [optional]
 **status** | **String**|  | [optional] [enum: Open, Pending, Approved, Rejected, Released]
 **customer** | **String**|  | [optional]

### Return type

[**List&lt;ExpenseReceiptDto&gt;**](ExpenseReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="expenseReceiptGetByreceiptNumber"></a>
# **expenseReceiptGetByreceiptNumber**
> ExpenseReceiptDto expenseReceiptGetByreceiptNumber(receiptNumber)

Get a specific ExpenseReceipt

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseReceiptApi;

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

ExpenseReceiptApi apiInstance = new ExpenseReceiptApi();
String receiptNumber = "receiptNumber_example"; // String | Identifies the ExpenseReceipt
try {
    ExpenseReceiptDto result = apiInstance.expenseReceiptGetByreceiptNumber(receiptNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseReceiptApi#expenseReceiptGetByreceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNumber** | **String**| Identifies the ExpenseReceipt |

### Return type

[**ExpenseReceiptDto**](ExpenseReceiptDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="expenseReceiptPost"></a>
# **expenseReceiptPost**
> Object expenseReceiptPost(expenseReceiptUpdateDto)

Create a Expense Receipt

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseReceiptApi;

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

ExpenseReceiptApi apiInstance = new ExpenseReceiptApi();
ExpenseReceiptUpdateDto expenseReceiptUpdateDto = new ExpenseReceiptUpdateDto(); // ExpenseReceiptUpdateDto | Defines the data for the Expense Receipt to create
try {
    Object result = apiInstance.expenseReceiptPost(expenseReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseReceiptApi#expenseReceiptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expenseReceiptUpdateDto** | [**ExpenseReceiptUpdateDto**](ExpenseReceiptUpdateDto.md)| Defines the data for the Expense Receipt to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="expenseReceiptPutByreceiptNumber"></a>
# **expenseReceiptPutByreceiptNumber**
> Object expenseReceiptPutByreceiptNumber(receiptNumber, expenseReceiptUpdateDto)

Update a Expense Receipt

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseReceiptApi;

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

ExpenseReceiptApi apiInstance = new ExpenseReceiptApi();
String receiptNumber = "receiptNumber_example"; // String | 
ExpenseReceiptUpdateDto expenseReceiptUpdateDto = new ExpenseReceiptUpdateDto(); // ExpenseReceiptUpdateDto | 
try {
    Object result = apiInstance.expenseReceiptPutByreceiptNumber(receiptNumber, expenseReceiptUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseReceiptApi#expenseReceiptPutByreceiptNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiptNumber** | **String**|  |
 **expenseReceiptUpdateDto** | [**ExpenseReceiptUpdateDto**](ExpenseReceiptUpdateDto.md)|  |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

