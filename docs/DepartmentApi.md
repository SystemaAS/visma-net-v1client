# DepartmentApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**departmentCreateDepartment**](DepartmentApi.md#departmentCreateDepartment) | **POST** /controller/api/v1/department | Creates a department
[**departmentGetAllDepartmentDtos**](DepartmentApi.md#departmentGetAllDepartmentDtos) | **GET** /controller/api/v1/department | Get a range of department
[**departmentGetDepartmentBydepartmentId**](DepartmentApi.md#departmentGetDepartmentBydepartmentId) | **GET** /controller/api/v1/department/{departmentId} | Get a specific department
[**departmentUpdateDepartmentBydepartmentId**](DepartmentApi.md#departmentUpdateDepartmentBydepartmentId) | **PUT** /controller/api/v1/department/{departmentId} | Updates a specific department


<a name="departmentCreateDepartment"></a>
# **departmentCreateDepartment**
> Object departmentCreateDepartment(departmentUpdateDto)

Creates a department

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DepartmentApi;

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

DepartmentApi apiInstance = new DepartmentApi();
DepartmentUpdateBaseDto departmentUpdateDto = new DepartmentUpdateBaseDto(); // DepartmentUpdateBaseDto | Defines the data for the department to create
try {
    Object result = apiInstance.departmentCreateDepartment(departmentUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepartmentApi#departmentCreateDepartment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **departmentUpdateDto** | [**DepartmentUpdateBaseDto**](DepartmentUpdateBaseDto.md)| Defines the data for the department to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="departmentGetAllDepartmentDtos"></a>
# **departmentGetAllDepartmentDtos**
> List&lt;DepartmentDto&gt; departmentGetAllDepartmentDtos(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get a range of department

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DepartmentApi;

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

DepartmentApi apiInstance = new DepartmentApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<DepartmentDto> result = apiInstance.departmentGetAllDepartmentDtos(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepartmentApi#departmentGetAllDepartmentDtos");
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

### Return type

[**List&lt;DepartmentDto&gt;**](DepartmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="departmentGetDepartmentBydepartmentId"></a>
# **departmentGetDepartmentBydepartmentId**
> DepartmentDto departmentGetDepartmentBydepartmentId(departmentId)

Get a specific department

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DepartmentApi;

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

DepartmentApi apiInstance = new DepartmentApi();
String departmentId = "departmentId_example"; // String | Identifies the department
try {
    DepartmentDto result = apiInstance.departmentGetDepartmentBydepartmentId(departmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepartmentApi#departmentGetDepartmentBydepartmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **departmentId** | **String**| Identifies the department |

### Return type

[**DepartmentDto**](DepartmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="departmentUpdateDepartmentBydepartmentId"></a>
# **departmentUpdateDepartmentBydepartmentId**
> Object departmentUpdateDepartmentBydepartmentId(departmentId, departmentUpdateDto)

Updates a specific department

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DepartmentApi;

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

DepartmentApi apiInstance = new DepartmentApi();
String departmentId = "departmentId_example"; // String | Identifies the department to update
DepartmentUpdateBaseDto departmentUpdateDto = new DepartmentUpdateBaseDto(); // DepartmentUpdateBaseDto | The data to update the department with
try {
    Object result = apiInstance.departmentUpdateDepartmentBydepartmentId(departmentId, departmentUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepartmentApi#departmentUpdateDepartmentBydepartmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **departmentId** | **String**| Identifies the department to update |
 **departmentUpdateDto** | [**DepartmentUpdateBaseDto**](DepartmentUpdateBaseDto.md)| The data to update the department with |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

