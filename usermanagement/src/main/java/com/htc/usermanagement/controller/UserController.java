package com.htc.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.usermanagement.dao.IUser;
import com.htc.usermanagement.entity.User;
@RestController
@RequestMapping("/api")

public class UserController {

	
	@Autowired
	IUser userdao;	
	
	
	
	@PostMapping("/users") User createUser(@RequestBody User user)
	{
		 return userdao.save(user);
		
	}
	
	@GetMapping("/users/{userId}")
	User getUserbyId(@PathVariable Long userId)
	{
		User user=null;
		user=userdao.findById(userId).get();
		return user;
		
	}
	
	
	
}
