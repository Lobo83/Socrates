package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type AlumnoDTO.
 */
@Entity
@Table(name = "ALUMNO")
@ToString
@Getter
@Setter
public class Alumno extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ALUMNO")
    private Long id;
    @JoinTable(name = "REL_ALUMNO_CLASE", joinColumns = @JoinColumn(name = "ID_ALUMNO", nullable = false), inverseJoinColumns = @JoinColumn(name = "ID_CLASE", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    List<Clase> clases;
    @OneToOne()
    private User user;
    @OneToMany
    private List<Authority> authorities;

}
