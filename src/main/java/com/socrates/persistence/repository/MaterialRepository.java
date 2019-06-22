package com.socrates.persistence.repository;

import com.socrates.persistence.model.Material;
import org.springframework.data.repository.CrudRepository;

public interface MaterialRepository extends CrudRepository<Material, Long> {
}
