package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue
    private IntegerType item_id;
    @Column(nullable = false)
    private StringType pos;
    @Column(nullable = false)
    private IntegerType angle;
    @ManyToOne
    @JoinColumn(name = "zone_id", foreignKey = @ForeignKey(name = "ZONE_ID_FK")) private FloorZone zone_id;
    @ManyToOne
    @JoinColumn(name = "item_type_id", foreignKey = @ForeignKey(name = "ITEM_TYPE_ID_FK")) private ItemType item_type_id;
}
