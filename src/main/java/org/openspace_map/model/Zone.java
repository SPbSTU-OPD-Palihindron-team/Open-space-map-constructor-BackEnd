package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openspace_map.model.ZoneForm;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class Zone   {
  
  private Integer zoneId;
  private Integer buildingId;
  private Integer floorId;
  private List<ZoneForm> form = new ArrayList<ZoneForm>();
  private Integer numberZone;
  private String type;
  private String description;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("zone_id")
  @NotNull
  public Integer getZoneId() {
    return zoneId;
  }
  public void setZoneId(Integer zoneId) {
    this.zoneId = zoneId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("building_id")
  @NotNull
  public Integer getBuildingId() {
    return buildingId;
  }
  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form")
  @NotNull
  public List<ZoneForm> getForm() {
    return form;
  }
  public void setForm(List<ZoneForm> form) {
    this.form = form;
  }

  /**
   * Number of cabinet if it is.
   **/
  
  @ApiModelProperty(value = "Number of cabinet if it is.")
  @JsonProperty("numberZone")
  public Integer getNumberZone() {
    return numberZone;
  }
  public void setNumberZone(Integer numberZone) {
    this.numberZone = numberZone;
  }

  /**
   * Enum of zone type: CABINET or OPEN_AREA 
   **/
  
  @ApiModelProperty(value = "Enum of zone type: CABINET or OPEN_AREA ")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zone zone = (Zone) o;
    return Objects.equals(zoneId, zone.zoneId) &&
        Objects.equals(buildingId, zone.buildingId) &&
        Objects.equals(floorId, zone.floorId) &&
        Objects.equals(form, zone.form) &&
        Objects.equals(numberZone, zone.numberZone) &&
        Objects.equals(type, zone.type) &&
        Objects.equals(description, zone.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, buildingId, floorId, form, numberZone, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zone {\n");
    
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    buildingId: ").append(toIndentedString(buildingId)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    numberZone: ").append(toIndentedString(numberZone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

