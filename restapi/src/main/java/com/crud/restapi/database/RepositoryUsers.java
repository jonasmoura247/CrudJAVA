package com.crud.restapi.database;

import com.crud.restapi.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsers extends JpaRepository<Users,Long> {
 
}
