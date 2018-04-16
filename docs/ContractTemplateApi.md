# ContractTemplateApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractTemplateGetAll**](ContractTemplateApi.md#contractTemplateGetAll) | **GET** /controller/api/v1/contractTemplate | Get a range of Contract Templates


<a name="contractTemplateGetAll"></a>
# **contractTemplateGetAll**
> List&lt;ContractTemplateDto&gt; contractTemplateGetAll(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, expandAttributes)

Get a range of Contract Templates

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ContractTemplateApi;

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

ContractTemplateApi apiInstance = new ContractTemplateApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Boolean expandAttributes = true; // Boolean | 
try {
    List<ContractTemplateDto> result = apiInstance.contractTemplateGetAll(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, expandAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTemplateApi#contractTemplateGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **expandAttributes** | **Boolean**|  | [optional]

### Return type

[**List&lt;ContractTemplateDto&gt;**](ContractTemplateDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

