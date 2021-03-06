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
import java.util.ArrayList;
import java.util.List;
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueNullableDecimal;
import no.systema.visma.v1client.model.DtoValueNullableInt32;
import no.systema.visma.v1client.model.DtoValueNullableTransportationModes;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.ShipmentDetailLineUpdateDto;
import no.systema.visma.v1client.model.ShipmentPackageLineUpdateDto;

/**
 * ShipmentUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ShipmentUpdateDto {
  @JsonProperty("hold")
  private DtoValueNullableBoolean hold = null;

  @JsonProperty("fromWarehouse")
  private DtoValueString fromWarehouse = null;

  @JsonProperty("toWarehouse")
  private DtoValueString toWarehouse = null;

  @JsonProperty("controlQuantity")
  private DtoValueNullableDecimal controlQuantity = null;

  @JsonProperty("overrideContact")
  private DtoValueNullableBoolean overrideContact = null;

  @JsonProperty("businessName")
  private DtoValueString businessName = null;

  @JsonProperty("attention")
  private DtoValueString attention = null;

  @JsonProperty("phone1")
  private DtoValueString phone1 = null;

  @JsonProperty("email")
  private DtoValueString email = null;

  @JsonProperty("overrideAddress")
  private DtoValueNullableBoolean overrideAddress = null;

  @JsonProperty("addressLine1")
  private DtoValueString addressLine1 = null;

  @JsonProperty("addressLine2")
  private DtoValueString addressLine2 = null;

  @JsonProperty("city")
  private DtoValueString city = null;

  @JsonProperty("country")
  private DtoValueString country = null;

  @JsonProperty("county")
  private DtoValueString county = null;

  @JsonProperty("postalCode")
  private DtoValueString postalCode = null;

  @JsonProperty("shipVia")
  private DtoValueString shipVia = null;

  @JsonProperty("fobPoint")
  private DtoValueString fobPoint = null;

  @JsonProperty("shippingTerms")
  private DtoValueString shippingTerms = null;

  @JsonProperty("shippingZone")
  private DtoValueString shippingZone = null;

  @JsonProperty("residentialDelivery")
  private DtoValueNullableBoolean residentialDelivery = null;

  @JsonProperty("saturdayDelivery")
  private DtoValueNullableBoolean saturdayDelivery = null;

  @JsonProperty("useCustomerAccount")
  private DtoValueNullableBoolean useCustomerAccount = null;

  @JsonProperty("insurance")
  private DtoValueNullableBoolean insurance = null;

  @JsonProperty("freightAmt")
  private DtoValueNullableDecimal freightAmt = null;

  @JsonProperty("transactionType")
  private DtoValueNullableInt32 transactionType = null;

  @JsonProperty("modeOfTrasport")
  private DtoValueNullableTransportationModes modeOfTrasport = null;

  @JsonProperty("container")
  private DtoValueNullableBoolean container = null;

  @JsonProperty("shipmentDetailLines")
  private List<ShipmentDetailLineUpdateDto> shipmentDetailLines = null;

  @JsonProperty("shipmentPackageLines")
  private List<ShipmentPackageLineUpdateDto> shipmentPackageLines = null;

  public ShipmentUpdateDto hold(DtoValueNullableBoolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getHold() {
    return hold;
  }

  public void setHold(DtoValueNullableBoolean hold) {
    this.hold = hold;
  }

  public ShipmentUpdateDto fromWarehouse(DtoValueString fromWarehouse) {
    this.fromWarehouse = fromWarehouse;
    return this;
  }

   /**
   * Get fromWarehouse
   * @return fromWarehouse
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getFromWarehouse() {
    return fromWarehouse;
  }

  public void setFromWarehouse(DtoValueString fromWarehouse) {
    this.fromWarehouse = fromWarehouse;
  }

  public ShipmentUpdateDto toWarehouse(DtoValueString toWarehouse) {
    this.toWarehouse = toWarehouse;
    return this;
  }

   /**
   * Get toWarehouse
   * @return toWarehouse
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getToWarehouse() {
    return toWarehouse;
  }

  public void setToWarehouse(DtoValueString toWarehouse) {
    this.toWarehouse = toWarehouse;
  }

  public ShipmentUpdateDto controlQuantity(DtoValueNullableDecimal controlQuantity) {
    this.controlQuantity = controlQuantity;
    return this;
  }

   /**
   * Get controlQuantity
   * @return controlQuantity
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getControlQuantity() {
    return controlQuantity;
  }

  public void setControlQuantity(DtoValueNullableDecimal controlQuantity) {
    this.controlQuantity = controlQuantity;
  }

  public ShipmentUpdateDto overrideContact(DtoValueNullableBoolean overrideContact) {
    this.overrideContact = overrideContact;
    return this;
  }

   /**
   * Get overrideContact
   * @return overrideContact
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getOverrideContact() {
    return overrideContact;
  }

  public void setOverrideContact(DtoValueNullableBoolean overrideContact) {
    this.overrideContact = overrideContact;
  }

  public ShipmentUpdateDto businessName(DtoValueString businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getBusinessName() {
    return businessName;
  }

  public void setBusinessName(DtoValueString businessName) {
    this.businessName = businessName;
  }

  public ShipmentUpdateDto attention(DtoValueString attention) {
    this.attention = attention;
    return this;
  }

   /**
   * Get attention
   * @return attention
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAttention() {
    return attention;
  }

  public void setAttention(DtoValueString attention) {
    this.attention = attention;
  }

  public ShipmentUpdateDto phone1(DtoValueString phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * Get phone1
   * @return phone1
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPhone1() {
    return phone1;
  }

  public void setPhone1(DtoValueString phone1) {
    this.phone1 = phone1;
  }

  public ShipmentUpdateDto email(DtoValueString email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getEmail() {
    return email;
  }

  public void setEmail(DtoValueString email) {
    this.email = email;
  }

  public ShipmentUpdateDto overrideAddress(DtoValueNullableBoolean overrideAddress) {
    this.overrideAddress = overrideAddress;
    return this;
  }

   /**
   * Get overrideAddress
   * @return overrideAddress
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getOverrideAddress() {
    return overrideAddress;
  }

  public void setOverrideAddress(DtoValueNullableBoolean overrideAddress) {
    this.overrideAddress = overrideAddress;
  }

  public ShipmentUpdateDto addressLine1(DtoValueString addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(DtoValueString addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public ShipmentUpdateDto addressLine2(DtoValueString addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(DtoValueString addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public ShipmentUpdateDto city(DtoValueString city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCity() {
    return city;
  }

  public void setCity(DtoValueString city) {
    this.city = city;
  }

  public ShipmentUpdateDto country(DtoValueString country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCountry() {
    return country;
  }

  public void setCountry(DtoValueString country) {
    this.country = country;
  }

  public ShipmentUpdateDto county(DtoValueString county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getCounty() {
    return county;
  }

  public void setCounty(DtoValueString county) {
    this.county = county;
  }

  public ShipmentUpdateDto postalCode(DtoValueString postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(DtoValueString postalCode) {
    this.postalCode = postalCode;
  }

  public ShipmentUpdateDto shipVia(DtoValueString shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * Get shipVia
   * @return shipVia
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getShipVia() {
    return shipVia;
  }

  public void setShipVia(DtoValueString shipVia) {
    this.shipVia = shipVia;
  }

  public ShipmentUpdateDto fobPoint(DtoValueString fobPoint) {
    this.fobPoint = fobPoint;
    return this;
  }

   /**
   * Get fobPoint
   * @return fobPoint
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getFobPoint() {
    return fobPoint;
  }

  public void setFobPoint(DtoValueString fobPoint) {
    this.fobPoint = fobPoint;
  }

  public ShipmentUpdateDto shippingTerms(DtoValueString shippingTerms) {
    this.shippingTerms = shippingTerms;
    return this;
  }

   /**
   * Get shippingTerms
   * @return shippingTerms
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getShippingTerms() {
    return shippingTerms;
  }

  public void setShippingTerms(DtoValueString shippingTerms) {
    this.shippingTerms = shippingTerms;
  }

  public ShipmentUpdateDto shippingZone(DtoValueString shippingZone) {
    this.shippingZone = shippingZone;
    return this;
  }

   /**
   * Get shippingZone
   * @return shippingZone
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getShippingZone() {
    return shippingZone;
  }

  public void setShippingZone(DtoValueString shippingZone) {
    this.shippingZone = shippingZone;
  }

  public ShipmentUpdateDto residentialDelivery(DtoValueNullableBoolean residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
    return this;
  }

   /**
   * Get residentialDelivery
   * @return residentialDelivery
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getResidentialDelivery() {
    return residentialDelivery;
  }

  public void setResidentialDelivery(DtoValueNullableBoolean residentialDelivery) {
    this.residentialDelivery = residentialDelivery;
  }

  public ShipmentUpdateDto saturdayDelivery(DtoValueNullableBoolean saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
    return this;
  }

   /**
   * Get saturdayDelivery
   * @return saturdayDelivery
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getSaturdayDelivery() {
    return saturdayDelivery;
  }

  public void setSaturdayDelivery(DtoValueNullableBoolean saturdayDelivery) {
    this.saturdayDelivery = saturdayDelivery;
  }

  public ShipmentUpdateDto useCustomerAccount(DtoValueNullableBoolean useCustomerAccount) {
    this.useCustomerAccount = useCustomerAccount;
    return this;
  }

   /**
   * Get useCustomerAccount
   * @return useCustomerAccount
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getUseCustomerAccount() {
    return useCustomerAccount;
  }

  public void setUseCustomerAccount(DtoValueNullableBoolean useCustomerAccount) {
    this.useCustomerAccount = useCustomerAccount;
  }

  public ShipmentUpdateDto insurance(DtoValueNullableBoolean insurance) {
    this.insurance = insurance;
    return this;
  }

   /**
   * Get insurance
   * @return insurance
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getInsurance() {
    return insurance;
  }

  public void setInsurance(DtoValueNullableBoolean insurance) {
    this.insurance = insurance;
  }

  public ShipmentUpdateDto freightAmt(DtoValueNullableDecimal freightAmt) {
    this.freightAmt = freightAmt;
    return this;
  }

   /**
   * Get freightAmt
   * @return freightAmt
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableDecimal getFreightAmt() {
    return freightAmt;
  }

  public void setFreightAmt(DtoValueNullableDecimal freightAmt) {
    this.freightAmt = freightAmt;
  }

  public ShipmentUpdateDto transactionType(DtoValueNullableInt32 transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableInt32 getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(DtoValueNullableInt32 transactionType) {
    this.transactionType = transactionType;
  }

  public ShipmentUpdateDto modeOfTrasport(DtoValueNullableTransportationModes modeOfTrasport) {
    this.modeOfTrasport = modeOfTrasport;
    return this;
  }

   /**
   * Get modeOfTrasport
   * @return modeOfTrasport
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableTransportationModes getModeOfTrasport() {
    return modeOfTrasport;
  }

  public void setModeOfTrasport(DtoValueNullableTransportationModes modeOfTrasport) {
    this.modeOfTrasport = modeOfTrasport;
  }

  public ShipmentUpdateDto container(DtoValueNullableBoolean container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getContainer() {
    return container;
  }

  public void setContainer(DtoValueNullableBoolean container) {
    this.container = container;
  }

  public ShipmentUpdateDto shipmentDetailLines(List<ShipmentDetailLineUpdateDto> shipmentDetailLines) {
    this.shipmentDetailLines = shipmentDetailLines;
    return this;
  }

  public ShipmentUpdateDto addShipmentDetailLinesItem(ShipmentDetailLineUpdateDto shipmentDetailLinesItem) {
    if (this.shipmentDetailLines == null) {
      this.shipmentDetailLines = new ArrayList<>();
    }
    this.shipmentDetailLines.add(shipmentDetailLinesItem);
    return this;
  }

   /**
   * Get shipmentDetailLines
   * @return shipmentDetailLines
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentDetailLineUpdateDto> getShipmentDetailLines() {
    return shipmentDetailLines;
  }

  public void setShipmentDetailLines(List<ShipmentDetailLineUpdateDto> shipmentDetailLines) {
    this.shipmentDetailLines = shipmentDetailLines;
  }

  public ShipmentUpdateDto shipmentPackageLines(List<ShipmentPackageLineUpdateDto> shipmentPackageLines) {
    this.shipmentPackageLines = shipmentPackageLines;
    return this;
  }

  public ShipmentUpdateDto addShipmentPackageLinesItem(ShipmentPackageLineUpdateDto shipmentPackageLinesItem) {
    if (this.shipmentPackageLines == null) {
      this.shipmentPackageLines = new ArrayList<>();
    }
    this.shipmentPackageLines.add(shipmentPackageLinesItem);
    return this;
  }

   /**
   * Get shipmentPackageLines
   * @return shipmentPackageLines
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentPackageLineUpdateDto> getShipmentPackageLines() {
    return shipmentPackageLines;
  }

  public void setShipmentPackageLines(List<ShipmentPackageLineUpdateDto> shipmentPackageLines) {
    this.shipmentPackageLines = shipmentPackageLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentUpdateDto shipmentUpdateDto = (ShipmentUpdateDto) o;
    return Objects.equals(this.hold, shipmentUpdateDto.hold) &&
        Objects.equals(this.fromWarehouse, shipmentUpdateDto.fromWarehouse) &&
        Objects.equals(this.toWarehouse, shipmentUpdateDto.toWarehouse) &&
        Objects.equals(this.controlQuantity, shipmentUpdateDto.controlQuantity) &&
        Objects.equals(this.overrideContact, shipmentUpdateDto.overrideContact) &&
        Objects.equals(this.businessName, shipmentUpdateDto.businessName) &&
        Objects.equals(this.attention, shipmentUpdateDto.attention) &&
        Objects.equals(this.phone1, shipmentUpdateDto.phone1) &&
        Objects.equals(this.email, shipmentUpdateDto.email) &&
        Objects.equals(this.overrideAddress, shipmentUpdateDto.overrideAddress) &&
        Objects.equals(this.addressLine1, shipmentUpdateDto.addressLine1) &&
        Objects.equals(this.addressLine2, shipmentUpdateDto.addressLine2) &&
        Objects.equals(this.city, shipmentUpdateDto.city) &&
        Objects.equals(this.country, shipmentUpdateDto.country) &&
        Objects.equals(this.county, shipmentUpdateDto.county) &&
        Objects.equals(this.postalCode, shipmentUpdateDto.postalCode) &&
        Objects.equals(this.shipVia, shipmentUpdateDto.shipVia) &&
        Objects.equals(this.fobPoint, shipmentUpdateDto.fobPoint) &&
        Objects.equals(this.shippingTerms, shipmentUpdateDto.shippingTerms) &&
        Objects.equals(this.shippingZone, shipmentUpdateDto.shippingZone) &&
        Objects.equals(this.residentialDelivery, shipmentUpdateDto.residentialDelivery) &&
        Objects.equals(this.saturdayDelivery, shipmentUpdateDto.saturdayDelivery) &&
        Objects.equals(this.useCustomerAccount, shipmentUpdateDto.useCustomerAccount) &&
        Objects.equals(this.insurance, shipmentUpdateDto.insurance) &&
        Objects.equals(this.freightAmt, shipmentUpdateDto.freightAmt) &&
        Objects.equals(this.transactionType, shipmentUpdateDto.transactionType) &&
        Objects.equals(this.modeOfTrasport, shipmentUpdateDto.modeOfTrasport) &&
        Objects.equals(this.container, shipmentUpdateDto.container) &&
        Objects.equals(this.shipmentDetailLines, shipmentUpdateDto.shipmentDetailLines) &&
        Objects.equals(this.shipmentPackageLines, shipmentUpdateDto.shipmentPackageLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hold, fromWarehouse, toWarehouse, controlQuantity, overrideContact, businessName, attention, phone1, email, overrideAddress, addressLine1, addressLine2, city, country, county, postalCode, shipVia, fobPoint, shippingTerms, shippingZone, residentialDelivery, saturdayDelivery, useCustomerAccount, insurance, freightAmt, transactionType, modeOfTrasport, container, shipmentDetailLines, shipmentPackageLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentUpdateDto {\n");
    
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    fromWarehouse: ").append(toIndentedString(fromWarehouse)).append("\n");
    sb.append("    toWarehouse: ").append(toIndentedString(toWarehouse)).append("\n");
    sb.append("    controlQuantity: ").append(toIndentedString(controlQuantity)).append("\n");
    sb.append("    overrideContact: ").append(toIndentedString(overrideContact)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    overrideAddress: ").append(toIndentedString(overrideAddress)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    fobPoint: ").append(toIndentedString(fobPoint)).append("\n");
    sb.append("    shippingTerms: ").append(toIndentedString(shippingTerms)).append("\n");
    sb.append("    shippingZone: ").append(toIndentedString(shippingZone)).append("\n");
    sb.append("    residentialDelivery: ").append(toIndentedString(residentialDelivery)).append("\n");
    sb.append("    saturdayDelivery: ").append(toIndentedString(saturdayDelivery)).append("\n");
    sb.append("    useCustomerAccount: ").append(toIndentedString(useCustomerAccount)).append("\n");
    sb.append("    insurance: ").append(toIndentedString(insurance)).append("\n");
    sb.append("    freightAmt: ").append(toIndentedString(freightAmt)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    modeOfTrasport: ").append(toIndentedString(modeOfTrasport)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    shipmentDetailLines: ").append(toIndentedString(shipmentDetailLines)).append("\n");
    sb.append("    shipmentPackageLines: ").append(toIndentedString(shipmentPackageLines)).append("\n");
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

