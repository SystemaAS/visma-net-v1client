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
import java.time.LocalDateTime;
import no.systema.visma.v1client.model.AddressDto;
import no.systema.visma.v1client.model.ContactInfoDto;
import no.systema.visma.v1client.model.CountryDto;
import no.systema.visma.v1client.model.CurrencyDto;
import no.systema.visma.v1client.model.IndustryCodeDto;
import no.systema.visma.v1client.model.VatZoneDto;

/**
 * BranchDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class BranchDto {
  @JsonProperty("number")
  private String number = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isMainBranch")
  private Boolean isMainBranch = null;

  @JsonProperty("mainAddress")
  private AddressDto mainAddress = null;

  @JsonProperty("mainContact")
  private ContactInfoDto mainContact = null;

  @JsonProperty("deliveryAddress")
  private AddressDto deliveryAddress = null;

  @JsonProperty("deliveryContact")
  private ContactInfoDto deliveryContact = null;

  @JsonProperty("corporateId")
  private String corporateId = null;

  @JsonProperty("vatRegistrationId")
  private String vatRegistrationId = null;

  @JsonProperty("defaultCountry")
  private CountryDto defaultCountry = null;

  @JsonProperty("industryCode")
  private IndustryCodeDto industryCode = null;

  @JsonProperty("currency")
  private CurrencyDto currency = null;

  @JsonProperty("vatZone")
  private VatZoneDto vatZone = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public BranchDto number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BranchDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchDto isMainBranch(Boolean isMainBranch) {
    this.isMainBranch = isMainBranch;
    return this;
  }

   /**
   * Get isMainBranch
   * @return isMainBranch
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMainBranch() {
    return isMainBranch;
  }

  public void setIsMainBranch(Boolean isMainBranch) {
    this.isMainBranch = isMainBranch;
  }

  public BranchDto mainAddress(AddressDto mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

   /**
   * Get mainAddress
   * @return mainAddress
  **/
  @ApiModelProperty(value = "")
  public AddressDto getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(AddressDto mainAddress) {
    this.mainAddress = mainAddress;
  }

  public BranchDto mainContact(ContactInfoDto mainContact) {
    this.mainContact = mainContact;
    return this;
  }

   /**
   * Get mainContact
   * @return mainContact
  **/
  @ApiModelProperty(value = "")
  public ContactInfoDto getMainContact() {
    return mainContact;
  }

  public void setMainContact(ContactInfoDto mainContact) {
    this.mainContact = mainContact;
  }

  public BranchDto deliveryAddress(AddressDto deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")
  public AddressDto getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(AddressDto deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public BranchDto deliveryContact(ContactInfoDto deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @ApiModelProperty(value = "")
  public ContactInfoDto getDeliveryContact() {
    return deliveryContact;
  }

  public void setDeliveryContact(ContactInfoDto deliveryContact) {
    this.deliveryContact = deliveryContact;
  }

  public BranchDto corporateId(String corporateId) {
    this.corporateId = corporateId;
    return this;
  }

   /**
   * Get corporateId
   * @return corporateId
  **/
  @ApiModelProperty(value = "")
  public String getCorporateId() {
    return corporateId;
  }

  public void setCorporateId(String corporateId) {
    this.corporateId = corporateId;
  }

  public BranchDto vatRegistrationId(String vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
    return this;
  }

   /**
   * Get vatRegistrationId
   * @return vatRegistrationId
  **/
  @ApiModelProperty(value = "")
  public String getVatRegistrationId() {
    return vatRegistrationId;
  }

  public void setVatRegistrationId(String vatRegistrationId) {
    this.vatRegistrationId = vatRegistrationId;
  }

  public BranchDto defaultCountry(CountryDto defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @ApiModelProperty(value = "")
  public CountryDto getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(CountryDto defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public BranchDto industryCode(IndustryCodeDto industryCode) {
    this.industryCode = industryCode;
    return this;
  }

   /**
   * Get industryCode
   * @return industryCode
  **/
  @ApiModelProperty(value = "")
  public IndustryCodeDto getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(IndustryCodeDto industryCode) {
    this.industryCode = industryCode;
  }

  public BranchDto currency(CurrencyDto currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public CurrencyDto getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyDto currency) {
    this.currency = currency;
  }

  public BranchDto vatZone(VatZoneDto vatZone) {
    this.vatZone = vatZone;
    return this;
  }

   /**
   * Get vatZone
   * @return vatZone
  **/
  @ApiModelProperty(value = "")
  public VatZoneDto getVatZone() {
    return vatZone;
  }

  public void setVatZone(VatZoneDto vatZone) {
    this.vatZone = vatZone;
  }

  public BranchDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * Get lastModifiedDateTime
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchDto branchDto = (BranchDto) o;
    return Objects.equals(this.number, branchDto.number) &&
        Objects.equals(this.name, branchDto.name) &&
        Objects.equals(this.isMainBranch, branchDto.isMainBranch) &&
        Objects.equals(this.mainAddress, branchDto.mainAddress) &&
        Objects.equals(this.mainContact, branchDto.mainContact) &&
        Objects.equals(this.deliveryAddress, branchDto.deliveryAddress) &&
        Objects.equals(this.deliveryContact, branchDto.deliveryContact) &&
        Objects.equals(this.corporateId, branchDto.corporateId) &&
        Objects.equals(this.vatRegistrationId, branchDto.vatRegistrationId) &&
        Objects.equals(this.defaultCountry, branchDto.defaultCountry) &&
        Objects.equals(this.industryCode, branchDto.industryCode) &&
        Objects.equals(this.currency, branchDto.currency) &&
        Objects.equals(this.vatZone, branchDto.vatZone) &&
        Objects.equals(this.lastModifiedDateTime, branchDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, name, isMainBranch, mainAddress, mainContact, deliveryAddress, deliveryContact, corporateId, vatRegistrationId, defaultCountry, industryCode, currency, vatZone, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchDto {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainBranch: ").append(toIndentedString(isMainBranch)).append("\n");
    sb.append("    mainAddress: ").append(toIndentedString(mainAddress)).append("\n");
    sb.append("    mainContact: ").append(toIndentedString(mainContact)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    corporateId: ").append(toIndentedString(corporateId)).append("\n");
    sb.append("    vatRegistrationId: ").append(toIndentedString(vatRegistrationId)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    vatZone: ").append(toIndentedString(vatZone)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
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
