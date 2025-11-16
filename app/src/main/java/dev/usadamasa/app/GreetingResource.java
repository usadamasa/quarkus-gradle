package dev.usadamasa.app;

import dev.usadamasa.lib.Lib;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Lib lib = new Lib();
        var message = "Hello from Quarkus REST with Gradle! And " + lib.getMessage();
        return message;
    }
}
