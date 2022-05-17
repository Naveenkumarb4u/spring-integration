package com.rythmos.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

import com.rythmos.model.Employee;

@Service
@Path("/emp")
public interface IEmployeeService {

	@POST
	@Path("/save")
	@Consumes("application/xml")
	@Produces("application/xml")
	public Employee saveEmployee(Employee emp);
	
	
}
