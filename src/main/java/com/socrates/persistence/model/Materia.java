package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type MateriaDTO.
 */
@Entity
@Table(name = "MATERIA")
@ToString
@Getter
@Setter
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MATERIA")
    private Long id;
    @Column(name = "NOMBRE", length = 50)
    private String nombre;
    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;
    @Column(name = "NIVEL", length = 10)
    private String nivel;
    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL, orphanRemoval = true)
//    @OneToMany(mappedBy = "materia")
    List<Clase> clases;

}
