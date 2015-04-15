package org.cactus.share.vo;

import org.cactus.share.enums.UserAccountRoleEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserAccountVO extends AbstractVO implements Serializable {

    private Long id;

	@NotNull
	@Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")
	private String email;

	@NotNull
	@Pattern(regexp = "^(?=.*d)(?=.*[a-zA-Z]).{8,60}$")
	private String password;

	@NotNull
	@Pattern(regexp = "/^[a-zA-Z0-9]{4,10}$/")
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
