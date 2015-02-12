package org.cactus.share.service;

import org.cactus.share.vo.UserAccountVO;

import java.util.List;

public interface UserAccountService {

    UserAccountVO getAccount(String email);
    UserAccountVO getById(long id);
    UserAccountVO getByLogin(String login);
//    UserAccountVO createUserAccount(UserAccountVO userAccount);
//    UserAccountVO updateUserAccount(UserAccountVO userAccount);
    void deleteUserAccount(long id);
    List getAllUserAccount();

}
