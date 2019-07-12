package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="SESION")
@Getter
@Setter
@ToString
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESION")
    private Long id;

    @Column(name="DIA")
    private String dia;
    @Column(name="HORA_INICIO")
    private String horaInicio;
    @Column(name="HORA_FIN")
    private String horaFin;
    @ManyToOne
    @JoinColumn(name = "ID_AULA", nullable = false)
    private Aula aula;
    @ManyToOne
    @JoinColumn(name = "ID_CLASE", nullable = false)
    private Clase clase;
}
