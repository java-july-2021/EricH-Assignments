package com.eric.authentication.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.eric.authentication.models.User;


@Repository
public interface UserRepository extends CrudRepository <User, Long> {
    User findByEmail(String email);
    
} 
