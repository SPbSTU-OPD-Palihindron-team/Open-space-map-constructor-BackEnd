package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.Employee;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="list of empolyees in definition zone")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class InlineResponse2008   {
  
  private List<Employee> empoyees = new ArrayList<Employee>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("empoyees")
  public List<Employee> getEmpoyees() {
    return empoyees;
  }
  public void setEmpoyees(List<Employee> empoyees) {
    this.empoyees = empoyees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(empoyees, inlineResponse2008.empoyees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empoyees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    empoyees: ").append(toIndentedString(empoyees)).append("\n");
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

