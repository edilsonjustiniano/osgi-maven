package org.user.api.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.user.api.UserService;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle started: "
				+ context.getBundle().getSymbolicName());
		context.registerService(UserService.class, new UserServiceImpl(), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle stoped: "
				+ context.getBundle().getSymbolicName());
	}

}
