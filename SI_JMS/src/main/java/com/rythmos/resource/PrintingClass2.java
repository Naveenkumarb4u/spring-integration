package com.rythmos.resource;

import com.rythmos.model.Employee;

public class PrintingClass2 {
	
	public Employee showEmployee(Employee emp){
		System.out.println("\n\n\n==================Service activater called==================");
		System.out.println("==================Getting Employee details from queue==================");
		System.out.println(emp);
		return emp;
	}

}
