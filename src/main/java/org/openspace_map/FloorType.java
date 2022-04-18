package org.openspace_map;


public class FloorType {
    private String floor_type;

    private FloorType(String floor_type) {
        this.floor_type = floor_type;
    }

    public static FloorType TECHNICAL = new FloorType("TECHNICAL");
    public static FloorType OFFICE = new FloorType("OFFICE");
}
