package org.cactus.share.service;

import org.cactus.share.vo.UserAccountVO;
import org.cactus.share.vo.UserVO;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

public interface UserAccountService {

    UserAccountVO getAccount(String email);
    UserAccountVO getById(long id);
    UserAccountVO getByLogin(String login);
	UserVO getUserVOByLogin(String login);
    void createUserAccount(UserAccountVO userAccountVO) throws SQLException;
    void updateUserAccount(UserAccountVO userAccountVO) throws SQLException;
    void deleteUserAccount(long id) throws SQLException;
    List getAllUserAccount();
    boolean addContact(long id, String login);
    HashSet getAllContacts(UserVO userVO);
}
