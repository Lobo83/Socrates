package com.socrates.service.service;

import com.socrates.service.vo.MateriaVO;

import java.util.List;

public interface MateriaService {

    MateriaVO crearMateria(MateriaVO materiaVO);

    List<MateriaVO> obtenerMaterias();

    MateriaVO obtenerMateria(Long id);

    void borrarMateria(Long id);
}
