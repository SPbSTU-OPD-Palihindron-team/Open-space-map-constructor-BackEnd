package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openspace_map.model.WorkspaceItem;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="list of possible items in basa")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineResponse2007   {
  
  private WorkspaceItem item;
  private String itemType;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item")
  @NotNull
  public WorkspaceItem getItem() {
    return item;
  }
  public void setItem(WorkspaceItem item) {
    this.item = item;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ItemType")
  @NotNull
  public String getItemType() {
    return itemType;
  }
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(item, inlineResponse2007.item) &&
        Objects.equals(itemType, inlineResponse2007.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, itemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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

