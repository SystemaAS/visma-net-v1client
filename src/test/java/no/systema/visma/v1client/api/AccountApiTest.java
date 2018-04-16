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

import no.systema.visma.v1client.model.AccountDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Gets a range of Accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountGetAllTest() {
        String greaterThanValue = null;
        Integer publicCode = null;
        String externalCode1 = null;
        String externalCode2 = null;
        String analysisCode = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        List<AccountDto> response = api.accountGetAll(greaterThanValue, publicCode, externalCode1, externalCode2, analysisCode, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);

        // TODO: test validations
    }
    
    /**
     * Get specific Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountGetByaccountCdTest() {
        String accountCd = null;
        AccountDto response = api.accountGetByaccountCd(accountCd);

        // TODO: test validations
    }
    
}