package com.example.user.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by momcilodavidovic on 10/16/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
