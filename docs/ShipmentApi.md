# ShipmentApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shipmentConfirmShipmentByshipmentNumber**](ShipmentApi.md#shipmentConfirmShipmentByshipmentNumber) | **POST** /controller/api/v1/shipment/{shipmentNumber}/action/confirmShipment | Confirm shipment operation
[**shipmentGetAllShipments**](ShipmentApi.md#shipmentGetAllShipments) | **GET** /controller/api/v1/shipment | Get a range of SO Shipments
[**shipmentGetByshipmentNbr**](ShipmentApi.md#shipmentGetByshipmentNbr) | **GET** /controller/api/v1/shipment/{shipmentNbr} | Get a specific Shipment
[**shipmentPrintPickListByshipmentNbr**](ShipmentApi.md#shipmentPrintPickListByshipmentNbr) | **GET** /controller/api/v1/shipment/{shipmentNbr}/printPickList | Get the pick list report
[**shipmentPrintShipmentConfirmationByshipmentNbr**](ShipmentApi.md#shipmentPrintShipmentConfirmationByshipmentNbr) | **GET** /controller/api/v1/shipment/{shipmentNbr}/printShipmentConfirmation | Get the shipment confirmation report
[**shipmentPutByshipmentNumber**](ShipmentApi.md#shipmentPutByshipmentNumber) | **PUT** /controller/api/v1/shipment/{shipmentNumber} | Update a specific Shipment


<a name="shipmentConfirmShipmentByshipmentNumber"></a>
# **shipmentConfirmShipmentByshipmentNumber**
> ConfirmShipmentActionResultDto shipmentConfirmShipmentByshipmentNumber(shipmentNumber)

Confirm shipment operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String shipmentNumber = "shipmentNumber_example"; // String | Reference number of the shipment to be confirmed
try {
    ConfirmShipmentActionResultDto result = apiInstance.shipmentConfirmShipmentByshipmentNumber(shipmentNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentConfirmShipmentByshipmentNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **String**| Reference number of the shipment to be confirmed |

### Return type

[**ConfirmShipmentActionResultDto**](ConfirmShipmentActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="shipmentGetAllShipments"></a>
# **shipmentGetAllShipments**
> List&lt;ShipmentDto&gt; shipmentGetAllShipments(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, status)

Get a range of SO Shipments

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
String status = "status_example"; // String | 
try {
    List<ShipmentDto> result = apiInstance.shipmentGetAllShipments(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentGetAllShipments");
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
 **status** | **String**|  | [optional] [enum: Open, Hold, Completed, Cancelled, Confirmed, Invoiced, Receipted, AutoGenerated, PartiallyInvoiced]

### Return type

[**List&lt;ShipmentDto&gt;**](ShipmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="shipmentGetByshipmentNbr"></a>
# **shipmentGetByshipmentNbr**
> ShipmentDto shipmentGetByshipmentNbr(shipmentNbr)

Get a specific Shipment

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String shipmentNbr = "shipmentNbr_example"; // String | Identifies the Shipment
try {
    ShipmentDto result = apiInstance.shipmentGetByshipmentNbr(shipmentNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentGetByshipmentNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNbr** | **String**| Identifies the Shipment |

### Return type

[**ShipmentDto**](ShipmentDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="shipmentPrintPickListByshipmentNbr"></a>
# **shipmentPrintPickListByshipmentNbr**
> Object shipmentPrintPickListByshipmentNbr(shipmentNbr)

Get the pick list report

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String shipmentNbr = "shipmentNbr_example"; // String | Identifies the shipment
try {
    Object result = apiInstance.shipmentPrintPickListByshipmentNbr(shipmentNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentPrintPickListByshipmentNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNbr** | **String**| Identifies the shipment |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="shipmentPrintShipmentConfirmationByshipmentNbr"></a>
# **shipmentPrintShipmentConfirmationByshipmentNbr**
> Object shipmentPrintShipmentConfirmationByshipmentNbr(shipmentNbr)

Get the shipment confirmation report

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String shipmentNbr = "shipmentNbr_example"; // String | Identifies the shipment
try {
    Object result = apiInstance.shipmentPrintShipmentConfirmationByshipmentNbr(shipmentNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentPrintShipmentConfirmationByshipmentNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNbr** | **String**| Identifies the shipment |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="shipmentPutByshipmentNumber"></a>
# **shipmentPutByshipmentNumber**
> Object shipmentPutByshipmentNumber(shipmentNumber, shipmentUpdateDto)

Update a specific Shipment

Response Message has StatusCode NoContent if PUT operation succeeded

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.ShipmentApi;

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

ShipmentApi apiInstance = new ShipmentApi();
String shipmentNumber = "shipmentNumber_example"; // String | Identifies the Shipment to update
ShipmentUpdateDto shipmentUpdateDto = new ShipmentUpdateDto(); // ShipmentUpdateDto | Defines the data for the Shipment to update
try {
    Object result = apiInstance.shipmentPutByshipmentNumber(shipmentNumber, shipmentUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentPutByshipmentNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentNumber** | **String**| Identifies the Shipment to update |
 **shipmentUpdateDto** | [**ShipmentUpdateDto**](ShipmentUpdateDto.md)| Defines the data for the Shipment to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

