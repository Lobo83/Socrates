package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@ToString
public class SesionDTO {
    private Long id;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private AulaDTO aula;
    private ClaseDTO clase;

}
