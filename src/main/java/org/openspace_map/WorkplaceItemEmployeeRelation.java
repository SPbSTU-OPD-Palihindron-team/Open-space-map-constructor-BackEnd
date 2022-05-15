package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "workplace_item_employee_relation")
public class WorkplaceItemEmployeeRelation {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id",
                foreignKey = @ForeignKey(name = "workplace_item_employee_relation_employee_id_fkey"))
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "item_id",
                foreignKey = @ForeignKey(name = "workplace_item_employee_relation_item_id_fkey"))
    private Item item;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Item getWorkplaceItem() {
        return item;
    }

    public void setWorkplaceItem(Item workplace_item) {
        this.item = workplace_item;
    }
}
