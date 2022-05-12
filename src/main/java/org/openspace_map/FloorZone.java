package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "floor_zone")
public class FloorZone {
    @Id
    @GeneratedValue
    @Column(name = "pk_zone_id", nullable = false)
    private IntegerType zone_id;
    @Column(nullable = false)
    private StringType form;
    @Column(nullable = false)
    private IntegerType zone_number;
    @Column(nullable = false)
    private StringType zone_name;
    @Column(nullable = true)
    private StringType description;
    @ManyToOne
    @JoinColumn(name = "floor_id", foreignKey = @ForeignKey(name = "FLOOR_ID_FK")) private BuildingFloor floor_id;
}
