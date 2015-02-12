package org.cactus.share.vo;

import org.cactus.share.enums.UserAccountRoleEnum;

import java.io.Serializable;

public class UserAccountVO extends AbstractVO implements Serializable {

    private long id;
    private String email;
    private String password;
    private String login;
    private UserAccountRoleEnum role;
    private String photo;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
