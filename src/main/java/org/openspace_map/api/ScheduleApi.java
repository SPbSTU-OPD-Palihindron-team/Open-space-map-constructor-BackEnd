package org.openspace_map.api;

import org.openspace_map.model.*;
import org.openspace_map.api.ScheduleApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openspace_map.model.InlineResponse2008;

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

@Path("/schedule/zone/{zone_id}/employees")


@io.swagger.annotations.Api(description = "the schedule API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public class ScheduleApi  {

    @Inject ScheduleApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "GET endpoint", notes = "Query for getting list of employees according to the zone by its id at the current time. ", response = InlineResponse2008.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "apiKey")
    }, tags={ "zone", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2008.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
    public Response getZonesEmployeesCheck( @PathParam("zone_id") Integer zoneId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getZonesEmployeesCheck(zoneId,securityContext);
    }
}
