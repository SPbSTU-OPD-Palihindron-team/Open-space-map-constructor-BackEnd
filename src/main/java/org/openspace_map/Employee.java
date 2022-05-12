package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "pk_employee_id", nullable = false)
    private IntegerType primary_key;
    @Column(nullable = false)
    private StringType first_name;
    @Column(nullable = false)
    private StringType second_name;
    @Column(nullable = false)
    private StringType patronymic;
    @Column(nullable = false)
    private StringType email;
    @Column(nullable = false)
    private StringType telephone_number;
    @Column(nullable = false)
    private StringType specialization;
    @Column(nullable = false)
    private StringType picture_link;
}
