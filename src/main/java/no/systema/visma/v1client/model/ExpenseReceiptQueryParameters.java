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
 * ExpenseReceiptQueryParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class ExpenseReceiptQueryParameters {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("dateCondition")
  private String dateCondition = null;

  @JsonProperty("inventory")
  private String inventory = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("claimedBy")
  private String claimedBy = null;

  @JsonProperty("projectTask")
  private String projectTask = null;

  @JsonProperty("invoiceable")
  private Boolean invoiceable = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("Open"),
    
    PENDING("Pending"),
    
    APPROVED("Approved"),
    
    REJECTED("Rejected"),
    
    RELEASED("Released");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("customer")
  private String customer = null;

  public ExpenseReceiptQueryParameters date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExpenseReceiptQueryParameters dateCondition(String dateCondition) {
    this.dateCondition = dateCondition;
    return this;
  }

   /**
   * Get dateCondition
   * @return dateCondition
  **/
  @ApiModelProperty(value = "")
  public String getDateCondition() {
    return dateCondition;
  }

  public void setDateCondition(String dateCondition) {
    this.dateCondition = dateCondition;
  }

  public ExpenseReceiptQueryParameters inventory(String inventory) {
    this.inventory = inventory;
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public String getInventory() {
    return inventory;
  }

  public void setInventory(String inventory) {
    this.inventory = inventory;
  }

  public ExpenseReceiptQueryParameters project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ExpenseReceiptQueryParameters claimedBy(String claimedBy) {
    this.claimedBy = claimedBy;
    return this;
  }

   /**
   * Get claimedBy
   * @return claimedBy
  **/
  @ApiModelProperty(value = "")
  public String getClaimedBy() {
    return claimedBy;
  }

  public void setClaimedBy(String claimedBy) {
    this.claimedBy = claimedBy;
  }

  public ExpenseReceiptQueryParameters projectTask(String projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * Get projectTask
   * @return projectTask
  **/
  @ApiModelProperty(value = "")
  public String getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(String projectTask) {
    this.projectTask = projectTask;
  }

  public ExpenseReceiptQueryParameters invoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * Get invoiceable
   * @return invoiceable
  **/
  @ApiModelProperty(value = "")
  public Boolean isInvoiceable() {
    return invoiceable;
  }

  public void setInvoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
  }

  public ExpenseReceiptQueryParameters status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ExpenseReceiptQueryParameters customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseReceiptQueryParameters expenseReceiptQueryParameters = (ExpenseReceiptQueryParameters) o;
    return Objects.equals(this.date, expenseReceiptQueryParameters.date) &&
        Objects.equals(this.dateCondition, expenseReceiptQueryParameters.dateCondition) &&
        Objects.equals(this.inventory, expenseReceiptQueryParameters.inventory) &&
        Objects.equals(this.project, expenseReceiptQueryParameters.project) &&
        Objects.equals(this.claimedBy, expenseReceiptQueryParameters.claimedBy) &&
        Objects.equals(this.projectTask, expenseReceiptQueryParameters.projectTask) &&
        Objects.equals(this.invoiceable, expenseReceiptQueryParameters.invoiceable) &&
        Objects.equals(this.status, expenseReceiptQueryParameters.status) &&
        Objects.equals(this.customer, expenseReceiptQueryParameters.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateCondition, inventory, project, claimedBy, projectTask, invoiceable, status, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseReceiptQueryParameters {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateCondition: ").append(toIndentedString(dateCondition)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    claimedBy: ").append(toIndentedString(claimedBy)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
