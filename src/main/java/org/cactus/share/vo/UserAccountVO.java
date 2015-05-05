package org.cactus.share.vo;

import java.util.HashSet;
import java.util.Set;

public class UserAccountVO extends UserVO {

	private String password;

    private Set<Long> contacts = new HashSet<Long>(0);

    public UserAccountVO() {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Long> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Long> contacts) {
        this.contacts = contacts;
    }
}
