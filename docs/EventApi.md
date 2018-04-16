# EventApi

All URIs are relative to *https://localhost/API*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEvents**](EventApi.md#getAllEvents) | **GET** /resources/v1/event | Get all events


<a name="getAllEvents"></a>
# **getAllEvents**
> List&lt;EventDto&gt; getAllEvents()

Get all events

Lists the events from Visma.net for which users can subscribe.

### Example
```java
// Import classes:
//import no.systema.visma.v1client.ApiException;
//import no.systema.visma.v1client.api.EventApi;


EventApi apiInstance = new EventApi();
try {
    List<EventDto> result = apiInstance.getAllEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getAllEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EventDto&gt;**](EventDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

