# FinancialPeriodApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**financialPeriodGetAll**](FinancialPeriodApi.md#financialPeriodGetAll) | **GET** /controller/api/v1/financialPeriod | Get a range of Financial Periods
[**financialPeriodGetByfinancialPeriodId**](FinancialPeriodApi.md#financialPeriodGetByfinancialPeriodId) | **GET** /controller/api/v1/financialPeriod/{financialPeriodId} | Get a specific Financial Period


<a name="financialPeriodGetAll"></a>
# **financialPeriodGetAll**
> List&lt;FinancialPeriodDto&gt; financialPeriodGetAll(greaterThanValue, numberToRead, skipRecords, orderBy)

Get a range of Financial Periods

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.FinancialPeriodApi;

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

FinancialPeriodApi apiInstance = new FinancialPeriodApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
try {
    List<FinancialPeriodDto> result = apiInstance.financialPeriodGetAll(greaterThanValue, numberToRead, skipRecords, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPeriodApi#financialPeriodGetAll");
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

### Return type

[**List&lt;FinancialPeriodDto&gt;**](FinancialPeriodDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="financialPeriodGetByfinancialPeriodId"></a>
# **financialPeriodGetByfinancialPeriodId**
> FinancialPeriodDto financialPeriodGetByfinancialPeriodId(financialPeriodId)

Get a specific Financial Period

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.FinancialPeriodApi;

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

FinancialPeriodApi apiInstance = new FinancialPeriodApi();
String financialPeriodId = "financialPeriodId_example"; // String | Identifies the Financial Period
try {
    FinancialPeriodDto result = apiInstance.financialPeriodGetByfinancialPeriodId(financialPeriodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialPeriodApi#financialPeriodGetByfinancialPeriodId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialPeriodId** | **String**| Identifies the Financial Period |

### Return type

[**FinancialPeriodDto**](FinancialPeriodDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

