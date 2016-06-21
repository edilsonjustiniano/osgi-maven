package org.user.api;

import java.util.List;

import org.user.model.User;

public interface UserService {

	List<User> listUsers();

	User retrieveUser(String id);

}
