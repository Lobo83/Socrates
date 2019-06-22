package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type ClaseDTO.
 */
@Entity
@Table(name = "CLASE")
@ToString
@Getter
@Setter
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLASE")
    private Long id;
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "ID_AULA", nullable = false)
    private Aula aula;
    @ManyToOne
    @JoinColumn(name = "ID_MATERIA", nullable = false)
    private Materia materia;
    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", nullable = false)
    private Profesor profesor;
    @ManyToMany(mappedBy = "clases")
    private List<Alumno> alumnos;

}
