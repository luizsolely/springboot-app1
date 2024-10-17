package com.spring.usersProject.user;

public record UserListingData(
		
		Long id,
		String first_name,
		String last_name,
		Sex sex,
		String birth_date,
		String email
		
		) {

	public UserListingData(User user) {
		this(
				
			user.getId(), 
			user.getFirst_name(), 
			user.getLast_name(), 
			user.getSex(), 
			user.getBirth_date(), 
			user.getEmail()
			
			);	
	}
	
}
