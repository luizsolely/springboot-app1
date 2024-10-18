package com.spring.usersProject.user;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public record UserUpdateData(

		@NotNull 
		Long id,

		String first_name, 
		String last_name, 
		Sex sex,
		LocalDate birth_date, 
		String email

) {

}
