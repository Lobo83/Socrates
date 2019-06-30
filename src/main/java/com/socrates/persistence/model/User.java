package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRoles> roles;
}
