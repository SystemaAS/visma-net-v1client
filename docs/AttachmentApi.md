# AttachmentApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentGetByattachmentId**](AttachmentApi.md#attachmentGetByattachmentId) | **GET** /controller/api/v1/attachment/{attachmentId} | Get latest revision of a specific Attachment
[**attachmentPutByattachmentId**](AttachmentApi.md#attachmentPutByattachmentId) | **PUT** /controller/api/v1/attachment/{attachmentId} | Update a specific Attachment


<a name="attachmentGetByattachmentId"></a>
# **attachmentGetByattachmentId**
> Object attachmentGetByattachmentId(attachmentId)

Get latest revision of a specific Attachment

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
UUID attachmentId = new UUID(); // UUID | Identifies the attachment
try {
    Object result = apiInstance.attachmentGetByattachmentId(attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#attachmentGetByattachmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | [**UUID**](.md)| Identifies the attachment |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="attachmentPutByattachmentId"></a>
# **attachmentPutByattachmentId**
> Object attachmentPutByattachmentId(attachmentId, metadataDto)

Update a specific Attachment

The the Response Message has StatusCode NoContent if Put operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.AttachmentApi;

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

AttachmentApi apiInstance = new AttachmentApi();
UUID attachmentId = new UUID(); // UUID | Identifies the Attachment to update
AttachmentMetadataUpdateDto metadataDto = new AttachmentMetadataUpdateDto(); // AttachmentMetadataUpdateDto | Defines the data for the Attachment to update
try {
    Object result = apiInstance.attachmentPutByattachmentId(attachmentId, metadataDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentApi#attachmentPutByattachmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | [**UUID**](.md)| Identifies the Attachment to update |
 **metadataDto** | [**AttachmentMetadataUpdateDto**](AttachmentMetadataUpdateDto.md)| Defines the data for the Attachment to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

