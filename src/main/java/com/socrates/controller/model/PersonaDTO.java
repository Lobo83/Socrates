package com.socrates.controller.model;

import com.socrates.service.TipoPersonaEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type PersonaDTO.
 */
@Getter
@Setter
@ToString
public class PersonaDTO {
    private Long idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    private TipoPersonaEnum tipoPersona;
    private String username;
}
