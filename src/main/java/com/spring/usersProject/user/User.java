package com.spring.usersProject.user;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Table(name = "Users")
@Entity(name = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
	
	public User(UserRegistrationData data) {
		this.first_name = data.first_name();
		this.last_name = data.last_name();
		this.sex = data.sex();
		this.age = data.age();
		this.email = data.email();
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String first_name;
	private String last_name;
	
	@Enumerated(EnumType.STRING)
	private Sex sex;
	private int age;
	private String email;
	
}
