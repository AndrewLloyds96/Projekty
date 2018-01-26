package main.java;

import javax.ws.rs.*;
import java.util.List;
import javax.ws.rs.core.MediaType;


@Path("/flights")
public class FlightResources {
    main.java.FlightsRepo repo = new main.java.FlightsRepo();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<main.java.Flight> getFlight(){
        System.out.println("Flights have been generated");

        return repo.getFlights();
    }
    @GET
    @Path("getflight/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public main.java.Flight getaccFlight(@PathParam("id") int id){

        return repo.checkFlight(id);
    }

    @POST
    @Path("flightadd")
    public main.java.Flight addFlight(main.java.Flight fl){
        System.out.println(fl);
        repo.createFlight(fl);
        return fl;
    }

    @DELETE
    @Path("deleteflight/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public main.java.Flight deleteFlight(@PathParam("id") int id)
    {
        main.java.Flight delF = repo.checkFlight(id);
        if(delF.getFlightNumber()!=0)
        {
         repo.delete(id);
        }
        return delF;
    }


}
