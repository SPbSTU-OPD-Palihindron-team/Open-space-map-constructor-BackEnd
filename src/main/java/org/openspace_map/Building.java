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
}
