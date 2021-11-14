# IfIsBotApi

All URIs are relative to *http://chat-bot.openbudget.gov.ua*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pingUsingGET**](IfIsBotApi.md#pingUsingGET) | **GET** /ifis/ping | Перевірка доступності API
[**projectByFieldUsingGET**](IfIsBotApi.md#projectByFieldUsingGET) | **GET** /ifis/projects | Відображення переліку проектів
[**projectCreditorsUsingGET**](IfIsBotApi.md#projectCreditorsUsingGET) | **GET** /ifis/creditors | Отримати список МФО
[**projectFieldsUsingGET**](IfIsBotApi.md#projectFieldsUsingGET) | **GET** /ifis/fields | Отримати список галузей проектів
[**projectInfoUsingGET**](IfIsBotApi.md#projectInfoUsingGET) | **GET** /ifis/project/{projectId} | Відображення повної інформації про проект
[**statisticUsingGET**](IfIsBotApi.md#statisticUsingGET) | **GET** /ifis/statistic/{statisticType} | Статистика по стадіям


<a name="pingUsingGET"></a>
# **pingUsingGET**
> pingUsingGET()

Перевірка доступності API

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    try {
      apiInstance.pingUsingGET();
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#pingUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="projectByFieldUsingGET"></a>
# **projectByFieldUsingGET**
> List&lt;InfoDTO&gt; projectByFieldUsingGET(creditorId, fieldId, projectName)

Відображення переліку проектів

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    Long creditorId = 56L; // Long | creditorId
    Long fieldId = 56L; // Long | fieldId
    String projectName = "projectName_example"; // String | projectName
    try {
      List<InfoDTO> result = apiInstance.projectByFieldUsingGET(creditorId, fieldId, projectName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#projectByFieldUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditorId** | **Long**| creditorId | [optional]
 **fieldId** | **Long**| fieldId | [optional]
 **projectName** | **String**| projectName | [optional]

### Return type

[**List&lt;InfoDTO&gt;**](InfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="projectCreditorsUsingGET"></a>
# **projectCreditorsUsingGET**
> List&lt;InfoDTO&gt; projectCreditorsUsingGET()

Отримати список МФО

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    try {
      List<InfoDTO> result = apiInstance.projectCreditorsUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#projectCreditorsUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InfoDTO&gt;**](InfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="projectFieldsUsingGET"></a>
# **projectFieldsUsingGET**
> List&lt;InfoDTO&gt; projectFieldsUsingGET()

Отримати список галузей проектів

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    try {
      List<InfoDTO> result = apiInstance.projectFieldsUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#projectFieldsUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InfoDTO&gt;**](InfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="projectInfoUsingGET"></a>
# **projectInfoUsingGET**
> ProjectDTO projectInfoUsingGET(projectId)

Відображення повної інформації про проект

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    Long projectId = 56L; // Long | projectId
    try {
      ProjectDTO result = apiInstance.projectInfoUsingGET(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#projectInfoUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Long**| projectId |

### Return type

[**ProjectDTO**](ProjectDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="statisticUsingGET"></a>
# **statisticUsingGET**
> List&lt;ProjectStatDTO&gt; statisticUsingGET(statisticType)

Статистика по стадіям

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IfIsBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    IfIsBotApi apiInstance = new IfIsBotApi(defaultClient);
    String statisticType = "statisticType_example"; // String | statisticType
    try {
      List<ProjectStatDTO> result = apiInstance.statisticUsingGET(statisticType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IfIsBotApi#statisticUsingGET");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statisticType** | **String**| statisticType | [enum: STATE, FIELD, CREDITOR]

### Return type

[**List&lt;ProjectStatDTO&gt;**](ProjectStatDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

