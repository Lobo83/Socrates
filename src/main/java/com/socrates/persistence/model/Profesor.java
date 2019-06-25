package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * The type ProfesorDTO.
 */
@ToString
@Getter
@Setter
@Entity
@DiscriminatorValue(value = "PROFESOR")
public class Profesor extends Persona {

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Clase> clases;
}
