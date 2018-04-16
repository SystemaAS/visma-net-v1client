package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.ConfirmShipmentActionResultDto;
import no.systema.visma.v1client.model.ShipmentDto;
import no.systema.visma.v1client.model.ShipmentUpdateDto;

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
@Component("no.systema.visma.v1client.api.ShipmentApi")
public class ShipmentApi {
    private ApiClient apiClient;

    public ShipmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ShipmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Confirm shipment operation
     * The action result dto contains information about the result of running the action
     * <p><b>200</b> - OK
     * @param shipmentNumber Reference number of the shipment to be confirmed
     * @return ConfirmShipmentActionResultDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConfirmShipmentActionResultDto shipmentConfirmShipmentByshipmentNumber(String shipmentNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'shipmentNumber' is set
        if (shipmentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentNumber' when calling shipmentConfirmShipmentByshipmentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentNumber", shipmentNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment/{shipmentNumber}/action/confirmShipment").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ConfirmShipmentActionResultDto> returnType = new ParameterizedTypeReference<ConfirmShipmentActionResultDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a range of SO Shipments
     * 
     * <p><b>200</b> - OK
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param status The status parameter
     * @return List&lt;ShipmentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ShipmentDto> shipmentGetAllShipments(String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, String status) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<List<ShipmentDto>> returnType = new ParameterizedTypeReference<List<ShipmentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Shipment
     * 
     * <p><b>200</b> - OK
     * @param shipmentNbr Identifies the Shipment
     * @return ShipmentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ShipmentDto shipmentGetByshipmentNbr(String shipmentNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'shipmentNbr' is set
        if (shipmentNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentNbr' when calling shipmentGetByshipmentNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentNbr", shipmentNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment/{shipmentNbr}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ShipmentDto> returnType = new ParameterizedTypeReference<ShipmentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the pick list report
     * 
     * <p><b>200</b> - OK
     * @param shipmentNbr Identifies the shipment
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object shipmentPrintPickListByshipmentNbr(String shipmentNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'shipmentNbr' is set
        if (shipmentNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentNbr' when calling shipmentPrintPickListByshipmentNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentNbr", shipmentNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment/{shipmentNbr}/printPickList").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the shipment confirmation report
     * 
     * <p><b>200</b> - OK
     * @param shipmentNbr Identifies the shipment
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object shipmentPrintShipmentConfirmationByshipmentNbr(String shipmentNbr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'shipmentNbr' is set
        if (shipmentNbr == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentNbr' when calling shipmentPrintShipmentConfirmationByshipmentNbr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentNbr", shipmentNbr);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment/{shipmentNbr}/printShipmentConfirmation").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a specific Shipment
     * Response Message has StatusCode NoContent if PUT operation succeeded
     * <p><b>204</b> - NoContent
     * @param shipmentNumber Identifies the Shipment to update
     * @param shipmentUpdateDto Defines the data for the Shipment to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object shipmentPutByshipmentNumber(String shipmentNumber, ShipmentUpdateDto shipmentUpdateDto) throws RestClientException {
        Object postBody = shipmentUpdateDto;
        
        // verify the required parameter 'shipmentNumber' is set
        if (shipmentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentNumber' when calling shipmentPutByshipmentNumber");
        }
        
        // verify the required parameter 'shipmentUpdateDto' is set
        if (shipmentUpdateDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipmentUpdateDto' when calling shipmentPutByshipmentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("shipmentNumber", shipmentNumber);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/shipment/{shipmentNumber}").buildAndExpand(uriVariables).toUriString();
        
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
