package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="marks")
	private int marks;
	
	@Column(name="branch")
	private String branch;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", marks=" + marks + ", branch=" + branch + "]";
	}

	public Student(String name, int marks, String branch) {
		super();
		this.name = name;
		this.marks = marks;
		this.branch = branch;
	}

}
