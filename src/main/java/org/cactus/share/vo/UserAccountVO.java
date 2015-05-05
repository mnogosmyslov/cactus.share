package org.cactus.share.vo;

import org.cactus.share.enums.UserAccountRoleEnum;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserAccountVO extends AbstractVO implements Serializable {

    private Long id;

	private String email;

	private String password;

    private String login;

    private String name;

    private Set<Long> contacts = new HashSet<Long>(0);

    private UserAccountRoleEnum role;
    private String photo;

    public UserAccountVO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserAccountRoleEnum getRole() {
        return role;
    }

    public void setRole(UserAccountRoleEnum role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Long> contacts) {
        this.contacts = contacts;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
