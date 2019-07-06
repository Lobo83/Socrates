package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Profesor;
import com.socrates.service.TipoPersonaEnum;
import com.socrates.service.vo.PersonaVO;
import com.socrates.service.vo.ProfesorVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface ProfesorMapper extends AbstractMapper<PersonaVO, Profesor> {

    @Override
    @Mapping(target = "clases", source = "clases", ignore = true)
    ProfesorVO inverseMapping(Profesor profesor);

    @AfterMapping
    default void mapeaTipoProfesor(@MappingTarget PersonaVO personaVO){
        personaVO.setTipoPersona(TipoPersonaEnum.PROFESOR);
    }

}
