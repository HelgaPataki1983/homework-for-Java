package homework14Parking;

import homework10Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parking {

    Car volvo = new Car("volvo", "black", "AA1111", "car");
    Bike yamaha = new Bike("yamaha", "black", "AA1112");

    //List<homework14Parking.Vehicle> autorizedObjects = new ArrayList<>(); лист разрешенных машин
    private int permitedVehicle;

    public int getPermitedVehicle() {
        return permitedVehicle;
    }

    /*public void add() {
        autorizedObjects.add(new Car("volvo", "black", "AA1111", "car"));
        autorizedObjects.add(new Bike("yamaha", "black", "AA1112"));*/


    public List autorizedVehicle(List<homework14Parking.Vehicle> vehicleList) {
        for (homework14Parking.Vehicle vehicle : vehicleList) {
            if (permitedVehicle > 9) {
                System.out.println("No more place on the perking");
            } else if (vehicle instanceof Car) {
                if (((Car) vehicle).getType() == "lorry") {
                    System.out.println("Lorry can not be autorized");
                }
            } else if (vehicle.equals(volvo)) {
                System.out.println(permitedVehicle = permitedVehicle + 1); // каунтер не работет, либо цикл до него не доходит
                    //либо неправильно написала


                    // System.out.println(permitedVehicle); тут принт не выводит в консоль ничего

            }

        }
            System.out.println(permitedVehicle);//тут выводит в цикле нули

            return vehicleList;

        }
    }









