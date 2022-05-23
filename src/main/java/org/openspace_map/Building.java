package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue
    private Integer id;

    private String address;
    
    private Integer floors_number;

    public Building(org.openspace_map.model.BuildingEntity building) {
        address = building.getAddress();
        floors_number = building.getNumberFloors();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloorsNumber(Integer num) {
        this.floors_number = num;
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getFloorsNumber() {
        return this.floors_number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
