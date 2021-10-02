package homework10Vehicle;

import homework10Animal.*;

public class Main {

    {
        Helicopter helicopter = new Helicopter(12, 150, 230);
        Helicopter helicopter1 = new Helicopter(13, 160, 240);
        Bicycle bicycle = new RoadBicycle(12);
        Bicycle bicycle1 = new RoadBicycle(15);
        Vehicle car = new Car("Sedan", "Manual gearbox", 350);
        System.out.println(car.move() + "with speed" + car.);
        System.out.println(bicycle.move() + helicopter.move());
    }
}
