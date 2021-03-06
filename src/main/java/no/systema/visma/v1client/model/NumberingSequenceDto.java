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
import no.systema.visma.v1client.model.BranchNumberDto;

/**
 * NumberingSequenceDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class NumberingSequenceDto {
  @JsonProperty("numberingId")
  private String numberingId = null;

  @JsonProperty("branch")
  private BranchNumberDto branch = null;

  @JsonProperty("startNbr")
  private String startNbr = null;

  @JsonProperty("endNbr")
  private String endNbr = null;

  @JsonProperty("startDate")
  private LocalDateTime startDate = null;

  @JsonProperty("lastNbr")
  private String lastNbr = null;

  @JsonProperty("warnNbr")
  private String warnNbr = null;

  @JsonProperty("nbrStep")
  private Integer nbrStep = null;

  public NumberingSequenceDto numberingId(String numberingId) {
    this.numberingId = numberingId;
    return this;
  }

   /**
   * Get numberingId
   * @return numberingId
  **/
  @ApiModelProperty(value = "")
  public String getNumberingId() {
    return numberingId;
  }

  public void setNumberingId(String numberingId) {
    this.numberingId = numberingId;
  }

  public NumberingSequenceDto branch(BranchNumberDto branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public BranchNumberDto getBranch() {
    return branch;
  }

  public void setBranch(BranchNumberDto branch) {
    this.branch = branch;
  }

  public NumberingSequenceDto startNbr(String startNbr) {
    this.startNbr = startNbr;
    return this;
  }

   /**
   * Get startNbr
   * @return startNbr
  **/
  @ApiModelProperty(value = "")
  public String getStartNbr() {
    return startNbr;
  }

  public void setStartNbr(String startNbr) {
    this.startNbr = startNbr;
  }

  public NumberingSequenceDto endNbr(String endNbr) {
    this.endNbr = endNbr;
    return this;
  }

   /**
   * Get endNbr
   * @return endNbr
  **/
  @ApiModelProperty(value = "")
  public String getEndNbr() {
    return endNbr;
  }

  public void setEndNbr(String endNbr) {
    this.endNbr = endNbr;
  }

  public NumberingSequenceDto startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public NumberingSequenceDto lastNbr(String lastNbr) {
    this.lastNbr = lastNbr;
    return this;
  }

   /**
   * Get lastNbr
   * @return lastNbr
  **/
  @ApiModelProperty(value = "")
  public String getLastNbr() {
    return lastNbr;
  }

  public void setLastNbr(String lastNbr) {
    this.lastNbr = lastNbr;
  }

  public NumberingSequenceDto warnNbr(String warnNbr) {
    this.warnNbr = warnNbr;
    return this;
  }

   /**
   * Get warnNbr
   * @return warnNbr
  **/
  @ApiModelProperty(value = "")
  public String getWarnNbr() {
    return warnNbr;
  }

  public void setWarnNbr(String warnNbr) {
    this.warnNbr = warnNbr;
  }

  public NumberingSequenceDto nbrStep(Integer nbrStep) {
    this.nbrStep = nbrStep;
    return this;
  }

   /**
   * Get nbrStep
   * @return nbrStep
  **/
  @ApiModelProperty(value = "")
  public Integer getNbrStep() {
    return nbrStep;
  }

  public void setNbrStep(Integer nbrStep) {
    this.nbrStep = nbrStep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberingSequenceDto numberingSequenceDto = (NumberingSequenceDto) o;
    return Objects.equals(this.numberingId, numberingSequenceDto.numberingId) &&
        Objects.equals(this.branch, numberingSequenceDto.branch) &&
        Objects.equals(this.startNbr, numberingSequenceDto.startNbr) &&
        Objects.equals(this.endNbr, numberingSequenceDto.endNbr) &&
        Objects.equals(this.startDate, numberingSequenceDto.startDate) &&
        Objects.equals(this.lastNbr, numberingSequenceDto.lastNbr) &&
        Objects.equals(this.warnNbr, numberingSequenceDto.warnNbr) &&
        Objects.equals(this.nbrStep, numberingSequenceDto.nbrStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberingId, branch, startNbr, endNbr, startDate, lastNbr, warnNbr, nbrStep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberingSequenceDto {\n");
    
    sb.append("    numberingId: ").append(toIndentedString(numberingId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    startNbr: ").append(toIndentedString(startNbr)).append("\n");
    sb.append("    endNbr: ").append(toIndentedString(endNbr)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lastNbr: ").append(toIndentedString(lastNbr)).append("\n");
    sb.append("    warnNbr: ").append(toIndentedString(warnNbr)).append("\n");
    sb.append("    nbrStep: ").append(toIndentedString(nbrStep)).append("\n");
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

