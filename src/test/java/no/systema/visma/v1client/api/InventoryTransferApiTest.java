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

import no.systema.visma.v1client.model.InventoryTransferDto;
import no.systema.visma.v1client.model.InventoryTransferUpdateDto;
import no.systema.visma.v1client.model.ReleaseInventoryDocumentActionResultDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryTransferApi
 */
@Ignore
public class InventoryTransferApiTest {

    private final InventoryTransferApi api = new InventoryTransferApi();

    
    /**
     * Get a range of Inventory Transfers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryTransferGetAllTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<InventoryTransferDto> response = api.inventoryTransferGetAll(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific Inventory Transfer document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryTransferGetByinventoryTransferNumberTest() {
        String inventoryTransferNumber = null;
        InventoryTransferDto response = api.inventoryTransferGetByinventoryTransferNumber(inventoryTransferNumber);

        // TODO: test validations
    }
    
    /**
     * Create an inventory transfer
     *
     * Response Message has StatusCode Created if POST operation succed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryTransferPostTest() {
        InventoryTransferUpdateDto inventoryTransfer = null;
        Object response = api.inventoryTransferPost(inventoryTransfer);

        // TODO: test validations
    }
    
    /**
     * Update a specific inventory transfer
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryTransferPutBytransferRefNumberTest() {
        String transferRefNumber = null;
        InventoryTransferUpdateDto transfer = null;
        Object response = api.inventoryTransferPutBytransferRefNumber(transferRefNumber, transfer);

        // TODO: test validations
    }
    
    /**
     * Release inventory operation
     *
     * The action result dto contains information about the result of running the action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryTransferReleaseDocumentBytransferNumberTest() {
        String transferNumber = null;
        ReleaseInventoryDocumentActionResultDto response = api.inventoryTransferReleaseDocumentBytransferNumber(transferNumber);

        // TODO: test validations
    }
    
}
