package homework14Parking;

import java.util.Objects;

public  class Vehicle {
    private String mark;
    private String color;
    private String carNumber;

    public Vehicle(String mark, String color, String carNumber) {
        this.mark = mark;
        this.color = color;
        this.carNumber = carNumber;
    }

    public String getMark() {
        return mark;
    }
    public String getColor() {
        return color;
    }
    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return color.equals(vehicle.color) && carNumber.equals(vehicle.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, carNumber);
    }
}
