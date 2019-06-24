package com.socrates.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLES", uniqueConstraints = {@UniqueConstraint(columnNames = {"role", "username"})})
@ToString
@Getter
@Setter
public class UserRoles {
    @Id
    @Column(name = "user_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User user;
    @Column(name = "role", columnDefinition = "VARCHAR(50) NOT NULL")
    private String role;
}
