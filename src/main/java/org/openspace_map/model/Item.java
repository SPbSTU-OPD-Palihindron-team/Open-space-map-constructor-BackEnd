package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openspace_map.model.ItemType;
import org.openspace_map.model.ZonePoint;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class Item   {
  
  private Integer itemId;
  private Integer floorId;
  private ZonePoint point;
  private Float angle;
  private Float scale;
  private ItemType itemType;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item_id")
  @NotNull
  public Integer getItemId() {
    return itemId;
  }
  public void setItemId(Integer itemId) {
    this.itemId = itemId;
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

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("itemType")
  @NotNull
  public ItemType getItemType() {
    return itemType;
  }
  public void setItemType(ItemType itemType) {
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
    Item item = (Item) o;
    return Objects.equals(itemId, item.itemId) &&
        Objects.equals(floorId, item.floorId) &&
        Objects.equals(point, item.point) &&
        Objects.equals(angle, item.angle) &&
        Objects.equals(scale, item.scale) &&
        Objects.equals(itemType, item.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, floorId, point, angle, scale, itemType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    floorId: ").append(toIndentedString(floorId)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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

