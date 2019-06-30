package com.socrates.service.service;

import com.socrates.service.vo.PersonaVO;

import java.util.List;

/**
 * The interface Persona service.
 */
public interface PersonaService {
    /**
     * Crear persona.
     *
     * @param personaVO the persona vo
     */
    void crearPersona(PersonaVO personaVO);

    /**
     * Obtener todas list.
     *
     * @return the list
     */
    List<PersonaVO> obtenerPersonas();
}
