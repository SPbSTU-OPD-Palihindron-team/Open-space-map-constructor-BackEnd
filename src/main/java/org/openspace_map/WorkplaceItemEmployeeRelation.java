package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "workplace_item_employee_relation")
public class WorkplaceItemEmployeeRelation {
    @Id
    @GeneratedValue
    private IntegerType relation_id;
    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "EMPLOYEE_ID_FK")) private Employee employee_id;
}
