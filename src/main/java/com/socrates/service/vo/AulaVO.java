package com.socrates.service.vo;

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
public class AulaVO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Integer capacidad;
    private List<SesionVO> sesiones;
    private List<MaterialVO> materiales;

}
