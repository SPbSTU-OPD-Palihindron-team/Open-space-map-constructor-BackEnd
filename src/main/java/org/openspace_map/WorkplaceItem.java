package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;

@Entity
@Table(name = "workplace_item")
public class WorkplaceItem extends Item {
    @ManyToOne
    @JoinColumn(name = "relation_id", foreignKey = @ForeignKey(name = "RELATION_ID_FK")) private WorkplaceItemEmployeeRelation relation_id;
}
