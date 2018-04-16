package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.ExpenseReceiptDto;
import no.systema.visma.v1client.model.ExpenseReceiptUpdateDto;

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
@Component("no.systema.visma.v1client.api.ExpenseReceiptApi")
public class ExpenseReceiptApi {
    private ApiClient apiClient;

    public ExpenseReceiptApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExpenseReceiptApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Expense Receipts, a filter needs to be specified
     * 
     * <p><b>200</b> - OK
     * @param date The date parameter
     * @param dateCondition The dateCondition parameter
     * @param inventory The inventory parameter
     * @param project The project parameter
     * @param claimedBy The claimedBy parameter
     * @param projectTask The projectTask parameter
     * @param invoiceable The invoiceable parameter
     * @param status The status parameter
     * @param customer The customer parameter
     * @return List&lt;ExpenseReceiptDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ExpenseReceiptDto> expenseReceiptGetAll(String date, String dateCondition, String inventory, String project, String claimedBy, String projectTask, Boolean invoiceable, String status, String customer) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseReceipt").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateCondition", dateCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inventory", inventory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "project", project));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "claimedBy", claimedBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectTask", projectTask));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "invoiceable", invoiceable));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer", customer));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<ExpenseReceiptDto>> returnType = new ParameterizedTypeReference<List<ExpenseReceiptDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific ExpenseReceipt
     * 
     * <p><b>200</b> - OK
     * @param receiptNumber Identifies the ExpenseReceipt
     * @return ExpenseReceiptDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExpenseReceiptDto expenseReceiptGetByreceiptNumber(String receiptNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'receiptNumber' is set
        if (receiptNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receiptNumber' when calling expenseReceiptGetByreceiptNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("receiptNumber", receiptNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseReceipt/{receiptNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ExpenseReceiptDto> returnType = new ParameterizedTypeReference<ExpenseReceiptDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Expense Receipt
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param expenseReceiptUpdateDto Defines the data for the Expense Receipt to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object expenseReceiptPost(ExpenseReceiptUpdateDto expenseReceiptUpdateDto) throws RestClientException {
        Object postBody = expenseReceiptUpdateDto;
        
        // verify the required parameter 'expenseReceiptUpdateDto' is set
        if (expenseReceiptUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseReceiptUpdateDto' when calling expenseReceiptPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseReceipt").build().toUriString();
        
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
     * Update a Expense Receipt
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param receiptNumber 
     * @param expenseReceiptUpdateDto 
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object expenseReceiptPutByreceiptNumber(String receiptNumber, ExpenseReceiptUpdateDto expenseReceiptUpdateDto) throws RestClientException {
        Object postBody = expenseReceiptUpdateDto;
        
        // verify the required parameter 'receiptNumber' is set
        if (receiptNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'receiptNumber' when calling expenseReceiptPutByreceiptNumber");
        }
        
        // verify the required parameter 'expenseReceiptUpdateDto' is set
        if (expenseReceiptUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expenseReceiptUpdateDto' when calling expenseReceiptPutByreceiptNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("receiptNumber", receiptNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/expenseReceipt/{receiptNumber}").buildAndExpand(uriVariables).toUriString();
        
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
