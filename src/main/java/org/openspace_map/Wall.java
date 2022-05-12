package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "wall")
public class Wall {
    @Id
    @GeneratedValue
    @Column(name = "pk_wall_id", nullable = false)
    private IntegerType wall_id;
    @Column(nullable = false)
    private StringType color;
    @Column(nullable = false)
    private StringType form;
    @Column(nullable = false)
    @Enumerated(javax.persistence.EnumType.STRING)
    private WallType wall_type;
    @ManyToOne
    @JoinColumn(name = "floor_id", foreignKey = @ForeignKey(name = "FLOOR_ID_FK")) private BuildingFloor floor_id;
}
