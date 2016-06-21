package org.user.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.user.api.UserService;
import org.user.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> listUsers() {
		List<User> users = new ArrayList<>();
		System.out.println("listUsers");
		users.add(new User("007", "James Bond"));
		System.out.println(users.toString());
		return users;
	}

	@Override
	public User retrieveUser(String id) {
		return null;
	}

	
}
