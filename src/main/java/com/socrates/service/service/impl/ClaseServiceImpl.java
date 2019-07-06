package com.socrates.service.service.impl;

import com.socrates.persistence.model.Clase;
import com.socrates.persistence.repository.ClaseRepository;
import com.socrates.service.mapper.ClaseMapper;
import com.socrates.service.service.ClaseService;
import com.socrates.service.vo.ClaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClaseServiceImpl implements ClaseService {
    @Autowired
    private ClaseRepository claseRepository;

    @Autowired
    private ClaseMapper claseMapper;

    @Transactional
    @Override
    public ClaseVO crearClase(ClaseVO claseVO){
        Clase Clase=claseMapper.directMapping(claseVO);
        claseRepository.save(Clase);
        claseVO.setId(Clase.getId());
        return claseVO;
    }

    @Override
    public List<ClaseVO> obtenerClases() {
        return claseMapper.inverseMapping((List<Clase>) claseRepository.findAll());
    }

    @Override
    public ClaseVO obtenerClase(Long id) {
        return  claseMapper.inverseMapping(claseRepository.findById(id).get());
    }

    @Override
    public void borrarClase(Long id) {
        claseRepository.deleteById(id);
    }
}
