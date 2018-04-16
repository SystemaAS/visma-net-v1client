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

import no.systema.visma.v1client.model.GeneralLedgerTransactionDetailsDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralLedgerTransactionsApi
 */
@Ignore
public class GeneralLedgerTransactionsApiTest {

    private final GeneralLedgerTransactionsApi api = new GeneralLedgerTransactionsApi();

    
    /**
     * Get a range of General Ledger Transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generalLedgerTransactionsGetAllTest() {
        String branch = null;
        String ledger = null;
        String fromPeriod = null;
        String toPeriod = null;
        String account = null;
        String subaccountId = null;
        String fromDate = null;
        String toDate = null;
        Boolean includeUnposted = null;
        Boolean includeUnreleased = null;
        Integer skipRecords = null;
        Integer numberToRead = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<GeneralLedgerTransactionDetailsDto> response = api.generalLedgerTransactionsGetAll(branch, ledger, fromPeriod, toPeriod, account, subaccountId, fromDate, toDate, includeUnposted, includeUnreleased, skipRecords, numberToRead, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
}
