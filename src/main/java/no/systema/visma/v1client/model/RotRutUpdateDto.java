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
import no.systema.visma.v1client.model.DtoValueNullableRutRotTypes;
import no.systema.visma.v1client.model.DtoValueString;
import no.systema.visma.v1client.model.RotRutDistributionUpdateDto;

/**
 * RotRutUpdateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class RotRutUpdateDto {
  @JsonProperty("distributedAutomaticaly")
  private DtoValueNullableBoolean distributedAutomaticaly = null;

  @JsonProperty("type")
  private DtoValueNullableRutRotTypes type = null;

  @JsonProperty("appartment")
  private DtoValueString appartment = null;

  @JsonProperty("estate")
  private DtoValueString estate = null;

  @JsonProperty("organizationNbr")
  private DtoValueString organizationNbr = null;

  @JsonProperty("distribution")
  private List<RotRutDistributionUpdateDto> distribution = null;

  public RotRutUpdateDto distributedAutomaticaly(DtoValueNullableBoolean distributedAutomaticaly) {
    this.distributedAutomaticaly = distributedAutomaticaly;
    return this;
  }

   /**
   * Get distributedAutomaticaly
   * @return distributedAutomaticaly
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableBoolean getDistributedAutomaticaly() {
    return distributedAutomaticaly;
  }

  public void setDistributedAutomaticaly(DtoValueNullableBoolean distributedAutomaticaly) {
    this.distributedAutomaticaly = distributedAutomaticaly;
  }

  public RotRutUpdateDto type(DtoValueNullableRutRotTypes type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public DtoValueNullableRutRotTypes getType() {
    return type;
  }

  public void setType(DtoValueNullableRutRotTypes type) {
    this.type = type;
  }

  public RotRutUpdateDto appartment(DtoValueString appartment) {
    this.appartment = appartment;
    return this;
  }

   /**
   * Get appartment
   * @return appartment
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getAppartment() {
    return appartment;
  }

  public void setAppartment(DtoValueString appartment) {
    this.appartment = appartment;
  }

  public RotRutUpdateDto estate(DtoValueString estate) {
    this.estate = estate;
    return this;
  }

   /**
   * Get estate
   * @return estate
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getEstate() {
    return estate;
  }

  public void setEstate(DtoValueString estate) {
    this.estate = estate;
  }

  public RotRutUpdateDto organizationNbr(DtoValueString organizationNbr) {
    this.organizationNbr = organizationNbr;
    return this;
  }

   /**
   * Get organizationNbr
   * @return organizationNbr
  **/
  @ApiModelProperty(value = "")
  public DtoValueString getOrganizationNbr() {
    return organizationNbr;
  }

  public void setOrganizationNbr(DtoValueString organizationNbr) {
    this.organizationNbr = organizationNbr;
  }

  public RotRutUpdateDto distribution(List<RotRutDistributionUpdateDto> distribution) {
    this.distribution = distribution;
    return this;
  }

  public RotRutUpdateDto addDistributionItem(RotRutDistributionUpdateDto distributionItem) {
    if (this.distribution == null) {
      this.distribution = new ArrayList<>();
    }
    this.distribution.add(distributionItem);
    return this;
  }

   /**
   * Get distribution
   * @return distribution
  **/
  @ApiModelProperty(value = "")
  public List<RotRutDistributionUpdateDto> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<RotRutDistributionUpdateDto> distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotRutUpdateDto rotRutUpdateDto = (RotRutUpdateDto) o;
    return Objects.equals(this.distributedAutomaticaly, rotRutUpdateDto.distributedAutomaticaly) &&
        Objects.equals(this.type, rotRutUpdateDto.type) &&
        Objects.equals(this.appartment, rotRutUpdateDto.appartment) &&
        Objects.equals(this.estate, rotRutUpdateDto.estate) &&
        Objects.equals(this.organizationNbr, rotRutUpdateDto.organizationNbr) &&
        Objects.equals(this.distribution, rotRutUpdateDto.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributedAutomaticaly, type, appartment, estate, organizationNbr, distribution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotRutUpdateDto {\n");
    
    sb.append("    distributedAutomaticaly: ").append(toIndentedString(distributedAutomaticaly)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    appartment: ").append(toIndentedString(appartment)).append("\n");
    sb.append("    estate: ").append(toIndentedString(estate)).append("\n");
    sb.append("    organizationNbr: ").append(toIndentedString(organizationNbr)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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
