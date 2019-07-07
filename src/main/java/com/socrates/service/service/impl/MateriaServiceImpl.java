package com.socrates.service.service.impl;

import com.socrates.persistence.model.Materia;
import com.socrates.persistence.repository.MateriaRepository;
import com.socrates.service.mapper.MateriaMapper;
import com.socrates.service.service.MateriaService;
import com.socrates.service.vo.MateriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {
    @Autowired
    private MateriaMapper materiaMapper;
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public MateriaVO crearMateria(MateriaVO materiaVO) {
        Materia materia=materiaMapper.directMapping(materiaVO);
        materiaRepository.save(materia);
        materiaVO.setId(materia.getId());
        return materiaVO;
    }

    @Override
    public List<MateriaVO> obtenerMaterias() {
        return materiaMapper.inverseMapping((List<Materia>) materiaRepository.findAll());
    }

    @Override
    public MateriaVO obtenerMateria(Long id) {
        return  materiaMapper.inverseMapping(materiaRepository.findById(id).get());
    }

    @Override
    public void borrarMateria(Long id) {
        materiaRepository.deleteById(id);
    }
}
