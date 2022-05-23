package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openspace_map.model.ZonePoint;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ItemEntity   {
  
  private Integer zoneId;
  private Integer itemTypeId;
  private ZonePoint point;
  private Float angle;
  private Float scale;

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
  @JsonProperty("itemType_id")
  @NotNull
  public Integer getItemTypeId() {
    return itemTypeId;
  }
  public void setItemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("point")
  @NotNull
  public ZonePoint getPoint() {
    return point;
  }
  public void setPoint(ZonePoint point) {
    this.point = point;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("angle")
  @NotNull
  public Float getAngle() {
    return angle;
  }
  public void setAngle(Float angle) {
    this.angle = angle;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("scale")
  @NotNull
  public Float getScale() {
    return scale;
  }
  public void setScale(Float scale) {
    this.scale = scale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemEntity itemEntity = (ItemEntity) o;
    return Objects.equals(zoneId, itemEntity.zoneId) &&
        Objects.equals(itemTypeId, itemEntity.itemTypeId) &&
        Objects.equals(point, itemEntity.point) &&
        Objects.equals(angle, itemEntity.angle) &&
        Objects.equals(scale, itemEntity.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneId, itemTypeId, point, angle, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemEntity {\n");
    
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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

