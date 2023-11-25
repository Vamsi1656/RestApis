package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;

@RestController

public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	// localhost:7782/students to find all the student data.
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		List<Student> students=repo.findAll();
		return students;
	}
	
	//localhost:7782/student/1 to findby id
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student=repo.findById(id).get();
		
		return student;
	}
	
	@PostMapping("/students/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		
		return repo.save(student);
	}
	
	@PutMapping("/students/update/{id}")
	
	public Student updateStudent(@PathVariable int id) {
		Student student =repo.findById(id).get();
		student.setName("SriLeela");
		student.setMarks(99);
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/students/delete/{id}")
	
	public Student removeStudent(@PathVariable int id) {
		
		Student student =repo.findById(id).get();
		repo.delete(student);
		return student;
	}

}
