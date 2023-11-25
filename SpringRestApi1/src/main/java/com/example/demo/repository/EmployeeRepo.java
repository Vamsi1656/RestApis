package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entities.Employee;

public interface EmployeeRepo extends JpaRepositoryImplementation<Employee, Integer>{

}
