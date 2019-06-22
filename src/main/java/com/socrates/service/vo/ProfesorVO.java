package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type ProfesorDTO.
 */
@ToString
@Getter
@Setter
public class ProfesorVO extends PersonaVO {
    private Long id;
    List<ClaseVO> clases;
}
