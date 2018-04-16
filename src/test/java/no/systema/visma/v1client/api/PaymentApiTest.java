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

import no.systema.visma.v1client.model.PaymentDto;
import no.systema.visma.v1client.model.PaymentUpdateDto;
import no.systema.visma.v1client.model.ReleasePaymentActionDto;
import no.systema.visma.v1client.model.ReleasePaymentActionResultDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentApi
 */
@Ignore
public class PaymentApiTest {

    private final PaymentApi api = new PaymentApi();

    
    /**
     * Create a Payment
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentCreatePaymentTest() {
        PaymentUpdateDto payment = null;
        Object response = api.paymentCreatePayment(payment);

        // TODO: test validations
    }
    
    /**
     * Get a range of Payments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentGetAllPaymentsTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<PaymentDto> response = api.paymentGetAllPayments(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific Payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentGetBypaymentNumberTest() {
        String paymentNumber = null;
        PaymentDto response = api.paymentGetBypaymentNumber(paymentNumber);

        // TODO: test validations
    }
    
    /**
     * Update a specific Payment
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentPutBypaymentNumberTest() {
        String paymentNumber = null;
        PaymentUpdateDto payment = null;
        Object response = api.paymentPutBypaymentNumber(paymentNumber, payment);

        // TODO: test validations
    }
    
    /**
     * Release payment operation
     *
     * The action result dto contains information about the result of running the action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void paymentReleasePaymentBypaymentNumberTest() {
        String paymentNumber = null;
        ReleasePaymentActionDto releaseActionDto = null;
        ReleasePaymentActionResultDto response = api.paymentReleasePaymentBypaymentNumber(paymentNumber, releaseActionDto);

        // TODO: test validations
    }
    
}
