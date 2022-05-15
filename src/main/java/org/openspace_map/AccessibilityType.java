package org.openspace_map;


public enum AccessibilityType {
    ADMIN("ADMIN"),
    USER("USER");

    private String accessibility_type;

    private AccessibilityType(String accessibility_type) {
        this.accessibility_type = accessibility_type;
    }
}
