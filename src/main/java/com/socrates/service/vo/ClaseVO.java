package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type ClaseDTO.
 */
@ToString
@Getter
@Setter
public class ClaseVO {
    private Long id;
    private String nombre;
    private String descripcion;
    private AulaVO aula;
    private MateriaVO materia;
    private ProfesorVO profesor;
    private List<AlumnoVO> alumnos;

}
