package com.socrates.controller.model;

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
public class MateriaDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String nivel;
    List<ClaseDTO> clases;

}
