package com.socrates.persistence.repository;

import com.socrates.persistence.model.UserRoles;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface User roles repository.
 */
public interface UserRolesRepository extends CrudRepository<UserRoles, Long> {
}
