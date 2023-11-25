package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employees;
import com.example.demo.repository.EmployeeRepo;

@RestController

public class EmployeesController {
	
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/employees/add")
	
	public List<Employees> createEmployees(@RequestBody List<Employees> employee) {
		
		List<Employees> employee1=repo.saveAll(employee);
		
		return (employee1);
	}
	
	@GetMapping("/employees")
	
	public List<Employees> getEmployeesAll() {
		
		List<Employees> employee=repo.findAll();
		return employee;
	}
	
    @GetMapping("/employees/{id}")
	
	public Employees getEmployeesAll1(@PathVariable int id) {
		
		Employees employee=repo.findById(id).get();
		return employee;
	}
    
    @PutMapping("/employees/update/{id}")
     public Employees updateEmployees(@PathVariable int id,@RequestBody Employees employee) {
    	
    	Employees employee1=repo.findById(id).get();
    	
    	employee1.setName(employee.getName());
    	employee1.setSalary(employee.getSalary());
    	employee1.setGender(employee.getGender());
    	
    	return repo.save(employee1);
    }

}
