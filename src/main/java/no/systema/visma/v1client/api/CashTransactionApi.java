package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CashTransactionDto;
import no.systema.visma.v1client.model.CashTransactionUpdateDto;
import no.systema.visma.v1client.model.ReleaseCashTransactionActionResultDto;
import no.systema.visma.v1client.model.ReverseCashTransactionActionDto;
import no.systema.visma.v1client.model.ReverseCashTransactionActionResultDto;

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
@Component("no.systema.visma.v1client.api.CashTransactionApi")
public class CashTransactionApi {
    private ApiClient apiClient;

    public CashTransactionApi() {
        this(new ApiClient());
    }

    @Autowired
    public CashTransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Cash Transaction
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param cashTransaction Defines the data for the Cash Transaction to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashTransactionCreateCashTransaction(CashTransactionUpdateDto cashTransaction) throws RestClientException {
        Object postBody = cashTransaction;
        
        // verify the required parameter 'cashTransaction' is set
        if (cashTransaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashTransaction' when calling cashTransactionCreateCashTransaction");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction").build().toUriString();
        
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
     * Get all Transaction
     * 
     * <p><b>200</b> - OK
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @return List&lt;CashTransactionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CashTransactionDto> cashTransactionGetAll(Integer numberToRead, Integer skipRecords, String lastModifiedDateTime, String lastModifiedDateTimeCondition) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<CashTransactionDto>> returnType = new ParameterizedTypeReference<List<CashTransactionDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Transaction
     * 
     * <p><b>200</b> - OK
     * @param referenceNumber Identifies the Transaction
     * @return CashTransactionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CashTransactionDto cashTransactionGetByreferenceNumber(String referenceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'referenceNumber' is set
        if (referenceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNumber' when calling cashTransactionGetByreferenceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNumber", referenceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction/{referenceNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CashTransactionDto> returnType = new ParameterizedTypeReference<CashTransactionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific CashTransaction
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param referenceNbr Identifies the Cash Transaction to update
     * @param cashTransaction Defines the data for the Cash Transaction to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashTransactionPutByreferenceNbr(String referenceNbr, CashTransactionUpdateDto cashTransaction) throws RestClientException {
        Object postBody = cashTransaction;
        
        // verify the required parameter 'referenceNbr' is set
        if (referenceNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNbr' when calling cashTransactionPutByreferenceNbr");
        }
        
        // verify the required parameter 'cashTransaction' is set
        if (cashTransaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashTransaction' when calling cashTransactionPutByreferenceNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNbr", referenceNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction/{referenceNbr}").buildAndExpand(uriVariables).toUriString();
        
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
     * Release cash transaction
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param referenceNbr Reference number of the cash transaction to be released.
     * @return ReleaseCashTransactionActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseCashTransactionActionResultDto cashTransactionReleaseByreferenceNbr(String referenceNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'referenceNbr' is set
        if (referenceNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNbr' when calling cashTransactionReleaseByreferenceNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNbr", referenceNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction/{referenceNbr}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleaseCashTransactionActionResultDto> returnType = new ParameterizedTypeReference<ReleaseCashTransactionActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reverse a Cash Transaction
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param referenceNbr Reference number of the cash transaction to be reversed.
     * @param reverseActionDto The action dto use to condition the action
     * @return ReverseCashTransactionActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReverseCashTransactionActionResultDto cashTransactionReverseByreferenceNbr(String referenceNbr, ReverseCashTransactionActionDto reverseActionDto) throws RestClientException {
        Object postBody = reverseActionDto;
        
        // verify the required parameter 'referenceNbr' is set
        if (referenceNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referenceNbr' when calling cashTransactionReverseByreferenceNbr");
        }
        
        // verify the required parameter 'reverseActionDto' is set
        if (reverseActionDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reverseActionDto' when calling cashTransactionReverseByreferenceNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referenceNbr", referenceNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashTransaction/{referenceNbr}/action/reverse").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReverseCashTransactionActionResultDto> returnType = new ParameterizedTypeReference<ReverseCashTransactionActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
