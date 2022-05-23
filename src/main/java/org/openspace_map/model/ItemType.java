package org.openspace_map.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openspace_map.model.ZoneForm;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ItemType   {
  
  private Integer itemTypeId;
  private String itemName;
  private String valuablePlacement;
  private ZoneForm polygon;
  private String pictureLink;
  private String description;

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
   * Enum of: - MFP - ATM - VENDING - COFFE_MACHINE - FIRE_HYDRANT - WORKPLACE - CONFERENCE_TABLE - DINING_ROOM_TABLE - CAFE_TABLE - GYM_SPOT - MEETING_ROOM - DOOR - WINDOW - LED_PANEL
   **/
  
  @ApiModelProperty(required = true, value = "Enum of: - MFP - ATM - VENDING - COFFE_MACHINE - FIRE_HYDRANT - WORKPLACE - CONFERENCE_TABLE - DINING_ROOM_TABLE - CAFE_TABLE - GYM_SPOT - MEETING_ROOM - DOOR - WINDOW - LED_PANEL")
  @JsonProperty("itemName")
  @NotNull
  public String getItemName() {
    return itemName;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  /**
   * Enum of: - ON_FLOOR - ON_ITEM - ON_WALL - IN_WALL
   **/
  
  @ApiModelProperty(required = true, value = "Enum of: - ON_FLOOR - ON_ITEM - ON_WALL - IN_WALL")
  @JsonProperty("valuablePlacement")
  @NotNull
  public String getValuablePlacement() {
    return valuablePlacement;
  }
  public void setValuablePlacement(String valuablePlacement) {
    this.valuablePlacement = valuablePlacement;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("polygon")
  @NotNull
  public ZoneForm getPolygon() {
    return polygon;
  }
  public void setPolygon(ZoneForm polygon) {
    this.polygon = polygon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pictureLink")
  public String getPictureLink() {
    return pictureLink;
  }
  public void setPictureLink(String pictureLink) {
    this.pictureLink = pictureLink;
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
    ItemType itemType = (ItemType) o;
    return Objects.equals(itemTypeId, itemType.itemTypeId) &&
        Objects.equals(itemName, itemType.itemName) &&
        Objects.equals(valuablePlacement, itemType.valuablePlacement) &&
        Objects.equals(polygon, itemType.polygon) &&
        Objects.equals(pictureLink, itemType.pictureLink) &&
        Objects.equals(description, itemType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemTypeId, itemName, valuablePlacement, polygon, pictureLink, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemType {\n");
    
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    valuablePlacement: ").append(toIndentedString(valuablePlacement)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    pictureLink: ").append(toIndentedString(pictureLink)).append("\n");
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

