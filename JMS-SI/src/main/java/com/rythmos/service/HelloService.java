package com.rythmos.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/hello")
public class HelloService {
	
	@GET
	@Produces("text/plain")
	@Path("/test")
	public String welcome(){
		return "Welcome Naveen!";
	}
}
