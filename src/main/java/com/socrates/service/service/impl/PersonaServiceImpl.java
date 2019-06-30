package com.socrates.service.service.impl;

import com.socrates.persistence.model.Alumno;
import com.socrates.persistence.model.Profesor;
import com.socrates.persistence.repository.AlumnoRepository;
import com.socrates.persistence.repository.ProfesorRepository;
import com.socrates.service.mapper.AlumnoMapper;
import com.socrates.service.mapper.ProfesorMapper;
import com.socrates.service.service.PersonaService;
import com.socrates.service.vo.PersonaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private AlumnoMapper alumnoMapper;

    @Autowired
    private ProfesorMapper profesorMapper;

    @Override
    @Transactional
    public void crearPersona(PersonaVO personaVO) {

        switch (personaVO.getTipoPersona()){
            case ALUMNO:
                Alumno alumno = alumnoMapper.directMapping(personaVO);
                alumnoRepository.save(alumno);
                personaVO.setIdPersona(alumno.getIdPersona());
                break;
            case PROFESOR:
                Profesor profesor = profesorMapper.directMapping(personaVO);
                profesorRepository.save(profesor);
                personaVO.setIdPersona(profesor.getIdPersona());
                break;
        }
    }

    @Override
    public List<PersonaVO> obtenerPersonas() {
        List<Alumno> alumnos= (List<Alumno>) alumnoRepository.findAll();
        List<Profesor> profesores= (List<Profesor>) profesorRepository.findAll();
        List<PersonaVO> personas = alumnoMapper.inverseMapping(alumnos);
        personas.addAll( profesorMapper.inverseMapping(profesores));
        return personas;
    }
}

