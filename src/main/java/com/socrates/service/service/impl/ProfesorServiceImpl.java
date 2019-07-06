package com.socrates.service.service.impl;

import com.socrates.persistence.model.Profesor;
import com.socrates.persistence.repository.ProfesorRepository;
import com.socrates.service.mapper.ProfesorMapper;
import com.socrates.service.service.ProfesorService;
import com.socrates.service.vo.PersonaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {
    @Autowired
    private ProfesorMapper profesorMapper;

    @Autowired
    private ProfesorRepository profesorRepository;
    @Override
    public List<PersonaVO> obtenerProfesores() {
        return profesorMapper.inverseMapping((List<Profesor>) profesorRepository.findAll());
    }

    @Override
    public PersonaVO obtenerProfesor(Long id) {
        return profesorMapper.inverseMapping(profesorRepository.findById(id).get());
    }
}
