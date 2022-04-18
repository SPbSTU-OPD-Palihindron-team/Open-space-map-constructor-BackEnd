package org.openspace_map;

import org.hibernate.type.*;

import javax.persistence.*;


@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue
    private IntegerType pk_building_id;
    @Column(nullable = false)
    private StringType address;
    @Column(nullable = false)
    private IntegerType floors_number;
}
