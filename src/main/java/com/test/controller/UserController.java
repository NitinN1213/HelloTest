package com.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Users;

@RestController
public class UserController {
	
	@PostMapping
	public String createUser(@RequestBody Users data) {
		
		return "true";
	}
	

}
