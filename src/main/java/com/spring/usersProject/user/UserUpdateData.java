package com.spring.usersProject.user;

import jakarta.validation.constraints.NotNull;

public record UserUpdateData(
		
		@NotNull
		Long id,
		
		String first_name,
		String last_name,
		Sex sex,
		String birth_date,
		String email
		
		) {
	
}
