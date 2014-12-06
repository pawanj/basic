package com.tool.ws.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

@Path("/newResource")
@Singleton
public class Resource {
	
	@GET
	@Path("/haha")
	@Produces(MediaType.APPLICATION_JSON)
	public String haha(){
		System.out.println("haha");
		return "hello world";
	}

	@POST
	@Path("/status/{str}")
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String status(@PathParam("str") String str){
		System.out.println("test string : " + str);
		return "received string " + str;
	}
}
