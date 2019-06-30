package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.User;
import com.socrates.service.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper extends AbstractMapper<UserVO, User> {

    @Mapping(target = "roles",ignore = true)
    User directMapping(UserVO userVO);

    @Mapping(target = "roles",ignore = true)
    UserVO inverseMapping(User user);
}
