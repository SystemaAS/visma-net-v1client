# CustomerDocumentApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerDocumentGetAllDocuments**](CustomerDocumentApi.md#customerDocumentGetAllDocuments) | **GET** /controller/api/v1/customerdocument | Gets a range of Customer Documents


<a name="customerDocumentGetAllDocuments"></a>
# **customerDocumentGetAllDocuments**
> List&lt;CustomerDocumentDto&gt; customerDocumentGetAllDocuments(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Gets a range of Customer Documents

Data for Customer Document

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerDocumentApi;

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

CustomerDocumentApi apiInstance = new CustomerDocumentApi();
String documentType = "documentType_example"; // String | The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint.
Integer released = 56; // Integer | 
Integer dunningLevel = 56; // Integer | 
String closedFinancialPeriod = "closedFinancialPeriod_example"; // String | 
String dunningLetterDateTime = "dunningLetterDateTime_example"; // String | 
String dunningLetterDateTimeCondition = "dunningLetterDateTimeCondition_example"; // String | 
String project = "project_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CustomerDocumentDto> result = apiInstance.customerDocumentGetAllDocuments(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerDocumentApi#customerDocumentGetAllDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentType** | **String**| The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint. | [optional] [enum: Invoice, DebitNote, CreditNote, Payment, VoidPayment, Prepayment, Refund, FinCharge, SmallBalanceWo, SmallCreditWo, CashSale, CashReturn, Undefined, NoUpdate]
 **released** | **Integer**|  | [optional]
 **dunningLevel** | **Integer**|  | [optional]
 **closedFinancialPeriod** | **String**|  | [optional]
 **dunningLetterDateTime** | **String**|  | [optional]
 **dunningLetterDateTimeCondition** | **String**|  | [optional]
 **project** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CustomerDocumentDto&gt;**](CustomerDocumentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

