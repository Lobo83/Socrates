package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Profesor;
import com.socrates.service.TipoPersonaEnum;
import com.socrates.service.vo.PersonaVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProfesorMapper extends AbstractMapper<PersonaVO, Profesor> {
    @AfterMapping
    default void mapeaTipoProfesor(@MappingTarget PersonaVO personaVO){
        personaVO.setTipoPersona(TipoPersonaEnum.PROFESOR);
    }

}
