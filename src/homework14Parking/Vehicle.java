package homework14Parking;

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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
