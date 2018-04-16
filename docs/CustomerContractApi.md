# CustomerContractApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerContractCreateCustomerContract**](CustomerContractApi.md#customerContractCreateCustomerContract) | **POST** /controller/api/v1/customerContract | Create a CustomerContract
[**customerContractGetAll**](CustomerContractApi.md#customerContractGetAll) | **GET** /controller/api/v1/customerContract | Get a range of Customer Contracts, a filter needs to be specified
[**customerContractGetCustomerContractBycontractId**](CustomerContractApi.md#customerContractGetCustomerContractBycontractId) | **GET** /controller/api/v1/customerContract/{contractId} | Get a specific Customer Contract
[**customerContractGetCustomerContractDetailsBycontractId**](CustomerContractApi.md#customerContractGetCustomerContractDetailsBycontractId) | **GET** /controller/api/v1/customerContract/{contractId}/details | Get a specific Customer Contract Details
[**customerContractGetCustomerContractRecurringSummaryBycontractId**](CustomerContractApi.md#customerContractGetCustomerContractRecurringSummaryBycontractId) | **GET** /controller/api/v1/customerContract/{contractId}/recurringSummary | Get a specific Customer Contract Recurring Summary
[**customerContractGetCustomerContractSummaryBycontractId**](CustomerContractApi.md#customerContractGetCustomerContractSummaryBycontractId) | **GET** /controller/api/v1/customerContract/{contractId}/summary | Get a specific Customer Contract Summary
[**customerContractPutBycustomerContractId**](CustomerContractApi.md#customerContractPutBycustomerContractId) | **PUT** /controller/api/v1/customerContract/{customerContractId} | Update a specific CustomerContract


<a name="customerContractCreateCustomerContract"></a>
# **customerContractCreateCustomerContract**
> Object customerContractCreateCustomerContract(customerContract)

Create a CustomerContract

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
CustomerContractUpdateDto customerContract = new CustomerContractUpdateDto(); // CustomerContractUpdateDto | Defines the data for the CustomerContract to create
try {
    Object result = apiInstance.customerContractCreateCustomerContract(customerContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractCreateCustomerContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerContract** | [**CustomerContractUpdateDto**](CustomerContractUpdateDto.md)| Defines the data for the CustomerContract to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="customerContractGetAll"></a>
# **customerContractGetAll**
> List&lt;CustomerContractDto&gt; customerContractGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, contractTemplate, status, customer, expandSummary, expandDetails, attributes, expandAttributes)

Get a range of Customer Contracts, a filter needs to be specified

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String contractTemplate = "contractTemplate_example"; // String | 
String status = "status_example"; // String | 
String customer = "customer_example"; // String | 
Boolean expandSummary = true; // Boolean | 
Boolean expandDetails = true; // Boolean | 
String attributes = "attributes_example"; // String | 
Boolean expandAttributes = true; // Boolean | 
try {
    List<CustomerContractDto> result = apiInstance.customerContractGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, contractTemplate, status, customer, expandSummary, expandDetails, attributes, expandAttributes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractGetAll");
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
 **contractTemplate** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: Draft, InApproval, Active, Expired, Canceled, Completed, InUpgrade, PendingActivation]
 **customer** | **String**|  | [optional]
 **expandSummary** | **Boolean**|  | [optional]
 **expandDetails** | **Boolean**|  | [optional]
 **attributes** | **String**|  | [optional]
 **expandAttributes** | **Boolean**|  | [optional]

### Return type

[**List&lt;CustomerContractDto&gt;**](CustomerContractDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerContractGetCustomerContractBycontractId"></a>
# **customerContractGetCustomerContractBycontractId**
> CustomerContractDto customerContractGetCustomerContractBycontractId(contractId)

Get a specific Customer Contract

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String contractId = "contractId_example"; // String | Identifies the customer contract
try {
    CustomerContractDto result = apiInstance.customerContractGetCustomerContractBycontractId(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractGetCustomerContractBycontractId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Identifies the customer contract |

### Return type

[**CustomerContractDto**](CustomerContractDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="customerContractGetCustomerContractDetailsBycontractId"></a>
# **customerContractGetCustomerContractDetailsBycontractId**
> CustomerContractDetailsDto customerContractGetCustomerContractDetailsBycontractId(contractId)

Get a specific Customer Contract Details

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String contractId = "contractId_example"; // String | Identifies the customer contract
try {
    CustomerContractDetailsDto result = apiInstance.customerContractGetCustomerContractDetailsBycontractId(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractGetCustomerContractDetailsBycontractId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Identifies the customer contract |

### Return type

[**CustomerContractDetailsDto**](CustomerContractDetailsDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerContractGetCustomerContractRecurringSummaryBycontractId"></a>
# **customerContractGetCustomerContractRecurringSummaryBycontractId**
> CustomerContractRecurringSummaryDto customerContractGetCustomerContractRecurringSummaryBycontractId(contractId)

Get a specific Customer Contract Recurring Summary

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String contractId = "contractId_example"; // String | Identifies the customer contract
try {
    CustomerContractRecurringSummaryDto result = apiInstance.customerContractGetCustomerContractRecurringSummaryBycontractId(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractGetCustomerContractRecurringSummaryBycontractId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Identifies the customer contract |

### Return type

[**CustomerContractRecurringSummaryDto**](CustomerContractRecurringSummaryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerContractGetCustomerContractSummaryBycontractId"></a>
# **customerContractGetCustomerContractSummaryBycontractId**
> CustomerContractSummaryDto customerContractGetCustomerContractSummaryBycontractId(contractId)

Get a specific Customer Contract Summary

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String contractId = "contractId_example"; // String | Identifies the customer contract
try {
    CustomerContractSummaryDto result = apiInstance.customerContractGetCustomerContractSummaryBycontractId(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractGetCustomerContractSummaryBycontractId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **String**| Identifies the customer contract |

### Return type

[**CustomerContractSummaryDto**](CustomerContractSummaryDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="customerContractPutBycustomerContractId"></a>
# **customerContractPutBycustomerContractId**
> Object customerContractPutBycustomerContractId(customerContractId, customerContract)

Update a specific CustomerContract

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.CustomerContractApi;

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

CustomerContractApi apiInstance = new CustomerContractApi();
String customerContractId = "customerContractId_example"; // String | Identifies the CustomerContract to update
CustomerContractUpdateDto customerContract = new CustomerContractUpdateDto(); // CustomerContractUpdateDto | Defines the data for the CustomerContract to update
try {
    Object result = apiInstance.customerContractPutBycustomerContractId(customerContractId, customerContract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerContractApi#customerContractPutBycustomerContractId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerContractId** | **String**| Identifies the CustomerContract to update |
 **customerContract** | [**CustomerContractUpdateDto**](CustomerContractUpdateDto.md)| Defines the data for the CustomerContract to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

