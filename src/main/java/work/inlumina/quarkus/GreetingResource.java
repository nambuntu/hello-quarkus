package work.inlumina.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import work.inlumina.quarkus.service.GreetingService;

@Path("/greeting")
public class GreetingResource {

	@Inject
	GreetingService greetingService;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello/{name}")
	public String hello(@PathParam String name) {
		return greetingService.greeting(name);
	}
}