package org.openspace_map;

//CREATE TYPE placement_type AS ENUM('ON_FLOOR', 'ON_ITEM', 'ON_WALL', 'IN_WALL')

public class PlacementType {
    private String placement_type;

    private PlacementType(String placement_type) {
        this.placement_type = placement_type;
    }

    public static PlacementType ON_FLOOR = new PlacementType("ON_FLOOR");
    public static PlacementType ON_ITEM = new PlacementType("ON_ITEM");
    public static PlacementType ON_WALL = new PlacementType("ON_WALL");
    public static PlacementType IN_WALL = new PlacementType("IN_WALL");
}
