package org.openspace_map.api;

import org.openspace_map.api.*;
import org.openspace_map.model.*;


import org.openspace_map.model.InlineObject4;
import org.openspace_map.model.Item;

import java.util.List;
import org.openspace_map.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-16T23:32:48.977899+03:00[Europe/Moscow]")
public interface ItemsApiService {
      Response getItems(SecurityContext securityContext)
      throws NotFoundException;
      Response postItemsSave(InlineObject4 inlineObject4,SecurityContext securityContext)
      throws NotFoundException;
}
