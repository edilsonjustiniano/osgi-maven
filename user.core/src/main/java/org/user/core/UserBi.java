package org.user.core;

import java.util.List;

import org.user.api.UserService;
import org.user.model.User;

public class UserBi {

	private UserService userService;

	public void listUsers() {
		User user = new User();
		user.setId("01");
		user.setName("Edilson de Souza Justiniano");

		System.out.println(user.toString());

		List<User> users = userService.listUsers();
		for (User iter : users) {
			System.out.println(iter.toString());
		}
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
