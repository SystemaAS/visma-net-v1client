package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CustomerContractDetailsDto;
import no.systema.visma.v1client.model.CustomerContractDto;
import no.systema.visma.v1client.model.CustomerContractRecurringSummaryDto;
import no.systema.visma.v1client.model.CustomerContractSummaryDto;
import no.systema.visma.v1client.model.CustomerContractUpdateDto;

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
@Component("no.systema.visma.v1client.api.CustomerContractApi")
public class CustomerContractApi {
    private ApiClient apiClient;

    public CustomerContractApi() {
        this(new ApiClient());
    }

    @Autowired
    public CustomerContractApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a CustomerContract
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param customerContract Defines the data for the CustomerContract to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerContractCreateCustomerContract(CustomerContractUpdateDto customerContract) throws RestClientException {
        Object postBody = customerContract;
        
        // verify the required parameter 'customerContract' is set
        if (customerContract == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerContract' when calling customerContractCreateCustomerContract");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract").build().toUriString();
        
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
     * Get a range of Customer Contracts, a filter needs to be specified
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param contractTemplate The contractTemplate parameter
     * @param status The status parameter
     * @param customer The customer parameter
     * @param expandSummary The expandSummary parameter
     * @param expandDetails The expandDetails parameter
     * @param attributes The attributes parameter
     * @param expandAttributes The expandAttributes parameter
     * @return List&lt;CustomerContractDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CustomerContractDto> customerContractGetAll(String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, String contractTemplate, String status, String customer, Boolean expandSummary, Boolean expandDetails, String attributes, Boolean expandAttributes) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "contractTemplate", contractTemplate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer", customer));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expandSummary", expandSummary));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expandDetails", expandDetails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributes", attributes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expandAttributes", expandAttributes));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<CustomerContractDto>> returnType = new ParameterizedTypeReference<List<CustomerContractDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Contract
     * 
     * <p><b>200</b> - OK
     * @param contractId Identifies the customer contract
     * @return CustomerContractDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerContractDto customerContractGetCustomerContractBycontractId(String contractId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling customerContractGetCustomerContractBycontractId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("contractId", contractId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract/{contractId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerContractDto> returnType = new ParameterizedTypeReference<CustomerContractDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Contract Details
     * 
     * <p><b>200</b> - OK
     * @param contractId Identifies the customer contract
     * @return CustomerContractDetailsDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerContractDetailsDto customerContractGetCustomerContractDetailsBycontractId(String contractId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling customerContractGetCustomerContractDetailsBycontractId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("contractId", contractId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract/{contractId}/details").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerContractDetailsDto> returnType = new ParameterizedTypeReference<CustomerContractDetailsDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Contract Recurring Summary
     * 
     * <p><b>200</b> - OK
     * @param contractId Identifies the customer contract
     * @return CustomerContractRecurringSummaryDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerContractRecurringSummaryDto customerContractGetCustomerContractRecurringSummaryBycontractId(String contractId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling customerContractGetCustomerContractRecurringSummaryBycontractId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("contractId", contractId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract/{contractId}/recurringSummary").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerContractRecurringSummaryDto> returnType = new ParameterizedTypeReference<CustomerContractRecurringSummaryDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Customer Contract Summary
     * 
     * <p><b>200</b> - OK
     * @param contractId Identifies the customer contract
     * @return CustomerContractSummaryDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerContractSummaryDto customerContractGetCustomerContractSummaryBycontractId(String contractId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling customerContractGetCustomerContractSummaryBycontractId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("contractId", contractId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract/{contractId}/summary").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CustomerContractSummaryDto> returnType = new ParameterizedTypeReference<CustomerContractSummaryDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific CustomerContract
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param customerContractId Identifies the CustomerContract to update
     * @param customerContract Defines the data for the CustomerContract to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object customerContractPutBycustomerContractId(String customerContractId, CustomerContractUpdateDto customerContract) throws RestClientException {
        Object postBody = customerContract;
        
        // verify the required parameter 'customerContractId' is set
        if (customerContractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerContractId' when calling customerContractPutBycustomerContractId");
        }
        
        // verify the required parameter 'customerContract' is set
        if (customerContract == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerContract' when calling customerContractPutBycustomerContractId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerContractId", customerContractId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/customerContract/{customerContractId}").buildAndExpand(uriVariables).toUriString();
        
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
