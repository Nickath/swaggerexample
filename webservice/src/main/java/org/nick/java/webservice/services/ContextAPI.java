package org.nick.java.webservice.services;

import io.swagger.annotations.Api;
import org.nick.java.webservice.model.Context;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Set;


public interface ContextAPI {

/*    @Path("/contexts/contexts")
    @GET*/
    List<Context> getContexts();



}
