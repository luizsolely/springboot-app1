package com.spring.usersProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.usersProject.user.User;
import com.spring.usersProject.user.UserListingData;
import com.spring.usersProject.user.UserRegistrationData;
import com.spring.usersProject.user.UserRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping
	@Transactional
	public void registerUsers(@RequestBody @Valid UserRegistrationData data) {
		repository.save(new User(data));
	}
	
	@GetMapping
	public List<UserListingData> listUsers() {
		return repository.findAll().stream().map(UserListingData::new).toList();
	}
	
}
