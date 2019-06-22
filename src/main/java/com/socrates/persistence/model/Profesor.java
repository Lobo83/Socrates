package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type ProfesorDTO.
 */
@ToString
@Getter
@Setter
@Entity
@Table(name = "PROFESOR")
public class Profesor extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PROFESOR")
    private Long id;
    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Clase> clases;
}
