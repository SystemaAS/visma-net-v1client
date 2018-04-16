# EmployeeApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**employeeGetAllEmplyee**](EmployeeApi.md#employeeGetAllEmplyee) | **GET** /controller/api/v1/employee | Get a range of employees
[**employeeGetEmployeeByemployeeCd**](EmployeeApi.md#employeeGetEmployeeByemployeeCd) | **GET** /controller/api/v1/employee/{employeeCd} | Get a specific employee
[**employeeGetEmployeeExpenseClaimsByemployeeCd**](EmployeeApi.md#employeeGetEmployeeExpenseClaimsByemployeeCd) | **GET** /controller/api/v1/employee/{employeeCd}/expenseClaim | Get expense claims for a specific employee
[**employeeGetEmployeeExpenseReceiptsByemployeeCd**](EmployeeApi.md#employeeGetEmployeeExpenseReceiptsByemployeeCd) | **GET** /controller/api/v1/employee/{employeeCd}/expenseReceipt | Get expense receipts for a specific employee
[**employeeGetEmployeeTimeCardsByemployeeCd**](EmployeeApi.md#employeeGetEmployeeTimeCardsByemployeeCd) | **GET** /controller/api/v1/employee/{employeeCd}/timecards | Get a specific employee time cards


<a name="employeeGetAllEmplyee"></a>
# **employeeGetAllEmplyee**
> List&lt;EmployeeDto&gt; employeeGetAllEmplyee(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of employees

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.EmployeeApi;

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

EmployeeApi apiInstance = new EmployeeApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<EmployeeDto> result = apiInstance.employeeGetAllEmplyee(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetAllEmplyee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;EmployeeDto&gt;**](EmployeeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="employeeGetEmployeeByemployeeCd"></a>
# **employeeGetEmployeeByemployeeCd**
> EmployeeDto employeeGetEmployeeByemployeeCd(employeeCd)

Get a specific employee

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.EmployeeApi;

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

EmployeeApi apiInstance = new EmployeeApi();
String employeeCd = "employeeCd_example"; // String | Identifies the employee
try {
    EmployeeDto result = apiInstance.employeeGetEmployeeByemployeeCd(employeeCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployeeByemployeeCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeCd** | **String**| Identifies the employee |

### Return type

[**EmployeeDto**](EmployeeDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="employeeGetEmployeeExpenseClaimsByemployeeCd"></a>
# **employeeGetEmployeeExpenseClaimsByemployeeCd**
> List&lt;ExpenseClaimDto&gt; employeeGetEmployeeExpenseClaimsByemployeeCd(employeeCd, status, date, customer, departmentId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get expense claims for a specific employee

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.EmployeeApi;

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

EmployeeApi apiInstance = new EmployeeApi();
String employeeCd = "employeeCd_example"; // String | Identifies the employee
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
    List<ExpenseClaimDto> result = apiInstance.employeeGetEmployeeExpenseClaimsByemployeeCd(employeeCd, status, date, customer, departmentId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployeeExpenseClaimsByemployeeCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeCd** | **String**| Identifies the employee |
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

<a name="employeeGetEmployeeExpenseReceiptsByemployeeCd"></a>
# **employeeGetEmployeeExpenseReceiptsByemployeeCd**
> List&lt;ExpenseReceiptDto&gt; employeeGetEmployeeExpenseReceiptsByemployeeCd(employeeCd, date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer)

Get expense receipts for a specific employee

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.EmployeeApi;

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

EmployeeApi apiInstance = new EmployeeApi();
String employeeCd = "employeeCd_example"; // String | Identifies the employee
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
    List<ExpenseReceiptDto> result = apiInstance.employeeGetEmployeeExpenseReceiptsByemployeeCd(employeeCd, date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployeeExpenseReceiptsByemployeeCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeCd** | **String**| Identifies the employee |
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

<a name="employeeGetEmployeeTimeCardsByemployeeCd"></a>
# **employeeGetEmployeeTimeCardsByemployeeCd**
> List&lt;TimeCardDto&gt; employeeGetEmployeeTimeCardsByemployeeCd(employeeCd, status, week, type, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a specific employee time cards

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.EmployeeApi;

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

EmployeeApi apiInstance = new EmployeeApi();
String employeeCd = "employeeCd_example"; // String | Identifies the employee
String status = "status_example"; // String | 
String week = "week_example"; // String | 
String type = "type_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<TimeCardDto> result = apiInstance.employeeGetEmployeeTimeCardsByemployeeCd(employeeCd, status, week, type, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#employeeGetEmployeeTimeCardsByemployeeCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeCd** | **String**| Identifies the employee |
 **status** | **String**|  | [optional] [enum: Hold, Open, Approved, Rejected, Released]
 **week** | **String**|  | [optional]
 **type** | **String**|  | [optional] [enum: Normal, Correction, NormalCorrected]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;TimeCardDto&gt;**](TimeCardDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

