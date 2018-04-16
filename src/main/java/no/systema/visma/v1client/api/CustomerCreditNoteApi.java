package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CustomerCreditNoteDto;
import no.systema.visma.v1client.model.CustomerCreditNoteUpdateDto;
import no.systema.visma.v1client.model.ReleaseCustomerCreditNoteActionResultDto;

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
@Component("no.systema.visma.v1client.api.CustomerCreditNoteApi")
public class CustomerCreditNoteApi {
    private ApiClient apiClient;

    public CustomerCreditNoteApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerCreditNoteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Credit Note
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param creditNote Defines the data for the Credit Note to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNoteCreate(CustomerCreditNoteUpdateDto creditNote) throws RestClientException {
        Object postBody = creditNote;
        
        // verify the required parameter 'creditNote' is set
        if (creditNote == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNote' when calling customerCreditNoteCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote").build().toUriString();
        
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
     * Creates an attachment and associates it with a credit note. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param creditNoteNumber Identifies the credit note
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber(String creditNoteNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteCreateHeaderAttachmentBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates an attachment and associates it with a certain credit note line. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param creditNoteNumber Identifies the credit note
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber(String creditNoteNumber, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling customerCreditNoteCreateLineAttachmentBycreditNoteNumberlineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Deletes a specific Customer Credit Note
     * Response Message has StatusCode NoContent if DELETE operation succeed
     * <p><b>204</b> - NoContent
     * @param creditNoteNumber Identifies the Customer Credit Note to delete
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNoteDeleteBycreditNoteNumber(String creditNoteNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteDeleteBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a range of Customer Credit Notes
     * Data for Customer Credit Note
     * <p><b>200</b> - OK
     * @param documentType The field is deprecated for specific customer document endpoints. It will only be usable from customer document endpoint.
     * @param released The released parameter
     * @param dunningLevel The dunningLevel parameter
     * @param closedFinancialPeriod The closedFinancialPeriod parameter
     * @param dunningLetterDateTime The dunningLetterDateTime parameter
     * @param dunningLetterDateTimeCondition The dunningLetterDateTimeCondition parameter
     * @param project The project parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;CustomerCreditNoteDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CustomerCreditNoteDto> customerCreditNoteGetAll(String documentType, Integer released, Integer dunningLevel, String closedFinancialPeriod, String dunningLetterDateTime, String dunningLetterDateTimeCondition, String project, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentType", documentType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "released", released));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dunningLevel", dunningLevel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "closedFinancialPeriod", closedFinancialPeriod));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dunningLetterDateTime", dunningLetterDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dunningLetterDateTimeCondition", dunningLetterDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "project", project));
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

        ParameterizedTypeReference<List<CustomerCreditNoteDto>> returnType = new ParameterizedTypeReference<List<CustomerCreditNoteDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Credit Note
     * Data for Customer Credit Note
     * <p><b>200</b> - OK
     * @param creditNoteNumber Identifies the Customer Credit Note
     * @return CustomerCreditNoteDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerCreditNoteDto customerCreditNoteGetBycreditNoteNumber(String creditNoteNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteGetBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerCreditNoteDto> returnType = new ParameterizedTypeReference<CustomerCreditNoteDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the print report of a Customer Credit Note
     * The File is in Content of the message
     * <p><b>200</b> - OK
     * @param creditNoteNumber Identifies the customer credit note
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNotePrintBycreditNoteNumber(String creditNoteNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNotePrintBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}/print").buildAndExpand(uriVariables).toUriString();
        
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
     * Release credit note operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param creditNoteNumber Reference number of the credit note to be released
     * @return ReleaseCustomerCreditNoteActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseCustomerCreditNoteActionResultDto customerCreditNoteReleaseDocumentBycreditNoteNumber(String creditNoteNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteReleaseDocumentBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleaseCustomerCreditNoteActionResultDto> returnType = new ParameterizedTypeReference<ReleaseCustomerCreditNoteActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific Credit Note
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param creditNoteNumber Identifies the Credit Note to update
     * @param creditNote Defines the data for the Credit Note to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerCreditNoteUpdateBycreditNoteNumber(String creditNoteNumber, CustomerCreditNoteUpdateDto creditNote) throws RestClientException {
        Object postBody = creditNote;
        
        // verify the required parameter 'creditNoteNumber' is set
        if (creditNoteNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNoteNumber' when calling customerCreditNoteUpdateBycreditNoteNumber");
        }
        
        // verify the required parameter 'creditNote' is set
        if (creditNote == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'creditNote' when calling customerCreditNoteUpdateBycreditNoteNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("creditNoteNumber", creditNoteNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerCreditNote/{creditNoteNumber}").buildAndExpand(uriVariables).toUriString();
        
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
