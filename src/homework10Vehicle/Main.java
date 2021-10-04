package homework10Vehicle;

import homework10Animal.*;

public class Main {
    public static void main(String[] args) {

        {
            Helicopter helicopter = new Helicopter(12, 150, 230);
            Helicopter helicopter1 = new Helicopter(13, 160, 240);
            Bicycle bicycle = new RoadBicycle(12);
            Bicycle bicycle1 = new RoadBicycle(15);
            Car car = new Car("Sedan", "Manual gearbox", 350, 5);
            car.move();
            System.out.println("Speed of car " + car.speed + " m/min");
            bicycle.applyBreak(23);
            System.out.println(helicopter.toString());
        }
    }
}
