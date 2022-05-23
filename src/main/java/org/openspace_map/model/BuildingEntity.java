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
public class BuildingEntity   {
  
  private String address;
  private Integer numberFloors;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("address")
  @NotNull
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Maximum floor number in the building.
   **/
  
  @ApiModelProperty(required = true, value = "Maximum floor number in the building.")
  @JsonProperty("numberFloors")
  @NotNull
  public Integer getNumberFloors() {
    return numberFloors;
  }
  public void setNumberFloors(Integer numberFloors) {
    this.numberFloors = numberFloors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildingEntity buildingEntity = (BuildingEntity) o;
    return Objects.equals(address, buildingEntity.address) &&
        Objects.equals(numberFloors, buildingEntity.numberFloors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, numberFloors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildingEntity {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    numberFloors: ").append(toIndentedString(numberFloors)).append("\n");
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

