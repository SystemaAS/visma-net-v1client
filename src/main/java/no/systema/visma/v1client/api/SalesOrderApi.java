package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CancelSalesOrderActionDto;
import no.systema.visma.v1client.model.CancelSalesOrderActionResultDto;
import no.systema.visma.v1client.model.CreateShipmentActionDto;
import no.systema.visma.v1client.model.CreateShipmentActionResultDto;
import no.systema.visma.v1client.model.SalesOrderDto;
import no.systema.visma.v1client.model.SalesOrderUpdateDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
@Component("no.systema.visma.v1client.api.SalesOrderApi")
public class SalesOrderApi {
    private ApiClient apiClient;

    public SalesOrderApi() {
        this(new ApiClient());
    }

    @Autowired
    public SalesOrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel Order action
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param saleOrderNumber Reference number of the sale oreder that will be cancelled
     * @param cancelSalesOrderActionDto Defines the data for the action
     * @return CancelSalesOrderActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CancelSalesOrderActionResultDto salesOrderCancelSalesOrderBysaleOrderNumber(String saleOrderNumber, CancelSalesOrderActionDto cancelSalesOrderActionDto) throws RestClientException {
        Object postBody = cancelSalesOrderActionDto;
        
        // verify the required parameter 'saleOrderNumber' is set
        if (saleOrderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'saleOrderNumber' when calling salesOrderCancelSalesOrderBysaleOrderNumber");
        }
        
        // verify the required parameter 'cancelSalesOrderActionDto' is set
        if (cancelSalesOrderActionDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cancelSalesOrderActionDto' when calling salesOrderCancelSalesOrderBysaleOrderNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("saleOrderNumber", saleOrderNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{saleOrderNumber}/action/cancelSalesOrder").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<CancelSalesOrderActionResultDto> returnType = new ParameterizedTypeReference<CancelSalesOrderActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an attachment and associates it with a sales order. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param orderNumber Identifies the sales order
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderCreateHeaderAttachmentByorderNumber(String orderNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling salesOrderCreateHeaderAttachmentByorderNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNumber", orderNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{orderNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an attachment and associates it with a sales order on a specific order type. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param orderNumber Identifies the sales order
     * @param orderType 
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderCreateHeaderAttachmentByorderNumberorderType(String orderNumber, String orderType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling salesOrderCreateHeaderAttachmentByorderNumberorderType");
        }
        
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderType' when calling salesOrderCreateHeaderAttachmentByorderNumberorderType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNumber", orderNumber);
        uriVariables.put("orderType", orderType);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/orderType/{orderType}/{orderNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an attachment and associates it with a certain sales order line. If the file already exists, a new revision is created.  - Method is deprecated and will be removed in a future version. Please start using the new method with order type.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param orderNumber Identifies the sales order
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderCreateLineAttachmentByorderNumberlineNumber(String orderNumber, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling salesOrderCreateLineAttachmentByorderNumberlineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling salesOrderCreateLineAttachmentByorderNumberlineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNumber", orderNumber);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{orderNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an attachment and associates it with a certain sales order line on a specific order type. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param orderNumber Identifies the sales order
     * @param orderType 
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber(String orderNumber, String orderType, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber");
        }
        
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderType' when calling salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling salesOrderCreateLineAttachmentByorderNumberorderTypelineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNumber", orderNumber);
        uriVariables.put("orderType", orderType);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/orderType/{orderType}/{orderNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create shipment operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param saleOrderNumber Reference number of the sale oreder from which the shipment will be created
     * @param createShipmentActionDto Defines the data for the action
     * @return CreateShipmentActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateShipmentActionResultDto salesOrderCreateShipmentActionBysaleOrderNumber(String saleOrderNumber, CreateShipmentActionDto createShipmentActionDto) throws RestClientException {
        Object postBody = createShipmentActionDto;
        
        // verify the required parameter 'saleOrderNumber' is set
        if (saleOrderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'saleOrderNumber' when calling salesOrderCreateShipmentActionBysaleOrderNumber");
        }
        
        // verify the required parameter 'createShipmentActionDto' is set
        if (createShipmentActionDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createShipmentActionDto' when calling salesOrderCreateShipmentActionBysaleOrderNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("saleOrderNumber", saleOrderNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{saleOrderNumber}/action/createShipment").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<CreateShipmentActionResultDto> returnType = new ParameterizedTypeReference<CreateShipmentActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a range of SO Orders
     * Data for all Sales Orders
     * <p><b>200</b> - OK
     * @param orderType The orderType parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param showNotes The showNotes parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;SalesOrderDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SalesOrderDto> salesOrderGetAllOrders(String orderType, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, Boolean showNotes, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderType", orderType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showNotes", showNotes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<SalesOrderDto>> returnType = new ParameterizedTypeReference<List<SalesOrderDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific SO Order
     * Data for a single Sales Order
     * <p><b>200</b> - OK
     * @param orderNbr Identifies the Sales Order Number
     * @return SalesOrderDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SalesOrderDto salesOrderGetByorderNbr(String orderNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNbr' is set
        if (orderNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNbr' when calling salesOrderGetByorderNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNbr", orderNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{orderNbr}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<SalesOrderDto> returnType = new ParameterizedTypeReference<SalesOrderDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific type of Order
     * Data for a single Sales Order
     * <p><b>200</b> - OK
     * @param orderType Identifies the Sales Order Type
     * @param orderNbr Identifies the Sales Order Number
     * @return SalesOrderDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SalesOrderDto salesOrderGetOrderByTypeByorderTypeorderNbr(String orderType, String orderNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderType' when calling salesOrderGetOrderByTypeByorderTypeorderNbr");
        }
        
        // verify the required parameter 'orderNbr' is set
        if (orderNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNbr' when calling salesOrderGetOrderByTypeByorderTypeorderNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderType", orderType);
        uriVariables.put("orderNbr", orderNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{orderType}/{orderNbr}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<SalesOrderDto> returnType = new ParameterizedTypeReference<SalesOrderDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Sale Order
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param saleOrderUpdateDto Defines the data for the Sale Order to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderPost(SalesOrderUpdateDto saleOrderUpdateDto) throws RestClientException {
        Object postBody = saleOrderUpdateDto;
        
        // verify the required parameter 'saleOrderUpdateDto' is set
        if (saleOrderUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'saleOrderUpdateDto' when calling salesOrderPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the print report of the Sales Order Quote
     * The File is in Content of the message
     * <p><b>200</b> - OK
     * @param orderNumber Identifies the order
     * @param orderType Identifies the Sales Order Type
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderPrintOrderByorderNumberorderType(String orderNumber, String orderType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling salesOrderPrintOrderByorderNumberorderType");
        }
        
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderType' when calling salesOrderPrintOrderByorderNumberorderType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNumber", orderNumber);
        uriVariables.put("orderType", orderType);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{orderType}/{orderNumber}/printOrder").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific Sale Order
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param salesOrderNumber Identifies the Sale Order to update
     * @param saleOrderUpdateDto Defines the data for the Sale Order to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object salesOrderPutBysalesOrderNumber(String salesOrderNumber, SalesOrderUpdateDto saleOrderUpdateDto) throws RestClientException {
        Object postBody = saleOrderUpdateDto;
        
        // verify the required parameter 'salesOrderNumber' is set
        if (salesOrderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'salesOrderNumber' when calling salesOrderPutBysalesOrderNumber");
        }
        
        // verify the required parameter 'saleOrderUpdateDto' is set
        if (saleOrderUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'saleOrderUpdateDto' when calling salesOrderPutBysalesOrderNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("salesOrderNumber", salesOrderNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/salesorder/{salesOrderNumber}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
