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
import no.systema.visma.v1client.model.ContractUsageLineUpdateDto;

/**
 * This class represent a Contract Usage in Contract Usage Controller. Used to pass data to server for creating or updating an Contract Usage
 */
@ApiModel(description = "This class represent a Contract Usage in Contract Usage Controller. Used to pass data to server for creating or updating an Contract Usage")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ContractUsageUpdateDto {
  @JsonProperty("lines")
  private List<ContractUsageLineUpdateDto> lines = null;

  public ContractUsageUpdateDto lines(List<ContractUsageLineUpdateDto> lines) {
    this.lines = lines;
    return this;
  }

  public ContractUsageUpdateDto addLinesItem(ContractUsageLineUpdateDto linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
  public List<ContractUsageLineUpdateDto> getLines() {
    return lines;
  }

  public void setLines(List<ContractUsageLineUpdateDto> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractUsageUpdateDto contractUsageUpdateDto = (ContractUsageUpdateDto) o;
    return Objects.equals(this.lines, contractUsageUpdateDto.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractUsageUpdateDto {\n");
    
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

