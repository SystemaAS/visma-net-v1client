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

import no.systema.visma.v1client.model.StocktakeDto;
import no.systema.visma.v1client.model.StocktakeUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StocktakeApi
 */
@Ignore
public class StocktakeApiTest {

    private final StocktakeApi api = new StocktakeApi();

    
    /**
     * Get a range of stocktakes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stocktakeGetAllStocktakesTest() {
        String warehouse = null;
        String location = null;
        String inventory = null;
        String lotSerialNumber = null;
        String summaryStatus = null;
        Integer numberToRead = null;
        Integer startWithLine = null;
        Integer endWithLine = null;
        String freezeDateTime = null;
        String freezeDateTimeCondition = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        String expirationDateTime = null;
        String expirationDateTimeCondition = null;
        String status = null;
        Integer skipRecords = null;
        List<StocktakeDto> response = api.stocktakeGetAllStocktakes(warehouse, location, inventory, lotSerialNumber, summaryStatus, numberToRead, startWithLine, endWithLine, freezeDateTime, freezeDateTimeCondition, lastModifiedDateTime, lastModifiedDateTimeCondition, expirationDateTime, expirationDateTimeCondition, status, skipRecords);

        // TODO: test validations
    }
    
    /**
     * Get a specific
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stocktakeGetByreferenceNumberTest() {
        String referenceNumber = null;
        StocktakeDto response = api.stocktakeGetByreferenceNumber(referenceNumber);

        // TODO: test validations
    }
    
    /**
     * Update a specific stocktake
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stocktakePutByreferenceNumberTest() {
        String referenceNumber = null;
        StocktakeUpdateDto stocktake = null;
        Object response = api.stocktakePutByreferenceNumber(referenceNumber, stocktake);

        // TODO: test validations
    }
    
}
