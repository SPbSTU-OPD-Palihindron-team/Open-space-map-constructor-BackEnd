package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "building_floor")
public class BuildingFloor {
    @Id
    @GeneratedValue
    private Integer id;
    
    private Integer floor_number;
    
    @Enumerated(javax.persistence.EnumType.STRING)
    private FloorType type;

    @ManyToOne
    @JoinColumn(name = "building_id", foreignKey = @ForeignKey(name = "building_floor_building_id_fkey"))
    private Building building;

    public BuildingFloor(Integer floor_number) {
        this.floor_number = floor_number;
    }

    public Integer getFloorNumber() {
        return this.floor_number;
    }

    public void setFloorNumber(Integer num) {
        this.floor_number = num;
    }

    public FloorType getFloorType() {
        return this.type;
    }

    public void setFloorType(FloorType type) {
        this.type = type;
    }

    public Building getBuilding() {
        return this.building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
