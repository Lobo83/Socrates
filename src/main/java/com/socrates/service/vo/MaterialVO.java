package com.socrates.service.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class MaterialVO {
    private Long id;
    private String nombre;
    private List<AulaVO> aulas;
}
