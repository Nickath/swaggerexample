package org.nick.java.webservice.services;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.nick.java.webservice.models.Context;
import org.nick.java.webservice.models.ContextAttribute;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Set;


public interface ContextAPI {

    @Path("/contexts/contexts")
    @GET
    List<Context> getContexts();

    @Path("/contexts/contexts/{contextId}")
    @GET
    Context getContext(@PathParam(value = "contextId") Long contextId);

    @Path("/contexts/contexts")
    @POST
    Response createContext(Context context);

    @Path("/contexts/contexts/{contextId}/attributes")
    @GET
    Set<ContextAttribute> getContextAttributes(@PathParam(value = "contextId") Long contextId);

    @Path("/contexts/contexts/{contextId}/addAttribute")
    @PUT
    Response updateContextAttributes(@PathParam(value = "contextId") Long contextId, ContextAttribute contextAttribute);

    @Path("/contexts/contexts/{contextId}/deleteAttribute/{attributeName}")
    @DELETE
    Set<ContextAttribute> deleteContextAttribute(@PathParam(value = "contextId") Long contextId,
                                                 @PathParam(value = "attributeName") String attributeName);


    @Path("/contexts/contexts/{contextId}/delete")
    @DELETE
    Response deleteContext(@PathParam(value = "contextId") Long contextId);
}
