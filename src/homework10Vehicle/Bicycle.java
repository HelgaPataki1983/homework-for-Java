package homework10Vehicle;

public abstract class Bicycle extends Vehicle {
public  int id;
protected int gear;

    public Bicycle(int id, int gear, int speed) {
        this.id = id;
        this.gear = gear;
        this.speed = speed;

    }
    public Bicycle(){}

    @Override
    String speedUp(int value) {
        System.out.println("Bicycle have a specific speed up  " + value + " m/sec");
        return null;
    }

    @Override
    public void applyBreak(int value) {
        System.out.println("Bicycle have a specific apply break  " + value);

    }

    @Override
    public void move() {
        System.out.println("Bicycle can move");

    }
    abstract void changeGear();
}
