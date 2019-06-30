package com.socrates.controller.model;

import lombok.*;

import java.util.List;

/**
 * The type User dto.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;
    private String password;
    private Boolean enabled;
    private List<String> roles;
}
