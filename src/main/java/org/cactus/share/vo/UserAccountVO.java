package org.cactus.share.vo;

import java.io.Serializable;

public class UserAccountVO extends AbstractVO implements Serializable {

    private long id;
    private String email;
    private String password;
    private String login;
    //private UserRole role;


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
}
