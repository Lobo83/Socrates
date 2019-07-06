package com.socrates.service.service.impl;

import com.socrates.persistence.model.Aula;
import com.socrates.persistence.repository.AulaRepository;
import com.socrates.service.mapper.AulaMapper;
import com.socrates.service.service.AulaService;
import com.socrates.service.vo.AulaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AulaServiceImpl implements AulaService {
    @Autowired
    private AulaRepository aulaRepository;

    @Autowired
    private AulaMapper aulaMapper;

    @Transactional
    @Override
    public AulaVO crearAula(AulaVO aulaVO){
        Aula aula=aulaMapper.directMapping(aulaVO);
        aulaRepository.save(aula);
        aulaVO.setId(aula.getId());
        return aulaVO;
    }

    @Override
    public List<AulaVO> obtenerAulas() {
        return aulaMapper.inverseMapping((List<Aula>) aulaRepository.findAll());
    }

    @Override
    public AulaVO obtenerAula(Long id) {
        return  aulaMapper.inverseMapping(aulaRepository.findById(id).get());
    }

    @Override
    public void borrarAula(Long id) {
        aulaRepository.deleteById(id);
    }
}
