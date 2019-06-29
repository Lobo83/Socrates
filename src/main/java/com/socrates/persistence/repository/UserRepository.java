package com.socrates.persistence.repository;

import com.socrates.persistence.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
