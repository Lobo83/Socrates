package com.socrates.service.service;

import com.socrates.service.vo.ClaseVO;

import java.util.List;

public interface ClaseService {
    /**
     * Crear Clase Clase vo.
     *
     * @param claseVO the Clase vo
     * @return the Clase vo
     */
    ClaseVO crearClase(ClaseVO claseVO);

    /**
     * Obtener Clases list.
     *
     * @return the list
     */
    List<ClaseVO> obtenerClases();

    /**
     * Obtener Clase Clase vo.
     *
     * @param id the id
     * @return the Clase vo
     */
    ClaseVO obtenerClase(Long id);

    /**
     * Borrar Clase.
     *
     * @param id the id
     */
    void borrarClase(Long id);
}
