# CustomerSalesPriceApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSalesPriceGetCustomerSalesPrices**](CustomerSalesPriceApi.md#customerSalesPriceGetCustomerSalesPrices) | **GET** /controller/api/v1/customerSalesPrice | Get a range of Customer Sales Prices


<a name="customerSalesPriceGetCustomerSalesPrices"></a>
# **customerSalesPriceGetCustomerSalesPrices**
> List&lt;CustomerSalesPriceDto&gt; customerSalesPriceGetCustomerSalesPrices(greaterThanValue, numberToRead, skipRecords, priceType, priceCode, inventoryId, effectiveAsOf, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of Customer Sales Prices

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerSalesPriceApi;

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

CustomerSalesPriceApi apiInstance = new CustomerSalesPriceApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String priceType = "priceType_example"; // String | 
String priceCode = "priceCode_example"; // String | 
String inventoryId = "inventoryId_example"; // String | 
LocalDateTime effectiveAsOf = new LocalDateTime(); // LocalDateTime | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<CustomerSalesPriceDto> result = apiInstance.customerSalesPriceGetCustomerSalesPrices(greaterThanValue, numberToRead, skipRecords, priceType, priceCode, inventoryId, effectiveAsOf, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerSalesPriceApi#customerSalesPriceGetCustomerSalesPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **priceType** | **String**|  | [optional] [enum: All, Base, Customer, CustomerPriceClass]
 **priceCode** | **String**|  | [optional]
 **inventoryId** | **String**|  | [optional]
 **effectiveAsOf** | **LocalDateTime**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;CustomerSalesPriceDto&gt;**](CustomerSalesPriceDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

