package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.PersonaDTO;
import com.socrates.service.vo.PersonaVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaBusinessMapper extends AbstractMapper<PersonaDTO, PersonaVO> {
}
