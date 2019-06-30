package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Alumno;
import com.socrates.service.TipoPersonaEnum;
import com.socrates.service.vo.PersonaVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface AlumnoMapper extends AbstractMapper<PersonaVO, Alumno> {


    @AfterMapping
    default void mapeaTipoAlumno(@MappingTarget PersonaVO personaVO){
        personaVO.setTipoPersona(TipoPersonaEnum.ALUMNO);
    }



}
