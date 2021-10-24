package com.example.Bookstore.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserTable, Long> {
	UserTable findByUsername(String username);
}