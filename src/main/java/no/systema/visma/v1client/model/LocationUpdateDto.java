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
import no.systema.visma.v1client.model.DtoValueAddressUpdateDto;
import no.systema.visma.v1client.model.DtoValueContactInfoUpdateDto;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * This class represents a Location in LocationController. Used to create and update Location.
 */
@ApiModel(description = "This class represents a Location in LocationController. Used to create and update Location.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class LocationUpdateDto {
  @JsonProperty("baccountId")
  private DtoValueString baccountId = null;

  @JsonProperty("locationId")
  private DtoValueString locationId = null;

  @JsonProperty("locationName")
  private DtoValueString locationName = null;

  @JsonProperty("active")
  private DtoValueNullableBoolean active = null;

  @JsonProperty("addressIsSameAsMain")
  private DtoValueNullableBoolean addressIsSameAsMain = null;

  @JsonProperty("address")
  private DtoValueAddressUpdateDto address = null;

  @JsonProperty("contactIsSameAsMain")
  private DtoValueNullableBoolean contactIsSameAsMain = null;

  @JsonProperty("contact")
  private DtoValueContactInfoUpdateDto contact = null;

  @JsonProperty("vatRegistrationId")
  private DtoValueString vatRegistrationId = null;

  @JsonProperty("vatZone")
  private DtoValueString vatZone = null;

  @JsonProperty("ediCode")
  private DtoValueString ediCode = null;

  @JsonProperty("gln")
  private DtoValueString gln = null;

  public LocationUpdateDto baccountId(DtoValueString baccountId) {
    this.baccountId = baccountId;
    return this;
  }

   /**
   * Mandatory field for creating a new location. Can not be updated after it has been created.
   * @return baccountId
  **/
  @ApiModelProperty(value = "Mandatory field for creating a new location. Can not be updated after it has been created.")
  public DtoValueString getBaccountId() {
    return baccountId;
  }

  public void setBaccountId(DtoValueString baccountId) {
    this.baccountId = baccountId;
  }

  public LocationUpdateDto locationId(DtoValueString locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Mandatory field for creating a new location. Can not be updated after it has been created.
   * @return locationId
  **/
  @ApiModelProperty(value = "Mandatory field for creating a new location. Can not be updated after it has been created.")
  public DtoValueString getLocationId() {
    return locationId;
  }

  public void setLocationId(DtoValueString locationId) {
    this.locationId = locationId;
  }

  public LocationUpdateDto locationName(DtoValueString locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getLocationName() {
    return locationName;
  }

  public void setLocationName(DtoValueString locationName) {
    this.locationName = locationName;
  }

  public LocationUpdateDto active(DtoValueNullableBoolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getActive() {
    return active;
  }

  public void setActive(DtoValueNullableBoolean active) {
    this.active = active;
  }

  public LocationUpdateDto addressIsSameAsMain(DtoValueNullableBoolean addressIsSameAsMain) {
    this.addressIsSameAsMain = addressIsSameAsMain;
    return this;
  }

   /**
   * Get addressIsSameAsMain
   * @return addressIsSameAsMain
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getAddressIsSameAsMain() {
    return addressIsSameAsMain;
  }

  public void setAddressIsSameAsMain(DtoValueNullableBoolean addressIsSameAsMain) {
    this.addressIsSameAsMain = addressIsSameAsMain;
  }

  public LocationUpdateDto address(DtoValueAddressUpdateDto address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public DtoValueAddressUpdateDto getAddress() {
    return address;
  }

  public void setAddress(DtoValueAddressUpdateDto address) {
    this.address = address;
  }

  public LocationUpdateDto contactIsSameAsMain(DtoValueNullableBoolean contactIsSameAsMain) {
    this.contactIsSameAsMain = contactIsSameAsMain;
    return this;
  }

   /**
   * Get contactIsSameAsMain
   * @return contactIsSameAsMain
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getContactIsSameAsMain() {
    return contactIsSameAsMain;
  }

  public void setContactIsSameAsMain(DtoValueNullableBoolean contactIsSameAsMain) {
    this.contactIsSameAsMain = contactIsSameAsMain;
  }

  public LocationUpdateDto contact(DtoValueContactInfoUpdateDto contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public DtoValueContactInfoUpdateDto getContact() {
    return contact;
  }

  public void setContact(DtoValueContactInfoUpdateDto contact) {
    this.contact = contact;
  }

  public LocationUpdateDto vatRegistrationId(DtoValueString vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
    return this;
  }

   /**
   * Get vatRegistrationId
   * @return vatRegistrationId
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatRegistrationId() {
    return vatRegistrationId;
  }

  public void setVatRegistrationId(DtoValueString vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
  }

  public LocationUpdateDto vatZone(DtoValueString vatZone) {
    this.vatZone = vatZone;
    return this;
  }

   /**
   * Get vatZone
   * @return vatZone
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getVatZone() {
    return vatZone;
  }

  public void setVatZone(DtoValueString vatZone) {
    this.vatZone = vatZone;
  }

  public LocationUpdateDto ediCode(DtoValueString ediCode) {
    this.ediCode = ediCode;
    return this;
  }

   /**
   * Get ediCode
   * @return ediCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getEdiCode() {
    return ediCode;
  }

  public void setEdiCode(DtoValueString ediCode) {
    this.ediCode = ediCode;
  }

  public LocationUpdateDto gln(DtoValueString gln) {
    this.gln = gln;
    return this;
  }

   /**
   * Get gln
   * @return gln
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getGln() {
    return gln;
  }

  public void setGln(DtoValueString gln) {
    this.gln = gln;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationUpdateDto locationUpdateDto = (LocationUpdateDto) o;
    return Objects.equals(this.baccountId, locationUpdateDto.baccountId) &&
        Objects.equals(this.locationId, locationUpdateDto.locationId) &&
        Objects.equals(this.locationName, locationUpdateDto.locationName) &&
        Objects.equals(this.active, locationUpdateDto.active) &&
        Objects.equals(this.addressIsSameAsMain, locationUpdateDto.addressIsSameAsMain) &&
        Objects.equals(this.address, locationUpdateDto.address) &&
        Objects.equals(this.contactIsSameAsMain, locationUpdateDto.contactIsSameAsMain) &&
        Objects.equals(this.contact, locationUpdateDto.contact) &&
        Objects.equals(this.vatRegistrationId, locationUpdateDto.vatRegistrationId) &&
        Objects.equals(this.vatZone, locationUpdateDto.vatZone) &&
        Objects.equals(this.ediCode, locationUpdateDto.ediCode) &&
        Objects.equals(this.gln, locationUpdateDto.gln);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baccountId, locationId, locationName, active, addressIsSameAsMain, address, contactIsSameAsMain, contact, vatRegistrationId, vatZone, ediCode, gln);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationUpdateDto {\n");
    
    sb.append("    baccountId: ").append(toIndentedString(baccountId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    addressIsSameAsMain: ").append(toIndentedString(addressIsSameAsMain)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactIsSameAsMain: ").append(toIndentedString(contactIsSameAsMain)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    vatRegistrationId: ").append(toIndentedString(vatRegistrationId)).append("\n");
    sb.append("    vatZone: ").append(toIndentedString(vatZone)).append("\n");
    sb.append("    ediCode: ").append(toIndentedString(ediCode)).append("\n");
    sb.append("    gln: ").append(toIndentedString(gln)).append("\n");
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
