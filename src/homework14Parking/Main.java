package homework14Parking;

import homework10Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        Vehicle volvo  = new Car("black", "AA3456", "car");
        Vehicle yamaha = new Bike("black", "AB3435", "yamaha");
        Vehicle mersedes = new Car("black", "AA4453", "lorry");
        Vehicle someLorry = new Car("black", "AA4452", "lorry");
        Vehicle someLorry1 = new Car("black", "AA4455", "lorry");
        Vehicle porche = new Car("white", "AA3456", "car");
        Vehicle yava = new Car("white", "AB3435", "bike");

        List<Vehicle> autorizedObjects = new ArrayList<>();
        List<Vehicle> allObjects = new ArrayList<>();

        allObjects.add(new Car("black", "AA3456", "car"));
        allObjects.add(new Bike("black", "AB3435", "yamaha"));
        allObjects.add(new Car("black", "AA4453", "lorry"));
        allObjects.add(new Car("black", "AA4452", "lorry"));
        allObjects.add(new Car("black", "AA4455", "lorry"));
        allObjects.add(new Car("white", "AA3456", "car"));
        allObjects.add(new Car("white", "AB3435", "bike"));
        allObjects.add(new Car("black", "AA3456", "car"));
        allObjects.add(new Bike("black", "AB3435", "bike"));

       /* allObjects.add(new Bike("white", "AB3435", "bike"));
        allObjects.add(new Bike("white", "AB3435", "bike"));
        allObjects.add(new Bike("white", "AB3435", "bike"));
        allObjects.add(new Bike("white", "AB3435", "bike"));
*/





        parking.autorizedVehicle(allObjects);


    }
}
