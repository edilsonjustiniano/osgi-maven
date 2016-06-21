package org.user.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle started: "
				+ context.getBundle().getSymbolicName());
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bundle stoped: "
				+ context.getBundle().getSymbolicName());
	}

}
