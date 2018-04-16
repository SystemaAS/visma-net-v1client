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

import no.systema.visma.v1client.model.CashSaleDto;
import no.systema.visma.v1client.model.CashSaleUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CashSaleApi
 */
@Ignore
public class CashSaleApiTest {

    private final CashSaleApi api = new CashSaleApi();

    
    /**
     * Get a range of Cash Sales
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cashSaleGetAllCashSalesTest() {
        String documentType = null;
        Integer released = null;
        Integer dunningLevel = null;
        String closedFinancialPeriod = null;
        String dunningLetterDateTime = null;
        String dunningLetterDateTimeCondition = null;
        String project = null;
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<CashSaleDto> response = api.cashSaleGetAllCashSales(documentType, released, dunningLevel, closedFinancialPeriod, dunningLetterDateTime, dunningLetterDateTimeCondition, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific Cash Sale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cashSaleGetBydocumentNumberTest() {
        String documentNumber = null;
        CashSaleDto response = api.cashSaleGetBydocumentNumber(documentNumber);

        // TODO: test validations
    }
    
    /**
     * Create a Cash Sale
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cashSalePostTest() {
        CashSaleUpdateDto cashSaleUpdateDto = null;
        Object response = api.cashSalePost(cashSaleUpdateDto);

        // TODO: test validations
    }
    
    /**
     * Update a specific Cash Sale
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cashSalePutBydocumentnumberTest() {
        String documentnumber = null;
        CashSaleUpdateDto cashSaleUpdateDto = null;
        Object response = api.cashSalePutBydocumentnumber(documentnumber, cashSaleUpdateDto);

        // TODO: test validations
    }
    
}
