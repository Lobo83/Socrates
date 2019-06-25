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
@DiscriminatorValue(value = "ALUMNO")
@ToString
@Getter
@Setter
public class Alumno extends Persona {

    @JoinTable(name = "REL_ALUMNO_CLASE", joinColumns = @JoinColumn(name = "ID_ALUMNO", nullable = false), inverseJoinColumns = @JoinColumn(name = "ID_CLASE", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    List<Clase> clases;



}
