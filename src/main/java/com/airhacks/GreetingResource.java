/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Nino
 */
@Path("greetings")
public class GreetingResource {
    
    @GET
    @Path("hello")
    public String greet() {
        return "Hello " + System.currentTimeMillis();
    }
}
