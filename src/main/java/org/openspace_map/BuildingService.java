package org.openspace_map;
import org.openspace_map.api.BuildingApiService;
import org.openspace_map.api.NotFoundException;
import org.openspace_map.model.InlineObject2;
import org.openspace_map.model.InlineObject3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@Transactional
@ApplicationScoped
public class BuildingService implements BuildingApiService {
    @Inject
    EntityManager em;

    @Override
    public Response getBuildingFloorsList(Integer buildingId, SecurityContext securityContext) throws NotFoundException {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            List<BuildingFloor> floors = em.createQuery("SELECT * from building_floor where building_id=:id",
                    BuildingFloor.class).setParameter("id", buildingId).getResultList();
            transaction.commit();

            return Response.ok(floors).build();
        }
        catch (Exception e) {
            return  Response.status(400).build();
        }
    }

    @Override
    public Response postBuilding(InlineObject3 inlineObject3, SecurityContext securityContext) throws NotFoundException {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Building building = new Building(inlineObject3.getAddress());
            List<Building> found = em.createQuery("SELECT * from building where address=:addr",
                    Building.class).setParameter(":addr", building.getAddress()).getResultList();
            if (found.isEmpty()) {
                em.persist(building);
            }
            else {
                transaction.commit();
                return Response.status(400).build();
            }
            transaction.commit();
            return Response.ok().build();
        }
        catch (Exception e) {
            return Response.status(400).build();
        }
    }

    @Override
    public Response postBuildingAdd(Integer buildingId, InlineObject2 inlineObject2, SecurityContext securityContext) throws NotFoundException {
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Building building = em.find(Building.class, buildingId);

            if (building == null) {
                transaction.commit();
                return Response.status(400).build();
            }

            em.createQuery("UPDATE Building b set b.floors_number=b.floors_number+1 WHERE b.id=:id",
                    Building.class).setParameter(":id", building.getId()).executeUpdate();
            transaction.commit();

            transaction.begin();
            building = em.find(Building.class, buildingId);
            BuildingFloor floor = new BuildingFloor(inlineObject2.getFloor());
            floor.setBuilding(building);
            floor.setFloorType(FloorType.OFFICE);
            em.persist(floor);
            transaction.commit();

            return Response.ok().build();
        }
        catch (Exception e) {
            return Response.status(400).build();
        }
    }
}
