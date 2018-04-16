package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.InventoryAdjustmentDto;
import no.systema.visma.v1client.model.InventoryAdjustmentUpdateDto;
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
@Component("no.systema.visma.v1client.api.InventoryAdjustmentApi")
public class InventoryAdjustmentApi {
    private ApiClient apiClient;

    public InventoryAdjustmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public InventoryAdjustmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Inventory Adjustment Dto
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
     * @return List&lt;InventoryAdjustmentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InventoryAdjustmentDto> inventoryAdjustmentGetAll(String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryadjustment").build().toUriString();
        
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

        ParameterizedTypeReference<List<InventoryAdjustmentDto>> returnType = new ParameterizedTypeReference<List<InventoryAdjustmentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Inventory Adjustment document
     * 
     * <p><b>200</b> - OK
     * @param inventoryAdjustmentNumber Identifies the Inventory Adjustment document
     * @return InventoryAdjustmentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventoryAdjustmentDto inventoryAdjustmentGetByinventoryAdjustmentNumber(String inventoryAdjustmentNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inventoryAdjustmentNumber' is set
        if (inventoryAdjustmentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryAdjustmentNumber' when calling inventoryAdjustmentGetByinventoryAdjustmentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryAdjustmentNumber", inventoryAdjustmentNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryadjustment/{inventoryAdjustmentNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InventoryAdjustmentDto> returnType = new ParameterizedTypeReference<InventoryAdjustmentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an inventory item
     * Response Message has StatusCode Created if POST operation succed
     * <p><b>201</b> - Created
     * @param inventoryAdjustment Define the data for the inventory adjustment to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryAdjustmentPost(InventoryAdjustmentUpdateDto inventoryAdjustment) throws RestClientException {
        Object postBody = inventoryAdjustment;
        
        // verify the required parameter 'inventoryAdjustment' is set
        if (inventoryAdjustment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryAdjustment' when calling inventoryAdjustmentPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryadjustment").build().toUriString();
        
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
     * @param adjRefNumber Identifies the inventory item to update
     * @param adjustment The data to update for inventory item
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryAdjustmentPutByadjRefNumber(String adjRefNumber, InventoryAdjustmentUpdateDto adjustment) throws RestClientException {
        Object postBody = adjustment;
        
        // verify the required parameter 'adjRefNumber' is set
        if (adjRefNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adjRefNumber' when calling inventoryAdjustmentPutByadjRefNumber");
        }
        
        // verify the required parameter 'adjustment' is set
        if (adjustment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adjustment' when calling inventoryAdjustmentPutByadjRefNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("adjRefNumber", adjRefNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryadjustment/{adjRefNumber}").buildAndExpand(uriVariables).toUriString();
        
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
     * Release inventory document action
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param adjRefNumber Reference number of the released adjustment to be released
     * @return ReleaseInventoryDocumentActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseInventoryDocumentActionResultDto inventoryAdjustmentReleaseDocumentByadjRefNumber(String adjRefNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'adjRefNumber' is set
        if (adjRefNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adjRefNumber' when calling inventoryAdjustmentReleaseDocumentByadjRefNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("adjRefNumber", adjRefNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventoryadjustment/{adjRefNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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
