# SecurityApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableUserContexts**](SecurityApi.md#getAvailableUserContexts) | **GET** /security/api/v1/token/usercontexts | Get the companies available for this token.
[**revokeSecurityToken**](SecurityApi.md#revokeSecurityToken) | **DELETE** /security/api/v1/token | 
[**testConnection**](SecurityApi.md#testConnection) | **GET** /security/api/v1/testconnection | Test connection


<a name="getAvailableUserContexts"></a>
# **getAvailableUserContexts**
> List&lt;ContextInformation&gt; getAvailableUserContexts(authorization)

Get the companies available for this token.



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: vna_oauth
OAuth vna_oauth = (OAuth) defaultClient.getAuthentication("vna_oauth");
vna_oauth.setAccessToken("YOUR ACCESS TOKEN");

SecurityApi apiInstance = new SecurityApi();
String authorization = "authorization_example"; // String | 
try {
    List<ContextInformation> result = apiInstance.getAvailableUserContexts(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getAvailableUserContexts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional]

### Return type

[**List&lt;ContextInformation&gt;**](ContextInformation.md)

### Authorization

[vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeSecurityToken"></a>
# **revokeSecurityToken**
> revokeSecurityToken(authorization)



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
String authorization = "authorization_example"; // String | 
try {
    apiInstance.revokeSecurityToken(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#revokeSecurityToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testConnection"></a>
# **testConnection**
> String testConnection()

Test connection

Returns \&quot;OK\&quot; as plain text if the test connection succeded.

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
try {
    String result = apiInstance.testConnection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#testConnection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

