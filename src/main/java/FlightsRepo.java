package main.java;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class FlightsRepo
{
        Connection conn;
        public FlightsRepo()
        {
            String UrlA = "jdbc:sqlserver://mssql-2016.labs.wmi.amu.edu.pl;user=s426213;password=ynM13W1I0p;";
            String username = "s426213";
            String password = "ynM13W1I0p";
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(UrlA);

            }catch(Exception e) {

                System.out.println(e);

            }

        }
        public List<main.java.Flight> getFlights()
        {
            List<main.java.Flight> flights = new ArrayList<main.java.Flight>();
            String que = "select * from flights";
            try {

                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(que);
                while(rs.next())
                {
                    main.java.Flight fly = new main.java.Flight();
                    fly.setFlightNumber(rs.getInt(1));
                    fly.setPilotNumber(rs.getInt(2));
                    fly.setPlaneNumber(rs.getInt(3));
                    fly.setArrivalTime(rs.getString(4));
                    fly.setDepartureTime(rs.getString(5));
                    fly.setNumberOfPeople(rs.getInt(6));
                    fly.setFrom(rs.getInt(7));
                    fly.setTo(rs.getInt(8));
                    flights.add(fly);
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
            return flights;
        }
        public main.java.Flight checkFlight(int id)
        {

               String que = "select * from flights where FlightNumber="+id+"";
               main.java.Flight flight = new main.java.Flight();
               try {

                   Statement stat = conn.createStatement();
                   ResultSet rs = stat.executeQuery(que);
                   while(rs.next())
                   {
                       flight.setFlightNumber(rs.getInt(1));
                       flight.setPilotNumber(rs.getInt(2));
                       flight.setPlaneNumber(rs.getInt(3));
                       flight.setArrivalTime(rs.getString(4));
                       flight.setDepartureTime(rs.getString(5));
                       flight.setNumberOfPeople(rs.getInt(6));
                       flight.setFrom(rs.getInt(7));
                       flight.setTo(rs.getInt(8));
                   }
               }catch(Exception e)
               {
                   System.out.println(e);
               }

           return flight;
        }
        public void createFlight(main.java.Flight fl)
        {
            String que = "insert into flights(PilotNumber,PlaneNumber,Arrival,Departure,NumberOfPeople,[From],[To]) values(?,?,?,?,?,?,?)";
            try
            {

                PreparedStatement st = conn.prepareStatement(que);

                st.setInt(1,fl.getPilotNumber());
                st.setInt(2,fl.getPlaneNumber());
                st.setString(3,fl.getArrivalTime());
                st.setString(4,fl.getDepartureTime());
                st.setInt(5,fl.getNumberOfPeople());
                st.setInt(6,fl.getFrom());
                st.setInt(7,fl.getTo());
                st.executeUpdate();
            }
            catch (Exception e)
            {

                System.out.println(e);

            }
        }

    public void delete(int id) {
        String que = "delete from flights where FlightNumber=?";
        try
        {
            PreparedStatement st = conn.prepareStatement(que);
            st.setInt(1,id);
            st.executeUpdate();
        }
        catch (Exception e)
        {

            System.out.println(e);
        }

    }
}
