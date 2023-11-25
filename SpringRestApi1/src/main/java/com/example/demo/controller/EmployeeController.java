package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepo;

@RestController

public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/employees/add")
	
	public Employee createemployee(@RequestBody Employee employee) {
		
		return repo.save(employee);
	}
	
	@GetMapping("/employees/{id}")
	
	public Employee getEmployee(@PathVariable int id) {
		
		Employee employee=repo.findById(id).get();
		
		return employee;
	}
	
	@PutMapping("/employees/update/{id}")
	
	public Employee updateEmployee(@PathVariable int id) {
		
		Employee employee=repo.findById(id).get();
		
		employee.setName("Pallavi");
		employee.setCity("Kerala");
		
		repo.save(employee);
		
		return employee;
	}
	
	@DeleteMapping("/employees/delete/{id}")
	
	public Employee deleteEmployee(@PathVariable int id) {
		
	     Employee employee=repo.findById(id).get();
	     
	     repo.delete(employee);
	     
	     return employee;
	}
	

}
