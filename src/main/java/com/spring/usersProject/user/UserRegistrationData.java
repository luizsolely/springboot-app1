package com.spring.usersProject.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record UserRegistrationData(

		@NotBlank 
		String first_name,

		@NotBlank 
		String last_name,

		@Enumerated 
		Sex sex,

		@NotNull
		@Past
		@JsonFormat(pattern = "yyyy-MM-dd")
		LocalDate birth_date,

		@Email 
		String email) {

}
