package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.User;
import com.socrates.service.vo.UserVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends AbstractMapper<UserVO, User> {
}
