package com.socrates.service.service;

import com.socrates.persistence.model.User;
import com.socrates.service.vo.UserVO;

/**
 * The interface User service.
 */
public interface UserService {
    /**
     * Create user user.
     *
     * @param userVO the user vo
     * @return the user
     */
    User createUser(UserVO userVO);
}
