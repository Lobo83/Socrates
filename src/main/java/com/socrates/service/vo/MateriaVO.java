package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type MateriaDTO.
 */
@ToString
@Getter
@Setter
public class MateriaVO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String nivel;
    List<ClaseVO> clases;

}
