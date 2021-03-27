package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "get user called";
	}

	
	@PostMapping
	public String  CreateUser() {
		return "create user called";
	}
	
	
	@PutMapping
	public String  updateUser() {
		return "update user called";
	}
	
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user called";
	}
	
}
