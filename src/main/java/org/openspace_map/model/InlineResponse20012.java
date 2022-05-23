package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openspace_map.model.Building;
import org.openspace_map.model.Floor;
import org.openspace_map.model.WorkspaceItem;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineResponse20012   {
  
  private WorkspaceItem item;
  private Building building;
  private Floor floor;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("item")
  public WorkspaceItem getItem() {
    return item;
  }
  public void setItem(WorkspaceItem item) {
    this.item = item;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("building")
  public Building getBuilding() {
    return building;
  }
  public void setBuilding(Building building) {
    this.building = building;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("floor")
  public Floor getFloor() {
    return floor;
  }
  public void setFloor(Floor floor) {
    this.floor = floor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(item, inlineResponse20012.item) &&
        Objects.equals(building, inlineResponse20012.building) &&
        Objects.equals(floor, inlineResponse20012.floor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, building, floor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
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

