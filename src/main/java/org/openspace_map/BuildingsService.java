package org.openspace_map;
import org.openspace_map.api.BuildingsApiService;
import org.openspace_map.api.NotFoundException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;
import java.util.List;


@Transactional
@ApplicationScoped
public class BuildingsService implements BuildingsApiService {
    @Inject
    EntityManager em;

    @Override
    public Response getBuilds(SecurityContext securityContext) throws NotFoundException {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            List<Building> builds = em.createQuery("SELECT * from building", Building.class).getResultList();
            transaction.commit();

            List<String> addresses = new ArrayList<String>();
            for (var build: builds) {
                addresses.add(build.getAddress());
            }

            return Response.ok(addresses).build();
        }
        catch (Exception e) {
            return Response.status(400).build();
        }
    }
}
