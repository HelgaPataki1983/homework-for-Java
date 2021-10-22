package homework14Parking;

import homework10Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parking {


    Vehicle car = new Car("black", "AA3456", "car");
    Vehicle car1 = new Bike("black", "AB3435", "bike");

    List<Vehicle> autorizedObjects = new ArrayList<>();
    private int permitedVehicle;

    public void add() {
        autorizedObjects.add(new Car("black", "AA3456", "car"));
        autorizedObjects.add(new Bike("black", "AB3435", "bike"));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parking parking = (Parking) o;
        return permitedVehicle == parking.permitedVehicle && car.equals(parking.car) && car1.equals(parking.car1) && autorizedObjects.equals(parking.autorizedObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, car1, autorizedObjects, permitedVehicle);
    }

    public List autorizedVehicle(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            if (permitedVehicle > 9) {
                System.out.println("No more place on the perking");
            } else if (vehicle instanceof Car) {
                if (((Car) vehicle).getType() == "lorry") {
                    System.out.println("Lorry can not be autorized");
                } else if (vehicle instanceof Car) {
                    if (vehicle.equals(this.autorizedObjects)) {
                        permitedVehicle = permitedVehicle + 1;
                       // System.out.println(permitedVehicle);
                    }

                }

            }
            System.out.println(permitedVehicle);
        }
        return vehicleList;

    }
    }


// if (vehicleList.size() > 10)
//if (((Car) vehicle).getType() == "car" && ((Car) vehicle).getCarNumber() == "AA3456" && ((Car) vehicle).getColor() == "black")







