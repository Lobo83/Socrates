package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.SesionDTO;
import com.socrates.service.vo.SesionVO;
import org.mapstruct.Mapper;

/**
 * The interface Sesion business mapper.
 */
@Mapper(componentModel = "spring")
public interface SesionBusinessMapper extends AbstractMapper<SesionDTO, SesionVO> {

}
