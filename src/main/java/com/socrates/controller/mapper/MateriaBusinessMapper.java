package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.MateriaDTO;
import com.socrates.service.vo.MateriaVO;
import org.mapstruct.Mapper;

/**
 * The interface Materia business mapper.
 */
@Mapper(componentModel = "spring")
public interface MateriaBusinessMapper extends AbstractMapper<MateriaDTO, MateriaVO> {

}
