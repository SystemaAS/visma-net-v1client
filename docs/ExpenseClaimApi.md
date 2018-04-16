# ExpenseClaimApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**expenseClaimCreateExpenseClaim**](ExpenseClaimApi.md#expenseClaimCreateExpenseClaim) | **POST** /controller/api/v1/expenseClaim | Create an ExpenseClaim
[**expenseClaimGetAll**](ExpenseClaimApi.md#expenseClaimGetAll) | **GET** /controller/api/v1/expenseClaim | Get a range of Expense Claims, a filter needs to be specified
[**expenseClaimGetExpenseClaimByexpenseClaimCd**](ExpenseClaimApi.md#expenseClaimGetExpenseClaimByexpenseClaimCd) | **GET** /controller/api/v1/expenseClaim/{expenseClaimCd} | Get a specific Expense Claim
[**expenseClaimPutByexpenseClaimNbr**](ExpenseClaimApi.md#expenseClaimPutByexpenseClaimNbr) | **PUT** /controller/api/v1/expenseClaim/{expenseClaimNbr} | Update a specific ExpenseClaim


<a name="expenseClaimCreateExpenseClaim"></a>
# **expenseClaimCreateExpenseClaim**
> Object expenseClaimCreateExpenseClaim(expenseClaim)

Create an ExpenseClaim

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseClaimApi;

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

ExpenseClaimApi apiInstance = new ExpenseClaimApi();
ExpenseClaimUpdateDto expenseClaim = new ExpenseClaimUpdateDto(); // ExpenseClaimUpdateDto | Defines the data for the ExpenseClaim to create
try {
    Object result = apiInstance.expenseClaimCreateExpenseClaim(expenseClaim);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseClaimApi#expenseClaimCreateExpenseClaim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expenseClaim** | [**ExpenseClaimUpdateDto**](ExpenseClaimUpdateDto.md)| Defines the data for the ExpenseClaim to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="expenseClaimGetAll"></a>
# **expenseClaimGetAll**
> List&lt;ExpenseClaimDto&gt; expenseClaimGetAll(status, date, customer, departmentId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a range of Expense Claims, a filter needs to be specified

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseClaimApi;

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

ExpenseClaimApi apiInstance = new ExpenseClaimApi();
String status = "status_example"; // String | 
LocalDateTime date = new LocalDateTime(); // LocalDateTime | 
String customer = "customer_example"; // String | 
String departmentId = "departmentId_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<ExpenseClaimDto> result = apiInstance.expenseClaimGetAll(status, date, customer, departmentId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseClaimApi#expenseClaimGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | [optional] [enum: Hold, PendingApproval, Approved, Rejected, Released]
 **date** | **LocalDateTime**|  | [optional]
 **customer** | **String**|  | [optional]
 **departmentId** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;ExpenseClaimDto&gt;**](ExpenseClaimDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="expenseClaimGetExpenseClaimByexpenseClaimCd"></a>
# **expenseClaimGetExpenseClaimByexpenseClaimCd**
> ExpenseClaimDto expenseClaimGetExpenseClaimByexpenseClaimCd(expenseClaimCd)

Get a specific Expense Claim

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseClaimApi;

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

ExpenseClaimApi apiInstance = new ExpenseClaimApi();
String expenseClaimCd = "expenseClaimCd_example"; // String | Identifies the expense claim
try {
    ExpenseClaimDto result = apiInstance.expenseClaimGetExpenseClaimByexpenseClaimCd(expenseClaimCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseClaimApi#expenseClaimGetExpenseClaimByexpenseClaimCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expenseClaimCd** | **String**| Identifies the expense claim |

### Return type

[**ExpenseClaimDto**](ExpenseClaimDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="expenseClaimPutByexpenseClaimNbr"></a>
# **expenseClaimPutByexpenseClaimNbr**
> Object expenseClaimPutByexpenseClaimNbr(expenseClaimNbr, expenseClaim)

Update a specific ExpenseClaim

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ExpenseClaimApi;

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

ExpenseClaimApi apiInstance = new ExpenseClaimApi();
String expenseClaimNbr = "expenseClaimNbr_example"; // String | Identifies the ExpenseClaim to update
ExpenseClaimUpdateDto expenseClaim = new ExpenseClaimUpdateDto(); // ExpenseClaimUpdateDto | Defines the data for the ExpenseClaim to update
try {
    Object result = apiInstance.expenseClaimPutByexpenseClaimNbr(expenseClaimNbr, expenseClaim);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpenseClaimApi#expenseClaimPutByexpenseClaimNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expenseClaimNbr** | **String**| Identifies the ExpenseClaim to update |
 **expenseClaim** | [**ExpenseClaimUpdateDto**](ExpenseClaimUpdateDto.md)| Defines the data for the ExpenseClaim to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

