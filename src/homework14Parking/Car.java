package homework14Parking;

public class Car extends Vehicle {
    private
    private String type;
    private String color;
    private String carNumber;

    public Car(String type, String color, String carNumber) {
        super(type, color, carNumber);
    }

    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public String getCarNumber() { return carNumber;}

}
