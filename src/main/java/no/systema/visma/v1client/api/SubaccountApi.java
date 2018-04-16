package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.SubAccountDto;
import no.systema.visma.v1client.model.SubAccountUpdateDto;

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
@Component("no.systema.visma.v1client.api.SubaccountApi")
public class SubaccountApi {
    private ApiClient apiClient;

    public SubaccountApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubaccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all SubAccounts
     * 
     * <p><b>200</b> - OK
     * @return List&lt;SubAccountDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SubAccountDto> subaccountGetAllSubaccounts() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/subaccount").build().toUriString();
        
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

        ParameterizedTypeReference<List<SubAccountDto>> returnType = new ParameterizedTypeReference<List<SubAccountDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific SubAccount
     * Data for SubAccount
     * <p><b>200</b> - OK
     * @param subAccountId Identifies the SubAccount
     * @return SubAccountDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubAccountDto subaccountGetSubaccountBysubAccountId(String subAccountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'subAccountId' is set
        if (subAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subAccountId' when calling subaccountGetSubaccountBysubAccountId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subAccountId", subAccountId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/subaccount/{subAccountId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SubAccountDto> returnType = new ParameterizedTypeReference<SubAccountDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Subaccount
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param subAccountUpdateDto Defines the data for Subaccount to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object subaccountPost(SubAccountUpdateDto subAccountUpdateDto) throws RestClientException {
        Object postBody = subAccountUpdateDto;
        
        // verify the required parameter 'subAccountUpdateDto' is set
        if (subAccountUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subAccountUpdateDto' when calling subaccountPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/subaccount").build().toUriString();
        
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
     * Update a specific Subaccount
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param subAccountId Identifies the Subaccount to update
     * @param subAccountUpdateDto Defines the data for the Subaccount to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object subaccountPutBysubAccountId(String subAccountId, SubAccountUpdateDto subAccountUpdateDto) throws RestClientException {
        Object postBody = subAccountUpdateDto;
        
        // verify the required parameter 'subAccountId' is set
        if (subAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subAccountId' when calling subaccountPutBysubAccountId");
        }
        
        // verify the required parameter 'subAccountUpdateDto' is set
        if (subAccountUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subAccountUpdateDto' when calling subaccountPutBysubAccountId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subAccountId", subAccountId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/subaccount/{subAccountId}").buildAndExpand(uriVariables).toUriString();
        
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
