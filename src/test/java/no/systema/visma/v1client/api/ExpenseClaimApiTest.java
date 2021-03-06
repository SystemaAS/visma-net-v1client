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

import no.systema.visma.v1client.model.ExpenseClaimDto;
import no.systema.visma.v1client.model.ExpenseClaimUpdateDto;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExpenseClaimApi
 */
@Ignore
public class ExpenseClaimApiTest {

    private final ExpenseClaimApi api = new ExpenseClaimApi();

    
    /**
     * Create an ExpenseClaim
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseClaimCreateExpenseClaimTest() {
        ExpenseClaimUpdateDto expenseClaim = null;
        Object response = api.expenseClaimCreateExpenseClaim(expenseClaim);

        // TODO: test validations
    }
    
    /**
     * Get a range of Expense Claims, a filter needs to be specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseClaimGetAllTest() {
        String status = null;
        LocalDateTime date = null;
        String customer = null;
        String departmentId = null;
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        List<ExpenseClaimDto> response = api.expenseClaimGetAll(status, date, customer, departmentId, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);

        // TODO: test validations
    }
    
    /**
     * Get a specific Expense Claim
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseClaimGetExpenseClaimByexpenseClaimCdTest() {
        String expenseClaimCd = null;
        ExpenseClaimDto response = api.expenseClaimGetExpenseClaimByexpenseClaimCd(expenseClaimCd);

        // TODO: test validations
    }
    
    /**
     * Update a specific ExpenseClaim
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void expenseClaimPutByexpenseClaimNbrTest() {
        String expenseClaimNbr = null;
        ExpenseClaimUpdateDto expenseClaim = null;
        Object response = api.expenseClaimPutByexpenseClaimNbr(expenseClaimNbr, expenseClaim);

        // TODO: test validations
    }
    
}
