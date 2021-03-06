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

import no.systema.visma.v1client.model.ContactDto;
import no.systema.visma.v1client.model.ContactUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactApi
 */
@Ignore
public class ContactApiTest {

    private final ContactApi api = new ContactApi();

    
    /**
     * Create a Contact
     *
     * Response Message has StatusCode Created if POST operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactCreateContactTest() {
        ContactUpdateDto contact = null;
        Object response = api.contactCreateContact(contact);

        // TODO: test validations
    }
    
    /**
     * Get a range of Contacts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactGetAllContactsTest() {
        String greaterThanValue = null;
        Integer numberToRead = null;
        Integer skipRecords = null;
        String orderBy = null;
        String lastModifiedDateTime = null;
        String lastModifiedDateTimeCondition = null;
        List<ContactDto> response = api.contactGetAllContacts(greaterThanValue, numberToRead, skipRecords, orderBy, lastModifiedDateTime, lastModifiedDateTimeCondition);

        // TODO: test validations
    }
    
    /**
     * Get a specific Contact
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactGetBycontactIdTest() {
        Integer contactId = null;
        ContactDto response = api.contactGetBycontactId(contactId);

        // TODO: test validations
    }
    
    /**
     * Update a specific Contact
     *
     * Response Message has StatusCode NoContent if PUT operation succeed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contactPutBycontactIdTest() {
        Integer contactId = null;
        ContactUpdateDto contact = null;
        Object response = api.contactPutBycontactId(contactId, contact);

        // TODO: test validations
    }
    
}
