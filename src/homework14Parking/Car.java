package homework14Parking;

public class Car extends Vehicle {
    private int numberOfDors;
    private String type;

    public Car(String mark, String color, String carNumber, String type) {
        super(mark, color, carNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}




