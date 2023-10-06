package com.dk.journee.api.auth;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/auth")
public class AuthResource {

    @GET
    public Response test() {
        return Response.ok().build();
    }
}
