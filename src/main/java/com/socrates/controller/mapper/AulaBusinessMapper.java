package com.socrates.controller.mapper;

import com.socrates.commons.AbstractMapper;
import com.socrates.controller.model.AulaDTO;
import com.socrates.service.vo.AulaVO;
import org.mapstruct.Mapper;

/**
 * The interface Aula business mapper.
 */
@Mapper(componentModel = "spring")
public interface AulaBusinessMapper extends AbstractMapper<AulaDTO, AulaVO> {

}
