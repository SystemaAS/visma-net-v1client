package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CashSaleDto;
import no.systema.visma.v1client.model.CashSaleUpdateDto;

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
@Component("no.systema.visma.v1client.api.CashSaleApi")
public class CashSaleApi {
    private ApiClient apiClient;

    public CashSaleApi() {
        this(new ApiClient());
    }

    @Autowired
    public CashSaleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Cash Sales
     * 
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
     * @return List&lt;CashSaleDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CashSaleDto> cashSaleGetAllCashSales(String documentType, Integer released, Integer dunningLevel, String closedFinancialPeriod, String dunningLetterDateTime, String dunningLetterDateTimeCondition, String project, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashsale").build().toUriString();
        
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

        ParameterizedTypeReference<List<CashSaleDto>> returnType = new ParameterizedTypeReference<List<CashSaleDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Cash Sale
     * 
     * <p><b>200</b> - OK
     * @param documentNumber Identifies the Cash Sale Document
     * @return CashSaleDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CashSaleDto cashSaleGetBydocumentNumber(String documentNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling cashSaleGetBydocumentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentNumber", documentNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashsale/{documentNumber}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CashSaleDto> returnType = new ParameterizedTypeReference<CashSaleDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a Cash Sale
     * Response Message has StatusCode Created if POST operation succeed
     * <p><b>201</b> - Created
     * @param cashSaleUpdateDto Defines the data for the Cash Sale to create
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashSalePost(CashSaleUpdateDto cashSaleUpdateDto) throws RestClientException {
        Object postBody = cashSaleUpdateDto;
        
        // verify the required parameter 'cashSaleUpdateDto' is set
        if (cashSaleUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashSaleUpdateDto' when calling cashSalePost");
        }
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashsale").build().toUriString();
        
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
     * Update a specific Cash Sale
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param documentnumber Identifies the Cash Sale to update
     * @param cashSaleUpdateDto Defines the data for the Cash Sale to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashSalePutBydocumentnumber(String documentnumber, CashSaleUpdateDto cashSaleUpdateDto) throws RestClientException {
        Object postBody = cashSaleUpdateDto;
        
        // verify the required parameter 'documentnumber' is set
        if (documentnumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentnumber' when calling cashSalePutBydocumentnumber");
        }
        
        // verify the required parameter 'cashSaleUpdateDto' is set
        if (cashSaleUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashSaleUpdateDto' when calling cashSalePutBydocumentnumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentnumber", documentnumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/cashsale/{documentnumber}").buildAndExpand(uriVariables).toUriString();
        
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
