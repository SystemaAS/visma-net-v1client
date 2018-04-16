package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.ExpenseClaimDto;
import no.systema.visma.v1client.model.ExpenseClaimUpdateDto;
import java.time.LocalDateTime;

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
@Component("no.systema.visma.v1client.api.ExpenseClaimApi")
public class ExpenseClaimApi {
    private ApiClient apiClient;

    public ExpenseClaimApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExpenseClaimApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an ExpenseClaim
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param expenseClaim Defines the data for the ExpenseClaim to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object expenseClaimCreateExpenseClaim(ExpenseClaimUpdateDto expenseClaim) throws RestClientException {
        Object postBody = expenseClaim;
        
        // verify the required parameter 'expenseClaim' is set
        if (expenseClaim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseClaim' when calling expenseClaimCreateExpenseClaim");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseClaim").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a range of Expense Claims, a filter needs to be specified
     * 
     * <p><b>200</b> - OK
     * @param status The status parameter
     * @param date The date parameter
     * @param customer The customer parameter
     * @param departmentId The departmentId parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @return List&lt;ExpenseClaimDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ExpenseClaimDto> expenseClaimGetAll(String status, LocalDateTime date, String customer, String departmentId, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseClaim").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer", customer));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departmentId", departmentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<ExpenseClaimDto>> returnType = new ParameterizedTypeReference<List<ExpenseClaimDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Expense Claim
     * 
     * <p><b>200</b> - OK
     * @param expenseClaimCd Identifies the expense claim
     * @return ExpenseClaimDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExpenseClaimDto expenseClaimGetExpenseClaimByexpenseClaimCd(String expenseClaimCd) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'expenseClaimCd' is set
        if (expenseClaimCd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseClaimCd' when calling expenseClaimGetExpenseClaimByexpenseClaimCd");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("expenseClaimCd", expenseClaimCd);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseClaim/{expenseClaimCd}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ExpenseClaimDto> returnType = new ParameterizedTypeReference<ExpenseClaimDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific ExpenseClaim
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param expenseClaimNbr Identifies the ExpenseClaim to update
     * @param expenseClaim Defines the data for the ExpenseClaim to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object expenseClaimPutByexpenseClaimNbr(String expenseClaimNbr, ExpenseClaimUpdateDto expenseClaim) throws RestClientException {
        Object postBody = expenseClaim;
        
        // verify the required parameter 'expenseClaimNbr' is set
        if (expenseClaimNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseClaimNbr' when calling expenseClaimPutByexpenseClaimNbr");
        }
        
        // verify the required parameter 'expenseClaim' is set
        if (expenseClaim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseClaim' when calling expenseClaimPutByexpenseClaimNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("expenseClaimNbr", expenseClaimNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseClaim/{expenseClaimNbr}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "text/json", "application/x-www-form-urlencoded"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
