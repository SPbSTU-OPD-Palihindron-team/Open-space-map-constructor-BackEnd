package org.openspace_map.api;

import org.openspace_map.api.*;
import org.openspace_map.model.*;


import org.openspace_map.model.InlineObject2;
import org.openspace_map.model.InlineObject3;
import org.openspace_map.model.InlineResponse2003;

import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public interface BuildingApiService {
      Response getBuildingFloorsList(Integer buildingId,SecurityContext securityContext)
      throws NotFoundException;
      Response postBuilding(InlineObject3 inlineObject3,SecurityContext securityContext)
      throws NotFoundException;
      Response postBuildingAdd(Integer buildingId,InlineObject2 inlineObject2,SecurityContext securityContext)
      throws NotFoundException;
}
