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

import no.systema.visma.v1client.model.ContextInformation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Ignore
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    
    /**
     * Get the companies available for this token.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailableUserContextsTest() {
        String authorization = null;
        List<ContextInformation> response = api.getAvailableUserContexts(authorization);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeSecurityTokenTest() {
        String authorization = null;
        api.revokeSecurityToken(authorization);

        // TODO: test validations
    }
    
    /**
     * Test connection
     *
     * Returns \&quot;OK\&quot; as plain text if the test connection succeded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testConnectionTest() {
        String response = api.testConnection();

        // TODO: test validations
    }
    
}
