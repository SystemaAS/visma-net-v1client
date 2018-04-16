package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.VatInformationDto;

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
@Component("no.systema.visma.v1client.api.VatApi")
public class VatApi {
    private ApiClient apiClient;

    public VatApi() {
        this(new ApiClient());
    }

    @Autowired
    public VatApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a range of Vats
     * 
     * <p><b>200</b> - OK
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @return List&lt;VatInformationDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<VatInformationDto> vatGetAllVats(Integer numberToRead, Integer skipRecords, String lastModifiedDateTime, String lastModifiedDateTimeCondition) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/vat").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<VatInformationDto>> returnType = new ParameterizedTypeReference<List<VatInformationDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Vat
     * 
     * <p><b>200</b> - OK
     * @param vatId Identifies the Vat
     * @return VatInformationDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VatInformationDto vatGetVatByvatId(String vatId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'vatId' is set
        if (vatId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vatId' when calling vatGetVatByvatId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vatId", vatId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/vat/{vatId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VatInformationDto> returnType = new ParameterizedTypeReference<VatInformationDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
