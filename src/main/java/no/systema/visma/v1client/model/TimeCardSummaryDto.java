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
import java.util.UUID;
import no.systema.visma.v1client.model.EarningTypeDto;
import no.systema.visma.v1client.model.ProjectIdDescriptionDto;
import no.systema.visma.v1client.model.ProjectTaskIdDescriptionDto;

/**
 * TimeCardSummaryDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T15:04:09.234+02:00")
public class TimeCardSummaryDto {
  @JsonProperty("lineNumber")
  private Integer lineNumber = null;

  @JsonProperty("lineId")
  private UUID lineId = null;

  @JsonProperty("earningType")
  private EarningTypeDto earningType = null;

  @JsonProperty("project")
  private ProjectIdDescriptionDto project = null;

  @JsonProperty("mon")
  private Integer mon = null;

  @JsonProperty("tue")
  private Integer tue = null;

  @JsonProperty("wed")
  private Integer wed = null;

  @JsonProperty("thu")
  private Integer thu = null;

  @JsonProperty("fri")
  private Integer fri = null;

  @JsonProperty("sat")
  private Integer sat = null;

  @JsonProperty("sun")
  private Integer sun = null;

  @JsonProperty("invoiceable")
  private Boolean invoiceable = null;

  @JsonProperty("projectTask")
  private ProjectTaskIdDescriptionDto projectTask = null;

  @JsonProperty("timeSpent")
  private Integer timeSpent = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * The approval status, which indicates whether the summary row requires approval and, if it does, what the current state of approval is.
   */
  public enum ApprovalStatusEnum {
    NEW("New"),
    
    CANCELED("Canceled"),
    
    SENTTOAPPROVAL("SentToApproval"),
    
    RECEIVEDBYAPPROVAL("ReceivedByApproval"),
    
    INPROGRESSAPPROVAL("InProgressApproval"),
    
    REJECTEDINAPPROVAL("RejectedInApproval"),
    
    APPROVEDINAPPROVAL("ApprovedInApproval"),
    
    ACTIVEWORKFLOWAPPROVAL("ActiveWorkflowApproval");

    private String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String text) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("approvalStatus")
  private ApprovalStatusEnum approvalStatus = null;

  @JsonProperty("approver")
  private String approver = null;

  @JsonProperty("approvalStatusText")
  private String approvalStatusText = null;

  @JsonProperty("lastModifiedDateTime")
  private LocalDateTime lastModifiedDateTime = null;

  public TimeCardSummaryDto lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * The time card line number
   * @return lineNumber
  **/
  @ApiModelProperty(value = "The time card line number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public TimeCardSummaryDto lineId(UUID lineId) {
    this.lineId = lineId;
    return this;
  }

   /**
   * The time card line id
   * @return lineId
  **/
  @ApiModelProperty(value = "The time card line id")
  public UUID getLineId() {
    return lineId;
  }

  public void setLineId(UUID lineId) {
    this.lineId = lineId;
  }

  public TimeCardSummaryDto earningType(EarningTypeDto earningType) {
    this.earningType = earningType;
    return this;
  }

   /**
   * The type of the work time spent by the employee
   * @return earningType
  **/
  @ApiModelProperty(value = "The type of the work time spent by the employee")
  public EarningTypeDto getEarningType() {
    return earningType;
  }

  public void setEarningType(EarningTypeDto earningType) {
    this.earningType = earningType;
  }

  public TimeCardSummaryDto project(ProjectIdDescriptionDto project) {
    this.project = project;
    return this;
  }

   /**
   * The project that the employee worked on.
   * @return project
  **/
  @ApiModelProperty(value = "The project that the employee worked on.")
  public ProjectIdDescriptionDto getProject() {
    return project;
  }

  public void setProject(ProjectIdDescriptionDto project) {
    this.project = project;
  }

  public TimeCardSummaryDto mon(Integer mon) {
    this.mon = mon;
    return this;
  }

   /**
   * The work time reported for Monday, including overtime.
   * @return mon
  **/
  @ApiModelProperty(value = "The work time reported for Monday, including overtime.")
  public Integer getMon() {
    return mon;
  }

  public void setMon(Integer mon) {
    this.mon = mon;
  }

  public TimeCardSummaryDto tue(Integer tue) {
    this.tue = tue;
    return this;
  }

   /**
   * The work time reported for Tuesday, including overtime.
   * @return tue
  **/
  @ApiModelProperty(value = "The work time reported for Tuesday, including overtime.")
  public Integer getTue() {
    return tue;
  }

  public void setTue(Integer tue) {
    this.tue = tue;
  }

  public TimeCardSummaryDto wed(Integer wed) {
    this.wed = wed;
    return this;
  }

   /**
   * The work time reported for Wednesday, including overtime.
   * @return wed
  **/
  @ApiModelProperty(value = "The work time reported for Wednesday, including overtime.")
  public Integer getWed() {
    return wed;
  }

  public void setWed(Integer wed) {
    this.wed = wed;
  }

  public TimeCardSummaryDto thu(Integer thu) {
    this.thu = thu;
    return this;
  }

   /**
   * The work time reported for Thursday, including overtime.
   * @return thu
  **/
  @ApiModelProperty(value = "The work time reported for Thursday, including overtime.")
  public Integer getThu() {
    return thu;
  }

  public void setThu(Integer thu) {
    this.thu = thu;
  }

  public TimeCardSummaryDto fri(Integer fri) {
    this.fri = fri;
    return this;
  }

   /**
   * The work time reported for Friday, including overtime.
   * @return fri
  **/
  @ApiModelProperty(value = "The work time reported for Friday, including overtime.")
  public Integer getFri() {
    return fri;
  }

  public void setFri(Integer fri) {
    this.fri = fri;
  }

  public TimeCardSummaryDto sat(Integer sat) {
    this.sat = sat;
    return this;
  }

   /**
   * The work time reported for Saturday, including overtime.
   * @return sat
  **/
  @ApiModelProperty(value = "The work time reported for Saturday, including overtime.")
  public Integer getSat() {
    return sat;
  }

  public void setSat(Integer sat) {
    this.sat = sat;
  }

  public TimeCardSummaryDto sun(Integer sun) {
    this.sun = sun;
    return this;
  }

   /**
   * The work time reported for Sunday, including overtime.
   * @return sun
  **/
  @ApiModelProperty(value = "The work time reported for Sunday, including overtime.")
  public Integer getSun() {
    return sun;
  }

  public void setSun(Integer sun) {
    this.sun = sun;
  }

  public TimeCardSummaryDto invoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * A check box that you select to indicate that these work hours are invoiceable.
   * @return invoiceable
  **/
  @ApiModelProperty(value = "A check box that you select to indicate that these work hours are invoiceable.")
  public Boolean isInvoiceable() {
    return invoiceable;
  }

  public void setInvoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
  }

  public TimeCardSummaryDto projectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
    return this;
  }

   /**
   * The project task that the employee worked on.
   * @return projectTask
  **/
  @ApiModelProperty(value = "The project task that the employee worked on.")
  public ProjectTaskIdDescriptionDto getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(ProjectTaskIdDescriptionDto projectTask) {
    this.projectTask = projectTask;
  }

  public TimeCardSummaryDto timeSpent(Integer timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * The work time (regular and overtime) that the employee spent on the project and task during the week.
   * @return timeSpent
  **/
  @ApiModelProperty(value = "The work time (regular and overtime) that the employee spent on the project and task during the week.")
  public Integer getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Integer timeSpent) {
    this.timeSpent = timeSpent;
  }

  public TimeCardSummaryDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the reported work hours.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the reported work hours.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TimeCardSummaryDto approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * The approval status, which indicates whether the summary row requires approval and, if it does, what the current state of approval is.
   * @return approvalStatus
  **/
  @ApiModelProperty(value = "The approval status, which indicates whether the summary row requires approval and, if it does, what the current state of approval is.")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public TimeCardSummaryDto approver(String approver) {
    this.approver = approver;
    return this;
  }

   /**
   * The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager.
   * @return approver
  **/
  @ApiModelProperty(value = "The identifier of the person authorized to approve the activity, if approval is required. This is either the approver of the project task or, if no approver is assigned to the project task, the project manager.")
  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }

  public TimeCardSummaryDto approvalStatusText(String approvalStatusText) {
    this.approvalStatusText = approvalStatusText;
    return this;
  }

   /**
   * The approval status text suitable for display
   * @return approvalStatusText
  **/
  @ApiModelProperty(value = "The approval status text suitable for display")
  public String getApprovalStatusText() {
    return approvalStatusText;
  }

  public void setApprovalStatusText(String approvalStatusText) {
    this.approvalStatusText = approvalStatusText;
  }

  public TimeCardSummaryDto lastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

   /**
   * The last time the time card line was modified
   * @return lastModifiedDateTime
  **/
  @ApiModelProperty(value = "The last time the time card line was modified")
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
    TimeCardSummaryDto timeCardSummaryDto = (TimeCardSummaryDto) o;
    return Objects.equals(this.lineNumber, timeCardSummaryDto.lineNumber) &&
        Objects.equals(this.lineId, timeCardSummaryDto.lineId) &&
        Objects.equals(this.earningType, timeCardSummaryDto.earningType) &&
        Objects.equals(this.project, timeCardSummaryDto.project) &&
        Objects.equals(this.mon, timeCardSummaryDto.mon) &&
        Objects.equals(this.tue, timeCardSummaryDto.tue) &&
        Objects.equals(this.wed, timeCardSummaryDto.wed) &&
        Objects.equals(this.thu, timeCardSummaryDto.thu) &&
        Objects.equals(this.fri, timeCardSummaryDto.fri) &&
        Objects.equals(this.sat, timeCardSummaryDto.sat) &&
        Objects.equals(this.sun, timeCardSummaryDto.sun) &&
        Objects.equals(this.invoiceable, timeCardSummaryDto.invoiceable) &&
        Objects.equals(this.projectTask, timeCardSummaryDto.projectTask) &&
        Objects.equals(this.timeSpent, timeCardSummaryDto.timeSpent) &&
        Objects.equals(this.description, timeCardSummaryDto.description) &&
        Objects.equals(this.approvalStatus, timeCardSummaryDto.approvalStatus) &&
        Objects.equals(this.approver, timeCardSummaryDto.approver) &&
        Objects.equals(this.approvalStatusText, timeCardSummaryDto.approvalStatusText) &&
        Objects.equals(this.lastModifiedDateTime, timeCardSummaryDto.lastModifiedDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, lineId, earningType, project, mon, tue, wed, thu, fri, sat, sun, invoiceable, projectTask, timeSpent, description, approvalStatus, approver, approvalStatusText, lastModifiedDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeCardSummaryDto {\n");
    
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    earningType: ").append(toIndentedString(earningType)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    approvalStatusText: ").append(toIndentedString(approvalStatusText)).append("\n");
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
