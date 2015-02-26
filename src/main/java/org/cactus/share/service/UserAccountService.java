package org.cactus.share.service;

import org.cactus.share.vo.UserAccountVO;

import java.util.List;

public interface UserAccountService {

    UserAccountVO getAccount(String email);
    UserAccountVO getById(long id);
    UserAccountVO getByLogin(String login);
    void createUserAccount(UserAccountVO userAccountVO);
    UserAccountVO updateUserAccount(UserAccountVO userAccountVO);
    void deleteUserAccount(long id);
    List getAllUserAccount();

}
