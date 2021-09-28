package homework10;

public class Horse extends Animal{
    private String horsesName;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoice() {
        System.out.println("Horse is making i-go-go");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
