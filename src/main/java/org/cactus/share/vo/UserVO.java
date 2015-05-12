package org.cactus.share.vo;

import org.cactus.share.enums.UserAccountRoleEnum;

public class UserVO extends AbstractVO {
	private Long id;

	private String email;

	private String login;

	private String name;

	private UserAccountRoleEnum role;

	private String photo;

	public UserVO() {}

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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
