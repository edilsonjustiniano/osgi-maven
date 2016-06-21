package org.user.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.user.api.UserService;

public class UserServiceConsumer implements ActionListener {

	private final UserService service;
	
	public UserServiceConsumer(UserService service) {
		this.service = service;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		service.listUsers();
	}
	
	public void start() {
		System.out.println("start");
		this.actionPerformed(null);
	}

}
