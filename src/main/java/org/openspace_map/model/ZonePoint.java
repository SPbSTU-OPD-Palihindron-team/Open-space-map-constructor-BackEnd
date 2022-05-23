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
public class ZonePoint   {
  
  private Integer x;
  private Integer y;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("x")
  @NotNull
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("y")
  @NotNull
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonePoint zonePoint = (ZonePoint) o;
    return Objects.equals(x, zonePoint.x) &&
        Objects.equals(y, zonePoint.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonePoint {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

