package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.WallEntityForm;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class WallEntity   {
  
  private Integer floorId;
  private String color;
  private List<WallEntityForm> form = new ArrayList<WallEntityForm>();
  private String wallType;

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
  
  @ApiModelProperty(value = "")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form")
  @NotNull
  public List<WallEntityForm> getForm() {
    return form;
  }
  public void setForm(List<WallEntityForm> form) {
    this.form = form;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wallType")
  public String getWallType() {
    return wallType;
  }
  public void setWallType(String wallType) {
    this.wallType = wallType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WallEntity wallEntity = (WallEntity) o;
    return Objects.equals(floorId, wallEntity.floorId) &&
        Objects.equals(color, wallEntity.color) &&
        Objects.equals(form, wallEntity.form) &&
        Objects.equals(wallType, wallEntity.wallType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorId, color, form, wallType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WallEntity {\n");
    
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    wallType: ").append(toIndentedString(wallType)).append("\n");
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

