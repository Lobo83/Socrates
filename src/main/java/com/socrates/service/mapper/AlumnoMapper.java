package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Alumno;
import com.socrates.service.vo.PersonaVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlumnoMapper extends AbstractMapper<PersonaVO, Alumno> {
}
