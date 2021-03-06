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

import no.systema.visma.v1client.model.ReleaseSupplierInvoiceActionResultDto;
import no.systema.visma.v1client.model.SupplierInvoiceDto;
import no.systema.visma.v1client.model.SupplierInvoiceUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupplierInvoiceApi
 */
@Ignore
public class SupplierInvoiceApiTest {

    private final SupplierInvoiceApi api = new SupplierInvoiceApi();

    
    /**
     * Creates an attachment and associates it with a supplier invoice. If the file already exists, a new revision is created.
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoiceCreateHeaderAttachmentByinvoiceNumberTest() {
        String invoiceNumber = null;
        Object response = api.supplierInvoiceCreateHeaderAttachmentByinvoiceNumber(invoiceNumber);

        // TODO: test validations
    }
    
    /**
     * Creates an attachment and associates it with a certain supplier invoice line. If the file already exists, a new revision is created.
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumberTest() {
        String invoiceNumber = null;
        Integer lineNumber = null;
        Object response = api.supplierInvoiceCreateLineAttachmentByinvoiceNumberlineNumber(invoiceNumber, lineNumber);

        // TODO: test validations
    }
    
    /**
     * Get a range of Invoices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoiceGetAllInvoicesTest() {
        String documentType = null;
        Integer released = null;
        String project = null;
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<SupplierInvoiceDto> response = api.supplierInvoiceGetAllInvoices(documentType, released, project, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific Invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoiceGetByinvoiceNumberTest() {
        String invoiceNumber = null;
        SupplierInvoiceDto response = api.supplierInvoiceGetByinvoiceNumber(invoiceNumber);

        // TODO: test validations
    }
    
    /**
     * Create an SupplierInvoice
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoicePostTest() {
        SupplierInvoiceUpdateDto supplierInvoice = null;
        Object response = api.supplierInvoicePost(supplierInvoice);

        // TODO: test validations
    }
    
    /**
     * Update a specific SupplierInvoice
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoicePutBysupplierInvoiceNumberTest() {
        String supplierInvoiceNumber = null;
        SupplierInvoiceUpdateDto supplierInvoice = null;
        Object response = api.supplierInvoicePutBysupplierInvoiceNumber(supplierInvoiceNumber, supplierInvoice);

        // TODO: test validations
    }
    
    /**
     * Release invoice operation
     *
     * The action result dto contains information about the result of running the action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void supplierInvoiceReleaseInvoiceByinvoiceNumberTest() {
        String invoiceNumber = null;
        ReleaseSupplierInvoiceActionResultDto response = api.supplierInvoiceReleaseInvoiceByinvoiceNumber(invoiceNumber);

        // TODO: test validations
    }
    
}
