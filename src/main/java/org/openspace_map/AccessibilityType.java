package org.openspace_map;


public class AccessibilityType {
    private String accessibility_type;

    private AccessibilityType(String accessibility_type) {
        this.accessibility_type = accessibility_type;
    }

    public static AccessibilityType ADMIN = new AccessibilityType("ADMIN");
    public static AccessibilityType USER = new AccessibilityType("USER");
}
