package homework10Vehicle;

public class Car extends Vehicle {
    static String carType;
    static String transmission;

    public Car(String carType, String transmission, int speed) {
        this.carType = carType;
        this.transmission = "Manual gearbox";
        this.speed = 55;

    }

    @Override
    public void move() {
        System.out.println("Car can move");
    }

     @Override
    public void takePassengers() {
         System.out.println("i can take from 2 to 7 passengers");



    }
}
