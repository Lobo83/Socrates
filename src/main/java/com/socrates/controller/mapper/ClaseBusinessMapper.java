package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.ClaseDTO;
import com.socrates.service.vo.ClaseVO;
import org.mapstruct.Mapper;

/**
 * The interface Clase business mapper.
 */
@Mapper(componentModel = "spring")
public interface ClaseBusinessMapper extends AbstractMapper<ClaseDTO, ClaseVO> {

}
