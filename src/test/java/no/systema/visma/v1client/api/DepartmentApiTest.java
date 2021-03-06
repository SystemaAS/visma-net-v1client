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

import no.systema.visma.v1client.model.DepartmentDto;
import no.systema.visma.v1client.model.DepartmentUpdateBaseDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepartmentApi
 */
@Ignore
public class DepartmentApiTest {

    private final DepartmentApi api = new DepartmentApi();

    
    /**
     * Creates a department
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentCreateDepartmentTest() {
        DepartmentUpdateBaseDto departmentUpdateDto = null;
        Object response = api.departmentCreateDepartment(departmentUpdateDto);

        // TODO: test validations
    }
    
    /**
     * Get a range of department
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentGetAllDepartmentDtosTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        List<DepartmentDto> response = api.departmentGetAllDepartmentDtos(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);

        // TODO: test validations
    }
    
    /**
     * Get a specific department
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentGetDepartmentBydepartmentIdTest() {
        String departmentId = null;
        DepartmentDto response = api.departmentGetDepartmentBydepartmentId(departmentId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific department
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void departmentUpdateDepartmentBydepartmentIdTest() {
        String departmentId = null;
        DepartmentUpdateBaseDto departmentUpdateDto = null;
        Object response = api.departmentUpdateDepartmentBydepartmentId(departmentId, departmentUpdateDto);

        // TODO: test validations
    }
    
}
