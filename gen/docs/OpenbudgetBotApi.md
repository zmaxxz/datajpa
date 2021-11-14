# OpenbudgetBotApi

All URIs are relative to *http://chat-bot.openbudget.gov.ua*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExpensesEconomicUsingGET**](OpenbudgetBotApi.md#getExpensesEconomicUsingGET) | **GET** /openbudget/national/cons/economic | Повертає видатки державного бюджету за економічною класифікацією
[**getExpensesFunctionalUsingGET**](OpenbudgetBotApi.md#getExpensesFunctionalUsingGET) | **GET** /openbudget/national/cons/functional | Повертає видатки державного бюджету за функціональною класифікацією
[**getExpensesProgramUsingGET**](OpenbudgetBotApi.md#getExpensesProgramUsingGET) | **GET** /openbudget/national/cons/program | Повертає видатки державного бюджету за програмною класифікацією
[**getLocalExpensesEconomicUsingGET**](OpenbudgetBotApi.md#getLocalExpensesEconomicUsingGET) | **GET** /openbudget/local/cons/economic | Повертає видатки місцевого бюджету за економічною класифікацією
[**getLocalExpensesFunctionalUsingGET**](OpenbudgetBotApi.md#getLocalExpensesFunctionalUsingGET) | **GET** /openbudget/local/cons/functional | Повертає видатки місцевого бюджету за функціональною класифікацією
[**getLocalExpensesProgramUsingGET**](OpenbudgetBotApi.md#getLocalExpensesProgramUsingGET) | **GET** /openbudget/local/cons/program | Повертає видатки місцевого бюджету за програмною класифікацією
[**getLocalIncoUsingGET**](OpenbudgetBotApi.md#getLocalIncoUsingGET) | **GET** /openbudget/local/inco | Пошук за доходами МБ
[**getLocalTotalInfoUsingGET**](OpenbudgetBotApi.md#getLocalTotalInfoUsingGET) | **GET** /openbudget/local/total | Загальна інформація по місцевому бюдету
[**getNationalIncoUsingGET**](OpenbudgetBotApi.md#getNationalIncoUsingGET) | **GET** /openbudget/national/inco | Пошук за доходами ДБ
[**getNationalTotalInfoUsingGET**](OpenbudgetBotApi.md#getNationalTotalInfoUsingGET) | **GET** /openbudget/national/total | Загальна інформація по державному бюдету
[**pingUsingGET1**](OpenbudgetBotApi.md#pingUsingGET1) | **GET** /openbudget/ping | Перевірка доступності API


<a name="getExpensesEconomicUsingGET"></a>
# **getExpensesEconomicUsingGET**
> ExpensesIncomesFullInfoDTO getExpensesEconomicUsingGET(code)

Повертає видатки державного бюджету за економічною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getExpensesEconomicUsingGET(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getExpensesEconomicUsingGET");
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
 **code** | **String**| code |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getExpensesFunctionalUsingGET"></a>
# **getExpensesFunctionalUsingGET**
> ExpensesIncomesFullInfoDTO getExpensesFunctionalUsingGET(code)

Повертає видатки державного бюджету за функціональною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getExpensesFunctionalUsingGET(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getExpensesFunctionalUsingGET");
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
 **code** | **String**| code |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getExpensesProgramUsingGET"></a>
# **getExpensesProgramUsingGET**
> ExpensesIncomesFullInfoDTO getExpensesProgramUsingGET(code)

Повертає видатки державного бюджету за програмною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getExpensesProgramUsingGET(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getExpensesProgramUsingGET");
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
 **code** | **String**| code |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getLocalExpensesEconomicUsingGET"></a>
# **getLocalExpensesEconomicUsingGET**
> ExpensesIncomesFullInfoDTO getLocalExpensesEconomicUsingGET(code, codeBudget)

Повертає видатки місцевого бюджету за економічною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    String codeBudget = "codeBudget_example"; // String | codeBudget
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getLocalExpensesEconomicUsingGET(code, codeBudget);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getLocalExpensesEconomicUsingGET");
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
 **code** | **String**| code |
 **codeBudget** | **String**| codeBudget |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getLocalExpensesFunctionalUsingGET"></a>
# **getLocalExpensesFunctionalUsingGET**
> ExpensesIncomesFullInfoDTO getLocalExpensesFunctionalUsingGET(code, codeBudget)

Повертає видатки місцевого бюджету за функціональною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    String codeBudget = "codeBudget_example"; // String | codeBudget
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getLocalExpensesFunctionalUsingGET(code, codeBudget);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getLocalExpensesFunctionalUsingGET");
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
 **code** | **String**| code |
 **codeBudget** | **String**| codeBudget |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getLocalExpensesProgramUsingGET"></a>
# **getLocalExpensesProgramUsingGET**
> ExpensesIncomesFullInfoDTO getLocalExpensesProgramUsingGET(code, codeBudget)

Повертає видатки місцевого бюджету за програмною класифікацією

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    String codeBudget = "codeBudget_example"; // String | codeBudget
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getLocalExpensesProgramUsingGET(code, codeBudget);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getLocalExpensesProgramUsingGET");
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
 **code** | **String**| code |
 **codeBudget** | **String**| codeBudget |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getLocalIncoUsingGET"></a>
# **getLocalIncoUsingGET**
> ExpensesIncomesFullInfoDTO getLocalIncoUsingGET(codeBudget, code)

Пошук за доходами МБ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String codeBudget = "codeBudget_example"; // String | codeBudget
    String code = "code_example"; // String | code
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getLocalIncoUsingGET(codeBudget, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getLocalIncoUsingGET");
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
 **codeBudget** | **String**| codeBudget |
 **code** | **String**| code | [optional]

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getLocalTotalInfoUsingGET"></a>
# **getLocalTotalInfoUsingGET**
> TotalDTO getLocalTotalInfoUsingGET(code)

Загальна інформація по місцевому бюдету

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    try {
      TotalDTO result = apiInstance.getLocalTotalInfoUsingGET(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getLocalTotalInfoUsingGET");
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
 **code** | **String**| code |

### Return type

[**TotalDTO**](TotalDTO.md)

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

<a name="getNationalIncoUsingGET"></a>
# **getNationalIncoUsingGET**
> ExpensesIncomesFullInfoDTO getNationalIncoUsingGET(code)

Пошук за доходами ДБ

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    String code = "code_example"; // String | code
    try {
      ExpensesIncomesFullInfoDTO result = apiInstance.getNationalIncoUsingGET(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getNationalIncoUsingGET");
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
 **code** | **String**| code |

### Return type

[**ExpensesIncomesFullInfoDTO**](ExpensesIncomesFullInfoDTO.md)

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

<a name="getNationalTotalInfoUsingGET"></a>
# **getNationalTotalInfoUsingGET**
> TotalDTO getNationalTotalInfoUsingGET()

Загальна інформація по державному бюдету

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    try {
      TotalDTO result = apiInstance.getNationalTotalInfoUsingGET();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#getNationalTotalInfoUsingGET");
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

[**TotalDTO**](TotalDTO.md)

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

<a name="pingUsingGET1"></a>
# **pingUsingGET1**
> pingUsingGET1()

Перевірка доступності API

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OpenbudgetBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    OpenbudgetBotApi apiInstance = new OpenbudgetBotApi(defaultClient);
    try {
      apiInstance.pingUsingGET1();
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenbudgetBotApi#pingUsingGET1");
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

