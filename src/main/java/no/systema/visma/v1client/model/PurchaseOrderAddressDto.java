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
 * PurchaseOrderAddressDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PurchaseOrderAddressDto {
  @JsonProperty("overrideAddress")
  private Boolean overrideAddress = null;

  @JsonProperty("addressId")
  private Integer addressId = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("addressLine3")
  private String addressLine3 = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private CountryDto country = null;

  @JsonProperty("county")
  private CountyDto county = null;

  public PurchaseOrderAddressDto overrideAddress(Boolean overrideAddress) {
    this.overrideAddress = overrideAddress;
    return this;
  }

   /**
   * Get overrideAddress
   * @return overrideAddress
  **/
  @ApiModelProperty(value = "")
  public Boolean isOverrideAddress() {
    return overrideAddress;
  }

  public void setOverrideAddress(Boolean overrideAddress) {
    this.overrideAddress = overrideAddress;
  }

  public PurchaseOrderAddressDto addressId(Integer addressId) {
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

  public PurchaseOrderAddressDto addressLine1(String addressLine1) {
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

  public PurchaseOrderAddressDto addressLine2(String addressLine2) {
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

  public PurchaseOrderAddressDto addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Get addressLine3
   * @return addressLine3
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public PurchaseOrderAddressDto postalCode(String postalCode) {
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

  public PurchaseOrderAddressDto city(String city) {
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

  public PurchaseOrderAddressDto country(CountryDto country) {
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

  public PurchaseOrderAddressDto county(CountyDto county) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrderAddressDto purchaseOrderAddressDto = (PurchaseOrderAddressDto) o;
    return Objects.equals(this.overrideAddress, purchaseOrderAddressDto.overrideAddress) &&
        Objects.equals(this.addressId, purchaseOrderAddressDto.addressId) &&
        Objects.equals(this.addressLine1, purchaseOrderAddressDto.addressLine1) &&
        Objects.equals(this.addressLine2, purchaseOrderAddressDto.addressLine2) &&
        Objects.equals(this.addressLine3, purchaseOrderAddressDto.addressLine3) &&
        Objects.equals(this.postalCode, purchaseOrderAddressDto.postalCode) &&
        Objects.equals(this.city, purchaseOrderAddressDto.city) &&
        Objects.equals(this.country, purchaseOrderAddressDto.country) &&
        Objects.equals(this.county, purchaseOrderAddressDto.county);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideAddress, addressId, addressLine1, addressLine2, addressLine3, postalCode, city, country, county);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderAddressDto {\n");
    
    sb.append("    overrideAddress: ").append(toIndentedString(overrideAddress)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
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

