package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.GeneralLedgerBalanceDto;

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
@Component("no.systema.visma.v1client.api.GeneralLedgerBalanceApi")
public class GeneralLedgerBalanceApi {
    private ApiClient apiClient;

    public GeneralLedgerBalanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public GeneralLedgerBalanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of General Ledger Balances
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param periodId The periodId parameter
     * @param periodIdCondition The periodIdCondition parameter
     * @param orderBy Order Options: AccountId, FinancialPeriod
     * @param accountId The accountId parameter
     * @param yearClosed The yearClosed parameter
     * @param balanceType The balanceType parameter
     * @param toggleBalanceSigns Parameter can be used in order to change the balance sign for liability accounts and expense accounts, in order to match the UI
     * @param pageNumber The pageNumber parameter
     * @param pageSize The pageSize parameter
     * @return List&lt;GeneralLedgerBalanceDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GeneralLedgerBalanceDto> generalLedgerBalanceGetAll(String greaterThanValue, Integer numberToRead, Integer skipRecords, String periodId, String periodIdCondition, String orderBy, String accountId, Integer yearClosed, String balanceType, Integer toggleBalanceSigns, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/generalLedgerBalance").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "periodId", periodId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "periodIdCondition", periodIdCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountId", accountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "yearClosed", yearClosed));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "balanceType", balanceType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toggleBalanceSigns", toggleBalanceSigns));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<GeneralLedgerBalanceDto>> returnType = new ParameterizedTypeReference<List<GeneralLedgerBalanceDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
