package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "wall")
public class Wall {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String color;
    
    private String form;
    
    @Enumerated(javax.persistence.EnumType.STRING)
    private WallType type;

    @ManyToOne
    @JoinColumn(name = "floor_id", foreignKey = @ForeignKey(name = "wall_floor_id_fkey"))
    private BuildingFloor floor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public WallType getType() {
        return type;
    }

    public void setType(WallType type) {
        this.type = type;
    }

    public BuildingFloor getFloor() {
        return floor;
    }

    public void setFloor(BuildingFloor floor) {
        this.floor = floor;
    }
}
