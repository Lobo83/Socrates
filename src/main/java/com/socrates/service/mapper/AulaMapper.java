package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Aula;
import com.socrates.service.vo.AulaVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class,SesionMapper.class})
public interface AulaMapper extends AbstractMapper<AulaVO, Aula> {
    @Override
    @Mapping(target = "sesiones", source = "sesiones", ignore = true)
    AulaVO inverseMapping(Aula aula);
}
