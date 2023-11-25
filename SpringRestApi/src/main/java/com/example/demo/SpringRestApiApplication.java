package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;

@SpringBootApplication
public class SpringRestApiApplication implements CommandLineRunner {
	
	@Autowired
	StudentRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student();
		s1.setName("Nani");
		s1.setMarks(98);
		s1.setBranch("CSE");
		

		Student s2=new Student();
		s2.setName("Virat");
		s2.setMarks(100);
		s2.setBranch("IT");
		
		
		
		List<Student> listofStudents=Arrays.asList(s1,s2);
		
		System.out.println(listofStudents);
		
		repo.saveAll(listofStudents);
		
		
	}
	
	
}
