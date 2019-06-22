package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ALUMNO")
@ToString
@Getter
@Setter
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MATERIAL")
    private Long id;
    @Column(name = "NOMBRE", length = 50)
    private String nombre;

    @ManyToMany(mappedBy = "materiales")
    private List<Aula> aulas;
}
