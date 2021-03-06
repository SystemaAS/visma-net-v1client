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

import no.systema.visma.v1client.model.PaymentMethodDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodApi
 */
@Ignore
public class PaymentMethodApiTest {

    private final PaymentMethodApi api = new PaymentMethodApi();

    
    /**
     * Get a range of Payment Method
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentMethodGetAllPaymentMethodTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        List<PaymentMethodDto> response = api.paymentMethodGetAllPaymentMethod(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);

        // TODO: test validations
    }
    
    /**
     * Get a specific Payment Method
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentMethodGetBypaymentMethodNumberTest() {
        String paymentMethodNumber = null;
        PaymentMethodDto response = api.paymentMethodGetBypaymentMethodNumber(paymentMethodNumber);

        // TODO: test validations
    }
    
}
