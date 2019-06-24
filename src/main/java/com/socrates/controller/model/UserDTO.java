package com.socrates.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * The type User dto.
 */
@Getter
@Setter
@ToString
public class UserDTO {
    private String username;
    private String password;
    private Boolean active;
    private List<String> roles;
}
