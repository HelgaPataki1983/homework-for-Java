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

        List<Vehicle> autorizedObjects = new ArrayList<>();
        List<homework14Parking.Vehicle> allObjects = new ArrayList<>();

        allObjects.add(new Car("volvo","black","AA1111","car"));
        allObjects.add(new Bike("yamaha", "black", "AA1112"));
        allObjects.add(new Car("mersedes", "black", "AA0000","lorry"));
        allObjects.add(new Car("someLorry", "white", "AA0001","lorry"));
        allObjects.add(new Car("someLorry1", "white", "AA0002","lorry"));
        allObjects.add(new Car("someLorry1", "white", "AA0002","lorry"));
        allObjects.add(new Car("porche", "white", "AA1113","car"));
        allObjects.add(new Bike("suzuki", "yellow", "AA1114"));

        parking.autorizedVehicle(allObjects);


    }
}
