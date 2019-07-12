package com.socrates.service.service;

import com.socrates.service.vo.SesionVO;

import java.util.List;

/**
 * The interface Sesion service.
 */
public interface SesionService {

    /**
     * Crear sesion sesion vo.
     *
     * @param sesionVO the sesion vo
     * @return the sesion vo
     */
    SesionVO crearSesion(SesionVO sesionVO);

    /**
     * Obtener sesiones list.
     *
     * @return the list
     */
    List<SesionVO> obtenerSesiones();

    /**
     * Obtener sesion sesion vo.
     *
     * @param id the id
     * @return the sesion vo
     */
    SesionVO obtenerSesion(Long id);

    /**
     * Borrar sesion.
     *
     * @param id the id
     */
    void borrarSesion(Long id);
}
