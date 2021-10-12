package homework12Clothes;

abstract public class Clothes {
    private Size size;
    private int cost;
    private String color;
    private String name;


    public Clothes( int cost, String color,String name,Size size) {
        this.size = size;
        this.cost = cost;
        this.color = color;
        this.name = name;
    }
    public Size getSize() {
        return size;
    }
    public int getCost() {
        return cost;
    }
    public String getColor() {
        return color;
    }
    public String getName() { return name; }

    }

