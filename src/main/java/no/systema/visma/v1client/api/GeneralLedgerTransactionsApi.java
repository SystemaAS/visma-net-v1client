package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.GeneralLedgerTransactionDetailsDto;

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
@Component("no.systema.visma.v1client.api.GeneralLedgerTransactionsApi")
public class GeneralLedgerTransactionsApi {
    private ApiClient apiClient;

    public GeneralLedgerTransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GeneralLedgerTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of General Ledger Transactions
     * 
     * <p><b>200</b> - OK
     * @param branch The branch parameter
     * @param ledger Mandatory
     * @param fromPeriod Mandatory
     * @param toPeriod Mandatory
     * @param account The account parameter
     * @param subaccountId The subaccountId parameter
     * @param fromDate The fromDate parameter
     * @param toDate The toDate parameter
     * @param includeUnposted The includeUnposted parameter
     * @param includeUnreleased The includeUnreleased parameter
     * @param skipRecords The skipRecords parameter
     * @param numberToRead The numberToRead parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;GeneralLedgerTransactionDetailsDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GeneralLedgerTransactionDetailsDto> generalLedgerTransactionsGetAll(String branch, String ledger, String fromPeriod, String toPeriod, String account, String subaccountId, String fromDate, String toDate, Boolean includeUnposted, Boolean includeUnreleased, Integer skipRecords, Integer numberToRead, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/GeneralLedgerTransactions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "branch", branch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ledger", ledger));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromPeriod", fromPeriod));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toPeriod", toPeriod));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "account", account));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subaccountId", subaccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeUnposted", includeUnposted));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeUnreleased", includeUnreleased));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
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

        ParameterizedTypeReference<List<GeneralLedgerTransactionDetailsDto>> returnType = new ParameterizedTypeReference<List<GeneralLedgerTransactionDetailsDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
