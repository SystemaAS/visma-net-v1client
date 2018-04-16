# ServiceStatusApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allServiceStatus**](ServiceStatusApi.md#allServiceStatus) | **GET** /resources/v1/serviceStatus | Get the list of all available services


<a name="allServiceStatus"></a>
# **allServiceStatus**
> List&lt;StatusPageComponentDto&gt; allServiceStatus()

Get the list of all available services



### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.api.ServiceStatusApi;


ServiceStatusApi apiInstance = new ServiceStatusApi();
try {
    List<StatusPageComponentDto> result = apiInstance.allServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceStatusApi#allServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StatusPageComponentDto&gt;**](StatusPageComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

