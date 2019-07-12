package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SesionVO {
    private Long id;

    private String dia;
    private String horaInicio;
    private String horaFin;
    private AulaVO aula;
    private ClaseVO clase;
}
