# DimensionApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensionGetDimensionBydimensionId**](DimensionApi.md#dimensionGetDimensionBydimensionId) | **GET** /controller/api/v1/dimension/{dimensionId} | Get a specific Dimension
[**dimensionGetDimensionList**](DimensionApi.md#dimensionGetDimensionList) | **GET** /controller/api/v1/dimension | Get a list of all Dimension names/IDs
[**dimensionGetSegmentBydimensionIdsegmentId**](DimensionApi.md#dimensionGetSegmentBydimensionIdsegmentId) | **GET** /controller/api/v1/dimension/{dimensionId}/{segmentId} | Get a specific Segment for a specific Dimension
[**dimensionGetSegmentValueBydimensionIdsegmentIdpublicId**](DimensionApi.md#dimensionGetSegmentValueBydimensionIdsegmentIdpublicId) | **GET** /controller/api/v1/dimension/{dimensionId}/{segmentId}/publicid/{publicId} | Get a specific SegmentValue for a specific Segment for a specific Dimension
[**dimensionGetSegmentValueBydimensionIdsegmentIdvalueId**](DimensionApi.md#dimensionGetSegmentValueBydimensionIdsegmentIdvalueId) | **GET** /controller/api/v1/dimension/{dimensionId}/{segmentId}/{valueId} | Get a specific SegmentValue for a specific Segment for a specific Dimension
[**dimensionUpdateSegmentBydimensionIdsegmentId**](DimensionApi.md#dimensionUpdateSegmentBydimensionIdsegmentId) | **PUT** /controller/api/v1/dimension/{dimensionId}/{segmentId} | Update a Segment


<a name="dimensionGetDimensionBydimensionId"></a>
# **dimensionGetDimensionBydimensionId**
> DtoDimension dimensionGetDimensionBydimensionId(dimensionId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, expandSegmentsValues)

Get a specific Dimension

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
String dimensionId = "dimensionId_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Boolean expandSegmentsValues = true; // Boolean | Flag can be used to return data without the segment values.
try {
    DtoDimension result = apiInstance.dimensionGetDimensionBydimensionId(dimensionId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, expandSegmentsValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGetDimensionBydimensionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionId** | **String**|  |
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **expandSegmentsValues** | **Boolean**| Flag can be used to return data without the segment values. | [optional]

### Return type

[**DtoDimension**](DtoDimension.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dimensionGetDimensionList"></a>
# **dimensionGetDimensionList**
> List&lt;String&gt; dimensionGetDimensionList()

Get a list of all Dimension names/IDs

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
try {
    List<String> result = apiInstance.dimensionGetDimensionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGetDimensionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dimensionGetSegmentBydimensionIdsegmentId"></a>
# **dimensionGetSegmentBydimensionIdsegmentId**
> DtoSegment dimensionGetSegmentBydimensionIdsegmentId(dimensionId, segmentId)

Get a specific Segment for a specific Dimension

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
String dimensionId = "dimensionId_example"; // String | Identifies the Dimension
Integer segmentId = 56; // Integer | Identifies the Segment
try {
    DtoSegment result = apiInstance.dimensionGetSegmentBydimensionIdsegmentId(dimensionId, segmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGetSegmentBydimensionIdsegmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionId** | **String**| Identifies the Dimension |
 **segmentId** | **Integer**| Identifies the Segment |

### Return type

[**DtoSegment**](DtoSegment.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dimensionGetSegmentValueBydimensionIdsegmentIdpublicId"></a>
# **dimensionGetSegmentValueBydimensionIdsegmentIdpublicId**
> DtoSegmentValue dimensionGetSegmentValueBydimensionIdsegmentIdpublicId(dimensionId, segmentId, publicId)

Get a specific SegmentValue for a specific Segment for a specific Dimension

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
String dimensionId = "dimensionId_example"; // String | Identifies the Dimension
Integer segmentId = 56; // Integer | Identifies the Segment
UUID publicId = new UUID(); // UUID | Identifies the SegmentValue by its publicId
try {
    DtoSegmentValue result = apiInstance.dimensionGetSegmentValueBydimensionIdsegmentIdpublicId(dimensionId, segmentId, publicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGetSegmentValueBydimensionIdsegmentIdpublicId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionId** | **String**| Identifies the Dimension |
 **segmentId** | **Integer**| Identifies the Segment |
 **publicId** | [**UUID**](.md)| Identifies the SegmentValue by its publicId |

### Return type

[**DtoSegmentValue**](DtoSegmentValue.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dimensionGetSegmentValueBydimensionIdsegmentIdvalueId"></a>
# **dimensionGetSegmentValueBydimensionIdsegmentIdvalueId**
> DtoSegmentValue dimensionGetSegmentValueBydimensionIdsegmentIdvalueId(dimensionId, segmentId, valueId)

Get a specific SegmentValue for a specific Segment for a specific Dimension

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
String dimensionId = "dimensionId_example"; // String | Identifies the Dimension
Integer segmentId = 56; // Integer | Identifies the Segment
String valueId = "valueId_example"; // String | Identifies the SegmentValue by Id. Must be Base64 encoded.
try {
    DtoSegmentValue result = apiInstance.dimensionGetSegmentValueBydimensionIdsegmentIdvalueId(dimensionId, segmentId, valueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionGetSegmentValueBydimensionIdsegmentIdvalueId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionId** | **String**| Identifies the Dimension |
 **segmentId** | **Integer**| Identifies the Segment |
 **valueId** | **String**| Identifies the SegmentValue by Id. Must be Base64 encoded. |

### Return type

[**DtoSegmentValue**](DtoSegmentValue.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dimensionUpdateSegmentBydimensionIdsegmentId"></a>
# **dimensionUpdateSegmentBydimensionIdsegmentId**
> Object dimensionUpdateSegmentBydimensionIdsegmentId(dimensionId, segmentId, update)

Update a Segment

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.DimensionApi;

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

DimensionApi apiInstance = new DimensionApi();
String dimensionId = "dimensionId_example"; // String | Identifies the Dimension for which the Segment is defined
Integer segmentId = 56; // Integer | Identifies the Segment
DtoSegmentUpdateDto update = new DtoSegmentUpdateDto(); // DtoSegmentUpdateDto | Defines the data for the Segment to update
try {
    Object result = apiInstance.dimensionUpdateSegmentBydimensionIdsegmentId(dimensionId, segmentId, update);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DimensionApi#dimensionUpdateSegmentBydimensionIdsegmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionId** | **String**| Identifies the Dimension for which the Segment is defined |
 **segmentId** | **Integer**| Identifies the Segment |
 **update** | [**DtoSegmentUpdateDto**](DtoSegmentUpdateDto.md)| Defines the data for the Segment to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

