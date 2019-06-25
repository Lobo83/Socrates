package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type AlumnoDTO.
 */
@ToString
@Getter
@Setter
public class AlumnoDTO extends PersonaDTO {
    private List<ClaseDTO> clases;

}
