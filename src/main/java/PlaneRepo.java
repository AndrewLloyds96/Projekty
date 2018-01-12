package main.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PlaneRepo {
    Connection con;

    public PlaneRepo() {
        String UrlA = "jdbc:sqlserver://mssql-2016.labs.wmi.amu.edu.pl;user=s426213;password=ynM13W1I0p;";
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(UrlA);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public List<main.java.Plane> getPlanes()
    {
        List<main.java.Plane> planes = new ArrayList<main.java.Plane>();
        String que = "Select * from Planes";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(que);
            while(rs.next())
            {
                main.java.Plane plane = new main.java.Plane();
                plane.setPlaneNumber(rs.getInt(1));
                plane.setMaxPeople(rs.getInt(2));
                plane.setTag(rs.getString(3));
                plane.setPlaneModel(rs.getString(4));
                planes.add(plane);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return planes;
    }
}
