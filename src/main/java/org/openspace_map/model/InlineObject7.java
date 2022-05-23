package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.Zone;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineObject7   {
  
  private List<Zone> zoneList = new ArrayList<Zone>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("zoneList")
  public List<Zone> getZoneList() {
    return zoneList;
  }
  public void setZoneList(List<Zone> zoneList) {
    this.zoneList = zoneList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(zoneList, inlineObject7.zoneList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    
    sb.append("    zoneList: ").append(toIndentedString(zoneList)).append("\n");
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

