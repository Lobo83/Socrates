package com.socrates.controller.model;

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
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    private UserDTO userDTO;
}
