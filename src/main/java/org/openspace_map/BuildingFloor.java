package org.openspace_map;

import org.hibernate.type.IntegerType;
import javax.persistence.*;


@Entity
@Table(name = "building_floor")
public class BuildingFloor {
    @Id
    @GeneratedValue
    private IntegerType floor_id;
    @Column(nullable = false)
    private IntegerType floor_number;
    @Column(nullable = false)
    private FloorType floor_type;
    @ManyToOne
    @JoinColumn(name = "building_id", foreignKey = @ForeignKey(name = "BUILDING_ID_FK")) private Building building_id;
}
