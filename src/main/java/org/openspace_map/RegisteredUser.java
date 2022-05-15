package org.openspace_map;

import javax.persistence.*;


@Entity
@Table(name = "registered_user")
public class RegisteredUser {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String login;

    private String password;
    
    @Enumerated(javax.persistence.EnumType.STRING)
    private AccessibilityType access;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccessibilityType getAccess() {
        return access;
    }

    public void setAccess(AccessibilityType access) {
        this.access = access;
    }
}
