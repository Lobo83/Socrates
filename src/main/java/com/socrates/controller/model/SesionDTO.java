package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SesionDTO {
    private Long id;
    private String dia;
    private String horaInicio;
    private String horaFin;
    private Long idAula;
    private AulaDTO aula;
    private Long idClase;
    private ClaseDTO clase;

}
