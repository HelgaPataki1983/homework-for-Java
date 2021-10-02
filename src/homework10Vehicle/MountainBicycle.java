package homework10Vehicle;

public class MountainBicycle extends Bicycle {
    private int seatHeight;

    public int getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    @Override
    void changeGear() {
        System.out.println("Road bicycle change gear every year");
    }
}
