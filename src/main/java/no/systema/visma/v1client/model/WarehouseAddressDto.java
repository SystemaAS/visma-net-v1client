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


package no.systema.visma.v1client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import no.systema.visma.v1client.model.CountryDto;
import no.systema.visma.v1client.model.CountyDto;

/**
 * WarehouseAddressDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class WarehouseAddressDto {
  @JsonProperty("addressId")
  private Integer addressId = null;

  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("validated")
  private Boolean validated = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private CountryDto country = null;

  @JsonProperty("county")
  private CountyDto county = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public WarehouseAddressDto addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public WarehouseAddressDto addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public WarehouseAddressDto validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

   /**
   * Get validated
   * @return validated
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public WarehouseAddressDto addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public WarehouseAddressDto addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public WarehouseAddressDto city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public WarehouseAddressDto country(CountryDto country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public CountryDto getCountry() {
    return country;
  }

  public void setCountry(CountryDto country) {
    this.country = country;
  }

  public WarehouseAddressDto county(CountyDto county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(value = "")
  public CountyDto getCounty() {
    return county;
  }

  public void setCounty(CountyDto county) {
    this.county = county;
  }

  public WarehouseAddressDto postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseAddressDto warehouseAddressDto = (WarehouseAddressDto) o;
    return Objects.equals(this.addressId, warehouseAddressDto.addressId) &&
        Objects.equals(this.addressType, warehouseAddressDto.addressType) &&
        Objects.equals(this.validated, warehouseAddressDto.validated) &&
        Objects.equals(this.addressLine1, warehouseAddressDto.addressLine1) &&
        Objects.equals(this.addressLine2, warehouseAddressDto.addressLine2) &&
        Objects.equals(this.city, warehouseAddressDto.city) &&
        Objects.equals(this.country, warehouseAddressDto.country) &&
        Objects.equals(this.county, warehouseAddressDto.county) &&
        Objects.equals(this.postalCode, warehouseAddressDto.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, addressType, validated, addressLine1, addressLine2, city, country, county, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseAddressDto {\n");
    
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

