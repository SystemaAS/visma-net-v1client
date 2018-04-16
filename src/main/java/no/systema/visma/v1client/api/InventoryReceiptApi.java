package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.InventoryReceiptDto;
import no.systema.visma.v1client.model.InventoryReceiptUpdateDto;
import no.systema.visma.v1client.model.ReleaseInventoryDocumentActionResultDto;

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
@Component("no.systema.visma.v1client.api.InventoryReceiptApi")
public class InventoryReceiptApi {
    private ApiClient apiClient;

    public InventoryReceiptApi() {
        this(new ApiClient());
    }

    @Autowired
    public InventoryReceiptApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Inventory Receipts
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;InventoryReceiptDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InventoryReceiptDto> inventoryReceiptGetAll(String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryReceipt").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<InventoryReceiptDto>> returnType = new ParameterizedTypeReference<List<InventoryReceiptDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Inventory Receipt document
     * 
     * <p><b>200</b> - OK
     * @param inventoryReceiptNumber Identifies the Inventory Issue document
     * @return InventoryReceiptDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventoryReceiptDto inventoryReceiptGetByinventoryReceiptNumber(String inventoryReceiptNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inventoryReceiptNumber' is set
        if (inventoryReceiptNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryReceiptNumber' when calling inventoryReceiptGetByinventoryReceiptNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryReceiptNumber", inventoryReceiptNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryReceipt/{inventoryReceiptNumber}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<InventoryReceiptDto> returnType = new ParameterizedTypeReference<InventoryReceiptDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an inventory item
     * Response Message has StatusCode Created if POST operation succed
     * <p><b>201</b> - Created
     * @param inventoryReceipt Define the data for the inventory issue to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryReceiptPost(InventoryReceiptUpdateDto inventoryReceipt) throws RestClientException {
        Object postBody = inventoryReceipt;
        
        // verify the required parameter 'inventoryReceipt' is set
        if (inventoryReceipt == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryReceipt' when calling inventoryReceiptPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryReceipt").build().toUriString();
        
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
     * Update a specific inventory item
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param receiptRefNumber Identifies the inventory receipt to update
     * @param receipt The data to update for inventory receipt
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryReceiptPutByreceiptRefNumber(String receiptRefNumber, InventoryReceiptUpdateDto receipt) throws RestClientException {
        Object postBody = receipt;
        
        // verify the required parameter 'receiptRefNumber' is set
        if (receiptRefNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receiptRefNumber' when calling inventoryReceiptPutByreceiptRefNumber");
        }
        
        // verify the required parameter 'receipt' is set
        if (receipt == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receipt' when calling inventoryReceiptPutByreceiptRefNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("receiptRefNumber", receiptRefNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryReceipt/{receiptRefNumber}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Release inventory operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param invoiceNumber Reference number of the released issue to be released
     * @return ReleaseInventoryDocumentActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseInventoryDocumentActionResultDto inventoryReceiptReleaseDocumentByinvoiceNumber(String invoiceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceNumber' when calling inventoryReceiptReleaseDocumentByinvoiceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invoiceNumber", invoiceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryReceipt/{invoiceNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<ReleaseInventoryDocumentActionResultDto> returnType = new ParameterizedTypeReference<ReleaseInventoryDocumentActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
