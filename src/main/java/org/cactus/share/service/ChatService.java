package org.cactus.share.service;

import org.cactus.share.vo.ChatVO;

import java.util.HashSet;

public interface ChatService {
	void addChat(ChatVO chat);
	ChatVO getChat(Long id);
	HashSet getAllChats(Long userAccountId);
	void updateChat(ChatVO chat);
	void deleteChat(Long id);
}
