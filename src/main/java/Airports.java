package main.java;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Airports {
    int airportNumber;
    String airportName;
    String city;
    String country;


    public Airports() {
    }

    public int getAirportNumber() {
        return airportNumber;
    }

    public void setAirportNumber(int airportNumber) {
        this.airportNumber = airportNumber;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airportNumber=" + airportNumber +
                ", airportName='" + airportName + '\'' +
                ", City='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
