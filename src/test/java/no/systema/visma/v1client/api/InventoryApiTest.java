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

import no.systema.visma.v1client.model.InventoryDto;
import no.systema.visma.v1client.model.InventoryUpdateDto;
import no.systema.visma.v1client.model.ItemClassDto;
import no.systema.visma.v1client.model.PostingClassDto;
import no.systema.visma.v1client.model.UpdateCostActionResultDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryApi
 */
@Ignore
public class InventoryApiTest {

    private final InventoryApi api = new InventoryApi();

    
    /**
     * Get a range of Inventory items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryGetAllTest() {
        String alternateID = null;
        Integer salesCategory = null;
        Boolean addCostPriceStatistics = null;
        String attributes = null;
        String description = null;
        String availabilityLastModifiedDateTime = null;
        String availabilityLastModifiedDateTimeCondition = null;
        Boolean expandCrossReference = null;
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        List<InventoryDto> response = api.inventoryGetAll(alternateID, salesCategory, addCostPriceStatistics, attributes, description, availabilityLastModifiedDateTime, availabilityLastModifiedDateTimeCondition, expandCrossReference, greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition, pageNumber, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a specific Inventory item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryGetByinventoryNumberTest() {
        String inventoryNumber = null;
        InventoryDto response = api.inventoryGetByinventoryNumber(inventoryNumber);

        // TODO: test validations
    }
    
    /**
     * Get Inventory Item Classes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryGetItemClassesTest() {
        List<ItemClassDto> response = api.inventoryGetItemClasses();

        // TODO: test validations
    }
    
    /**
     * Get Inventory Item Post Classes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryGetItemPostClassesTest() {
        List<PostingClassDto> response = api.inventoryGetItemPostClasses();

        // TODO: test validations
    }
    
    /**
     * Get Specific Inventory Item Class
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryGetSpecificItemClassByitemClassNumberTest() {
        String itemClassNumber = null;
        ItemClassDto response = api.inventoryGetSpecificItemClassByitemClassNumber(itemClassNumber);

        // TODO: test validations
    }
    
    /**
     * Create an inventory item
     *
     * Response Message has StatusCode Created if POST operation succed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryPostTest() {
        InventoryUpdateDto inventory = null;
        Object response = api.inventoryPost(inventory);

        // TODO: test validations
    }
    
    /**
     * Update a specific inventory item
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryPutByinventoryNumberTest() {
        String inventoryNumber = null;
        InventoryUpdateDto inventory = null;
        Object response = api.inventoryPutByinventoryNumber(inventoryNumber, inventory);

        // TODO: test validations
    }
    
    /**
     * Update Cost action on Non-Stock Item
     *
     * The action result dto contains information about the result of running the action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inventoryUpdateCostNonStockItemByinventoryCdTest() {
        String inventoryCd = null;
        UpdateCostActionResultDto response = api.inventoryUpdateCostNonStockItemByinventoryCd(inventoryCd);

        // TODO: test validations
    }
    
}
