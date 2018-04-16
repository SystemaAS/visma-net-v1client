# GeneralLedgerBalanceApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generalLedgerBalanceGetAll**](GeneralLedgerBalanceApi.md#generalLedgerBalanceGetAll) | **GET** /controller/api/v1/generalLedgerBalance | Get a range of General Ledger Balances


<a name="generalLedgerBalanceGetAll"></a>
# **generalLedgerBalanceGetAll**
> List&lt;GeneralLedgerBalanceDto&gt; generalLedgerBalanceGetAll(greaterThanValue, numberToRead, skipRecords, periodId, periodIdCondition, orderBy, accountId, yearClosed, balanceType, toggleBalanceSigns, pageNumber, pageSize)

Get a range of General Ledger Balances

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.GeneralLedgerBalanceApi;

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

GeneralLedgerBalanceApi apiInstance = new GeneralLedgerBalanceApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String periodId = "periodId_example"; // String | 
String periodIdCondition = "periodIdCondition_example"; // String | 
String orderBy = "orderBy_example"; // String | Order Options: AccountId, FinancialPeriod
String accountId = "accountId_example"; // String | 
Integer yearClosed = 56; // Integer | 
String balanceType = "balanceType_example"; // String | 
Integer toggleBalanceSigns = 56; // Integer | Parameter can be used in order to change the balance sign for liability accounts and expense accounts, in order to match the UI
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<GeneralLedgerBalanceDto> result = apiInstance.generalLedgerBalanceGetAll(greaterThanValue, numberToRead, skipRecords, periodId, periodIdCondition, orderBy, accountId, yearClosed, balanceType, toggleBalanceSigns, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerBalanceApi#generalLedgerBalanceGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **periodId** | **String**|  | [optional]
 **periodIdCondition** | **String**|  | [optional]
 **orderBy** | **String**| Order Options: AccountId, FinancialPeriod | [optional]
 **accountId** | **String**|  | [optional]
 **yearClosed** | **Integer**|  | [optional]
 **balanceType** | **String**|  | [optional] [enum: Actual, Report, Statistical, Budget]
 **toggleBalanceSigns** | **Integer**| Parameter can be used in order to change the balance sign for liability accounts and expense accounts, in order to match the UI | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;GeneralLedgerBalanceDto&gt;**](GeneralLedgerBalanceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

