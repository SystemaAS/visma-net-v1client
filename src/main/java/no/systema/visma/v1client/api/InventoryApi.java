package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.InventoryDto;
import no.systema.visma.v1client.model.InventoryUpdateDto;
import no.systema.visma.v1client.model.ItemClassDto;
import no.systema.visma.v1client.model.PostingClassDto;
import no.systema.visma.v1client.model.UpdateCostActionResultDto;

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
@Component("no.systema.visma.v1client.api.InventoryApi")
public class InventoryApi {
    private ApiClient apiClient;

    public InventoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public InventoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Inventory items
     * 
     * <p><b>200</b> - OK
     * @param alternateID The alternateID parameter
     * @param salesCategory The salesCategory parameter
     * @param addCostPriceStatistics This filter can be used only for stock items
     * @param attributes The attributes parameter
     * @param description The description parameter
     * @param availabilityLastModifiedDateTime The availabilityLastModifiedDateTime parameter
     * @param availabilityLastModifiedDateTimeCondition The availabilityLastModifiedDateTimeCondition parameter
     * @param expandCrossReference The expandCrossReference parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;InventoryDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InventoryDto> inventoryGetAll(String alternateID, Integer salesCategory, Boolean addCostPriceStatistics, String attributes, String description, String availabilityLastModifiedDateTime, String availabilityLastModifiedDateTimeCondition, Boolean expandCrossReference, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "alternateID", alternateID));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "salesCategory", salesCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addCostPriceStatistics", addCostPriceStatistics));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributes", attributes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilityLastModifiedDateTime", availabilityLastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilityLastModifiedDateTimeCondition", availabilityLastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expandCrossReference", expandCrossReference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
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

        ParameterizedTypeReference<List<InventoryDto>> returnType = new ParameterizedTypeReference<List<InventoryDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Inventory item
     * 
     * <p><b>200</b> - OK
     * @param inventoryNumber Identifies the Inventory item
     * @return InventoryDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InventoryDto inventoryGetByinventoryNumber(String inventoryNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inventoryNumber' is set
        if (inventoryNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryNumber' when calling inventoryGetByinventoryNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryNumber", inventoryNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/{inventoryNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InventoryDto> returnType = new ParameterizedTypeReference<InventoryDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Inventory Item Classes
     * 
     * <p><b>200</b> - OK
     * @return List&lt;ItemClassDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ItemClassDto> inventoryGetItemClasses() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/itemClass").build().toUriString();
        
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

        ParameterizedTypeReference<List<ItemClassDto>> returnType = new ParameterizedTypeReference<List<ItemClassDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Inventory Item Post Classes
     * 
     * <p><b>200</b> - OK
     * @return List&lt;PostingClassDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostingClassDto> inventoryGetItemPostClasses() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/itemPostClass").build().toUriString();
        
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

        ParameterizedTypeReference<List<PostingClassDto>> returnType = new ParameterizedTypeReference<List<PostingClassDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Specific Inventory Item Class
     * 
     * <p><b>200</b> - OK
     * @param itemClassNumber The itemClassNumber parameter
     * @return ItemClassDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ItemClassDto inventoryGetSpecificItemClassByitemClassNumber(String itemClassNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'itemClassNumber' is set
        if (itemClassNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemClassNumber' when calling inventoryGetSpecificItemClassByitemClassNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("itemClassNumber", itemClassNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/itemclass/{itemClassNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ItemClassDto> returnType = new ParameterizedTypeReference<ItemClassDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an inventory item
     * Response Message has StatusCode Created if POST operation succed
     * <p><b>201</b> - Created
     * @param inventory Define the data for the inventory item to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryPost(InventoryUpdateDto inventory) throws RestClientException {
        Object postBody = inventory;
        
        // verify the required parameter 'inventory' is set
        if (inventory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventory' when calling inventoryPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory").build().toUriString();
        
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
     * @param inventoryNumber Identifies the inventory item to update
     * @param inventory The data to update for inventory item
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object inventoryPutByinventoryNumber(String inventoryNumber, InventoryUpdateDto inventory) throws RestClientException {
        Object postBody = inventory;
        
        // verify the required parameter 'inventoryNumber' is set
        if (inventoryNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryNumber' when calling inventoryPutByinventoryNumber");
        }
        
        // verify the required parameter 'inventory' is set
        if (inventory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventory' when calling inventoryPutByinventoryNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryNumber", inventoryNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/{inventoryNumber}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update Cost action on Non-Stock Item
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param inventoryCd Identifies the inventory item to update
     * @return UpdateCostActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateCostActionResultDto inventoryUpdateCostNonStockItemByinventoryCd(String inventoryCd) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inventoryCd' is set
        if (inventoryCd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryCd' when calling inventoryUpdateCostNonStockItemByinventoryCd");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryCd", inventoryCd);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventory/{inventoryCd}/action/updateCost").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<UpdateCostActionResultDto> returnType = new ParameterizedTypeReference<UpdateCostActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
