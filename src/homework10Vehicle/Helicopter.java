package homework10Vehicle;

import java.util.Objects;

public class Helicopter extends Vehicle{
    int amountOfPassengers;
    int maxHeight;
    int tankSize;

    public Helicopter(int amountOfPassengers, int maxHeight, int tankSize) {
        this.amountOfPassengers = 43;
        this.maxHeight = 150;
        this.tankSize = 12;
    }

    @Override
    public void move() {
        System.out.println("Helicopter can move");
    }
    @Override
    public String toString() {
        return "Helicopter has " +
                "amountOfPassengers =" + amountOfPassengers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPassengers == that.amountOfPassengers && maxHeight == that.maxHeight && tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPassengers, maxHeight, tankSize);
    }

    @Override
    public void takePassengers() {
        System.out.println("i can take from 2 to 4 passengers");


    }
}
