package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.InventorySummaryDto;

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
@Component("no.systema.visma.v1client.api.InventorySummaryApi")
public class InventorySummaryApi {
    private ApiClient apiClient;

    public InventorySummaryApi() {
        this(new ApiClient());
    }

    @Autowired
    public InventorySummaryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of InventorySummary
     * 
     * <p><b>200</b> - OK
     * @param inventoryNumber 
     * @param warehouse The warehouse parameter
     * @param location The location parameter
     * @return List&lt;InventorySummaryDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InventorySummaryDto> inventorySummaryGetAllInventorySummaryByinventoryNumber(String inventoryNumber, String warehouse, String location) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inventoryNumber' is set
        if (inventoryNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryNumber' when calling inventorySummaryGetAllInventorySummaryByinventoryNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryNumber", inventoryNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/inventorysummary/{inventoryNumber}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "warehouse", warehouse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "location", location));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<InventorySummaryDto>> returnType = new ParameterizedTypeReference<List<InventorySummaryDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
