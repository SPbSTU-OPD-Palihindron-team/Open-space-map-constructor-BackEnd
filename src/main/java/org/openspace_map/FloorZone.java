package org.openspace_map;

import com.vividsolutions.jts.geom.Polygon;
import javax.persistence.*;


@Entity
@Table(name = "floor_zone")
public class FloorZone {
    @Id
    @GeneratedValue
    private Integer id;
    
    private Polygon form;
    
    private Integer number;
    
    private String name;
    
    private String description;

    @ManyToOne
    @JoinColumn(name = "floor_id", foreignKey = @ForeignKey(name = "floor_zone_floor_id_fkey"))
    private BuildingFloor floor;

    public Polygon getForm() {
        return form;
    }

    public void setForm(Polygon form) {
        this.form = form;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BuildingFloor getFloor() {
        return floor;
    }

    public void setFloor(BuildingFloor floor) {
        this.floor = floor;
    }
}
