package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.ItemType;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineResponse2006   {
  
  private List<ItemType> itemTypes = new ArrayList<ItemType>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemTypes")
  public List<ItemType> getItemTypes() {
    return itemTypes;
  }
  public void setItemTypes(List<ItemType> itemTypes) {
    this.itemTypes = itemTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(itemTypes, inlineResponse2006.itemTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    itemTypes: ").append(toIndentedString(itemTypes)).append("\n");
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

