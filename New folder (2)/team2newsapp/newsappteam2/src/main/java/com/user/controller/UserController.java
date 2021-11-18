package com.user.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;
@RestController

public class UserController 
{
	@Autowired
	UserService service;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		try {
			service.addUser(user);
			System.out.println(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<?> removeUserById(@PathVariable("userId") long userId)
	{
		boolean deleted =service.deleteUserById(userId);
		if(deleted)
		{
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		
	}
	
	
	
	@PutMapping("/users")
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		User UpdatedUser=service.updateUser(user);
		return new ResponseEntity<>(UpdatedUser,HttpStatus.CREATED);
		
	}	
	
	
}
