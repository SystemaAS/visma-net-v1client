package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.StocktakeDto;
import no.systema.visma.v1client.model.StocktakeUpdateDto;

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
@Component("no.systema.visma.v1client.api.StocktakeApi")
public class StocktakeApi {
    private ApiClient apiClient;

    public StocktakeApi() {
        this(new ApiClient());
    }

    @Autowired
    public StocktakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of stocktakes
     * 
     * <p><b>200</b> - OK
     * @param warehouse The warehouse parameter
     * @param location The location parameter
     * @param inventory The inventory parameter
     * @param lotSerialNumber The lotSerialNumber parameter
     * @param summaryStatus The summaryStatus parameter
     * @param numberToRead The numberToRead parameter
     * @param startWithLine The startWithLine parameter
     * @param endWithLine The endWithLine parameter
     * @param freezeDateTime The freezeDateTime parameter
     * @param freezeDateTimeCondition The freezeDateTimeCondition parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param expirationDateTime The expirationDateTime parameter
     * @param expirationDateTimeCondition The expirationDateTimeCondition parameter
     * @param status The status parameter
     * @param skipRecords The skipRecords parameter
     * @return List&lt;StocktakeDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StocktakeDto> stocktakeGetAllStocktakes(String warehouse, String location, String inventory, String lotSerialNumber, String summaryStatus, Integer numberToRead, Integer startWithLine, Integer endWithLine, String freezeDateTime, String freezeDateTimeCondition, String lastModifiedDateTime, String lastModifiedDateTimeCondition, String expirationDateTime, String expirationDateTimeCondition, String status, Integer skipRecords) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/stocktake").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "warehouse", warehouse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "location", location));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inventory", inventory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lotSerialNumber", lotSerialNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "summaryStatus", summaryStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startWithLine", startWithLine));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endWithLine", endWithLine));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freezeDateTime", freezeDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freezeDateTimeCondition", freezeDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expirationDateTime", expirationDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expirationDateTimeCondition", expirationDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<StocktakeDto>> returnType = new ParameterizedTypeReference<List<StocktakeDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific
     * 
     * <p><b>200</b> - OK
     * @param referenceNumber Identifies the Stocktake
     * @return StocktakeDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StocktakeDto stocktakeGetByreferenceNumber(String referenceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'referenceNumber' is set
        if (referenceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNumber' when calling stocktakeGetByreferenceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNumber", referenceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/stocktake/{referenceNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<StocktakeDto> returnType = new ParameterizedTypeReference<StocktakeDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific stocktake
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param referenceNumber Identifies the stocktake to update
     * @param stocktake The data to update for stocktake
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object stocktakePutByreferenceNumber(String referenceNumber, StocktakeUpdateDto stocktake) throws RestClientException {
        Object postBody = stocktake;
        
        // verify the required parameter 'referenceNumber' is set
        if (referenceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNumber' when calling stocktakePutByreferenceNumber");
        }
        
        // verify the required parameter 'stocktake' is set
        if (stocktake == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stocktake' when calling stocktakePutByreferenceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNumber", referenceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/stocktake/{referenceNumber}").buildAndExpand(uriVariables).toUriString();
        
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
