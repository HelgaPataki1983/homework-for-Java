package homework10Vehicle;

public class Car extends Vehicle {
    static String carType;
    static String transmission;
    private  int pass;

    public Car(String carType, String transmission, int speed, int pass) {
        this.carType = carType;
        this.transmission = "Manual gearbox";
        this.speed = 55;
        this.pass = pass;
    }

    @Override
    public void move() {
        System.out.println("Car can move");
    }

     @Override
    public void takePassengers(int pass) {
         System.out.println("i can take from 2 to 7 passengers");



    }
}
