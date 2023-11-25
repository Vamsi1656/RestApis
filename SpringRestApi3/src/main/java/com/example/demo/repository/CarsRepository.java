package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cars;

public interface CarsRepository extends JpaRepository<Cars, Serializable> {

}
