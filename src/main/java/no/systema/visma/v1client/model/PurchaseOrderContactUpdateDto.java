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
import no.systema.visma.v1client.model.DtoValueNullableBoolean;
import no.systema.visma.v1client.model.DtoValueString;

/**
 * PurchaseOrderContactUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class PurchaseOrderContactUpdateDto {
  @JsonProperty("overrideContact")
  private DtoValueNullableBoolean overrideContact = null;

  @JsonProperty("name")
  private DtoValueString name = null;

  @JsonProperty("attention")
  private DtoValueString attention = null;

  @JsonProperty("email")
  private DtoValueString email = null;

  @JsonProperty("web")
  private DtoValueString web = null;

  @JsonProperty("phone1")
  private DtoValueString phone1 = null;

  @JsonProperty("phone2")
  private DtoValueString phone2 = null;

  @JsonProperty("fax")
  private DtoValueString fax = null;

  public PurchaseOrderContactUpdateDto overrideContact(DtoValueNullableBoolean overrideContact) {
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

  public PurchaseOrderContactUpdateDto name(DtoValueString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getName() {
    return name;
  }

  public void setName(DtoValueString name) {
    this.name = name;
  }

  public PurchaseOrderContactUpdateDto attention(DtoValueString attention) {
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

  public PurchaseOrderContactUpdateDto email(DtoValueString email) {
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

  public PurchaseOrderContactUpdateDto web(DtoValueString web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getWeb() {
    return web;
  }

  public void setWeb(DtoValueString web) {
    this.web = web;
  }

  public PurchaseOrderContactUpdateDto phone1(DtoValueString phone1) {
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

  public PurchaseOrderContactUpdateDto phone2(DtoValueString phone2) {
    this.phone2 = phone2;
    return this;
  }

   /**
   * Get phone2
   * @return phone2
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getPhone2() {
    return phone2;
  }

  public void setPhone2(DtoValueString phone2) {
    this.phone2 = phone2;
  }

  public PurchaseOrderContactUpdateDto fax(DtoValueString fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getFax() {
    return fax;
  }

  public void setFax(DtoValueString fax) {
    this.fax = fax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrderContactUpdateDto purchaseOrderContactUpdateDto = (PurchaseOrderContactUpdateDto) o;
    return Objects.equals(this.overrideContact, purchaseOrderContactUpdateDto.overrideContact) &&
        Objects.equals(this.name, purchaseOrderContactUpdateDto.name) &&
        Objects.equals(this.attention, purchaseOrderContactUpdateDto.attention) &&
        Objects.equals(this.email, purchaseOrderContactUpdateDto.email) &&
        Objects.equals(this.web, purchaseOrderContactUpdateDto.web) &&
        Objects.equals(this.phone1, purchaseOrderContactUpdateDto.phone1) &&
        Objects.equals(this.phone2, purchaseOrderContactUpdateDto.phone2) &&
        Objects.equals(this.fax, purchaseOrderContactUpdateDto.fax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideContact, name, attention, email, web, phone1, phone2, fax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderContactUpdateDto {\n");
    
    sb.append("    overrideContact: ").append(toIndentedString(overrideContact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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

