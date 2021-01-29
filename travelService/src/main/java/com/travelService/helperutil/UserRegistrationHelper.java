package com.travelService.helperutil;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationHelper {

	public String generateBcryptHash(String name) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		return "{bcrypt}" + encoder.encode(name);
		
	}

	public String generateFullname(String firstName ,String lastName) {
		
		
		return firstName+lastName;
		
	}
	
	
	
	
}
