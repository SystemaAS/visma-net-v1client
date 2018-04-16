package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.ReleaseSupplierInvoiceActionResultDto;
import no.systema.visma.v1client.model.SupplierInvoiceDto;
import no.systema.visma.v1client.model.SupplierInvoiceUpdateDto;

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
@Component("no.systema.visma.v1client.api.SupplierInvoiceApi")
public class SupplierInvoiceApi {
    private ApiClient apiClient;

    public SupplierInvoiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public SupplierInvoiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an attachment and associates it with a supplier invoice. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param invoiceNumber Identifies the supplier invoice
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object supplierInvoiceCreateHeaderAttachmentByinvoiceNumber(String invoiceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceNumber' when calling supplierInvoiceCreateHeaderAttachmentByinvoiceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invoiceNumber", invoiceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice/{invoiceNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates an attachment and associates it with a certain supplier invoice line. If the file already exists, a new revision is created.
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param invoiceNumber Identifies the supplier invoice
     * @param lineNumber Specifies line number
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(String invoiceNumber, Integer lineNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceNumber' when calling supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber");
        }
        
        // verify the required parameter 'lineNumber' is set
        if (lineNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lineNumber' when calling supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invoiceNumber", invoiceNumber);
        uriVariables.put("lineNumber", lineNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice/{invoiceNumber}/{lineNumber}/attachment").buildAndExpand(uriVariables).toUriString();
        
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
     * Get a range of Invoices
     * 
     * <p><b>200</b> - OK
     * @param documentType The documentType parameter
     * @param released The released parameter
     * @param project The project parameter
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;SupplierInvoiceDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SupplierInvoiceDto> supplierInvoiceGetAllInvoices(String documentType, Integer released, String project, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentType", documentType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "released", released));
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

        ParameterizedTypeReference<List<SupplierInvoiceDto>> returnType = new ParameterizedTypeReference<List<SupplierInvoiceDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Invoice
     * 
     * <p><b>200</b> - OK
     * @param invoiceNumber Identifies the Invoice
     * @return SupplierInvoiceDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SupplierInvoiceDto supplierInvoiceGetByinvoiceNumber(String invoiceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceNumber' when calling supplierInvoiceGetByinvoiceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invoiceNumber", invoiceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice/{invoiceNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SupplierInvoiceDto> returnType = new ParameterizedTypeReference<SupplierInvoiceDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an SupplierInvoice
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param supplierInvoice Defines the data for the SupplierInvoice to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object supplierInvoicePost(SupplierInvoiceUpdateDto supplierInvoice) throws RestClientException {
        Object postBody = supplierInvoice;
        
        // verify the required parameter 'supplierInvoice' is set
        if (supplierInvoice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'supplierInvoice' when calling supplierInvoicePost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice").build().toUriString();
        
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
     * Update a specific SupplierInvoice
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param supplierInvoiceNumber Identifies the SupplierInvoice to update
     * @param supplierInvoice Defines the data for the Invoice to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object supplierInvoicePutBysupplierInvoiceNumber(String supplierInvoiceNumber, SupplierInvoiceUpdateDto supplierInvoice) throws RestClientException {
        Object postBody = supplierInvoice;
        
        // verify the required parameter 'supplierInvoiceNumber' is set
        if (supplierInvoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'supplierInvoiceNumber' when calling supplierInvoicePutBysupplierInvoiceNumber");
        }
        
        // verify the required parameter 'supplierInvoice' is set
        if (supplierInvoice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'supplierInvoice' when calling supplierInvoicePutBysupplierInvoiceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("supplierInvoiceNumber", supplierInvoiceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice/{supplierInvoiceNumber}").buildAndExpand(uriVariables).toUriString();
        
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
     * Release invoice operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param invoiceNumber Reference number of the released invoice to be reversed
     * @return ReleaseSupplierInvoiceActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReleaseSupplierInvoiceActionResultDto supplierInvoiceReleaseInvoiceByinvoiceNumber(String invoiceNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoiceNumber' when calling supplierInvoiceReleaseInvoiceByinvoiceNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invoiceNumber", invoiceNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/supplierInvoice/{invoiceNumber}/action/release").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReleaseSupplierInvoiceActionResultDto> returnType = new ParameterizedTypeReference<ReleaseSupplierInvoiceActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
