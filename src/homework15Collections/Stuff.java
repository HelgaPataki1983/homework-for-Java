package homework15Collections;

public enum Stuff {
    PLATE("Plate",55),
    SHOT_GLASS("Shot_glass", 150),
    FORKS("Forks",30),
    POT("Pot", 200);

    private String name;
    private double price;

    Stuff(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
