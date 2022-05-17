package com.rythmos.resource;

import com.rythmos.model.Employee;

public class PrintSubscriber {

	public Employee display(Employee emp){
		
		System.out.println("\n\n\n=============Service Activator2 invoked====================");
		System.out.println("Got employee from queue");
		System.out.println(emp.toString().toUpperCase());
		return emp;
		
	}
}
