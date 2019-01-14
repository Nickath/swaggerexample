package org.nick.java.webservice.services.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.nick.java.webservice.model.Context;

import org.nick.java.webservice.services.ContextAPI;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.*;

@Service
@Path("/jcpabecontextsapi")
@Consumes("application/json")
@Produces("application/json")
@Api(value = "Contexts API", produces = "application/json")
public class ContextAPIImpl implements ContextAPI {


    @GET
    @Path("/contexts/contexts")
    @ApiOperation( value = "get contexts",
            response = List.class)
    public List<Context> getContexts() {
        List<Context> contexts  =  new ArrayList<>();
        contexts.add(new Context(1L));
        return contexts;
    }

}
