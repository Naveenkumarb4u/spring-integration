package com.rythmos.resource;

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
	public String sayHai(){
		return "Hey Integration Team! ";
	}
	

}
