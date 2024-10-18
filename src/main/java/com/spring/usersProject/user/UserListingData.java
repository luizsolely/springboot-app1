package com.spring.usersProject.user;

import java.time.LocalDate;

public record UserListingData(

		Long id,
		Boolean active,
		String first_name, 
		String last_name, 
		Sex sex, 
		LocalDate birth_date, 
		String email

) {

	public UserListingData(User user) {
		this(

				user.getId(),
				user.getActive(),
				user.getFirst_name(), 
				user.getLast_name(),
				user.getSex(), 
				user.getBirth_date(),
				user.getEmail()

		);
	}

}
