package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.UserDTO;
import com.socrates.service.vo.UserVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserBusinessMapper extends AbstractMapper<UserDTO, UserVO> {
}
