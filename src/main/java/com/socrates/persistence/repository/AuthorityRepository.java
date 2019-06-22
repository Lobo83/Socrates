package com.socrates.persistence.repository;

import com.socrates.persistence.model.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {
}
