package org.openspace_map;


public enum PlacementType {
    ON_FLOOR("ON_FLOOR"),
    ON_ITEM("ON_ITEM"),
    ON_WALL("ON_WALL"),
    IN_WALL("IN_WALL");

    private String placement_type;

    private PlacementType(String placement_type) {
        this.placement_type = placement_type;
    }
}
