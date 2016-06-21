package org.user.api.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.user.api.UserService;

public class Activator implements BundleActivator {

	private ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle started: "
				+ context.getBundle().getSymbolicName());
		registration = context.registerService(UserService.class.getName(),
				new UserServiceImpl(), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle stoped: "
				+ context.getBundle().getSymbolicName());
		registration.unregister();
	}

}
