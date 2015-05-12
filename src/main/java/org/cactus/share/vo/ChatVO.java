package org.cactus.share.vo;

import java.util.HashSet;
import java.util.Set;

public class ChatVO extends AbstractVO {

	private Long chatId;
	private String chatName;
	private Set<UserVO> members = new HashSet<UserVO>();
	private String last_message;
	private boolean secure;

	public ChatVO() {
	}

	public Long getChatId() {
		return chatId;
	}

	public void setChatId(Long chatId) {
		this.chatId = chatId;
	}

	public String getChatName() {
		return chatName;
	}

	public void setChatName(String chatName) {
		this.chatName = chatName;
	}

	public Set<UserVO> getMembers() {
		return members;
	}

	public void setMembers(Set<UserVO> members) {
		this.members = members;
	}

	public String getLast_message() {
		return last_message;
	}

	public void setLast_message(String last_message) {
		this.last_message = last_message;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

}
