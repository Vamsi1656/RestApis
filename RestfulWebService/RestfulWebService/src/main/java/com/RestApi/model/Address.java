package com.RestApi.model;

import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="address")

public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="addressId")
	private Long addressId;
	
	@Column(name="city")
	private String city;
	
	@Column(name="addresstype")
	private String addresstype;
	


}
