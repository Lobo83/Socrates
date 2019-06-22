package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "AUTHORITY")
@ToString
@Getter
@Setter
public class Authority {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "username")
    private User username;
    @Column(name = "authority", columnDefinition = "VARCHAR(50) NOT NULL")
    private String authority;
}
