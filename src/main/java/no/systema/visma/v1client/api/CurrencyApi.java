package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.CurrencyDto;

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
@Component("no.systema.visma.v1client.api.CurrencyApi")
public class CurrencyApi {
    private ApiClient apiClient;

    public CurrencyApi() {
        this(new ApiClient());
    }

    @Autowired
    public CurrencyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Gets all available Currencies
     * 
     * <p><b>200</b> - OK
     * @return List&lt;CurrencyDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CurrencyDto> currencyGetAllCurrencies() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/currency").build().toUriString();
        
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

        ParameterizedTypeReference<List<CurrencyDto>> returnType = new ParameterizedTypeReference<List<CurrencyDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Currency
     * 
     * <p><b>200</b> - OK
     * @param curyId 
     * @return CurrencyDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyDto currencyGetSpecificCurrencyBycuryId(String curyId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'curyId' is set
        if (curyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'curyId' when calling currencyGetSpecificCurrencyBycuryId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("curyId", curyId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/currency/{curyId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CurrencyDto> returnType = new ParameterizedTypeReference<CurrencyDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
