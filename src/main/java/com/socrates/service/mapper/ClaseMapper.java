package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Clase;
import com.socrates.service.vo.ClaseVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class,ProfesorMapper.class,MateriaMapper.class})
public interface ClaseMapper extends AbstractMapper<ClaseVO, Clase> {


    @AfterMapping
    default void completarCadenaJpa(ClaseVO claseVO, @MappingTarget Clase clase){
        List<Clase> clases=clase.getProfesor().getClases();
        if(clases==null){
            clase.getProfesor().setClases(new ArrayList<>());
        }
        clase.getProfesor().getClases().add(clase);

        List<Clase> materiaClases=clase.getMateria().getClases();
        if(materiaClases==null){
            clase.getMateria().setClases(new ArrayList<>());
        }
        clase.getMateria().getClases().add(clase);
    }
}
