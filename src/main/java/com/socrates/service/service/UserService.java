package com.socrates.service.service;

import com.socrates.persistence.model.User;
import com.socrates.service.vo.UserVO;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Crea usuario en el sistema basandose en la entrada userVO.
     *
     * @param userVO the user vo
     * @return the user
     */
    User crearUsuario(UserVO userVO);

    /**
     * Obtiene todos los usuarios del sistema
     *
     * @return the list
     */
    List<UserVO> obtenerUsuarios();

    /**
     * Find by username user vo.
     *
     * @param username the username
     * @return the user vo
     */
    UserVO findByUsername(String username);
}
