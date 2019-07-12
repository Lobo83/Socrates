package com.socrates.service.service.impl;

import com.socrates.persistence.model.Sesion;
import com.socrates.persistence.repository.SesionRepository;
import com.socrates.service.mapper.SesionMapper;
import com.socrates.service.service.SesionService;
import com.socrates.service.vo.SesionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SesionServiceImpl implements SesionService {
    @Autowired
    private SesionRepository sesionRepository;

    @Autowired
    private SesionMapper sesionMapper;

    @Transactional
    @Override
    public SesionVO crearSesion(SesionVO sesionVO){
        Sesion sesion= sesionMapper.directMapping(sesionVO);
        sesionRepository.save(sesion);
        sesionVO.setId(sesion.getId());
        return sesionVO;
    }

    @Override
    public List<SesionVO> obtenerSesiones() {
        return sesionMapper.inverseMapping((List<Sesion>) sesionRepository.findAll());
    }

    @Override
    public SesionVO obtenerSesion(Long id) {
        return  sesionMapper.inverseMapping(sesionRepository.findById(id).get());
    }

    @Override
    public void borrarSesion(Long id) {
        sesionRepository.deleteById(id);
    }
}
