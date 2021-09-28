package homework10;

public class Cat extends Animal{
    private String catsName;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoice() {
        System.out.println("Cat is making may-may");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
