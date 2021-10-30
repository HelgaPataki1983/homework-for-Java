package homework14Parking;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parking {

    Car volvo = new Car("volvo", "black", "AA1111", "car");
    Bike yamaha = new Bike("yamaha", "black", "AA1112");

    List<Vehicle> autorizedObjects = new ArrayList<>();
    private int permitedVehicle;

    public int getPermitedVehicle() {
        return permitedVehicle;
    }

    public void add() {
        autorizedObjects.add(new Car("volvo", "black", "AA1111", "car"));
        autorizedObjects.add(new Bike("yamaha", "black", "AA1112"));
    }

    public List autorizedVehicle(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            if (permitedVehicle > 9) {
                System.out.println("No more place on the perking");
            } else if (vehicle instanceof Car && ((Car) vehicle).getType() == "lorry") {
                System.out.println("Lorry can not be autorized");
            } else if (vehicle.getColor().equals(autorizedObjects.     записать сюда get.color обьекта из списка autorizedObjects)) {
                permitedVehicle = permitedVehicle + 1;
            } else if (vehicle.equals(yamaha)) {
                permitedVehicle = permitedVehicle + 1;
            }

        }
        System.out.println("The number of autorizing car is " + permitedVehicle);
        return vehicleList;
    }
}

   /* public List permitedVehicle(List<Vehicle> vehicleList){
        for (Vehicle vehicle : vehicleList) {
            if (vehicleList.equals(autorizedObjects)){
                System.out.println(permitedVehicle = permitedVehicle + 1);
            }
        }
return vehicleList;   не работает*/





/*
vehicle.equals(volvo) && vehicle.equals(yamaha)) {
        permitedVehicle = permitedVehicle + 1;
*/







