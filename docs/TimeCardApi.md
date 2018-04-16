# TimeCardApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**timeCardCreateTimeCard**](TimeCardApi.md#timeCardCreateTimeCard) | **POST** /controller/api/v1/timeCard | Creates a time card
[**timeCardGetAllEmployeeTimeCards**](TimeCardApi.md#timeCardGetAllEmployeeTimeCards) | **GET** /controller/api/v1/timeCard | Get all employee time cards, a filter needs to be specified
[**timeCardGetEmployeeTimeCardBytimeCardCd**](TimeCardApi.md#timeCardGetEmployeeTimeCardBytimeCardCd) | **GET** /controller/api/v1/timeCard/{timeCardCd} | Get a specific employee time cards
[**timeCardUpdateTimeCardByreferenceNumber**](TimeCardApi.md#timeCardUpdateTimeCardByreferenceNumber) | **PUT** /controller/api/v1/timeCard/{referenceNumber} | Updates a specific time card


<a name="timeCardCreateTimeCard"></a>
# **timeCardCreateTimeCard**
> Object timeCardCreateTimeCard(timeCardUpdateDto)

Creates a time card

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.TimeCardApi;

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

TimeCardApi apiInstance = new TimeCardApi();
TimeCardUpdateDto timeCardUpdateDto = new TimeCardUpdateDto(); // TimeCardUpdateDto | Defines the data for the time card to create
try {
    Object result = apiInstance.timeCardCreateTimeCard(timeCardUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeCardApi#timeCardCreateTimeCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeCardUpdateDto** | [**TimeCardUpdateDto**](TimeCardUpdateDto.md)| Defines the data for the time card to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="timeCardGetAllEmployeeTimeCards"></a>
# **timeCardGetAllEmployeeTimeCards**
> List&lt;TimeCardDto&gt; timeCardGetAllEmployeeTimeCards(status, week, type, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition)

Get all employee time cards, a filter needs to be specified

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.TimeCardApi;

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

TimeCardApi apiInstance = new TimeCardApi();
String status = "status_example"; // String | 
String week = "week_example"; // String | 
String type = "type_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
try {
    List<TimeCardDto> result = apiInstance.timeCardGetAllEmployeeTimeCards(status, week, type, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeCardApi#timeCardGetAllEmployeeTimeCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | [optional] [enum: Hold, Open, Approved, Rejected, Released]
 **week** | **String**|  | [optional]
 **type** | **String**|  | [optional] [enum: Normal, Correction, NormalCorrected]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]

### Return type

[**List&lt;TimeCardDto&gt;**](TimeCardDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="timeCardGetEmployeeTimeCardBytimeCardCd"></a>
# **timeCardGetEmployeeTimeCardBytimeCardCd**
> TimeCardDto timeCardGetEmployeeTimeCardBytimeCardCd(timeCardCd)

Get a specific employee time cards

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.TimeCardApi;

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

TimeCardApi apiInstance = new TimeCardApi();
String timeCardCd = "timeCardCd_example"; // String | Identifies the time card
try {
    TimeCardDto result = apiInstance.timeCardGetEmployeeTimeCardBytimeCardCd(timeCardCd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeCardApi#timeCardGetEmployeeTimeCardBytimeCardCd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeCardCd** | **String**| Identifies the time card |

### Return type

[**TimeCardDto**](TimeCardDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="timeCardUpdateTimeCardByreferenceNumber"></a>
# **timeCardUpdateTimeCardByreferenceNumber**
> Object timeCardUpdateTimeCardByreferenceNumber(referenceNumber, timeCardUpdateDto)

Updates a specific time card

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.TimeCardApi;

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

TimeCardApi apiInstance = new TimeCardApi();
String referenceNumber = "referenceNumber_example"; // String | Identifies the time card to update
TimeCardUpdateDto timeCardUpdateDto = new TimeCardUpdateDto(); // TimeCardUpdateDto | The data to update the time card with
try {
    Object result = apiInstance.timeCardUpdateTimeCardByreferenceNumber(referenceNumber, timeCardUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimeCardApi#timeCardUpdateTimeCardByreferenceNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceNumber** | **String**| Identifies the time card to update |
 **timeCardUpdateDto** | [**TimeCardUpdateDto**](TimeCardUpdateDto.md)| The data to update the time card with |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

