package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.models.*;

@Service
public class UserService {

	private ArrayList<User> userList = new ArrayList<User>(Arrays.asList(
			new User("Rajaie", "rajaie111", "Rajaie@gamil.com"), new User("moath", "moath111", "m@hotmail.com")));

	public ArrayList<User> getUsers() {
		return this.userList;
	}

	public boolean addUser(User user) {
		return this.userList.add(user);
	}

	public boolean deleteUser(String username) {

		for (User user : userList)
			if (user.getUserName().equals(username))
				return userList.remove(user);
		return false;
	}

	public boolean editUser(String username, User newUser) {
		for (User user : userList)
			if (user.getUserName().equalsIgnoreCase(username)) {
				user.setName(newUser.getName());
				user.setEmail(newUser.getEmail());
				return true;
			}
		return false;

	}

}
