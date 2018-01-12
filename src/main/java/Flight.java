package main.java;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flight {
    int flightNumber;   //Flight number
    int planeNumber;    // Plane number (It is a number of airplane model
    int pilotNumber;    //It is a identifying number of pilot
    String departureTime; // Time of departure
    String arrivalTime; //Just Arrival time
    int numberOfPeople; //Number of People just...
    int from;
    int to;
    public Flight() {
    }

    //Getters & Setters section below

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(int planeNumber) {
        this.planeNumber = planeNumber;
    }

    public int getPilotNumber() {
        return pilotNumber;
    }

    public void setPilotNumber(int pilotNumber) {
        this.pilotNumber = pilotNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", planeNumber=" + planeNumber +
                ", pilotNumber=" + pilotNumber +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
