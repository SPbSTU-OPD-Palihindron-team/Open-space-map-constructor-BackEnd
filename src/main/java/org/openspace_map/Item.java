package org.openspace_map;

import com.vividsolutions.jts.geom.*;
import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "pk_item_id", nullable = false)
    private IntegerType item_id;
    @Column(nullable = false)
    private StringType pos;
    @Column(nullable = true)
    private IntegerType angle;
    @ManyToOne
    @JoinColumn(name = "fk_zone_id", foreignKey = @ForeignKey(name = "item_fk_zone_id_fkey")) private FloorZone zone_id;
    @ManyToOne
    @JoinColumn(name = "item_type_id", foreignKey = @ForeignKey(name = "item_fk_item_type_id_fkey")) private ItemType item_type_id;
}
