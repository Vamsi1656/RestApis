package com.example.demo.configurations;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
		
		
	 return http.csrf().disable().authorizeHttpRequests().requestMatchers("/cars/add").permitAll()
			 .and()
			 .authorizeHttpRequests().requestMatchers("/cars").authenticated()
			 .and().formLogin()
			 .and().build();

   }

}
