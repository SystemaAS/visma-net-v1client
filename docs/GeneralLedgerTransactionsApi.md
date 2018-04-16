# GeneralLedgerTransactionsApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generalLedgerTransactionsGetAll**](GeneralLedgerTransactionsApi.md#generalLedgerTransactionsGetAll) | **GET** /controller/api/v1/GeneralLedgerTransactions | Get a range of General Ledger Transactions


<a name="generalLedgerTransactionsGetAll"></a>
# **generalLedgerTransactionsGetAll**
> List&lt;GeneralLedgerTransactionDetailsDto&gt; generalLedgerTransactionsGetAll(branch, ledger, fromPeriod, toPeriod, account, subaccountId, fromDate, toDate, includeUnposted, includeUnreleased, skipRecords, numberToRead, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of General Ledger Transactions

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.GeneralLedgerTransactionsApi;

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

GeneralLedgerTransactionsApi apiInstance = new GeneralLedgerTransactionsApi();
String branch = "branch_example"; // String | 
String ledger = "ledger_example"; // String | Mandatory
String fromPeriod = "fromPeriod_example"; // String | Mandatory
String toPeriod = "toPeriod_example"; // String | Mandatory
String account = "account_example"; // String | 
String subaccountId = "subaccountId_example"; // String | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
Boolean includeUnposted = true; // Boolean | 
Boolean includeUnreleased = true; // Boolean | 
Integer skipRecords = 56; // Integer | 
Integer numberToRead = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<GeneralLedgerTransactionDetailsDto> result = apiInstance.generalLedgerTransactionsGetAll(branch, ledger, fromPeriod, toPeriod, account, subaccountId, fromDate, toDate, includeUnposted, includeUnreleased, skipRecords, numberToRead, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralLedgerTransactionsApi#generalLedgerTransactionsGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branch** | **String**|  | [optional]
 **ledger** | **String**| Mandatory | [optional]
 **fromPeriod** | **String**| Mandatory | [optional]
 **toPeriod** | **String**| Mandatory | [optional]
 **account** | **String**|  | [optional]
 **subaccountId** | **String**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **includeUnposted** | **Boolean**|  | [optional]
 **includeUnreleased** | **Boolean**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;GeneralLedgerTransactionDetailsDto&gt;**](GeneralLedgerTransactionDetailsDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

