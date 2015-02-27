package org.cactus.share.service;

import org.cactus.share.vo.UserAccountVO;

import java.sql.SQLException;
import java.util.List;

public interface UserAccountService {

    UserAccountVO getAccount(String email);
    UserAccountVO getById(long id);
    UserAccountVO getByLogin(String login);
    void createUserAccount(UserAccountVO userAccountVO) throws SQLException;
    void updateUserAccount(UserAccountVO userAccountVO) throws SQLException;
    void deleteUserAccount(long id) throws SQLException;
    List getAllUserAccount();

}
