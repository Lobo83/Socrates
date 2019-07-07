package com.socrates.controller.model;

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
public class ClaseDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private List<SesionDTO> sesiones;
    private MateriaDTO materia;
    private ProfesorDTO profesor;
    private Long idProfesor;
    private Long idMateria;
    private List<AlumnoDTO> alumnos;

}
