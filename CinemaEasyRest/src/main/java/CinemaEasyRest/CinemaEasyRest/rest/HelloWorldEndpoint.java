package CinemaEasyRest.CinemaEasyRest.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.swagger.annotations.SwaggerDefinition;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
@SwaggerDefinition
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello from Thorntail!").build();
	}
}
