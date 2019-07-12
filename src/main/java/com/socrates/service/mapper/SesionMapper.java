package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Sesion;
import com.socrates.service.vo.SesionVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface SesionMapper extends AbstractMapper<SesionVO, Sesion> {

    @AfterMapping
    default void completarCadenaJpa(SesionVO sesionVO, @MappingTarget Sesion sesion){

        if(null==sesion.getClase().getSesiones()){
            sesion.getClase().setSesiones(new ArrayList<>());
        }
        sesion.getClase().getSesiones().add(sesion);

        List<Sesion> aulaSesiones=sesion.getAula().getSesiones();
        if(aulaSesiones==null){
            sesion.getAula().setSesiones(new ArrayList<>());
        }
        sesion.getAula().getSesiones().add(sesion);
    }

}
