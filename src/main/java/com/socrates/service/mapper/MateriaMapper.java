package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Materia;
import com.socrates.service.vo.MateriaVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface MateriaMapper extends AbstractMapper<MateriaVO, Materia> {

    @Override
    @Mapping(target = "clases", source = "clases", ignore = true)
    MateriaVO inverseMapping(Materia materia);
}
