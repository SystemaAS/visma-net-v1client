# AccountApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountGetAll**](AccountApi.md#accountGetAll) | **GET** /controller/api/v1/account | Gets a range of Accounts
[**accountGetByaccountCd**](AccountApi.md#accountGetByaccountCd) | **GET** /controller/api/v1/account/{accountCd} | Get specific Account


<a name="accountGetAll"></a>
# **accountGetAll**
> List&lt;AccountDto&gt; accountGetAll(greaterThanValue, publicCode, externalCode1, externalCode2, analysisCode, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Gets a range of Accounts

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.AccountApi;

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

AccountApi apiInstance = new AccountApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer publicCode = 56; // Integer | 
String externalCode1 = "externalCode1_example"; // String | 
String externalCode2 = "externalCode2_example"; // String | 
String analysisCode = "analysisCode_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<AccountDto> result = apiInstance.accountGetAll(greaterThanValue, publicCode, externalCode1, externalCode2, analysisCode, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **publicCode** | **Integer**|  | [optional]
 **externalCode1** | **String**|  | [optional]
 **externalCode2** | **String**|  | [optional]
 **analysisCode** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;AccountDto&gt;**](AccountDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="accountGetByaccountCd"></a>
# **accountGetByaccountCd**
> AccountDto accountGetByaccountCd(accountCd)

Get specific Account

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.AccountApi;

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

AccountApi apiInstance = new AccountApi();
String accountCd = "accountCd_example"; // String | Identifies the account
try {
    AccountDto result = apiInstance.accountGetByaccountCd(accountCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountGetByaccountCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountCd** | **String**| Identifies the account |

### Return type

[**AccountDto**](AccountDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

