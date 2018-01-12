package main.java;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Plane {
    int planeNumber;
    int maxPeople;
    String tag;
    String planeModel;


    public Plane() {
    }

    public int getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(int planeNumber) {
        this.planeNumber = planeNumber;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeNumber=" + planeNumber +
                ", maxPeople=" + maxPeople +
                ", tag='" + tag + '\'' +
                ", planeModel='" + planeModel + '\'' +
                '}';
    }
}
