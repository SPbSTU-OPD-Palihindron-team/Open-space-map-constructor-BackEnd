package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.ZoneApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2009;

import java.util.Map;
import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/zone/{zone_id}/items")


@io.swagger.annotations.Api(description = "the zone API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ZoneApi  {

    @Inject ZoneApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Returns items in zone.", response = InlineResponse2009.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "zone", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2009.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getZoneZoneIdItems( @PathParam("zone_id") Integer zoneId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getZoneZoneIdItems(zoneId,securityContext);
    }
}
