package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class Floor   {
  
  private Integer floorId;
  private Integer buildingId;
  private Integer numberFloor;
  private String floorType;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("floor_id")
  @NotNull
  public Integer getFloorId() {
    return floorId;
  }
  public void setFloorId(Integer floorId) {
    this.floorId = floorId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("building_id")
  @NotNull
  public Integer getBuildingId() {
    return buildingId;
  }
  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("numberFloor")
  @NotNull
  public Integer getNumberFloor() {
    return numberFloor;
  }
  public void setNumberFloor(Integer numberFloor) {
    this.numberFloor = numberFloor;
  }

  /**
   * Enum of: - TECHNICAL - OFFICE
   **/
  
  @ApiModelProperty(value = "Enum of: - TECHNICAL - OFFICE")
  @JsonProperty("floorType")
  public String getFloorType() {
    return floorType;
  }
  public void setFloorType(String floorType) {
    this.floorType = floorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Floor floor = (Floor) o;
    return Objects.equals(floorId, floor.floorId) &&
        Objects.equals(buildingId, floor.buildingId) &&
        Objects.equals(numberFloor, floor.numberFloor) &&
        Objects.equals(floorType, floor.floorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorId, buildingId, numberFloor, floorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Floor {\n");
    
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    numberFloor: ").append(toIndentedString(numberFloor)).append("\n");
    sb.append("    floorType: ").append(toIndentedString(floorType)).append("\n");
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

