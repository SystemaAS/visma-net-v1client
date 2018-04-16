/*
 * Visma Net API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.13.03.0008
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package no.systema.visma.v1client.api;

import no.systema.visma.v1client.model.ContractTemplateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractTemplateApi
 */
@Ignore
public class ContractTemplateApiTest {

    private final ContractTemplateApi api = new ContractTemplateApi();

    
    /**
     * Get a range of Contract Templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contractTemplateGetAllTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Boolean expandAttributes = null;
        List<ContractTemplateDto> response = api.contractTemplateGetAll(greaterThanValue, numberToRead, skipRecords, lastModifiedDateTime, lastModifiedDateTimeCondition, expandAttributes);

        // TODO: test validations
    }
    
}