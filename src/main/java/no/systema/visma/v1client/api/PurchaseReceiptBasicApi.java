package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.PurchaseReceiptBasicDto;
import no.systema.visma.v1client.model.PurchaseReceiptBasicUpdateDto;
import no.systema.visma.v1client.model.ReleasePurchaseReceiptActionResultDto;

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
@Component("no.systema.visma.v1client.api.PurchaseReceiptBasicApi")
public class PurchaseReceiptBasicApi {
    private ApiClient apiClient;

    public PurchaseReceiptBasicApi() {
        this(new ApiClient());
    }

    @Autowired
    public PurchaseReceiptBasicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param receiptType The receiptType parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @return List&lt;PurchaseReceiptBasicDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PurchaseReceiptBasicDto> purchaseReceiptBasicGetAllReceiptBasic(String receiptType, String greaterThanValue, Integer numberToRead, Integer skipRecords, String lastModifiedDateTime, String lastModifiedDateTimeCondition) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/PurchaseReceiptBasic").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "receiptType", receiptType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<PurchaseReceiptBasicDto>> returnType = new ParameterizedTypeReference<List<PurchaseReceiptBasicDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Purchase Receipt
     * 
     * <p><b>200</b> - OK
     * @param receiptNbr Identifies the Purchase Receipt
     * @return PurchaseReceiptBasicDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PurchaseReceiptBasicDto purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr(String receiptNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'receiptNbr' is set
        if (receiptNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receiptNbr' when calling purchaseReceiptBasicGetPurchaseReceiptBasicByreceiptNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("receiptNbr", receiptNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/PurchaseReceiptBasic/{receiptNbr}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PurchaseReceiptBasicDto> returnType = new ParameterizedTypeReference<PurchaseReceiptBasicDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Purchase Receipt
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param poReceiptUpdateDto Defines the data for the  Purchase Receipt to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object purchaseReceiptBasicPost(PurchaseReceiptBasicUpdateDto poReceiptUpdateDto) throws RestClientException {
        Object postBody = poReceiptUpdateDto;
        
        // verify the required parameter 'poReceiptUpdateDto' is set
        if (poReceiptUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'poReceiptUpdateDto' when calling purchaseReceiptBasicPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/PurchaseReceiptBasic").build().toUriString();
        
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
     * Update a specific Purchase Receipt
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param poReceiptNumber Identifies the  Purchase Receipt  to update
     * @param poReceiptUpdateDto Defines the data for the  Purchase Receipt  to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object purchaseReceiptBasicPutBypoReceiptNumber(String poReceiptNumber, PurchaseReceiptBasicUpdateDto poReceiptUpdateDto) throws RestClientException {
        Object postBody = poReceiptUpdateDto;
        
        // verify the required parameter 'poReceiptNumber' is set
        if (poReceiptNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'poReceiptNumber' when calling purchaseReceiptBasicPutBypoReceiptNumber");
        }
        
        // verify the required parameter 'poReceiptUpdateDto' is set
        if (poReceiptUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'poReceiptUpdateDto' when calling purchaseReceiptBasicPutBypoReceiptNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("poReceiptNumber", poReceiptNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/PurchaseReceiptBasic/{poReceiptNumber}").buildAndExpand(uriVariables).toUriString();
        
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
     * Release purchase receipt operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param receiptNumber Reference number of the receipt to be released
     * @return ReleasePurchaseReceiptActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleasePurchaseReceiptActionResultDto purchaseReceiptBasicReleaseInvoiceByreceiptNumber(String receiptNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'receiptNumber' is set
        if (receiptNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receiptNumber' when calling purchaseReceiptBasicReleaseInvoiceByreceiptNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("receiptNumber", receiptNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/PurchaseReceiptBasic/{receiptNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleasePurchaseReceiptActionResultDto> returnType = new ParameterizedTypeReference<ReleasePurchaseReceiptActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
