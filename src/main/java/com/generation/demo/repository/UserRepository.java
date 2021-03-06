package com.generation.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
