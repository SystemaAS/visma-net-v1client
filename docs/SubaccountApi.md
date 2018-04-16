# SubaccountApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subaccountGetAllSubaccounts**](SubaccountApi.md#subaccountGetAllSubaccounts) | **GET** /controller/api/v1/subaccount | Get all SubAccounts
[**subaccountGetSubaccountBysubAccountId**](SubaccountApi.md#subaccountGetSubaccountBysubAccountId) | **GET** /controller/api/v1/subaccount/{subAccountId} | Get a specific SubAccount
[**subaccountPost**](SubaccountApi.md#subaccountPost) | **POST** /controller/api/v1/subaccount | Create a Subaccount
[**subaccountPutBysubAccountId**](SubaccountApi.md#subaccountPutBysubAccountId) | **PUT** /controller/api/v1/subaccount/{subAccountId} | Update a specific Subaccount


<a name="subaccountGetAllSubaccounts"></a>
# **subaccountGetAllSubaccounts**
> List&lt;SubAccountDto&gt; subaccountGetAllSubaccounts()

Get all SubAccounts

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SubaccountApi;

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

SubaccountApi apiInstance = new SubaccountApi();
try {
    List<SubAccountDto> result = apiInstance.subaccountGetAllSubaccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountGetAllSubaccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SubAccountDto&gt;**](SubAccountDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subaccountGetSubaccountBysubAccountId"></a>
# **subaccountGetSubaccountBysubAccountId**
> SubAccountDto subaccountGetSubaccountBysubAccountId(subAccountId)

Get a specific SubAccount

Data for SubAccount

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SubaccountApi;

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

SubaccountApi apiInstance = new SubaccountApi();
String subAccountId = "subAccountId_example"; // String | Identifies the SubAccount
try {
    SubAccountDto result = apiInstance.subaccountGetSubaccountBysubAccountId(subAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountGetSubaccountBysubAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountId** | **String**| Identifies the SubAccount |

### Return type

[**SubAccountDto**](SubAccountDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subaccountPost"></a>
# **subaccountPost**
> Object subaccountPost(subAccountUpdateDto)

Create a Subaccount

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SubaccountApi;

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

SubaccountApi apiInstance = new SubaccountApi();
SubAccountUpdateDto subAccountUpdateDto = new SubAccountUpdateDto(); // SubAccountUpdateDto | Defines the data for Subaccount to create
try {
    Object result = apiInstance.subaccountPost(subAccountUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountUpdateDto** | [**SubAccountUpdateDto**](SubAccountUpdateDto.md)| Defines the data for Subaccount to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="subaccountPutBysubAccountId"></a>
# **subaccountPutBysubAccountId**
> Object subaccountPutBysubAccountId(subAccountId, subAccountUpdateDto)

Update a specific Subaccount

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SubaccountApi;

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

SubaccountApi apiInstance = new SubaccountApi();
String subAccountId = "subAccountId_example"; // String | Identifies the Subaccount to update
SubAccountUpdateDto subAccountUpdateDto = new SubAccountUpdateDto(); // SubAccountUpdateDto | Defines the data for the Subaccount to update
try {
    Object result = apiInstance.subaccountPutBysubAccountId(subAccountId, subAccountUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountApi#subaccountPutBysubAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subAccountId** | **String**| Identifies the Subaccount to update |
 **subAccountUpdateDto** | [**SubAccountUpdateDto**](SubAccountUpdateDto.md)| Defines the data for the Subaccount to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

