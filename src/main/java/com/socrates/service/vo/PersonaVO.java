package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type PersonaDTO.
 */
@Getter
@Setter
public class PersonaVO {
    private Long idPersona;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    private UserVO userVO;
}
