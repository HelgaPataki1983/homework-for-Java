package homework14Parking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        Car volvo  = new Car("volvo","black","AA1111","car");
        Bike yamaha = new Bike("yamaha", "black", "AA1112");
        Car mersedes = new Car("mersedes", "black", "AA0000","lorry");
        Car someLorry = new Car("someLorry", "white", "AA0001","lorry");
        Car someLorry1 = new Car("someLorry1", "white", "AA0002","lorry");
        Car porche = new Car("porche", "white", "AA1113","car");
        Bike suzuki = new Bike("suzuki", "yellow", "AA1114");

        List<Vehicle> allObjects = new ArrayList<>();

        allObjects.add(volvo);
        allObjects.add(yamaha);
        allObjects.add(mersedes);
        allObjects.add(someLorry);
        allObjects.add(someLorry1);
        allObjects.add(porche);
        allObjects.add(suzuki);

        parking.autorizedVehicle(allObjects);
        //parking.permitedVehicle(allObjects);


    }
}
