package com.socrates.controller.model;

import com.socrates.service.NivelEnum;
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
    private List<ClaseDTO> clases;
    private NivelEnum nivel;

}
