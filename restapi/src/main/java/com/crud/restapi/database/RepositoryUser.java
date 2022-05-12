package com.crud.restapi.database;

import com.crud.restapi.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User,Long> {
    
}
