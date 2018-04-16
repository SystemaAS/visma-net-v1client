package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.JournalTransactionDto;
import no.systema.visma.v1client.model.JournalTransactionUpdateDto;
import no.systema.visma.v1client.model.ReleaseJournalTransactionActionResultDto;

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
@Component("no.systema.visma.v1client.api.JournalTransactionApi")
public class JournalTransactionApi {
    private ApiClient apiClient;

    public JournalTransactionApi() {
        this(new ApiClient());
    }

    @Autowired
    public JournalTransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an attachment and associates it with an journalTransaction. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param journalTransactionNumber Identifies the journalTransaction
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object journalTransactionCreateHeaderAttachmentByjournalTransactionNumber(String journalTransactionNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'journalTransactionNumber' is set
        if (journalTransactionNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransactionNumber' when calling journalTransactionCreateHeaderAttachmentByjournalTransactionNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("journalTransactionNumber", journalTransactionNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction/{journalTransactionNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates an attachment and associates it with a certain journalTransaction line. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param journalTransactionNumber Identifies the journalTransaction
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber(String journalTransactionNumber, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'journalTransactionNumber' is set
        if (journalTransactionNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransactionNumber' when calling journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling journalTransactionCreateLineAttachmentByjournalTransactionNumberlineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("journalTransactionNumber", journalTransactionNumber);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction/{journalTransactionNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Get a range of Journal Transactions
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param customerSupplierStart The customerSupplierStart parameter
     * @param customerSupplierEnd The customerSupplierEnd parameter
     * @param released The released parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;JournalTransactionDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<JournalTransactionDto> journalTransactionGetAllJournalTransactions(String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, String customerSupplierStart, String customerSupplierEnd, Integer released, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customerSupplierStart", customerSupplierStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customerSupplierEnd", customerSupplierEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "released", released));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<JournalTransactionDto>> returnType = new ParameterizedTypeReference<List<JournalTransactionDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Journal Transaction
     * 
     * <p><b>200</b> - OK
     * @param journalTransactionNumber Identifies the Journal Transaction
     * @return JournalTransactionDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JournalTransactionDto journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber(String journalTransactionNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'journalTransactionNumber' is set
        if (journalTransactionNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransactionNumber' when calling journalTransactionGetSpecificJournalTransactionsByjournalTransactionNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("journalTransactionNumber", journalTransactionNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction/{journalTransactionNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<JournalTransactionDto> returnType = new ParameterizedTypeReference<JournalTransactionDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Journal Transaction
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param journalTransaction Defines the data for the Journal Transaction to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object journalTransactionPost(JournalTransactionUpdateDto journalTransaction) throws RestClientException {
        Object postBody = journalTransaction;
        
        // verify the required parameter 'journalTransaction' is set
        if (journalTransaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransaction' when calling journalTransactionPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction").build().toUriString();
        
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
     * Update a Journal Transaction
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param journalTransactionNumber Identifies the Journal Transaction to update
     * @param journalTransaction Defines the data for the Journal Transaction to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object journalTransactionPutByjournalTransactionNumber(String journalTransactionNumber, JournalTransactionUpdateDto journalTransaction) throws RestClientException {
        Object postBody = journalTransaction;
        
        // verify the required parameter 'journalTransactionNumber' is set
        if (journalTransactionNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransactionNumber' when calling journalTransactionPutByjournalTransactionNumber");
        }
        
        // verify the required parameter 'journalTransaction' is set
        if (journalTransaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransaction' when calling journalTransactionPutByjournalTransactionNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("journalTransactionNumber", journalTransactionNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction/{journalTransactionNumber}").buildAndExpand(uriVariables).toUriString();
        
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
     * Release journal transaction operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param journalTransactionNumber Reference number of the journal transaction to be released
     * @return ReleaseJournalTransactionActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseJournalTransactionActionResultDto journalTransactionReleaseJournalTransactionByjournalTransactionNumber(String journalTransactionNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'journalTransactionNumber' is set
        if (journalTransactionNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'journalTransactionNumber' when calling journalTransactionReleaseJournalTransactionByjournalTransactionNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("journalTransactionNumber", journalTransactionNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/journaltransaction/{journalTransactionNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleaseJournalTransactionActionResultDto> returnType = new ParameterizedTypeReference<ReleaseJournalTransactionActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
