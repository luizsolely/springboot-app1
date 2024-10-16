package com.spring.usersProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.usersProject.user.User;
import com.spring.usersProject.user.UserRegistrationData;
import com.spring.usersProject.user.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@PostMapping
	public void register(@RequestBody UserRegistrationData data) {
		repository.save(new User(data));
	}
	
}
