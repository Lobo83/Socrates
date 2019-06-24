package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


/**
 * The type User vo.
 */
@ToString
@Getter
@Setter
public class UserVO {
    private String username;
    private String password;
    private Boolean active;
    private List<String> roles;
}
