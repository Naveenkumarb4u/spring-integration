package com.rythmos.resource;

import com.rythmos.model.Employee;

public class PrintingClass1 {
	
	public Employee saveEmployee(Employee emp){
		System.out.println("==================Service activater called==================");
		System.out.println("==================Sending Employee details to queue==================");
		System.out.println(emp);
		return emp;
	}

}
