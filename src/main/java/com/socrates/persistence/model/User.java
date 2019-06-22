package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@ToString
@Getter
@Setter
public class User {
    @Id
    @Column(name = "username", columnDefinition = "VARCHAR(50) NOT NULL")
    private String username;
    @Column(name = "password", columnDefinition = "VARCHAR(50) NOT NULL")
    private String password;
    @Column(name = "enabled", columnDefinition = "TINYINT NOT NULL DEFAULT 1")
    private Boolean enabled;
}
