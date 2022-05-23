package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class Schedule   {
  
  private Integer sesionId;
  private List<Integer> employeeId = new ArrayList<Integer>();
  private Integer zoneId;
  private Date startTime;
  private String endTime;
  private String description;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sesion_id")
  @NotNull
  public Integer getSesionId() {
    return sesionId;
  }
  public void setSesionId(Integer sesionId) {
    this.sesionId = sesionId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("employee_id")
  @NotNull
  public List<Integer> getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(List<Integer> employeeId) {
    this.employeeId = employeeId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("zone_id")
  @NotNull
  public Integer getZoneId() {
    return zoneId;
  }
  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Admins addictional information for users.
   **/
  
  @ApiModelProperty(value = "Admins addictional information for users.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(sesionId, schedule.sesionId) &&
        Objects.equals(employeeId, schedule.employeeId) &&
        Objects.equals(zoneId, schedule.zoneId) &&
        Objects.equals(startTime, schedule.startTime) &&
        Objects.equals(endTime, schedule.endTime) &&
        Objects.equals(description, schedule.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sesionId, employeeId, zoneId, startTime, endTime, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    sesionId: ").append(toIndentedString(sesionId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

