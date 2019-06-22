package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * The type PersonaDTO.
 */
@MappedSuperclass
@Getter
@Setter
public class Persona {
    @Column(name = "NOMBRE", length = 50)
    private String nombre;
    @Column(name = "APELLIDO1", length = 50)
    private String apellido1;
    @Column(name = "APELLIDO2", length = 50)
    private String apellido2;
    @Column(name = "DNI", length = 10)
    private String dni;
    @Column(name = "TELEFONO", length = 30)
    private String telefono;
    @Column(name = "EMAIL", length = 150)
    private String email;
}
