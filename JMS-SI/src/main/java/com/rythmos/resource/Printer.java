package com.rythmos.resource;

import com.rythmos.model.Employee;

public class Printer {

	public Employee saveEmployee(Employee emp){
		
		System.out.println("================Service Activator1 Invoked================================");
		System.out.println(emp);
		return emp;
	}
}
