package com.socrates.service.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.persistence.model.Aula;
import com.socrates.service.vo.AulaVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface AulaMapper extends AbstractMapper<AulaVO, Aula> {

}
