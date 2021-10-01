package homework10;

public class Car extends Vehicle {
    static String carType;
    static String transmission;

    public Car(String carType, String transmission, int speed) {
        this.carType = carType;
        this.transmission = transmission;
        this.speed = speed;
    }
    @Override
    void speedUp(int speed) {
        System.out.println("Car have a specific speed up  " + speed + " m/sec");
    }
    @Override
    void applyBreak(int value) {
        System.out.println("Car have a specific apply break  " + value);
    }
    @Override
    public void move() {
        System.out.println("Car can move");
    }
}
