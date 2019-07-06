package com.socrates.persistence.repository;

import com.socrates.persistence.model.Sesion;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Sesion repository.
 */
public interface SesionRepository extends CrudRepository<Sesion, Long> {
}
