package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CustomerOverdueChargeDto;
import no.systema.visma.v1client.model.CustomerOverdueChargeUpdateDto;
import no.systema.visma.v1client.model.ReleaseCustomerOverdueChargeActionResultDto;

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
@Component("no.systema.visma.v1client.api.CustomerOverdueChargeApi")
public class CustomerOverdueChargeApi {
    private ApiClient apiClient;

    public CustomerOverdueChargeApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerOverdueChargeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an attachment and associates it with an overdue charge. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param overdueChargeNumber Identifies the overdue charge
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber(String overdueChargeNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'overdueChargeNumber' is set
        if (overdueChargeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueChargeNumber' when calling customerOverdueChargeCreateHeaderAttachmentByoverdueChargeNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("overdueChargeNumber", overdueChargeNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates an attachment and associates it with a certain overdue charge line. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param overdueChargeNumber Identifies the overdue charge
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber(String overdueChargeNumber, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'overdueChargeNumber' is set
        if (overdueChargeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueChargeNumber' when calling customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling customerOverdueChargeCreateLineAttachmentByoverdueChargeNumberlineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("overdueChargeNumber", overdueChargeNumber);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Get a range of Customer Overdue Charges
     * Data for Customer Overdue Charge
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
     * @return List&lt;CustomerOverdueChargeDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CustomerOverdueChargeDto> customerOverdueChargeGetAll(String documentType, Integer released, Integer dunningLevel, String closedFinancialPeriod, String dunningLetterDateTime, String dunningLetterDateTimeCondition, String project, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge").build().toUriString();
        
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

        ParameterizedTypeReference<List<CustomerOverdueChargeDto>> returnType = new ParameterizedTypeReference<List<CustomerOverdueChargeDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Overdue Charge
     * Data for Customer Overdue Charge
     * <p><b>200</b> - OK
     * @param overdueChargeNumber Identifies the Customer Overdue Charge
     * @return CustomerOverdueChargeDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerOverdueChargeDto customerOverdueChargeGetByoverdueChargeNumber(String overdueChargeNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'overdueChargeNumber' is set
        if (overdueChargeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueChargeNumber' when calling customerOverdueChargeGetByoverdueChargeNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("overdueChargeNumber", overdueChargeNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge/{overdueChargeNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerOverdueChargeDto> returnType = new ParameterizedTypeReference<CustomerOverdueChargeDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Release overdue charge operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param overdueChargeNumber Reference number of the overdue charge to be released
     * @return ReleaseCustomerOverdueChargeActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseCustomerOverdueChargeActionResultDto customerOverdueChargeReleaseDocumentByoverdueChargeNumber(String overdueChargeNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'overdueChargeNumber' is set
        if (overdueChargeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueChargeNumber' when calling customerOverdueChargeReleaseDocumentByoverdueChargeNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("overdueChargeNumber", overdueChargeNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge/{overdueChargeNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleaseCustomerOverdueChargeActionResultDto> returnType = new ParameterizedTypeReference<ReleaseCustomerOverdueChargeActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific Overdue Charge
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param overdueChargeNumber Identifies the Overdue Charge to update
     * @param overdueCharge Defines the data for the Overdue Charge to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerOverdueChargeUpdateByoverdueChargeNumber(String overdueChargeNumber, CustomerOverdueChargeUpdateDto overdueCharge) throws RestClientException {
        Object postBody = overdueCharge;
        
        // verify the required parameter 'overdueChargeNumber' is set
        if (overdueChargeNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueChargeNumber' when calling customerOverdueChargeUpdateByoverdueChargeNumber");
        }
        
        // verify the required parameter 'overdueCharge' is set
        if (overdueCharge == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'overdueCharge' when calling customerOverdueChargeUpdateByoverdueChargeNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("overdueChargeNumber", overdueChargeNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerOverdueCharge/{overdueChargeNumber}").buildAndExpand(uriVariables).toUriString();
        
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
