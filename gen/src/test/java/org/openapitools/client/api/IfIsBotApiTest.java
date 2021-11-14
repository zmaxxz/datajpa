/*
 * Сервіс чатбота
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InfoDTO;
import org.openapitools.client.model.ProjectDTO;
import org.openapitools.client.model.ProjectStatDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IfIsBotApi
 */
@Ignore
public class IfIsBotApiTest {

    private final IfIsBotApi api = new IfIsBotApi();

    
    /**
     * Перевірка доступності API
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pingUsingGETTest() throws ApiException {
        api.pingUsingGET();

        // TODO: test validations
    }
    
    /**
     * Відображення переліку проектів
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectByFieldUsingGETTest() throws ApiException {
        Long creditorId = null;
        Long fieldId = null;
        String projectName = null;
        List<InfoDTO> response = api.projectByFieldUsingGET(creditorId, fieldId, projectName);

        // TODO: test validations
    }
    
    /**
     * Отримати список МФО
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectCreditorsUsingGETTest() throws ApiException {
        List<InfoDTO> response = api.projectCreditorsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Отримати список галузей проектів
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectFieldsUsingGETTest() throws ApiException {
        List<InfoDTO> response = api.projectFieldsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Відображення повної інформації про проект
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectInfoUsingGETTest() throws ApiException {
        Long projectId = null;
        ProjectDTO response = api.projectInfoUsingGET(projectId);

        // TODO: test validations
    }
    
    /**
     * Статистика по стадіям
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statisticUsingGETTest() throws ApiException {
        String statisticType = null;
        List<ProjectStatDTO> response = api.statisticUsingGET(statisticType);

        // TODO: test validations
    }
    
}
