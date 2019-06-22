package com.socrates.persistence.repository;

import com.socrates.persistence.model.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface ProfesorRepository extends CrudRepository<Profesor, Long> {
}
