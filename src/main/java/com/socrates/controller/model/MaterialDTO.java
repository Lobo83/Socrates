package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class MaterialDTO {
    private Long id;
    private String nombre;
    private List<AulaDTO> aulas;
}
