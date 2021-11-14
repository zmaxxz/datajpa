# DwhApi

All URIs are relative to *http://chat-bot.openbudget.gov.ua*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAggregateResultUsingGET**](DwhApi.md#getAggregateResultUsingGET) | **GET** /dwh/pdv/aggregate | getAggregateResult
[**getPayerInfoUsingGET**](DwhApi.md#getPayerInfoUsingGET) | **GET** /dwh/pdv/payer | getPayerInfo
[**getPdvUsingGET**](DwhApi.md#getPdvUsingGET) | **GET** /dwh/pdv | getPdv


<a name="getAggregateResultUsingGET"></a>
# **getAggregateResultUsingGET**
> PdvAggregateDto getAggregateResultUsingGET(searchParam)

getAggregateResult

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DwhApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    DwhApi apiInstance = new DwhApi(defaultClient);
    String searchParam = "searchParam_example"; // String | payer ipn or name
    try {
      PdvAggregateDto result = apiInstance.getAggregateResultUsingGET(searchParam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DwhApi#getAggregateResultUsingGET");
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
 **searchParam** | **String**| payer ipn or name | [optional]

### Return type

[**PdvAggregateDto**](PdvAggregateDto.md)

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

<a name="getPayerInfoUsingGET"></a>
# **getPayerInfoUsingGET**
> List&lt;PayerDTO&gt; getPayerInfoUsingGET(payerName)

getPayerInfo

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DwhApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    DwhApi apiInstance = new DwhApi(defaultClient);
    String payerName = "payerName_example"; // String | payerName
    try {
      List<PayerDTO> result = apiInstance.getPayerInfoUsingGET(payerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DwhApi#getPayerInfoUsingGET");
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
 **payerName** | **String**| payerName |

### Return type

[**List&lt;PayerDTO&gt;**](PayerDTO.md)

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

<a name="getPdvUsingGET"></a>
# **getPdvUsingGET**
> List&lt;PdvDTO&gt; getPdvUsingGET(declarationNumber, payerIpn, payerName)

getPdv

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DwhApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://chat-bot.openbudget.gov.ua");

    DwhApi apiInstance = new DwhApi(defaultClient);
    String declarationNumber = "declarationNumber_example"; // String | declarationNumber
    String payerIpn = "payerIpn_example"; // String | payerIpn
    String payerName = "payerName_example"; // String | payerName
    try {
      List<PdvDTO> result = apiInstance.getPdvUsingGET(declarationNumber, payerIpn, payerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DwhApi#getPdvUsingGET");
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
 **declarationNumber** | **String**| declarationNumber | [optional]
 **payerIpn** | **String**| payerIpn | [optional]
 **payerName** | **String**| payerName | [optional]

### Return type

[**List&lt;PdvDTO&gt;**](PdvDTO.md)

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

