package com.spring.usersProject.user;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
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
		this.birth_date = data.birth_date();
		this.email = data.email();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Boolean active = true;
	private String first_name;
	private String last_name;

	@Enumerated(EnumType.STRING)
	private Sex sex;

	private LocalDate birth_date;

	private String email;

	public void updateInfo(@Valid UserUpdateData data) {

		if (data.first_name() != null) {
			this.first_name = data.first_name();
		}

		if (data.last_name() != null) {
			this.last_name = data.last_name();
		}

		if (data.sex() != null) {
			this.sex = data.sex();
		}

		if (data.birth_date() != null) {
			this.birth_date = data.birth_date();
		}

		if (data.email() != null) {
			this.email = data.email();
		}

	}

	public void updateStatus() {
		this.active = !(this.active);		
	}
}
