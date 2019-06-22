package com.socrates.persistence.repository;

import com.socrates.persistence.model.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
