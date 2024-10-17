package com.spring.usersProject.user;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRegistrationData(
		
		@NotBlank
		String first_name, 
		
		@NotBlank
		String last_name, 
		
		@Enumerated
		Sex sex, 
		
		@NotBlank
		String birth_date,
		
		@Email
		String email) {

}
