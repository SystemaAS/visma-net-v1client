# SalesOrderBasicApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesOrderBasicCreateHeaderAttachmentByorderNumber**](SalesOrderBasicApi.md#salesOrderBasicCreateHeaderAttachmentByorderNumber) | **POST** /controller/api/v1/salesorderbasic/{orderNumber}/attachment | Creates an attachment and associates it with a sales order. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
[**salesOrderBasicCreateHeaderAttachmentByorderNumberorderType**](SalesOrderBasicApi.md#salesOrderBasicCreateHeaderAttachmentByorderNumberorderType) | **POST** /controller/api/v1/salesorderbasic/orderType/{orderType}/{orderNumber}/attachment | Creates an attachment and associates it with a sales order on a specific order type. If the file already exists, a new revision is created.
[**salesOrderBasicCreateLineAttachmentByorderNumberlineNumber**](SalesOrderBasicApi.md#salesOrderBasicCreateLineAttachmentByorderNumberlineNumber) | **POST** /controller/api/v1/salesorderbasic/{orderNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain sales order line. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
[**salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber**](SalesOrderBasicApi.md#salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber) | **POST** /controller/api/v1/salesorderbasic/orderType/{orderType}/{orderNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain sales order line on a specific order type. If the file already exists, a new revision is created.
[**salesOrderBasicCreateShipmentActionBysaleOrderNumber**](SalesOrderBasicApi.md#salesOrderBasicCreateShipmentActionBysaleOrderNumber) | **POST** /controller/api/v1/salesorderbasic/{saleOrderNumber}/action/createShipment | Crete shipment operation
[**salesOrderBasicGetAllOrders**](SalesOrderBasicApi.md#salesOrderBasicGetAllOrders) | **GET** /controller/api/v1/salesorderbasic | Get a range of SO Orders
[**salesOrderBasicGetByorderNbr**](SalesOrderBasicApi.md#salesOrderBasicGetByorderNbr) | **GET** /controller/api/v1/salesorderbasic/{orderNbr} | Get a specific SO Order
[**salesOrderBasicGetOrderByTypeByorderTypeorderNbr**](SalesOrderBasicApi.md#salesOrderBasicGetOrderByTypeByorderTypeorderNbr) | **GET** /controller/api/v1/salesorderbasic/{orderType}/{orderNbr} | Get a specific type of Order
[**salesOrderBasicPost**](SalesOrderBasicApi.md#salesOrderBasicPost) | **POST** /controller/api/v1/salesorderbasic | Create a Sale Order
[**salesOrderBasicPutBysalesOrderNumber**](SalesOrderBasicApi.md#salesOrderBasicPutBysalesOrderNumber) | **PUT** /controller/api/v1/salesorderbasic/{salesOrderNumber} | Update a specific Sale Order


<a name="salesOrderBasicCreateHeaderAttachmentByorderNumber"></a>
# **salesOrderBasicCreateHeaderAttachmentByorderNumber**
> Object salesOrderBasicCreateHeaderAttachmentByorderNumber(orderNumber)

Creates an attachment and associates it with a sales order. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
try {
    Object result = apiInstance.salesOrderBasicCreateHeaderAttachmentByorderNumber(orderNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicCreateHeaderAttachmentByorderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicCreateHeaderAttachmentByorderNumberorderType"></a>
# **salesOrderBasicCreateHeaderAttachmentByorderNumberorderType**
> Object salesOrderBasicCreateHeaderAttachmentByorderNumberorderType(orderNumber, orderType)

Creates an attachment and associates it with a sales order on a specific order type. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
String orderType = "orderType_example"; // String | Identifies the sales order type
try {
    Object result = apiInstance.salesOrderBasicCreateHeaderAttachmentByorderNumberorderType(orderNumber, orderType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicCreateHeaderAttachmentByorderNumberorderType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |
 **orderType** | **String**| Identifies the sales order type |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicCreateLineAttachmentByorderNumberlineNumber"></a>
# **salesOrderBasicCreateLineAttachmentByorderNumberlineNumber**
> Object salesOrderBasicCreateLineAttachmentByorderNumberlineNumber(orderNumber, lineNumber)

Creates an attachment and associates it with a certain sales order line. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.salesOrderBasicCreateLineAttachmentByorderNumberlineNumber(orderNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicCreateLineAttachmentByorderNumberlineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber"></a>
# **salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber**
> Object salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber(orderNumber, orderType, lineNumber)

Creates an attachment and associates it with a certain sales order line on a specific order type. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
String orderType = "orderType_example"; // String | Identifies the sales order type
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber(orderNumber, orderType, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicCreateLineAttachmentByorderNumberorderTypelineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |
 **orderType** | **String**| Identifies the sales order type |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicCreateShipmentActionBysaleOrderNumber"></a>
# **salesOrderBasicCreateShipmentActionBysaleOrderNumber**
> CreateShipmentActionResultDto salesOrderBasicCreateShipmentActionBysaleOrderNumber(saleOrderNumber, createShipmentActionDto)

Crete shipment operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String saleOrderNumber = "saleOrderNumber_example"; // String | Reference number of the sale oreder from which the shipment will be created
CreateShipmentActionDto createShipmentActionDto = new CreateShipmentActionDto(); // CreateShipmentActionDto | Defines the data for the action
try {
    CreateShipmentActionResultDto result = apiInstance.salesOrderBasicCreateShipmentActionBysaleOrderNumber(saleOrderNumber, createShipmentActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicCreateShipmentActionBysaleOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleOrderNumber** | **String**| Reference number of the sale oreder from which the shipment will be created |
 **createShipmentActionDto** | [**CreateShipmentActionDto**](CreateShipmentActionDto.md)| Defines the data for the action |

### Return type

[**CreateShipmentActionResultDto**](CreateShipmentActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderBasicGetAllOrders"></a>
# **salesOrderBasicGetAllOrders**
> List&lt;SalesOrderBasicDto&gt; salesOrderBasicGetAllOrders(orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of SO Orders

Data for all Sales Order Basic

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderType = "orderType_example"; // String | 
String greaterThanValue = "greaterThanValue_example"; // String | 
Integer numberToRead = 56; // Integer | 
Integer skipRecords = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
Boolean showNotes = true; // Boolean | 
String lastModifiedDateTime = "lastModifiedDateTime_example"; // String | 
String lastModifiedDateTimeCondition = "lastModifiedDateTimeCondition_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    List<SalesOrderBasicDto> result = apiInstance.salesOrderBasicGetAllOrders(orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicGetAllOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**|  | [optional]
 **greaterThanValue** | **String**|  | [optional]
 **numberToRead** | **Integer**|  | [optional]
 **skipRecords** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **showNotes** | **Boolean**|  | [optional]
 **lastModifiedDateTime** | **String**|  | [optional]
 **lastModifiedDateTimeCondition** | **String**|  | [optional]
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;SalesOrderBasicDto&gt;**](SalesOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicGetByorderNbr"></a>
# **salesOrderBasicGetByorderNbr**
> SalesOrderBasicDto salesOrderBasicGetByorderNbr(orderNbr)

Get a specific SO Order

Data for a single Sales Order Basic

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderNbr = "orderNbr_example"; // String | Identifies the Sales Order Number
try {
    SalesOrderBasicDto result = apiInstance.salesOrderBasicGetByorderNbr(orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicGetByorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNbr** | **String**| Identifies the Sales Order Number |

### Return type

[**SalesOrderBasicDto**](SalesOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicGetOrderByTypeByorderTypeorderNbr"></a>
# **salesOrderBasicGetOrderByTypeByorderTypeorderNbr**
> SalesOrderBasicDto salesOrderBasicGetOrderByTypeByorderTypeorderNbr(orderType, orderNbr)

Get a specific type of Order

Data for a single Sales Order Basic

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String orderType = "orderType_example"; // String | Identifies the Sales Order Type
String orderNbr = "orderNbr_example"; // String | Identifies the Sales Order Number
try {
    SalesOrderBasicDto result = apiInstance.salesOrderBasicGetOrderByTypeByorderTypeorderNbr(orderType, orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicGetOrderByTypeByorderTypeorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**| Identifies the Sales Order Type |
 **orderNbr** | **String**| Identifies the Sales Order Number |

### Return type

[**SalesOrderBasicDto**](SalesOrderBasicDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderBasicPost"></a>
# **salesOrderBasicPost**
> Object salesOrderBasicPost(saleOrderUpdateDto)

Create a Sale Order

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
SalesOrderBasicUpdateDto saleOrderUpdateDto = new SalesOrderBasicUpdateDto(); // SalesOrderBasicUpdateDto | Defines the data for the Sale Order to create
try {
    Object result = apiInstance.salesOrderBasicPost(saleOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleOrderUpdateDto** | [**SalesOrderBasicUpdateDto**](SalesOrderBasicUpdateDto.md)| Defines the data for the Sale Order to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="salesOrderBasicPutBysalesOrderNumber"></a>
# **salesOrderBasicPutBysalesOrderNumber**
> Object salesOrderBasicPutBysalesOrderNumber(salesOrderNumber, saleOrderUpdateDto)

Update a specific Sale Order

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderBasicApi;

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

SalesOrderBasicApi apiInstance = new SalesOrderBasicApi();
String salesOrderNumber = "salesOrderNumber_example"; // String | Identifies the Sale Order to update
SalesOrderBasicUpdateDto saleOrderUpdateDto = new SalesOrderBasicUpdateDto(); // SalesOrderBasicUpdateDto | Defines the data for the Sale Order to update
try {
    Object result = apiInstance.salesOrderBasicPutBysalesOrderNumber(salesOrderNumber, saleOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderBasicApi#salesOrderBasicPutBysalesOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesOrderNumber** | **String**| Identifies the Sale Order to update |
 **saleOrderUpdateDto** | [**SalesOrderBasicUpdateDto**](SalesOrderBasicUpdateDto.md)| Defines the data for the Sale Order to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

