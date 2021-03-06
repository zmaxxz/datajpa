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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DisposerStatDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T13:37:39.038490800+02:00[Europe/Helsinki]")
public class DisposerStatDTO {
  public static final String SERIALIZED_NAME_CNT_SIGN_ACTS = "cntSignActs";
  @SerializedName(SERIALIZED_NAME_CNT_SIGN_ACTS)
  private Long cntSignActs;

  public static final String SERIALIZED_NAME_CNT_SIGN_ADDENDUMS = "cntSignAddendums";
  @SerializedName(SERIALIZED_NAME_CNT_SIGN_ADDENDUMS)
  private Long cntSignAddendums;

  public static final String SERIALIZED_NAME_CNT_SIGN_CONTRACTS = "cntSignContracts";
  @SerializedName(SERIALIZED_NAME_CNT_SIGN_CONTRACTS)
  private Long cntSignContracts;

  public static final String SERIALIZED_NAME_CNT_SIGN_FINES = "cntSignFines";
  @SerializedName(SERIALIZED_NAME_CNT_SIGN_FINES)
  private Long cntSignFines;

  public static final String SERIALIZED_NAME_CNT_SIGN_REPORTS = "cntSignReports";
  @SerializedName(SERIALIZED_NAME_CNT_SIGN_REPORTS)
  private Long cntSignReports;


  public DisposerStatDTO cntSignActs(Long cntSignActs) {
    
    this.cntSignActs = cntSignActs;
    return this;
  }

   /**
   * Get cntSignActs
   * @return cntSignActs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCntSignActs() {
    return cntSignActs;
  }


  public void setCntSignActs(Long cntSignActs) {
    this.cntSignActs = cntSignActs;
  }


  public DisposerStatDTO cntSignAddendums(Long cntSignAddendums) {
    
    this.cntSignAddendums = cntSignAddendums;
    return this;
  }

   /**
   * Get cntSignAddendums
   * @return cntSignAddendums
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCntSignAddendums() {
    return cntSignAddendums;
  }


  public void setCntSignAddendums(Long cntSignAddendums) {
    this.cntSignAddendums = cntSignAddendums;
  }


  public DisposerStatDTO cntSignContracts(Long cntSignContracts) {
    
    this.cntSignContracts = cntSignContracts;
    return this;
  }

   /**
   * Get cntSignContracts
   * @return cntSignContracts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCntSignContracts() {
    return cntSignContracts;
  }


  public void setCntSignContracts(Long cntSignContracts) {
    this.cntSignContracts = cntSignContracts;
  }


  public DisposerStatDTO cntSignFines(Long cntSignFines) {
    
    this.cntSignFines = cntSignFines;
    return this;
  }

   /**
   * Get cntSignFines
   * @return cntSignFines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCntSignFines() {
    return cntSignFines;
  }


  public void setCntSignFines(Long cntSignFines) {
    this.cntSignFines = cntSignFines;
  }


  public DisposerStatDTO cntSignReports(Long cntSignReports) {
    
    this.cntSignReports = cntSignReports;
    return this;
  }

   /**
   * Get cntSignReports
   * @return cntSignReports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCntSignReports() {
    return cntSignReports;
  }


  public void setCntSignReports(Long cntSignReports) {
    this.cntSignReports = cntSignReports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisposerStatDTO disposerStatDTO = (DisposerStatDTO) o;
    return Objects.equals(this.cntSignActs, disposerStatDTO.cntSignActs) &&
        Objects.equals(this.cntSignAddendums, disposerStatDTO.cntSignAddendums) &&
        Objects.equals(this.cntSignContracts, disposerStatDTO.cntSignContracts) &&
        Objects.equals(this.cntSignFines, disposerStatDTO.cntSignFines) &&
        Objects.equals(this.cntSignReports, disposerStatDTO.cntSignReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cntSignActs, cntSignAddendums, cntSignContracts, cntSignFines, cntSignReports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisposerStatDTO {\n");
    sb.append("    cntSignActs: ").append(toIndentedString(cntSignActs)).append("\n");
    sb.append("    cntSignAddendums: ").append(toIndentedString(cntSignAddendums)).append("\n");
    sb.append("    cntSignContracts: ").append(toIndentedString(cntSignContracts)).append("\n");
    sb.append("    cntSignFines: ").append(toIndentedString(cntSignFines)).append("\n");
    sb.append("    cntSignReports: ").append(toIndentedString(cntSignReports)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

