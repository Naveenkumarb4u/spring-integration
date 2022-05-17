package com.rythmos.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.rythmos.model.Employee;

@Service					//will automatically be added to the Spring application context at startup
@Path("/employee")
public class EmployeeService {
	
	@POST
	@Produces("application/xml")
	@Consumes("application/xml")
	@Path("/create")
	public void createEmployee(Employee emp){
		
		List<Employee> employees	= new ArrayList();
		employees.add(emp);
		System.out.println(employees);
		
	}

}
