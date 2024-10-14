package com.unisoft.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/auth")
public class AuthController {

    @POST
    @Path("/token")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAuthToken() {
        return "1234";
    }
}
