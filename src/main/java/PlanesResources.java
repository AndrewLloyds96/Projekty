package main.java;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/planes")
public class PlanesResources {
    main.java.PlaneRepo reposy = new main.java.PlaneRepo();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<main.java.Plane> getPlanes(){

        System.out.println("Planes have been generated");
        return reposy.getPlanes();

    }

}
