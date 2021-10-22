package homework14Parking;

import homework10Vehicle.Vehicle;

public class Bike  {
    private String mark;
    private String color;
    private String bikeNumber;


    public Bike(String color, String bikeNumber,String mark) {
        this.mark = mark;
        this.color = color;
        this.bikeNumber = bikeNumber;
    }
    public String getColor() {
        return color;
    }
    public String getBikeNumber() {
        return bikeNumber;
    }



}
