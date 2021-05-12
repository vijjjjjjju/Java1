package com.glarimy.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * GET /directory/employee 
 */

@Path("/directory")
public class DirectoryResource {
	@GET
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee get() {
		Directory dir = new Directory();
		Employee employee = dir.find();
		return employee;
	}
}
