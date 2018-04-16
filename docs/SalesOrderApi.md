# SalesOrderApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**salesOrderCancelSalesOrderBysaleOrderNumber**](SalesOrderApi.md#salesOrderCancelSalesOrderBysaleOrderNumber) | **POST** /controller/api/v1/salesorder/{saleOrderNumber}/action/cancelSalesOrder | Cancel Order action
[**salesOrderCreateHeaderAttachmentByorderNumber**](SalesOrderApi.md#salesOrderCreateHeaderAttachmentByorderNumber) | **POST** /controller/api/v1/salesorder/{orderNumber}/attachment | Creates an attachment and associates it with a sales order. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
[**salesOrderCreateHeaderAttachmentByorderNumberorderType**](SalesOrderApi.md#salesOrderCreateHeaderAttachmentByorderNumberorderType) | **POST** /controller/api/v1/salesorder/orderType/{orderType}/{orderNumber}/attachment | Creates an attachment and associates it with a sales order on a specific order type. If the file already exists, a new revision is created.
[**salesOrderCreateLineAttachmentByorderNumberlineNumber**](SalesOrderApi.md#salesOrderCreateLineAttachmentByorderNumberlineNumber) | **POST** /controller/api/v1/salesorder/{orderNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain sales order line. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
[**salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber**](SalesOrderApi.md#salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber) | **POST** /controller/api/v1/salesorder/orderType/{orderType}/{orderNumber}/{lineNumber}/attachment | Creates an attachment and associates it with a certain sales order line on a specific order type. If the file already exists, a new revision is created.
[**salesOrderCreateShipmentActionBysaleOrderNumber**](SalesOrderApi.md#salesOrderCreateShipmentActionBysaleOrderNumber) | **POST** /controller/api/v1/salesorder/{saleOrderNumber}/action/createShipment | Create shipment operation
[**salesOrderGetAllOrders**](SalesOrderApi.md#salesOrderGetAllOrders) | **GET** /controller/api/v1/salesorder | Get a range of SO Orders
[**salesOrderGetByorderNbr**](SalesOrderApi.md#salesOrderGetByorderNbr) | **GET** /controller/api/v1/salesorder/{orderNbr} | Get a specific SO Order
[**salesOrderGetOrderByTypeByorderTypeorderNbr**](SalesOrderApi.md#salesOrderGetOrderByTypeByorderTypeorderNbr) | **GET** /controller/api/v1/salesorder/{orderType}/{orderNbr} | Get a specific type of Order
[**salesOrderPost**](SalesOrderApi.md#salesOrderPost) | **POST** /controller/api/v1/salesorder | Create a Sale Order
[**salesOrderPrintOrderByorderNumberorderType**](SalesOrderApi.md#salesOrderPrintOrderByorderNumberorderType) | **GET** /controller/api/v1/salesorder/{orderType}/{orderNumber}/printOrder | Get the print report of the Sales Order Quote
[**salesOrderPutBysalesOrderNumber**](SalesOrderApi.md#salesOrderPutBysalesOrderNumber) | **PUT** /controller/api/v1/salesorder/{salesOrderNumber} | Update a specific Sale Order


<a name="salesOrderCancelSalesOrderBysaleOrderNumber"></a>
# **salesOrderCancelSalesOrderBysaleOrderNumber**
> CancelSalesOrderActionResultDto salesOrderCancelSalesOrderBysaleOrderNumber(saleOrderNumber, cancelSalesOrderActionDto)

Cancel Order action

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String saleOrderNumber = "saleOrderNumber_example"; // String | Reference number of the sale oreder that will be cancelled
CancelSalesOrderActionDto cancelSalesOrderActionDto = new CancelSalesOrderActionDto(); // CancelSalesOrderActionDto | Defines the data for the action
try {
    CancelSalesOrderActionResultDto result = apiInstance.salesOrderCancelSalesOrderBysaleOrderNumber(saleOrderNumber, cancelSalesOrderActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCancelSalesOrderBysaleOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleOrderNumber** | **String**| Reference number of the sale oreder that will be cancelled |
 **cancelSalesOrderActionDto** | [**CancelSalesOrderActionDto**](CancelSalesOrderActionDto.md)| Defines the data for the action |

### Return type

[**CancelSalesOrderActionResultDto**](CancelSalesOrderActionResultDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="salesOrderCreateHeaderAttachmentByorderNumber"></a>
# **salesOrderCreateHeaderAttachmentByorderNumber**
> Object salesOrderCreateHeaderAttachmentByorderNumber(orderNumber)

Creates an attachment and associates it with a sales order. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
try {
    Object result = apiInstance.salesOrderCreateHeaderAttachmentByorderNumber(orderNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateHeaderAttachmentByorderNumber");
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

<a name="salesOrderCreateHeaderAttachmentByorderNumberorderType"></a>
# **salesOrderCreateHeaderAttachmentByorderNumberorderType**
> Object salesOrderCreateHeaderAttachmentByorderNumberorderType(orderNumber, orderType)

Creates an attachment and associates it with a sales order on a specific order type. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
String orderType = "orderType_example"; // String | 
try {
    Object result = apiInstance.salesOrderCreateHeaderAttachmentByorderNumberorderType(orderNumber, orderType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateHeaderAttachmentByorderNumberorderType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |
 **orderType** | **String**|  |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderCreateLineAttachmentByorderNumberlineNumber"></a>
# **salesOrderCreateLineAttachmentByorderNumberlineNumber**
> Object salesOrderCreateLineAttachmentByorderNumberlineNumber(orderNumber, lineNumber)

Creates an attachment and associates it with a certain sales order line. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.salesOrderCreateLineAttachmentByorderNumberlineNumber(orderNumber, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateLineAttachmentByorderNumberlineNumber");
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

<a name="salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber"></a>
# **salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber**
> Object salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber(orderNumber, orderType, lineNumber)

Creates an attachment and associates it with a certain sales order line on a specific order type. If the file already exists, a new revision is created.

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNumber = "orderNumber_example"; // String | Identifies the sales order
String orderType = "orderType_example"; // String | 
Integer lineNumber = 56; // Integer | Specifies line number
try {
    Object result = apiInstance.salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber(orderNumber, orderType, lineNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the sales order |
 **orderType** | **String**|  |
 **lineNumber** | **Integer**| Specifies line number |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderCreateShipmentActionBysaleOrderNumber"></a>
# **salesOrderCreateShipmentActionBysaleOrderNumber**
> CreateShipmentActionResultDto salesOrderCreateShipmentActionBysaleOrderNumber(saleOrderNumber, createShipmentActionDto)

Create shipment operation

The action result dto contains information about the result of running the action

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String saleOrderNumber = "saleOrderNumber_example"; // String | Reference number of the sale oreder from which the shipment will be created
CreateShipmentActionDto createShipmentActionDto = new CreateShipmentActionDto(); // CreateShipmentActionDto | Defines the data for the action
try {
    CreateShipmentActionResultDto result = apiInstance.salesOrderCreateShipmentActionBysaleOrderNumber(saleOrderNumber, createShipmentActionDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderCreateShipmentActionBysaleOrderNumber");
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

<a name="salesOrderGetAllOrders"></a>
# **salesOrderGetAllOrders**
> List&lt;SalesOrderDto&gt; salesOrderGetAllOrders(orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize)

Get a range of SO Orders

Data for all Sales Orders

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
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
    List<SalesOrderDto> result = apiInstance.salesOrderGetAllOrders(orderType, greaterThanValue, numberToRead, skipRecords, orderBy, showNotes, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetAllOrders");
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

[**List&lt;SalesOrderDto&gt;**](SalesOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderGetByorderNbr"></a>
# **salesOrderGetByorderNbr**
> SalesOrderDto salesOrderGetByorderNbr(orderNbr)

Get a specific SO Order

Data for a single Sales Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNbr = "orderNbr_example"; // String | Identifies the Sales Order Number
try {
    SalesOrderDto result = apiInstance.salesOrderGetByorderNbr(orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetByorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNbr** | **String**| Identifies the Sales Order Number |

### Return type

[**SalesOrderDto**](SalesOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderGetOrderByTypeByorderTypeorderNbr"></a>
# **salesOrderGetOrderByTypeByorderTypeorderNbr**
> SalesOrderDto salesOrderGetOrderByTypeByorderTypeorderNbr(orderType, orderNbr)

Get a specific type of Order

Data for a single Sales Order

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderType = "orderType_example"; // String | Identifies the Sales Order Type
String orderNbr = "orderNbr_example"; // String | Identifies the Sales Order Number
try {
    SalesOrderDto result = apiInstance.salesOrderGetOrderByTypeByorderTypeorderNbr(orderType, orderNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderGetOrderByTypeByorderTypeorderNbr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**| Identifies the Sales Order Type |
 **orderNbr** | **String**| Identifies the Sales Order Number |

### Return type

[**SalesOrderDto**](SalesOrderDto.md)

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderPost"></a>
# **salesOrderPost**
> Object salesOrderPost(saleOrderUpdateDto)

Create a Sale Order

Response Message has StatusCode Created if POST operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
SalesOrderUpdateDto saleOrderUpdateDto = new SalesOrderUpdateDto(); // SalesOrderUpdateDto | Defines the data for the Sale Order to create
try {
    Object result = apiInstance.salesOrderPost(saleOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleOrderUpdateDto** | [**SalesOrderUpdateDto**](SalesOrderUpdateDto.md)| Defines the data for the Sale Order to create |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="salesOrderPrintOrderByorderNumberorderType"></a>
# **salesOrderPrintOrderByorderNumberorderType**
> Object salesOrderPrintOrderByorderNumberorderType(orderNumber, orderType)

Get the print report of the Sales Order Quote

The File is in Content of the message

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String orderNumber = "orderNumber_example"; // String | Identifies the order
String orderType = "orderType_example"; // String | Identifies the Sales Order Type
try {
    Object result = apiInstance.salesOrderPrintOrderByorderNumberorderType(orderNumber, orderType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderPrintOrderByorderNumberorderType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**| Identifies the order |
 **orderType** | **String**| Identifies the Sales Order Type |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="salesOrderPutBysalesOrderNumber"></a>
# **salesOrderPutBysalesOrderNumber**
> Object salesOrderPutBysalesOrderNumber(salesOrderNumber, saleOrderUpdateDto)

Update a specific Sale Order

Response Message has StatusCode NoContent if PUT operation succeed

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiClient;
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.Configuration;
//import no.systema.visma.v1client.auth.*;
//import no.systema.visma.v1client.api.SalesOrderApi;

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

SalesOrderApi apiInstance = new SalesOrderApi();
String salesOrderNumber = "salesOrderNumber_example"; // String | Identifies the Sale Order to update
SalesOrderUpdateDto saleOrderUpdateDto = new SalesOrderUpdateDto(); // SalesOrderUpdateDto | Defines the data for the Sale Order to update
try {
    Object result = apiInstance.salesOrderPutBysalesOrderNumber(salesOrderNumber, saleOrderUpdateDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesOrderApi#salesOrderPutBysalesOrderNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **salesOrderNumber** | **String**| Identifies the Sale Order to update |
 **saleOrderUpdateDto** | [**SalesOrderUpdateDto**](SalesOrderUpdateDto.md)| Defines the data for the Sale Order to update |

### Return type

**Object**

### Authorization

[ipp-application-type](../README.md#ipp-application-type), [ipp-company-id](../README.md#ipp-company-id), [vna_oauth](../README.md#vna_oauth)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

