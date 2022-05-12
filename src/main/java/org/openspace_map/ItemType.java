package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "item_type")
public class ItemType {
    @Id
    @GeneratedValue
    @Column(name = "pk_item_type_id", nullable = false)
    private IntegerType item_type_id;
    @Column(nullable = false)
    private StringType item_name;
    @Column(nullable = false)
    @Enumerated(javax.persistence.EnumType.STRING)
    private PlacementType placement_type;
    @Column(nullable = false)
    private StringType form;
    @Column(nullable = false)
    private StringType picture_link;
    @Column(nullable = true)
    private StringType description;
}
