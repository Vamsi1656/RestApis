package com.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestApi.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
