package com.socrates.service.vo;

import com.socrates.service.NivelEnum;
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
    private NivelEnum nivel;
    private List<AulaVO> aulas;
}
