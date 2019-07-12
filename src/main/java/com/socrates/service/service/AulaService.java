package com.socrates.service.service;

import com.socrates.service.vo.AulaVO;

import java.util.List;

/**
 * The interface Aula service.
 */
public interface AulaService {


    /**
     * Crear aula aula vo.
     *
     * @param aulaVO the aula vo
     * @return the aula vo
     */
    AulaVO crearAula(AulaVO aulaVO);

    /**
     * Obtener aulas list.
     *
     * @return the list
     */
    List<AulaVO> obtenerAulas();

    /**
     * Obtener aula aula vo.
     *
     * @param id the id
     * @return the aula vo
     */
    AulaVO obtenerAula(Long id);

    /**
     * Borrar aula.
     *
     * @param id the id
     */
    void borrarAula(Long id);
}
