package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type ProfesorDTO.
 */
@ToString
@Getter
@Setter
public class ProfesorDTO extends PersonaDTO {
    private Long id;
    List<ClaseDTO> clases;
}
