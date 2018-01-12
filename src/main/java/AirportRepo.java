package main.java;


import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AirportRepo {

    Connection con;
    public AirportRepo() {
        String UrlA = "jdbc:sqlserver://mssql-2016.labs.wmi.amu.edu.pl;user=s426213;password=ynM13W1I0p;";
        try
        {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(UrlA);

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public List<main.java.Airports> getAirports()
    {
        List<main.java.Airports> airports = new ArrayList<main.java.Airports>();
        String que = "select * from airports";
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(que);
            while(rs.next())
            {
                main.java.Airports a = new main.java.Airports();
                a.setAirportNumber(rs.getInt(1));
                a.setAirportName(rs.getString(2));
                a.setCity(rs.getString(3));
                a.setCountry(rs.getString(4));
                airports.add(a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return airports;
    }
}
