package org.cactus.share.vo;

import java.util.HashSet;
import java.util.Set;

public class ChatVO extends AbstractVO {

	private Long chatId;
	private String chatName;
	private Set<UserVO> members = new HashSet<UserVO>();
	private MessageVO last_message;
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

	public MessageVO getLast_message() {
		return last_message;
	}

	public void setLast_message(MessageVO last_message) {
		this.last_message = last_message;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

}
