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

/**
 * CostPriceStatisticsDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class CostPriceStatisticsDto {
  @JsonProperty("lastCost")
  private Double lastCost = null;

  @JsonProperty("averageCost")
  private Double averageCost = null;

  @JsonProperty("minCost")
  private Double minCost = null;

  @JsonProperty("maxCost")
  private Double maxCost = null;

  public CostPriceStatisticsDto lastCost(Double lastCost) {
    this.lastCost = lastCost;
    return this;
  }

   /**
   * The last standard cost used for the stock item.
   * @return lastCost
  **/
  @ApiModelProperty(value = "The last standard cost used for the stock item.")
  public Double getLastCost() {
    return lastCost;
  }

  public void setLastCost(Double lastCost) {
    this.lastCost = lastCost;
  }

  public CostPriceStatisticsDto averageCost(Double averageCost) {
    this.averageCost = averageCost;
    return this;
  }

   /**
   * The average cost for the stock item.
   * @return averageCost
  **/
  @ApiModelProperty(value = "The average cost for the stock item.")
  public Double getAverageCost() {
    return averageCost;
  }

  public void setAverageCost(Double averageCost) {
    this.averageCost = averageCost;
  }

  public CostPriceStatisticsDto minCost(Double minCost) {
    this.minCost = minCost;
    return this;
  }

   /**
   * The minimum cost for the stock item.
   * @return minCost
  **/
  @ApiModelProperty(value = "The minimum cost for the stock item.")
  public Double getMinCost() {
    return minCost;
  }

  public void setMinCost(Double minCost) {
    this.minCost = minCost;
  }

  public CostPriceStatisticsDto maxCost(Double maxCost) {
    this.maxCost = maxCost;
    return this;
  }

   /**
   * The maximum cost for the stock item.
   * @return maxCost
  **/
  @ApiModelProperty(value = "The maximum cost for the stock item.")
  public Double getMaxCost() {
    return maxCost;
  }

  public void setMaxCost(Double maxCost) {
    this.maxCost = maxCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostPriceStatisticsDto costPriceStatisticsDto = (CostPriceStatisticsDto) o;
    return Objects.equals(this.lastCost, costPriceStatisticsDto.lastCost) &&
        Objects.equals(this.averageCost, costPriceStatisticsDto.averageCost) &&
        Objects.equals(this.minCost, costPriceStatisticsDto.minCost) &&
        Objects.equals(this.maxCost, costPriceStatisticsDto.maxCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastCost, averageCost, minCost, maxCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostPriceStatisticsDto {\n");
    
    sb.append("    lastCost: ").append(toIndentedString(lastCost)).append("\n");
    sb.append("    averageCost: ").append(toIndentedString(averageCost)).append("\n");
    sb.append("    minCost: ").append(toIndentedString(minCost)).append("\n");
    sb.append("    maxCost: ").append(toIndentedString(maxCost)).append("\n");
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

