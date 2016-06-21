package org.user.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.user.api.UserService;

public class Activator implements BundleActivator {

	private UserServiceConsumer consumer;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Bundle started: " + context.getBundle().getSymbolicName());
		ServiceReference reference = context.getServiceReference(UserService.class.getName());
        consumer = new UserServiceConsumer((UserService) context.getService(reference));
        consumer.start();
        
//		User user = new User("1", "Edilson");
//		System.out.println("Ops 123");
//		System.out.println(user.toString());
//		UserBi userBi = new UserBi();
//		System.out.println("after userBi");
//		ServiceReference<UserService> serviceReference = context.getServiceReference(UserService.class);
//		System.out.println(serviceReference.getBundle());
//		System.out.println(serviceReference.toString());
		//userBi.listUsers();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle stoped: " + context.getBundle().getSymbolicName());
	}

}
