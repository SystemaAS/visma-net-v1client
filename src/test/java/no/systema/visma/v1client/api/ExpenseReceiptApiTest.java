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

import no.systema.visma.v1client.model.ExpenseReceiptDto;
import no.systema.visma.v1client.model.ExpenseReceiptUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExpenseReceiptApi
 */
@Ignore
public class ExpenseReceiptApiTest {

    private final ExpenseReceiptApi api = new ExpenseReceiptApi();

    
    /**
     * Get a range of Expense Receipts, a filter needs to be specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseReceiptGetAllTest() {
        String date = null;
        String dateCondition = null;
        String inventory = null;
        String project = null;
        String claimedBy = null;
        String projectTask = null;
        Boolean invoiceable = null;
        String status = null;
        String customer = null;
        List<ExpenseReceiptDto> response = api.expenseReceiptGetAll(date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer);

        // TODO: test validations
    }
    
    /**
     * Get a specific ExpenseReceipt
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseReceiptGetByreceiptNumberTest() {
        String receiptNumber = null;
        ExpenseReceiptDto response = api.expenseReceiptGetByreceiptNumber(receiptNumber);

        // TODO: test validations
    }
    
    /**
     * Create a Expense Receipt
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseReceiptPostTest() {
        ExpenseReceiptUpdateDto expenseReceiptUpdateDto = null;
        Object response = api.expenseReceiptPost(expenseReceiptUpdateDto);

        // TODO: test validations
    }
    
    /**
     * Update a Expense Receipt
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseReceiptPutByreceiptNumberTest() {
        String receiptNumber = null;
        ExpenseReceiptUpdateDto expenseReceiptUpdateDto = null;
        Object response = api.expenseReceiptPutByreceiptNumber(receiptNumber, expenseReceiptUpdateDto);

        // TODO: test validations
    }
    
}
