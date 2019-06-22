package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type AulaDTO.
 */
@Entity
@Table(name = "AULA")
@ToString
@Getter
@Setter
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AULA")
    private Long id;
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;
    @Column(name = "CAPACIDAD", precision = 3)
    private Integer capacidad;

    @OneToMany(mappedBy = "aula", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Clase> clases;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "REL_AULA_MATERIAL", joinColumns = @JoinColumn(name = "ID_AULA", nullable = false), inverseJoinColumns = @JoinColumn(name = "ID_MATERIAL", nullable = false))
    private List<Material> materiales;

}
