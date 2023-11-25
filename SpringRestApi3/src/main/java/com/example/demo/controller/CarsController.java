package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cars;
import com.example.demo.repository.CarsRepository;

@RestController
public class CarsController {
	
	@Autowired
	CarsRepository repo;
	
	@PostMapping("/cars/add")
	
       public List<Cars> createEmployees(@RequestBody List<Cars> car) {
		
		List<Cars> cars=repo.saveAll(car);
		
		return (cars);
	
	}
	
	@GetMapping("/cars/{id}")
	public Cars getCars(@PathVariable int id) {
		
		Cars car=repo.findById(id).get();
		return car;
	}
	
	@GetMapping("/cars")
	public List<Cars> getCar() {
		
		List<Cars> car1=repo.findAll();
		return car1;
	}
	
	@PutMapping("/cars/update/{id}")
	
	public Cars updateCars(@PathVariable int id,@RequestBody Cars car) {
		
		Cars carss=repo.findById(id).get();
		carss.setName(car.getName());
		carss.setMailage(car.getMailage());
		carss.setPrice(car.getPrice());
		carss.setModel(car.getModel());
		return repo.save(carss);
	}

}
