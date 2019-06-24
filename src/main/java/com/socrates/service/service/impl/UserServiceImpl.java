package com.socrates.service.service.impl;

import com.socrates.persistence.model.User;
import com.socrates.persistence.model.UserRoles;
import com.socrates.persistence.repository.UserRepository;
import com.socrates.persistence.repository.UserRolesRepository;
import com.socrates.service.service.UserService;
import com.socrates.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * The type User service.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRolesRepository userRolesRepository;


    @Override
    @Transactional
    public User createUser(UserVO userVO) {
        User user = new User();
        user.setEnabled(userVO.getActive());
        user.setUsername(userVO.getUsername());
        user.setPassword(userVO.getPassword());
        userRepository.save(user);
        List<UserRoles> roles = new ArrayList<>();
        for (String role : userVO.getRoles()) {
            UserRoles userRoles = new UserRoles();
            userRoles.setUser(user);
            userRoles.setRole(role);
            roles.add(userRoles);
        }
        userRolesRepository.saveAll(roles);

        return user;
    }
}
