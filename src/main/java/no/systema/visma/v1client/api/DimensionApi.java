package no.systema.visma.v1client.api;

import no.systema.visma.v1client.ApiClient;

import no.systema.visma.v1client.model.DtoDimension;
import no.systema.visma.v1client.model.DtoSegment;
import no.systema.visma.v1client.model.DtoSegmentUpdateDto;
import no.systema.visma.v1client.model.DtoSegmentValue;
import java.util.UUID;

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
@Component("no.systema.visma.v1client.api.DimensionApi")
public class DimensionApi {
    private ApiClient apiClient;

    public DimensionApi() {
        this(new ApiClient());
    }

    @Autowired
    public DimensionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a specific Dimension
     * 
     * <p><b>200</b> - OK
     * @param dimensionId 
     * @param greaterThanValue The greaterThanValue parameter
     * @param numberToRead The numberToRead parameter
     * @param skipRecords The skipRecords parameter
     * @param orderBy The orderBy parameter
     * @param lastModifiedDateTime The lastModifiedDateTime parameter
     * @param lastModifiedDateTimeCondition The lastModifiedDateTimeCondition parameter
     * @param expandSegmentsValues Flag can be used to return data without the segment values.
     * @return DtoDimension
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DtoDimension dimensionGetDimensionBydimensionId(String dimensionId, String greaterThanValue, Integer numberToRead, Integer skipRecords, String orderBy, String lastModifiedDateTime, String lastModifiedDateTimeCondition, Boolean expandSegmentsValues) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dimensionId' is set
        if (dimensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimensionId' when calling dimensionGetDimensionBydimensionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimensionId", dimensionId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension/{dimensionId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "greaterThanValue", greaterThanValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "numberToRead", numberToRead));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipRecords", skipRecords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderBy", orderBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTime", lastModifiedDateTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastModifiedDateTimeCondition", lastModifiedDateTimeCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expandSegmentsValues", expandSegmentsValues));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ipp-application-type", "ipp-company-id", "vna_oauth" };

        ParameterizedTypeReference<DtoDimension> returnType = new ParameterizedTypeReference<DtoDimension>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of all Dimension names/IDs
     * 
     * <p><b>200</b> - OK
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> dimensionGetDimensionList() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension").build().toUriString();
        
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

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific Segment for a specific Dimension
     * 
     * <p><b>200</b> - OK
     * @param dimensionId Identifies the Dimension
     * @param segmentId Identifies the Segment
     * @return DtoSegment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DtoSegment dimensionGetSegmentBydimensionIdsegmentId(String dimensionId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dimensionId' is set
        if (dimensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimensionId' when calling dimensionGetSegmentBydimensionIdsegmentId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling dimensionGetSegmentBydimensionIdsegmentId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimensionId", dimensionId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension/{dimensionId}/{segmentId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DtoSegment> returnType = new ParameterizedTypeReference<DtoSegment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific SegmentValue for a specific Segment for a specific Dimension
     * 
     * <p><b>200</b> - OK
     * @param dimensionId Identifies the Dimension
     * @param segmentId Identifies the Segment
     * @param publicId Identifies the SegmentValue by its publicId
     * @return DtoSegmentValue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DtoSegmentValue dimensionGetSegmentValueBydimensionIdsegmentIdpublicId(String dimensionId, Integer segmentId, UUID publicId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dimensionId' is set
        if (dimensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimensionId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdpublicId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdpublicId");
        }
        
        // verify the required parameter 'publicId' is set
        if (publicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publicId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdpublicId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimensionId", dimensionId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("publicId", publicId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension/{dimensionId}/{segmentId}/publicid/{publicId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DtoSegmentValue> returnType = new ParameterizedTypeReference<DtoSegmentValue>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a specific SegmentValue for a specific Segment for a specific Dimension
     * 
     * <p><b>200</b> - OK
     * @param dimensionId Identifies the Dimension
     * @param segmentId Identifies the Segment
     * @param valueId Identifies the SegmentValue by Id. Must be Base64 encoded.
     * @return DtoSegmentValue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DtoSegmentValue dimensionGetSegmentValueBydimensionIdsegmentIdvalueId(String dimensionId, Integer segmentId, String valueId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dimensionId' is set
        if (dimensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimensionId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdvalueId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdvalueId");
        }
        
        // verify the required parameter 'valueId' is set
        if (valueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'valueId' when calling dimensionGetSegmentValueBydimensionIdsegmentIdvalueId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimensionId", dimensionId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("valueId", valueId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension/{dimensionId}/{segmentId}/{valueId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DtoSegmentValue> returnType = new ParameterizedTypeReference<DtoSegmentValue>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a Segment
     * Response Message has StatusCode NoContent if PUT operation succeed
     * <p><b>204</b> - NoContent
     * @param dimensionId Identifies the Dimension for which the Segment is defined
     * @param segmentId Identifies the Segment
     * @param update Defines the data for the Segment to update
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dimensionUpdateSegmentBydimensionIdsegmentId(String dimensionId, Integer segmentId, DtoSegmentUpdateDto update) throws RestClientException {
        Object postBody = update;
        
        // verify the required parameter 'dimensionId' is set
        if (dimensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimensionId' when calling dimensionUpdateSegmentBydimensionIdsegmentId");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling dimensionUpdateSegmentBydimensionIdsegmentId");
        }
        
        // verify the required parameter 'update' is set
        if (update == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'update' when calling dimensionUpdateSegmentBydimensionIdsegmentId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimensionId", dimensionId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/controller/api/v1/dimension/{dimensionId}/{segmentId}").buildAndExpand(uriVariables).toUriString();
        
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
