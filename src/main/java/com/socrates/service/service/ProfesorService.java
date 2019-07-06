package com.socrates.service.service;

import com.socrates.service.vo.PersonaVO;

import java.util.List;

public interface ProfesorService {

    List<PersonaVO> obtenerProfesores();
    PersonaVO obtenerProfesor(Long id);
}
