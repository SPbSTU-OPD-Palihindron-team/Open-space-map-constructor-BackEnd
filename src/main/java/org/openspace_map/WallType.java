package org.openspace_map;


public class WallType {
    private String wall_type;

    private WallType(String wall_type) {
        this.wall_type = wall_type;
    }

    public static WallType VIRTUAL = new WallType("VIRTUAL");
    public static WallType PHYSICAL = new WallType("PHYSICAL");
}
