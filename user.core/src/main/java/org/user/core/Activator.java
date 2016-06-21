package org.user.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.user.api.UserService;
import org.user.model.User;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle started: " + context.getBundle().getSymbolicName());
		User user = new User("1", "Edilson");
		System.out.println("Ops 123");
		System.out.println(user.toString());
		UserBi userBi = new UserBi();
		System.out.println("after userBi");
		ServiceReference<UserService> serviceReference = context.getServiceReference(UserService.class);
		System.out.println(serviceReference.getBundle());
		System.out.println(serviceReference.toString());
		//userBi.listUsers();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle stoped: " + context.getBundle().getSymbolicName());
		
	}

}
