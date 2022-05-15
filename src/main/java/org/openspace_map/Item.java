package org.openspace_map;

import com.vividsolutions.jts.geom.Point;
import javax.persistence.*;
import java.awt.*;


@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue
    private Integer id;
    
    private Point pos;
    
    private Integer angle;

    private Float scale;

    private Boolean is_workplace;

    @ManyToOne
    @JoinColumn(name = "zone_id", foreignKey = @ForeignKey(name = "item_zone_id_fkey"))
    private FloorZone zone;

    @ManyToOne
    @JoinColumn(name = "item_type_id", foreignKey = @ForeignKey(name = "item_item_type_id_fkey"))
    private ItemType item_type;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public Boolean getIsWorkplace() {
        return is_workplace;
    }

    public void setIsWorkplace(Boolean is_workplace) {
        this.is_workplace = is_workplace;
    }

    public FloorZone getZone() {
        return zone;
    }

    public void setZone(FloorZone zone) {
        this.zone = zone;
    }

    public ItemType getItemType() {
        return item_type;
    }

    public void setItemType(ItemType item_type) {
        this.item_type = item_type;
    }
}
