package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.WallEntity;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineObject6   {
  
  private List<WallEntity> wallsList = new ArrayList<WallEntity>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wallsList")
  public List<WallEntity> getWallsList() {
    return wallsList;
  }
  public void setWallsList(List<WallEntity> wallsList) {
    this.wallsList = wallsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject6 inlineObject6 = (InlineObject6) o;
    return Objects.equals(wallsList, inlineObject6.wallsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject6 {\n");
    
    sb.append("    wallsList: ").append(toIndentedString(wallsList)).append("\n");
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

