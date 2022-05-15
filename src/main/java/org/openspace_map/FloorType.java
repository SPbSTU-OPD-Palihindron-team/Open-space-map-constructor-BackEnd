package org.openspace_map;


public enum FloorType {
    TECHNICAL("TECHNICAL"),
    OFFICE("OFFICE");

    private String floor_type;

    private FloorType(String floor_type) {
        this.floor_type = floor_type;
    }
}
