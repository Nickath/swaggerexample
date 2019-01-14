package org.nick.java.webservice.services.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.swaggerexample.demo.services.ContextAPI;
import org.springframework.stereotype.Service;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.*;

@Service
@Path("/jcpabecontextsapi")
@Consumes("application/json")
@Produces("application/json")
@Api(value = "Contexts API", produces = "application/json", description = "description", hidden = false)
public class ContextAPIImpl implements ContextAPI {


    @Override
    @GET
    @ApiOperation( value = "get contexts",
            response = List.class)
    public List<Context> getContexts() {
        return null;
    }


}
