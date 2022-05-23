package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.InlineResponse2009ItemList;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="list of item in definition zone")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineResponse2009   {
  
  private List<InlineResponse2009ItemList> itemList = new ArrayList<InlineResponse2009ItemList>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("itemList")
  public List<InlineResponse2009ItemList> getItemList() {
    return itemList;
  }
  public void setItemList(List<InlineResponse2009ItemList> itemList) {
    this.itemList = itemList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(itemList, inlineResponse2009.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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

