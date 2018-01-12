package main.java;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/airports")
public class AirportResources {
    main.java.AirportRepo repos = new main.java.AirportRepo();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<main.java.Airports> getAirports(){
        System.out.println("Airports have been generated");
        return repos.getAirports();
    }

}
