package homework10Vehicle;

public class RoadBicycle extends Bicycle {

    private int rudderDepth;

    public RoadBicycle(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }
        public void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    @Override
    void changeGear() {
        System.out.println("Road bicycle change gear every year");

    }
}
