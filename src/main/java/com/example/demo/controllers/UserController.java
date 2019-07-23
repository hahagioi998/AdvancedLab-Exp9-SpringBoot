package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/users")
	public ArrayList<User> getUsers() {
		return service.getUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/users")
	public boolean addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/users/{username}")
	public boolean deleteUser(@PathVariable String username) {
		return service.deleteUser(username);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/users/{username}")
	public boolean updateUser(@PathVariable String username,@RequestBody User user) {
		return service.editUser(username, user);
	}
	
	
	
	
}
