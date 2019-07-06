package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.PersonaDTO;
import com.socrates.controller.model.ProfesorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaProfesorBusinessMapper extends AbstractMapper<PersonaDTO, ProfesorDTO> {


}
