package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "item_type")
public class ItemType {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    
    @Enumerated(javax.persistence.EnumType.STRING)
    private PlacementType type;
    
    private String form;
    
    private String picture_link;
    
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlacementType getType() {
        return type;
    }

    public void setType(PlacementType type) {
        this.type = type;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getPictureLink() {
        return picture_link;
    }

    public void setPictureLink(String picture_link) {
        this.picture_link = picture_link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
