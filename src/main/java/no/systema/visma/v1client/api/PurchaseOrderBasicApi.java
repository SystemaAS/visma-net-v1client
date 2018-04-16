package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.PurchaseOrderBasicDto;
import no.systema.visma.v1client.model.PurchaseOrderBasicUpdateDto;

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
@Component("no.systema.visma.v1client.api.PurchaseOrderBasicApi")
public class PurchaseOrderBasicApi {
    private ApiClient apiClient;

    public PurchaseOrderBasicApi() {
        this(new ApiClient());
    }

    @Autowired
    public PurchaseOrderBasicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Purchase Order
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param orderType The orderType parameter
     * @param orderStatus The orderStatus parameter
     * @param supplier The supplier parameter
     * @return List&lt;PurchaseOrderBasicDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PurchaseOrderBasicDto> purchaseOrderBasicGetAllOrderBasic(String greaterThanValue, Integer numberToRead, Integer skipRecords, String lastModifiedDateTime, String lastModifiedDateTimeCondition, String orderType, String orderStatus, String supplier) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/purchaseorderbasic").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderType", orderType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderStatus", orderStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "supplier", supplier));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<PurchaseOrderBasicDto>> returnType = new ParameterizedTypeReference<List<PurchaseOrderBasicDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Purchase Order
     * 
     * <p><b>200</b> - OK
     * @param orderNbr Identifies the Purchase Order
     * @return PurchaseOrderBasicDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PurchaseOrderBasicDto purchaseOrderBasicGetPurchaseOrderBasicByorderNbr(String orderNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderNbr' is set
        if (orderNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNbr' when calling purchaseOrderBasicGetPurchaseOrderBasicByorderNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderNbr", orderNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/purchaseorderbasic/{orderNbr}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PurchaseOrderBasicDto> returnType = new ParameterizedTypeReference<PurchaseOrderBasicDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Purchase Order Basic
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param purchaseOrderBasicUpdateDto Defines the data for the Purchase Order to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object purchaseOrderBasicPost(PurchaseOrderBasicUpdateDto purchaseOrderBasicUpdateDto) throws RestClientException {
        Object postBody = purchaseOrderBasicUpdateDto;
        
        // verify the required parameter 'purchaseOrderBasicUpdateDto' is set
        if (purchaseOrderBasicUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseOrderBasicUpdateDto' when calling purchaseOrderBasicPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/purchaseorderbasic").build().toUriString();
        
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
     * Update a Purchase Order Basic
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param purchaseOrderNumber Identifies the Purchase Order to update
     * @param purchaseOrderBasicUpdateDto Defines the data for the Purchase Order to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object purchaseOrderBasicPutBypurchaseOrderNumber(String purchaseOrderNumber, PurchaseOrderBasicUpdateDto purchaseOrderBasicUpdateDto) throws RestClientException {
        Object postBody = purchaseOrderBasicUpdateDto;
        
        // verify the required parameter 'purchaseOrderNumber' is set
        if (purchaseOrderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseOrderNumber' when calling purchaseOrderBasicPutBypurchaseOrderNumber");
        }
        
        // verify the required parameter 'purchaseOrderBasicUpdateDto' is set
        if (purchaseOrderBasicUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseOrderBasicUpdateDto' when calling purchaseOrderBasicPutBypurchaseOrderNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseOrderNumber", purchaseOrderNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/purchaseorderbasic/{purchaseOrderNumber}").buildAndExpand(uriVariables).toUriString();
        
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
