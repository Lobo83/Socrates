package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@ToString
public class SesionVO {
    private Long id;

    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private AulaVO aula;
    private ClaseVO clase;
}
