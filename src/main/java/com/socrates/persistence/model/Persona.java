package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type PersonaDTO.
 */
@Entity
@DiscriminatorColumn(name = "TIPO_PERSONA", length = 10)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private Long idPersona;
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

    @OneToOne()
    private User user;
}
