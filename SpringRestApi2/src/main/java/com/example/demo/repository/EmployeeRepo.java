package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employees;

public interface EmployeeRepo extends JpaRepository<Employees, Integer>{

}
