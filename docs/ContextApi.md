# ContextApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableContexts**](ContextApi.md#getAvailableContexts) | **GET** /resources/v1/context | Get the companies available for this token.
[**getCompanyInfo**](ContextApi.md#getCompanyInfo) | **GET** /resources/v1/context/{companyId} | Get company details by company ID.
[**getUserInfo**](ContextApi.md#getUserInfo) | **GET** /resources/v1/context/userdetails | Get the user details available for this token.


<a name="getAvailableContexts"></a>
# **getAvailableContexts**
> List&lt;ContextInformation&gt; getAvailableContexts()

Get the companies available for this token.



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

ContextApi apiInstance = new ContextApi();
try {
    List<ContextInformation> result = apiInstance.getAvailableContexts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getAvailableContexts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContextInformation&gt;**](ContextInformation.md)

### Authorization

[vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyInfo"></a>
# **getCompanyInfo**
> CompanyDto getCompanyInfo(companyId)

Get company details by company ID.



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

ContextApi apiInstance = new ContextApi();
Long companyId = 789L; // Long | 
try {
    CompanyDto result = apiInstance.getCompanyInfo(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getCompanyInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Long**|  |

### Return type

[**CompanyDto**](CompanyDto.md)

### Authorization

[vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserInfo"></a>
# **getUserInfo**
> List&lt;UserDetailsDto&gt; getUserInfo()

Get the user details available for this token.



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ContextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

ContextApi apiInstance = new ContextApi();
try {
    List<UserDetailsDto> result = apiInstance.getUserInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextApi#getUserInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserDetailsDto&gt;**](UserDetailsDto.md)

### Authorization

[vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

