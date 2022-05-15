package org.openspace_map;


public enum WallType {
    VIRTUAL("VIRTUAL"), PHYSICAL("PHYSICAL");

    private String wall_type;

    private WallType(String wall_type) {
        this.wall_type = wall_type;
    }
}
