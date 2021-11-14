# SpendingBotApi

All URIs are relative to *http://chat-bot.openbudget.gov.ua*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDisposerChangesUsingPOST**](SpendingBotApi.md#getDisposerChangesUsingPOST) | **POST** /spending/statistic/documents | Статистика опублікованих документів за вчора
[**getDisposerUsingGET**](SpendingBotApi.md#getDisposerUsingGET) | **GET** /spending/disposer/{edrpou} | Інформація про розпорядника бюджетних коштів
[**getDisposersStateUsingPOST**](SpendingBotApi.md#getDisposersStateUsingPOST) | **POST** /spending/disposer/states | Повертає статус розпорядника
[**getExpensesDynamicUsingGET**](SpendingBotApi.md#getExpensesDynamicUsingGET) | **GET** /spending/dynamic/expenses | Динаміка витрат
[**getIncomesDynamicUsingGET**](SpendingBotApi.md#getIncomesDynamicUsingGET) | **GET** /spending/dynamic/incomes | Динаміка надходжень
[**getReportingPeriodInfoUsingPOST**](SpendingBotApi.md#getReportingPeriodInfoUsingPOST) | **POST** /spending/reporting/info | Інформація про неопублікування організацією жодного документа за звітній період
[**getTop10PayersUsingGET**](SpendingBotApi.md#getTop10PayersUsingGET) | **GET** /spending/top10/payers | Топ 10 платників бюджетних коштів
[**getTop10RecipientsUsingGET**](SpendingBotApi.md#getTop10RecipientsUsingGET) | **GET** /spending/top10/recipients | Топ 10 отримувачів бюджетних коштів
[**getYesterdayTransactionsStatUsingPOST**](SpendingBotApi.md#getYesterdayTransactionsStatUsingPOST) | **POST** /spending/statistic/transactions | Статистика опублікованих транзакцій за вчора
[**pingUsingGET2**](SpendingBotApi.md#pingUsingGET2) | **GET** /spending/ping | Перевірка доступності API


<a name="getDisposerChangesUsingPOST"></a>
# **getDisposerChangesUsingPOST**
> DisposerStatResponseDisposerStatDTO getDisposerChangesUsingPOST(request)

Статистика опублікованих документів за вчора

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    EdrpouRequest request = new EdrpouRequest(); // EdrpouRequest | request
    try {
      DisposerStatResponseDisposerStatDTO result = apiInstance.getDisposerChangesUsingPOST(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getDisposerChangesUsingPOST");
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
 **request** | [**EdrpouRequest**](EdrpouRequest.md)| request |

### Return type

[**DisposerStatResponseDisposerStatDTO**](DisposerStatResponseDisposerStatDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getDisposerUsingGET"></a>
# **getDisposerUsingGET**
> OrganizationInfoDTO getDisposerUsingGET(edrpou)

Інформація про розпорядника бюджетних коштів

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    String edrpou = "edrpou_example"; // String | edrpou
    try {
      OrganizationInfoDTO result = apiInstance.getDisposerUsingGET(edrpou);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getDisposerUsingGET");
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
 **edrpou** | **String**| edrpou |

### Return type

[**OrganizationInfoDTO**](OrganizationInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getDisposersStateUsingPOST"></a>
# **getDisposersStateUsingPOST**
> DisposerStatResponsestring getDisposersStateUsingPOST(request)

Повертає статус розпорядника

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    EdrpouRequest request = new EdrpouRequest(); // EdrpouRequest | request
    try {
      DisposerStatResponsestring result = apiInstance.getDisposersStateUsingPOST(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getDisposersStateUsingPOST");
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
 **request** | [**EdrpouRequest**](EdrpouRequest.md)| request |

### Return type

[**DisposerStatResponsestring**](DisposerStatResponsestring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getExpensesDynamicUsingGET"></a>
# **getExpensesDynamicUsingGET**
> DynamicYearDTO getExpensesDynamicUsingGET(edrpou, year)

Динаміка витрат

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    String edrpou = "edrpou_example"; // String | edrpou
    Integer year = 56; // Integer | year
    try {
      DynamicYearDTO result = apiInstance.getExpensesDynamicUsingGET(edrpou, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getExpensesDynamicUsingGET");
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
 **edrpou** | **String**| edrpou |
 **year** | **Integer**| year |

### Return type

[**DynamicYearDTO**](DynamicYearDTO.md)

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

<a name="getIncomesDynamicUsingGET"></a>
# **getIncomesDynamicUsingGET**
> DynamicYearDTO getIncomesDynamicUsingGET(edrpou, year)

Динаміка надходжень

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    String edrpou = "edrpou_example"; // String | edrpou
    Integer year = 56; // Integer | year
    try {
      DynamicYearDTO result = apiInstance.getIncomesDynamicUsingGET(edrpou, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getIncomesDynamicUsingGET");
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
 **edrpou** | **String**| edrpou |
 **year** | **Integer**| year |

### Return type

[**DynamicYearDTO**](DynamicYearDTO.md)

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

<a name="getReportingPeriodInfoUsingPOST"></a>
# **getReportingPeriodInfoUsingPOST**
> ReportingInfoDTO getReportingPeriodInfoUsingPOST(request)

Інформація про неопублікування організацією жодного документа за звітній період

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    EdrpouRequest request = new EdrpouRequest(); // EdrpouRequest | request
    try {
      ReportingInfoDTO result = apiInstance.getReportingPeriodInfoUsingPOST(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getReportingPeriodInfoUsingPOST");
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
 **request** | [**EdrpouRequest**](EdrpouRequest.md)| request |

### Return type

[**ReportingInfoDTO**](ReportingInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getTop10PayersUsingGET"></a>
# **getTop10PayersUsingGET**
> List&lt;BudgCostStatDTO&gt; getTop10PayersUsingGET(kpk, year, month)

Топ 10 платників бюджетних коштів

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    String kpk = "kpk_example"; // String | kpk
    Integer year = 56; // Integer | year
    Integer month = 56; // Integer | month
    try {
      List<BudgCostStatDTO> result = apiInstance.getTop10PayersUsingGET(kpk, year, month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getTop10PayersUsingGET");
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
 **kpk** | **String**| kpk |
 **year** | **Integer**| year |
 **month** | **Integer**| month | [optional]

### Return type

[**List&lt;BudgCostStatDTO&gt;**](BudgCostStatDTO.md)

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

<a name="getTop10RecipientsUsingGET"></a>
# **getTop10RecipientsUsingGET**
> List&lt;BudgCostStatDTO&gt; getTop10RecipientsUsingGET(kpk, year, month)

Топ 10 отримувачів бюджетних коштів

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    String kpk = "kpk_example"; // String | kpk
    Integer year = 56; // Integer | year
    Integer month = 56; // Integer | month
    try {
      List<BudgCostStatDTO> result = apiInstance.getTop10RecipientsUsingGET(kpk, year, month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getTop10RecipientsUsingGET");
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
 **kpk** | **String**| kpk |
 **year** | **Integer**| year |
 **month** | **Integer**| month | [optional]

### Return type

[**List&lt;BudgCostStatDTO&gt;**](BudgCostStatDTO.md)

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

<a name="getYesterdayTransactionsStatUsingPOST"></a>
# **getYesterdayTransactionsStatUsingPOST**
> DisposerStatResponseMapstringlong getYesterdayTransactionsStatUsingPOST(request)

Статистика опублікованих транзакцій за вчора

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    EdrpouRequest request = new EdrpouRequest(); // EdrpouRequest | request
    try {
      DisposerStatResponseMapstringlong result = apiInstance.getYesterdayTransactionsStatUsingPOST(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#getYesterdayTransactionsStatUsingPOST");
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
 **request** | [**EdrpouRequest**](EdrpouRequest.md)| request |

### Return type

[**DisposerStatResponseMapstringlong**](DisposerStatResponseMapstringlong.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="pingUsingGET2"></a>
# **pingUsingGET2**
> pingUsingGET2()

Перевірка доступності API

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpendingBotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    SpendingBotApi apiInstance = new SpendingBotApi(defaultClient);
    try {
      apiInstance.pingUsingGET2();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingBotApi#pingUsingGET2");
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

