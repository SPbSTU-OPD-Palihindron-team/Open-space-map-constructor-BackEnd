package org.openspace_map.api;

import org.openspace_map.api.*;
import org.openspace_map.model.*;


import org.openspace_map.model.InlineResponse20011;

import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public interface RegisteredUserApiService {
      Response getUser(Integer userId,SecurityContext securityContext)
      throws NotFoundException;
      Response putRegistratedUserUserId(Integer userId,SecurityContext securityContext)
      throws NotFoundException;
}
