package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type AulaDTO.
 */
@ToString
@Getter
@Setter
public class AulaDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer capacidad;
    private List<ClaseDTO> clases;
    private List<MaterialDTO> materiales;

}
