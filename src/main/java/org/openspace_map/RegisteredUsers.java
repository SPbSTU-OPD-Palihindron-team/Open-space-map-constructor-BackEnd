package org.openspace_map;

import org.hibernate.type.*;
import javax.persistence.*;


@Entity
@Table(name = "registered_users")
public class RegisteredUsers {
    @Id
    @GeneratedValue
    private IntegerType id;
    @Column(nullable = false)
    private StringType user_login;
    @Column(nullable = false)
    private StringType user_password;
    @Column(nullable = false)
    @Enumerated(javax.persistence.EnumType.STRING)
    private AccessibilityType accessibility_type;
}
